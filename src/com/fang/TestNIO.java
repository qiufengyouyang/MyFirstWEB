package com.fang;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.Channel;
import java.nio.channels.FileChannel;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;

/**
 * ，Channel和传统IO中的Stream很相似。 虽然很相似，但是有很大的区别，主要区别为：
 * 通道是双向的，通过一个Channel既可以进行读，也可以进行写； 而Stream只能进行单向操作，通过一个Stream只能进行读或者写；
 * 
 * 
 * Buffer，故名思意，缓冲区，实际上是一个容器，是一个连续数组。 Channel提供从文件、网络读取数据的渠道，
 * 但是读取或写入的数据都必须经由Buffer。 Selector类是NIO的核心类，Selector能够检测多个注册的
 * 通道上是否有事件发生，如果有事件发生， 便获取事件然后针对每个事件进行相应的响应处理。 这样一来，只是用一个单线程就可以管理多个通道，也就是管理多个连接。
 * 
 * @author zhangning 2016年11月9日
 */
public class TestNIO {
	public static void tesNio() throws Exception {
		File file = new File("datab.txt");
		FileOutputStream fos = new FileOutputStream(file);
		FileChannel channel = fos.getChannel();
		ByteBuffer buffer = ByteBuffer.allocate(1024);
		String str = "abcd java niob";
		buffer.put(str.getBytes());
		buffer.flip(); // 此处必须要调用buffer的flip方法
		channel.write(buffer);
		channel.close();
		fos.close();
	}
	//转换
	public static void testTransform() throws Exception {
		RandomAccessFile fromFile = new RandomAccessFile("data.txt", "rw");
		FileChannel fromChannel = fromFile.getChannel();
		RandomAccessFile toFile = new RandomAccessFile("datab.txt", "rw");
		FileChannel toChannel = toFile.getChannel();
		long position = 0;
		long count = fromChannel.size();
		toChannel.transferFrom(fromChannel,position, count );
		fromChannel.close();
		toChannel.close();
	}
	//选择器
	/**
	 * 某个channel成功连接到另一个服务器称为“连接就绪”。
	 * 一个server socket channel准备好接收新进入的连接称为“接收就绪”。
	 * 一个有数据可读的通道可以说是“读就绪”。等待写数据的通道可以说是“写就绪”。
	 * @throws Exception
	 */
	public static void testSelector() throws Exception{
		Selector selector = Selector.open();
		//为了将Channel和Selector配合使用，必须将channel注册到selector上。
		SelectableChannel channel = null;
		channel.configureBlocking(false);
		SelectionKey selectionKey = channel.register(selector, SelectionKey.OP_READ);
		int interestSet = selectionKey.interestOps();
		/**
		 * interest集合是你所选择的感兴趣的事件集合。可以通过SelectionKey读写interest集合，s
		 */
		 
		
		boolean isInterestedInAccept  = (interestSet & SelectionKey.OP_ACCEPT) == SelectionKey.OP_ACCEPT;
		
		/*boolean isInterestedInConnect = (interestSet & SelectionKey.OP_CONNECT);
		
		boolean isInterestedInRead    = interestSet & SelectionKey.OP_READ;
		
		boolean isInterestedInWrite   = interestSet & SelectionKey.OP_WRITE;*/
		
		//ready 集合是通道已经准备就绪的操作的集合
		int readySet = selectionKey.readyOps();
		
		Channel  chan  = selectionKey.channel();
		
	}
	public static void main(String[] args) throws Exception {
		testTransform();
	}

}

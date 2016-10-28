package com.fang.exp;

import java.util.Scanner;

/**\
 *  int i=0;  
    int j=0;  
    for(i=1;i<=9;i++)  
    {   for(j=1;j<=i;j++)  
            System.out.print(i+"*"+j+"="+i*j+"\t");  
            System.out.println();  
    }  

 * @author zhangning
 * 2016年10月24日
 * 
 *  题目：猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个   
 *  第二天早上又将剩下的桃子吃掉一半，又多吃了一个。
 *  以后每天早上都吃了前一天剩下   的一半零一个。
 *  到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。     
1.程序分析：采取逆向思维的方法，从后往前推断。 
 */
public class DiGui {
	public static int getNumber(int day){
		if(day == 10){
			return 1;
		}else{
			return (getNumber(day + 1)+1) *2;
		}
	}
	
	public static int getSum(int n){
		if(n==1){
			return 1;
		}else{
			return getSum(n-1) *n;
		}
	}
	/**
	 *   题目：有5个人坐在一起，问第五个人多少岁？他说比第4个人大2岁。
	 *   问第4个人岁数，他说比第3个人大2岁。问第三个人，又说比第2人大两岁。问第2个人，说比第一个人大两岁。最后问第一个人，他说是10岁。请问第五个人多大？     
1.程序分析：利用递归的方法，递归分为回推和递推两个阶段。要想知道第五个人岁数，
需知道第四人的岁数，依次类推，推到第一人（10岁），再往回推。
	*/
	public static int getAge(int n){
		if(n==1){
			return 10;
		}else{
			return getAge(n-1) +2;
		}
	}
	//逆序输出数字 
	public static void getNumtoStr(int num){
		String temp = Integer.toString(num);
		char[]chars=temp.toCharArray();
		for (int i = chars.length-1; i >=0; i--) {
			System.out.print(chars[i]);
		}
	}
	
	//一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同
	
	public static void isHuiWen(int num){
		String str = Integer.toString(num);
		int[] array1 = new int[str.length()];
		int[] array2 = new int[str.length()];
		for (int i = array2.length-1; i >= 0; i--) {
			array1[i] = (int) (num / (Math.pow(10, i)));
			num = (int) (num % Math.pow(10, i));
		}
		for (int i = 0,j=0; i < array2.length; i++,j++) {
			array2[j] = array1[i]; 
		}
		boolean result = false;
		for (int i = 0,j=array2.length-1; i < array2.length; i++,j--) {
			if((array1[i] != array2[j])){
				result = false;
				break;
			}else{
				result = true;
			}
		}
		if(result){
			System.out.println("is true");
		}else{
			System.out.println("is not");
		}
		
		
	}
	public static void isHun(int num){
		
		boolean flag = false;
		String s = Integer.toString(num);
		char[] a = s.toCharArray();
		int length = s.length();
		for (int i = 0; i < length/2; i++) {
			if(a[i] != a[length-i-1]){
				flag = false;
				break;
			}else{
				flag=true;
			}
		}
		if(flag){
			System.out.println("is huiwen");
		}else{
			System.out.println("is not hui wen");
		}
		
	}
	public static void main(String[] args) {
		//System.out.println(getNumber(1));
		//System.out.println(getSum(5));
		//System.out.println(getAge(5));
		//getNumtoStr(123456);
		//isHuiWen(110);
		//isHuiWen(12321);
		//isHun(110);
		//(121);
		//isHun(1221);
		//isHun(111);
		System.out.print("请输入一个数字:");
		 Scanner s = new Scanner(System.in);
		 int rt = s.nextInt();
		 System.out.println(rt);
	}

}

package org.smart4j.framework;

import org.smart4j.framework.aop.AopHelper;
import org.smart4j.framework.dao.DatabaseHelper;
import org.smart4j.framework.ioc.BeanHelper;
import org.smart4j.framework.ioc.IocHelper;
import org.smart4j.framework.mvc.ActionHelper;
import org.smart4j.framework.orm.EntityHelper;
import org.smart4j.framework.plugin.PluginHelper;
import org.smart4j.framework.util.ClassUtil;

/**
 * 加载相应的 Helper 类
 *
 * @author huangyong
 * @since 2.0
 */
public final class HelperLoader {

    public static void init() {
        // 定义需要加载的 Helper 类
        Class<?>[] classList = {
            DatabaseHelper.class,
            EntityHelper.class,
            ActionHelper.class,
            BeanHelper.class,
            AopHelper.class,
            IocHelper.class,
            PluginHelper.class,
        };
        // 按照顺序加载类
        for (Class<?> cls : classList) {
            ClassUtil.loadClass(cls.getName());
        }
    }
    
    /**
     * 初始化DataSource
-初始化Entity Map（建立Entity 与Field 的映射关系）
-初始化Action Map（建立Request 与Action 的映射关系）
-初始化Bean Map（建立Bean Class 与Bean Instance 的映射关系）
-创建Bean 的Proxy Instance 并重置Bean Map
-实现Bean 的依赖注入
-初始化Plugin List
ContainerListener
-监听Web 容器的初始化与销毁事件
-加载Smart 相关Helper 类
-初始化Servlet Mapping
     */
}

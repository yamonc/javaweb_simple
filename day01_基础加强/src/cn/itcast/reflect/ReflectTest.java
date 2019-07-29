package cn.itcast.reflect;

import cn.itcast.demain.Person;
import cn.itcast.demain.Student;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * Created by Intellij IDEA.
 * User:  陈亚萌
 * Date:  2019/7/28
 */
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        //可以执行创建人以类的对象，可以执行任意方法
        /*
         * 不能改变该类的任何代码，可以创建人以类的对象，可以执行方法
         * */
        /*Person p=new Person();
        p.eat();*/
        /*Student student=new Student();
        student.sleep();*/
        //1加载配置文件
        //1,1创建Properties对象
        Properties properties = new Properties();
        //1.2加载配置文件，转换成一个集合
        //1.2.1获取class目录下的配置文件
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        properties.load(is);
        //2.获取配置文件中定义的数据
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");
        //3.加载该类进入内存
        Class<?> cls = Class.forName(className);
        //4,创建对象
        Object o = cls.newInstance();
        //5,获取方法对象
        Method method = cls.getMethod(methodName);
        //6.执行方法
        method.invoke(o);
    }
}

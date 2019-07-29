package cn.itcast.reflect;

import cn.itcast.demain.Person;
import cn.itcast.demain.Student;

/**
 * Created by Intellij IDEA.
 * User:  陈亚萌
 * Date:  2019/7/27
 */
public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        //1. Class.forName("全类名")：将字节码文件加载进内存，返回Class对象
        //多用于配置文件，将类名定义在配置文件中。读取文件，加载类
        Class cls1 = Class.forName("cn.itcast.demain.Person");
        System.out.println(cls1);
        /*          类名.class：通过类名的属性class获取
         * 多用于参数的传递
         * */
        Class cls2 = Person.class;
        System.out.println(cls2);
        /* 对象.getClass()：getClass()方法在Object类中定义着。
         * 多用于对象的获取字节码的方式
         * */
        Person p = new Person();
        Class<? extends Person> cls3 = p.getClass();
        System.out.println(cls3);

        //用==比较三个对象
        System.out.println(cls1 == cls2); //true
        System.out.println(cls1 == cls3); //true
        Class c = Student.class;
        System.out.println(c == cls1);

    }
}

package cn.itcast.reflect;

import cn.itcast.demain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by Intellij IDEA.
 * User:  陈亚萌
 * Date:  2019/7/27
 */
public class ReflectDemo4 {

    /*
    * 获取功能：
			1. 获取成员变量们
				* Field[] getFields() ：获取所有public修饰的成员变量
				* Field getField(String name)   获取指定名称的 public修饰的成员变量

				* Field[] getDeclaredFields()  获取所有的成员变量，不考虑修饰符
				* Field getDeclaredField(String name)  
			2. 获取构造方法们
				* Constructor<?>[] getConstructors()  
				* Constructor<T> getConstructor(类<?>... parameterTypes)  

				* Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)  
				* Constructor<?>[] getDeclaredConstructors()  
			3. 获取成员方法们：
				* Method[] getMethods()  
				* Method getMethod(String name, 类<?>... parameterTypes)  

				* Method[] getDeclaredMethods()  
				* Method getDeclaredMethod(String name, 类<?>... parameterTypes)  

			4. 获取全类名	
				* String getName()  
    * */
    public static void main(String[] args) throws Exception {
        //1,获取Person的class对象
        Class<Person> personClass = Person.class;
        //获取指定名称的方法
        Method eat = personClass.getMethod("eat");
        Person p = new Person();
        //执行方法
        eat.invoke(p);

        System.out.println("---------------");
        Method eat1 = personClass.getMethod("eat", String.class);
        eat1.invoke(p, "屎");
        System.out.println("---------------");
        System.out.println("get all public method");
        Method[] method = personClass.getMethods();
        for (Method method1 : method) {
            System.out.println(method1);
            System.out.println(method1.getName());
            //  method1.setAccessible(true);
        }


    }
}

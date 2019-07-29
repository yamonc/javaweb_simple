package cn.itcast.annotation;

import java.lang.annotation.*;

/**
 * Created by Intellij IDEA.
 * User:  陈亚萌
 * Date:  2019/7/28
 */
/*
 *
 * * @Target：描述注解能够作用的位置
 * ElementType取值：
 * TYPE：可以作用于类上
 * METHOD：可以作用于方法上
 * FIELD：可以作用于成员变量上
 * @Retention：描述注解被保留的阶段
 * @Retention(RetentionPolicy.RUNTIME)：当前被描述的注解，会保留到class字节码文件中，并被JVM读取到
 * @Documented：描述注解是否被抽取到api文档中
 * @Inherited：描述注解是否被子类继承

 * */
@Retention(RetentionPolicy.RUNTIME)//当前被描述的注解会保留到class字节码文件中，并被jvm读取到
@Target(value = {ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})//表示MyAnno3只能作用于类上
@Documented
@Inherited
public @interface MyAnno3 {

}

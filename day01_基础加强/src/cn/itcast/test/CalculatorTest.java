package cn.itcast.test;

import cn.itcast.junit.Calculateor;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Intellij IDEA.
 * User:  陈亚萌
 * Date:  2019/7/27
 */
public class CalculatorTest {
    /*
     * 用于资源申请，所有测试方法在执行之前都会先执行该方法
     * */
    @Before
    public void init() {
        System.out.println("init----");

    }

    @After
    public void close() {
        /*在所有测试方法执行完后们都会自动执行该方法*/
        System.out.println("close");
    }

    @Test
    public void testAdd() {
        //System.out.println("我被执行了");
        Calculateor c = new Calculateor();
        int add = c.add(1, 2);
        System.out.println("testadd,,,,");
        Assert.assertEquals(3, add);
    }
}

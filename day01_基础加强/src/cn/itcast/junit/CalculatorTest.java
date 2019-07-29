package cn.itcast.junit;

/**
 * Created by Intellij IDEA.
 * User:  陈亚萌
 * Date:  2019/7/27
 */
public class CalculatorTest {
    public static void main(String[] args) {
        Calculateor c = new Calculateor();
        int add = c.add(1, 2);
        System.out.println(add);
        int sub = c.sub(1, 1);
        System.out.println(sub);
        String str = "abc";

    }
}

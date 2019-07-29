package cn.itcast.annotation;

/**
 * Created by Intellij IDEA.
 * User:  陈亚萌
 * Date:  2019/7/28
 */
@SuppressWarnings("all")
public class AnnoDemo2 {
    @Override
    public String toString() {
        return super.toString();
    }

    @Deprecated
    public void show1() {

    }

    public void show2() {

    }

    public void demo() {
        show1();
    }


}

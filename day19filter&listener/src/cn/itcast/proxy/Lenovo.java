package cn.itcast.proxy;

/**
 * Created by Intellij IDEA.
 * User:  陈亚萌
 * Date:  2019/7/29
 */
/*
真实类
* */
public class Lenovo implements SaleComputer {
    @Override
    public String sale(double money) {
        System.out.println("花了" +
                money + "买联想电脑");
        return "联想电脑";
    }

    @Override
    public void show() {
        System.out.println("show展示电脑..");
    }
}

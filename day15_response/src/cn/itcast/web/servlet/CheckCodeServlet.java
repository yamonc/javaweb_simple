package cn.itcast.web.servlet;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

@WebServlet("/checkCodeServlet")
public class CheckCodeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1，创建一个对象，在内存中画图（验证码的图\片对象）
        int width=100;
        int height=50;
        BufferedImage image=new BufferedImage(width,height,
                BufferedImage.TYPE_INT_RGB);


        //2美化图片

        //2.1填充背景色
        Graphics graphics = image.getGraphics();
        graphics.setColor(Color.PINK);//
        graphics.fillRect(0,0,width,height);
        //2.2话边框
        graphics.setColor(Color.blue);
        graphics.drawRect(0,0,width-1,height-1);

        String str="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        //创建随机类生成随机交表
        Random ran=new Random();


        for (int i = 1; i <=4 ; i++) {
            int index = ran.nextInt(str.length());
            //获取字符
            char ch = str.charAt(index);

            //2.3写验证码
            graphics.drawString(ch+"",width/5*i,height/2);



        }
        //2.4,话干扰线
        graphics.setColor(Color.GREEN);
        //随机生成坐标
        for (int i = 0; i < 10; i++) {
            int x1 = ran.nextInt(width);
            int x2 = ran.nextInt(width);
            int y1 = ran.nextInt(height);
            int y2 = ran.nextInt(height);
            graphics.drawLine(x1,x2,y1,y2);

        }


        //3将图片输出到页面展示
        ImageIO.write(image,"jpg",response.getOutputStream());


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}

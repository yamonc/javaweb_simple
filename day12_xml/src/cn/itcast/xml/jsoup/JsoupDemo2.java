package cn.itcast.xml.jsoup;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 * Jsoup对象功能
 */
public class JsoupDemo2 {
    public static void main(String[] args) throws IOException {
        //2.获取Document对象，根据xml文档获取
        //2.1获取student.xml的path
        String path = JsoupDemo2.class.getClassLoader().getResource("src\\student.xml").getPath();
        //2.2解析xml文档，加载文档进内存，获取dom树--->Document
        File file=new File(path);
        Document document = Jsoup.parse(file, "utf-8");
        System.out.println(document);
    }

}

package com.dom4j;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;


/**
 * 目标：学会使用dom4j解析XML文件中的数据
 * 1.导入dom4j框架
 * 2.准备一个XML文件
 */
public class Dom4jHelloWorldDemo1 {
    @Test
    public void parseXMLData() throws Exception {

        //1.创建一个Dom4j的解析器对象，代表整个dom4j框架
        SAXReader saxReader = new SAXReader();
        //2.把XML文件加载到内存中成为一个Document文档对象
        //Document document=saxReader.read("XMLDemo\\src\\contact.xml");  //需要通过模块去定位
        //Document document =saxReader.read(new File("XMLDemo\\\\src\\\\contact.xml"));


        //注意，getResourceAsStream的/是直接去src下寻找文件
        InputStream is = Dom4jHelloWorldDemo1.class.getResourceAsStream("/contact.xml");
        Document document = saxReader.read(is);

        //3.获取根元素
        Element root = document.getRootElement();
        System.out.println(root.getName());

        //4.根元素下的全部子元素对象
        List<Element> sonEls = root.elements("contact");
        for (Element sonEl : sonEls) {
            System.out.println(sonEl.getName());
        }

        //拿某个子元素
        Element userEle = root.element("user");
        System.out.println(userEle.getName());


        //默认拿第一个子元素
        Element contact = root.element("contact");
        System.out.println(contact.elementText("name"));


        //获取子元素文本
        System.out.println(contact.elementTextTrim("name"));

        //根据元素获取属性的值
        Attribute idAttr = contact.attribute("id");
        System.out.println(idAttr.getName() + "==>" + idAttr.getValue());

        //直接提取属性值
        System.out.println(contact.attributeValue("id"));
        System.out.println(contact.attributeValue("vip"));

        //获取子元素对象
        Element email = contact.element("email");
        System.out.println(email.getText());


    }
}

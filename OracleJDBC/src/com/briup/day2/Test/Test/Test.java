package com.briup.day2.Test.Test;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

    private static Map<String, Object> map = new HashMap<>();

    public static void main(String[] args) {

        initBeanFactory();
        Object student1 = getObject("student1");
        System.out.println(student1);
        Object student2 = getObject("student2");
        System.out.println(student2);
        Object student3 = getObject("student3");
        System.out.println(student3);

    }

    private static Object getObject(String id) {
        return map.get(id);
    }

    private static void initBeanFactory() {
        SAXReader saxReader = new SAXReader();
        try {
            Document document = saxReader.read("src/com/briup/day2/Test/Test/beans.xml");
            Element root = document.getRootElement();
            List<Element> elements = root.elements();
            for (Element element : elements) {
                String id = element.attributeValue("id");
                String aClass = element.attributeValue("class");

                Class<?> clazz = Class.forName(aClass);
                Object o = clazz.newInstance();

                List<Element> propertys = element.elements();
                //Map<String, String> map = new HashMap<>();

                for (Element property : propertys) {
                    String name = property.attributeValue("name");
                    String text = property.getText();

                    name = "set" + name.substring(0, 1).toUpperCase() + name.substring(1);
                    Method method = clazz.getMethod(name, text.getClass());
                    method.invoke(o, text);

                    //map.put(name, text);
                }

                map.put(id, o);

            /*System.out.println(id);
            System.out.println(aClass);
            map.forEach((a, b) -> System.out.println(a + "=" + b));*/
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}

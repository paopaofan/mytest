package work;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.Set;

//一、已知一个类，定义如下：
//package com.itcast.demo;
//public class DemoClass {
//public void run() {
//System.out.println("welcome to heima!");}}
//(1)写一个Properties格式的配置文件，配置类的完整名称。
//(2) 写一个程序，读取这个Properties配置文件，获得类的完整名称并加载这个类，
//(3)用反射 的方式运行run方法
public class Work03 {

	public static void main(String[] args) throws Exception {
		Properties prop=new Properties();
		prop.load(new FileReader("a..txt"));
        String name=prop.getProperty("name");
        Class clazz=Class.forName(name);
        Object ob=clazz.newInstance();
        Method method=clazz.getMethod("run");
        method.invoke(ob);
	}

}

package work;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.Set;

//һ����֪һ���࣬�������£�
//package com.itcast.demo;
//public class DemoClass {
//public void run() {
//System.out.println("welcome to heima!");}}
//(1)дһ��Properties��ʽ�������ļ�����������������ơ�
//(2) дһ�����򣬶�ȡ���Properties�����ļ����������������Ʋ���������࣬
//(3)�÷��� �ķ�ʽ����run����
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

package work;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Scanner;

//编写一个类A，增加一个实例方法showString,用于打印一条字符串，
//在编写一个类TestA ,作为客户端，用键盘输入一个字符串，该字符串就是类A的全名，使用反射机制创建该类的对象，
//并调用该对象中的方法showString
public class Work01 {

	public static void main(String[] args) throws Exception, SecurityException {
		Scanner sc=new Scanner(System.in);
        System.out.println("请输入类A的全名：");
        String name=sc.next();
        Class clazz=Class.forName(name);
        Constructor<?> con=clazz.getConstructor();
        Object ob=con.newInstance();
        Method method=clazz.getMethod("showString");
        method.invoke(ob);
	}

}

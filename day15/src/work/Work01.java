package work;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Scanner;

//��дһ����A������һ��ʵ������showString,���ڴ�ӡһ���ַ�����
//�ڱ�дһ����TestA ,��Ϊ�ͻ��ˣ��ü�������һ���ַ��������ַ���������A��ȫ����ʹ�÷�����ƴ�������Ķ���
//�����øö����еķ���showString
public class Work01 {

	public static void main(String[] args) throws Exception, SecurityException {
		Scanner sc=new Scanner(System.in);
        System.out.println("��������A��ȫ����");
        String name=sc.next();
        Class clazz=Class.forName(name);
        Constructor<?> con=clazz.getConstructor();
        Object ob=con.newInstance();
        Method method=clazz.getMethod("showString");
        method.invoke(ob);
	}

}

package work;

import java.lang.reflect.Method;

//һ������һ����׼��Person�࣬��������name������setget����,�����ղι��졣
//ʹ�÷���ķ�ʽ����һ��ʵ��������ʼ����ʹ�÷��䷽ʽ����setName���������ƽ�������,
//����֮�� ��ͨ�����䷽ʽִ��getName()����
public class Work02 {

	public static void main(String[] args) throws Exception {
		Class clazz=Class.forName("work.Person");
        Object ob=clazz.newInstance();
        Method method=clazz.getMethod("setName", String.class);
        method.invoke(ob, "luhan");
        Method method1=clazz.getMethod("getName");
        System.out.println(method1.invoke(ob));
	}

}

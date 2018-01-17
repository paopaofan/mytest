package work;

import java.lang.reflect.Method;

//一、定义一个标准的Person类，包含属性name，包含setget方法,包含空参构造。
//使用反射的方式创建一个实例、并初始化，使用反射方式调用setName方法对名称进行设置,
//设置之后 在通过反射方式执行getName()方法
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

package lianxi;

import java.lang.reflect.Constructor;

public class Demo01 {
public static void main(String[] args) throws ClassNotFoundException, Exception, SecurityException {	Class<?> clazz=Student.class;
	Class<?> c2=Class.forName("lianxi.Student");
//	 Constructor<?>[] con =c2.getDeclaredConstructors();
//	 for (Constructor<?> constructor : con) {
//		System.out.println(constructor);
//	}
	Constructor<?> con=c2.getConstructor(String.class,String.class);
	Student stu = (Student)con.newInstance("¡ıÃŒ","35");
	System.out.println(stu.getAge());
	System.out.println(stu);
	
	 
}
}

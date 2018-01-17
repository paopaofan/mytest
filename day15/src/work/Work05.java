package work;

import java.io.File;
import java.lang.reflect.Field;

/**
 * 得到某个对象的私有属性
 * @param obj 对象
 * @param fieldName 属性名 
 * @return return 该属性对象 
 */
//public Object getProperty (Object obj, String fieldName) throws Exception {
//	
//}
public class Work05 {

	public static void main(String[] args) throws Exception {
		Class clazz=Class.forName("work.Student");
        Object object=clazz.newInstance();
        Field file=clazz.getDeclaredField("name");
        file.setAccessible(true);
        Object ob=file.get(object);
	}

}

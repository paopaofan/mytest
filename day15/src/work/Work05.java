package work;

import java.io.File;
import java.lang.reflect.Field;

/**
 * �õ�ĳ�������˽������
 * @param obj ����
 * @param fieldName ������ 
 * @return return �����Զ��� 
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

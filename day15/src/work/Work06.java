package work;
/**
 * 执行某对象方法
 * @param obj 对象
 * @param methodName 方法名 
 * @param args 参数数组
 * @return 方法返回值
 */
public class Work06 {

	public static void main(String[] args) throws Exception {
		Class clazz=Class.forName("work.Student");
        Object object=clazz.newInstance();
        
	}

}

package work;
//一、定义一个标准的Person类，包含属性name，包含setget方法,包含空参构造。
//使用反射的方式创建一个实例、并初始化，使用反射方式调用setName方法对名称进行设置,
//设置之后 在通过反射方式执行getName()方法
public class Person {
private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Person(String name) {
	super();
	this.name = name;
}

public Person() {
	super();
	// TODO Auto-generated constructor stub
}

}

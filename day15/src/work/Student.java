package work;

public class Student {
private String name;
private String age;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public Student(String name, String age) {
	super();
	this.name = name;
	this.age = age;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
private void eat(){
	System.out.println("�Է�");
}
public void study(){
	System.out.println("ѧϰ");
}
}

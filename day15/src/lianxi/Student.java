package lianxi;

public class Student {
private String name;
private String age;
@Override
public String toString() {
	return "Student [name=" + name + ", age=" + age + "]";
}
private void eat(){
	System.out.println("³Ô·¹");
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

}

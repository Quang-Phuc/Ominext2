package modle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Student {
private int id;
private String name;
private String birthday;
private float gpa;
private Date dateInsert;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBirthday() {
	return birthday;
}
public void setBirthday(String birthday) {
	this.birthday = birthday;
}

public float getGpa() {
	return gpa;
}
public void setGpa(float gpa) {
	this.gpa = gpa;
}
public Student() {
	super();
}

public Date getDateInsert() {
	return dateInsert;
}
public void setDateInsert(Date dateInsert) {
	this.dateInsert = dateInsert;
}
public Student(int id, String name, String birthday,float gpa) {
	super();
	this.id = id;
	this.name = name;
	this.birthday = birthday;
	this.gpa = gpa;
}


public Student(int id, String name, String birthday, float gpa, Date dateInsert) {
	super();
	this.id = id;
	this.name = name;
	this.birthday = birthday;
	this.gpa = gpa;
	this.dateInsert = dateInsert;
}
@Override
public String toString() {
	return "\n Student [id=" + id + ", name=" + name + ", birthday=" + birthday + ", gpa=" + gpa + "]";
}
public List<Student> insert() throws ParseException
{
	SimpleDateFormat formatter = new SimpleDateFormat("dd'/'MM'/'yyyy HH:mm:ss");
	 Date original =formatter.parse("20/11/2019 20:55:55");
	Student student = new Student(1, "An", "20191112",4.5f,original);
	Student student1 = new Student(2, "Ca", "20191012",6.6f,original);
	Student student2 = new Student(3, "Ba", "20191112",3.5f,original);
	Student student3 = new Student(4, "Sn", "20190912",3.5f,original);
	Student student4 = new Student(5, "Dn", "20180912",3.5f,original);
	Student student5 = new Student(6, "", "20170912",3.5f,original);
	Student student6 = new Student(6, "sa", "20170912",3.5f,original);
	Student student7 = new Student(6, "Nguyen Van sa", "20170912",3.5f,original);
	List<Student> students= Arrays.asList(student,student1,student2,student3,student4,student5,student6,student7);
		
	return students;
	
}
}

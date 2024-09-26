package java_package;

public class StudentManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj=new Student();
		obj.setName("Sravani");
		System.out.println(obj.getName());
		obj.setGrade(70);
		System.out.println(obj.getGrade());
		obj.setGrade(150);
		
	}

}


class Student 
{
private String name;
private int grade;


// setter
public void setName(String stdName)
{
	name=stdName;
}

//getter
public String getName()
{
	return name;
}

public void setGrade(int stdgrade)
{
	if(stdgrade >=0 && stdgrade<=100)
	{
		grade=stdgrade;
	}
	else
	{
		System.out.println("Give a grade between 0 to 100");
	}

}


public int getGrade()
{
	return grade;
}
}
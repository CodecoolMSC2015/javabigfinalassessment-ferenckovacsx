package database;

import java.util.List;

public class Employee extends Person
{
	
	int Salary;
	String jobTitle;
	
	public Employee(String name, String email, List<Skill> skillset)
	{
		super(name, email, skillset);
		// TODO Auto-generated constructor stub
	}
	
	public int getSalary()
	{
		return Salary;
	}
	public void setSalary(int salary)
	{
		Salary = salary;
	}
	public String getJobTitle()
	{
		return jobTitle;
	}
	public void setJobTitle(String jobTitle)
	{
		this.jobTitle = jobTitle;
	}
	@Override
	public String toString()
	{
		return "Employee [Salary=" + Salary + ", jobTitle=" + jobTitle + "]";
	}
	
	
}

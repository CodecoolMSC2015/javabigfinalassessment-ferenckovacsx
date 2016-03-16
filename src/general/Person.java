package general;

import java.util.ArrayList;
import java.util.List;

public class Person
{
	String name;
	String email;
	List<Skill> skillset = new ArrayList<>();
	
	public Person(String name, String email, List<Skill> skillset)
	{
		this.name = name;
		this.email = email;
		this.skillset = skillset;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public List<Skill> getSkillset()
	{
		return skillset;
	}
	public void setSkillset(List<Skill> skillset)
	{
		this.skillset = skillset;
	}
	
	static void addSkill(Skill skill)
	{
		
	}
	
}

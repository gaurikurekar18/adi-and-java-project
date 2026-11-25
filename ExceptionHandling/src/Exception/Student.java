package Exception;

public class Student {
	
	void checkAge(int age)
	{
		if(age<18 && age>0)
		{
			//below line is limited  for console
			//System.out.println("student age is not eligible for admission");
			//below line is not limited for console ..the response can be sent to the clint/brwser/postman.
			throw new AgeNotEligibleException("student age is not eligible for admission");
			
			}
		else if(age<0)
		{
		throw new InvalidAgeException("please Enter valid age..Greater than 0");	
		}
		else
		{
			System.out.println("Student is eligible for admission");
		}
	}
	public static void main(String[] args)
	{
		Student s1=new Student();
		try
		{
			s1.checkAge(3);
		}
		catch(AgeNotEligibleException a)
		{
			System.out.println(a.getMessage());
		}
		catch(InvalidAgeException a)
		{
			System.out.println(a.getMessage());
		}
		
		
	}

}

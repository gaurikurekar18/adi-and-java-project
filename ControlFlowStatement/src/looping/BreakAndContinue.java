package looping;

public class BreakAndContinue {
	public static void main(String[]args){
		/*for(int i=1;i<=100;i++)
		{
			System.out.println(i);
			break;//it will end your loop explicitly...
		}*/
		
		
		
	/*	for(int i=1;i<=100;i++)
		{
			System.out.println(i);
			if(i==50)
			{
				break;//it will end your loop explicity
			}
		}*/
		
		
		
		//while,do while loop
	/*	int arr[]= {10,20,30,-56,35,-34};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				break;
			}
			System.out.println(arr[i]);
		}*/
		
		
		
		//user searching for VIVO16
	/*	String [] products= {"Laptop","VIVO16","TV","CHAR"};
		for(int i=0;i<products.length;i++)
		{
			if(products[i].equals("VIVO16"))
			{
				System.out.println(products[i]);
				break;//2 time iterate
			}
		}*/
		
	/*	int arr[]= {10,20,30,-56,35,-34};
		for(int i=0;i<arr.length;i++){
		{
			if(arr[i]>0)
			continue;
		}
		System.out.println(arr[i]);
	}*/
		
		
	/*	String emails[]={"aadi@gmail.com","ram.com","shyam@","ravi2gmail"};
				{
			for(int i=0;i<emails.length;i++) {
				if(!emails[i].contains("gmail.com"))
				{
					continue;
				}
				System.out.println(emails[i]);
			}
			*/
		
		
		for(int i=1;i<=100;i++)
		{
			if(i==10 || i==15)
			{
				continue;
			}
			if(i==50)
			{
				break;
			}
			System.out.println(i);//skip the 10,15
		}
		
		
		
	}
}

package demo;

public class ArithematicOperators {
	
	public static void main(String []args) {
		
   //     int x = 501, y = 10;
		//String+int=concat
		// + => addition + concat
		//()=>its has higher priority in execution
	//	System.out.println("Addition ="+(x+y));
	//	System.out.println("Sub ="+(x-y));
	//	System.out.println("Multi ="+x*y);
	//	System.out.println("Div ="+x/y);
	//	System.out.println("Remainder="+x%y);//modulo it will provide remainder to us
		
		
	//	double salary = 45000.00;
	//	System.out.println("Salary Before bonus ="+salary);
	//	double bonus = 4000;
	//	double SalaryAfterBonus = salary + bonus;
	//	System.out.println("Salary After Bonus ="+SalaryAfterBonus);
	//	double tax = SalaryAfterBonus*0.10;//18% GST
	//	double AfterTaxCalculationSalary = SalaryAfterBonus - tax;
	//	System.out.println("Tax Amount:"+tax);
	//	System.out.println("Salary After Tax="+AfterTaxCalculationSalary);
		
		
		//mostly double is used to store price ,salary,discount
		double laptopPrice = 120000;
		double mobilePrice = 34000;
		double tvPrice = 21000;
		double total=laptopPrice+mobilePrice+tvPrice;
		System.out.println("Total="+total);
		
		double discount = total * 0.10;
		double finalprice = total - discount;
		System.out.println("you Got 10% Discount-"+discount);
		System.out.println("After Discount Final Pay : "+total+"-"+discount+"-"+finalprice);
		
		double avg = total  /3;
		System.out.println("Avg Price:"+avg);
		
		
		
		
		
	}

	
}

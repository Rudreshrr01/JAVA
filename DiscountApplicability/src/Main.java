import java.util.Scanner;

public class Main {
	

		public static void checkDiscount(double purchaseAmount)

		{

		if(purchaseAmount>100)
		{
			System.out.println("discount is applicable");
		}

		}

		public static void main(String[] args)

		{

		Scanner scan=new Scanner(System.in);
		System.out.println("enter the purchase amount");
		double amount=scan.nextDouble();
		checkDiscount(amount);

		}

		}


import java.util.Scanner;

public class Main {
	public static void checkMultipleOfTen(int n)

	{

	if(n%10==0)
	{
		System.out.println("the number is multiple of ten");
	}

	}

	public static void main(String[] args)

	{
Scanner scan=new Scanner(System.in);
System.out.println("enter a number");
int n=scan.nextInt();
checkMultipleOfTen(n);
	}

}

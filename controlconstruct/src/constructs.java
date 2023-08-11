import java.util.Scanner;

public class constructs {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter ascore");
	int score=scan.nextInt()	;
	if(score>=90)
	{
		System.out.println("aa grade");
	}
	else if(score>=80 && score<90)
	{
		System.out.println("a grade");
	}
	else if(score>=70 && score<80)
	{
		System.out.println("b grade");
	}
	else if(score>=60 && score<70)
	{
		System.out.println("c grade");
	}
	else if(score>=50 && score<60)
	{
		System.out.println("dgrade");
	}
	else
	{
		System.out.println("get lost");
	}
}
}
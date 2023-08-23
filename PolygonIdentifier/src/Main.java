import java.util.Scanner;

public class Main {
	
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int sides=scan.nextInt();
		identifypolygon(sides);
		scan.close();
	}

		public static void identifypolygon(int sides)

		{
			switch (sides) {
			case 3:
				System.out.println("tringle");
				break;
			case 4:
				System.out.println("quadrilateral");
				break;
			case 5:
				System.out.println("pentogon");
				break;
			case 6:
				System.out.println("hexogon");
				break;
			default:
				System.out.println("polygon");

			}
		}
	}
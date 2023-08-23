import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the product code");
		String productCode=scan.next();
		getProduct(productCode);
	}
public static void getProduct(String productCode)
{
	switch(productCode){
		case "co1":
			System.out.println("coca cola");break;
		case "co2" :
		System.out.println("pepsi");break;
		case "co3" :
		System.out.println("fanta");break;
		case "co4" :
		System.out.println("jaljeera");break;
		case "co5" :
			System.out.println("mountain dew");break;
		case "co6" :
			System.out.println("boatguaa");break;
		default :
			System.out.println("panaka");
	}

}

}


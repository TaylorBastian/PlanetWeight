import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		int weight;
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your weight on the Earth?");
		weight = sc.nextInt();
		System.out.println("1. Voltar");
		System.out.println("2. Krypton");
		System.out.println("3. Fertos");
		System.out.println("4. Servontos");
		choice=sc.nextInt();
		switch(choice){
		case(1):
			System.out.println("Your weight on Voltar would be "+weight*0.091);
			break;
		case(2):
			System.out.println("Your weight on Krypton would be "+weight*0.720);
			break;
		case(3):
			System.out.println("Your weight on Fertos would be "+weight*0.865);
			break;
		case(4):
			System.out.println("Your weight on Servontos would be "+weight*4.612);
			break;
		default:
			System.out.println("You peasant!!! You need to choose 1,2,3, or 4!!!!!!!!!");
			break;
		
		}
		sc.close();

	}
}

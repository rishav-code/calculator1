package calculator1;

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		System.out.println("Enter the no of elements");
		Scanner input = new Scanner(System.in);
		int element = input.nextInt();
		int ar[] = new int[element];
		System.out.println("Enter the Elements");
		for (int i = 0; i < element; i++) {
			ar[i] = input.nextInt();
		}
		System.out.println("enter the operation 1: + 2: - 3: * 4: /");
		int operation = input.nextInt();
		double s = 0;

		switch (operation) {
		case 1:
			for (int i1 = 0; i1 < element; i1++) {
				s = s + ar[i1];

			}
			System.out.println("The Result is  " + s);
			break;
		case 2:
			s=ar[0];
			for (int i1 = 1; i1 < element; i1++) {
				s=s-ar[i1];

			}
			System.out.println("The Result is " + s);
			break;
		case 3:
			s=ar[0];
			for (int i1 = 1; i1 <element; i1++) {
				s = s * ar[i1];
			}
			System.out.println("The Result is " + s);
			break;
		case 4:
			s = ar[0];
			for (int i1 = 1; i1 < element ; i1++) {
				s = s / ar[i1];
			}
			System.out.println("The Result is " + s);
			break;
		default:
			System.out.println("operation didnt matched");

		}
	}
}

package kanwaljeetsm;

import java.util.Random;
import java.util.Scanner;

public class TossACoin {
	
	static {
		System.out.println("Let's toss a Coin!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result, randomNum;
		
		while(true) {
			System.out.println("\nPress '1' to Toss    and    Press '0' to Exit");
			Scanner scanner = new Scanner(System.in);
			Random random = new Random();
			result = scanner.nextInt();
		
				if(result == 1) {
					randomNum = random.nextInt(2);
					
					if(randomNum == 0) {
						System.out.println("Heads!");
					}
					
					else {
						System.out.println("Tails!");
					}
				}
		
				else if(result == 0) {
					System.exit(0);
				}
				
				else {
					System.out.println("Invalid Input!");
				}
			}
		}
	}

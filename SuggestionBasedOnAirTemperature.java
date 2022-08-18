import java.util.Scanner;
public class SuggestionBasedOnAirTemperature {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("What is the temperature: ");
		int temp=kb.nextInt();
		
		if (temp<5) {
			System.out.println("I suggest skiing.");			
			}
		else if (temp<15) {
			System.out.println("I suggest to you go to cinema.");			
			}
		else if(temp<25) {
			System.out.println("I suggest you to have picnic.");			
			}
			
		else {
			System.out.println("I suggest swimming.");			
			
		}
	}

}

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		new StartUp();
		Scanner scanner = new Scanner (System.in);
		System.out.println ("What is your animal name ");
		String animalname = scanner.nextLine();
		System.out.printf ("Your animal name is: %s \n" , animalname);
		
		
		Penguin penguin = new Penguin(animalname);
		penguin.setMood(PenguinMood.HAPPY);
		System.out.println ("Your penguin is : " + penguin.getMood());
		
		
		}
	
}
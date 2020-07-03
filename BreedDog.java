package dogbreeder;

import java.util.Scanner;

class BreedDog {
	
	static Dog dog;
	
	static String breed, color, name;
	static int age, weight;
	
	static int user_input;

	public static void main(String[] arge) {
		
		displayInstruction();
		
	}

	public static void displayInstruction() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("\nCREATE A DOG");
		System.out.println();
		
		System.out.println("\nBreed:");
		breed = in.nextLine();
		
		System.out.println("\nColor:");
		color = in.nextLine();
		
		System.out.println("\nName:");
		name = in.nextLine();
		
		System.out.println("\nAge:");
		age = in.nextInt();
		
		System.out.println("\nWeight:");
		weight = in.nextInt();
		
		createDog();
		
	}

	public static void createDog() {
		
		dog = new Dog();
		
		dog.assignBreed(breed);
		dog.assignColor(color);
		dog.assignName(name);
		dog.assignAge(age);
		dog.assignWeight(weight);
		
		dog.hungry = true;
		dog.restless = false;
		dog.tired = false;
		dog.nervous = false;
		
		displayState();
		
	}

	public static void displayState() {
		
		dog.displayState();
		displayOptions();
		
	}
	
	public static void displayOptions() {
		
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("\n1. Feed");
		System.out.println("2. Play");
		System.out.println("3. Rest");
		System.out.println("4. Calm");
		System.out.println();
		
		user_input = in.nextInt();
		
		switch(user_input) {
			
			case 1:
				dog.feed();
			break;
			case 2:
				dog.play();
			break;
			case 3:
				dog.rest();
			break;
			case 4:
				dog.calm();
			break;
		}

		displayState();
			
		}
		
}
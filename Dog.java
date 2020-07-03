package dogbreeder;

class Dog {
	
	
	String breed, color, name;
	
	int age, weight;
	
	boolean hungry, restless, tired, nervous;
	
	void assignBreed(String dog_breed) {
		
		breed = dog_breed;
		
	}
	
	void assignColor(String dog_color) {
		
		color = dog_color;
		
	}
	
	void assignName(String dog_name) {
		
		name = dog_name;
		
	}
	
	void assignAge(int dog_age) {
		
		age = dog_age;
		
	}
	
	void assignWeight(int dog_weight) {
		
		weight = dog_weight;
		
	}
	
	void feed() {
		
		hungry = false;
		restless = true;
		
	}
	
	void play() {
		
		restless = false;
		tired = true;
		
	}
	
	void rest() {
		
		tired = false;
		nervous = true;
		
	}
	
	void calm() {
		
		nervous = false;
		hungry = true;
		
	}
	
	void displayState() {
		
		System.out.println("\nBreed: " + breed);
		System.out.println("Color: " + color);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Weight: " + weight);

		if (hungry) { System.out.println("\n" + name + " is hungry.");}
		if (restless) { System.out.println("\n" + name + " is restless.");}
		if (tired) { System.out.println("\n" + name + " is tired.");}
		if (nervous) { System.out.println("\n" + name + " is nervous.");}
		
		System.out.println();
		
	}
	
}
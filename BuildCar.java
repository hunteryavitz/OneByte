package carbuilder;

class BuildCar {
	
	public static void main(String[] args) {
		
		
		Car car1 = new Car();
		Car car2 = new Car();
		
		car1.setMake("Tesla");
		car1.setModel("Model 3");
		car1.setColor("Red");
		
		car1.setYear(2019);
		car1.setMileage(500);
		
		car2.setMake("Tesla");
		car2.setModel("Model S");
		car2.setColor("Charcoal");
		
		car2.setYear(2020);
		car2.setMileage(750);
		
		System.out.println("\nMake: " + car1.getMake());
		System.out.println("\nModel: " + car1.getModel());
		System.out.println("\nColor: " + car1.getColor());
		
		System.out.println("\nYear: " + car1.getYear());
		System.out.println("\nMileage: " + car1.getMileage());

		System.out.println("\nMake: " + car2.getMake());
		System.out.println("\nModel: " + car2.getModel());
		System.out.println("\nColor: " + car2.getColor());
		
		System.out.println("\nYear: " + car2.getYear());
		System.out.println("\nMileage: " + car2.getMileage());
		
		System.out.println("\nTotal Cars: " + Car.carCounter);
		
	}
	
}
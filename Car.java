package carbuilder;

class Car {
	
	private String make, model, color;
	private int year, mileage;
	
	static int carCounter;
	
	public Car() {
		
		carCounter++;
		
	}

	void setMake(String c_make) {
		
		this.make = c_make;
		
	}

	void setModel(String c_model) {
		
		this.model = c_model;
		
	}

	void setColor(String c_color) {
		
		this.color = c_color;
		
	}

	void setYear(int c_year) {
		
		this.year = c_year;
		
	}

	void setMileage(int c_mileage) {
		
		this.mileage = c_mileage;
		
	}
	
	String getMake() {
		
		return this.make;
		
	}

	String getModel() {
		
		return this.model;
		
	}

	String getColor() {
		
		return this.color;
		
	}

	int getYear() {
		
		return this.year;
		
	}
	
	int getMileage() {
		
		return this.mileage;
		
	}
	
}
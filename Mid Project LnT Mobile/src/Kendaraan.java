
public abstract class Kendaraan {
	
	private String brand;
	private String license;
	private Integer speed;
	private Integer capacity;
	private Integer wheel;
	private String type;
	private String name;
	
	public Kendaraan(String brand, String name, String license, Integer speed, Integer capacity, Integer wheel, String type) {
		this.brand = brand;
		this.name = name;
		this.license = license;
		this.speed = speed;
		this.capacity = capacity;
		this.wheel = wheel;
		this.type = type;
		
		System.out.println("Successfully Added!!");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public Integer getSpeed() {
		return speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public Integer getWheel() {
		return wheel;
	}

	public void setWheel(Integer wheel) {
		this.wheel = wheel;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
	
	

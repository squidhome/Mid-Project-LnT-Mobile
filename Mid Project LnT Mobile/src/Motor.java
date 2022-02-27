
public class Motor extends Kendaraan {
	
	private Integer helm;
	
	public Motor(String brand, String name, String license, Integer speed, Integer capacity, Integer wheel, String type, Integer helm) {
		super(brand, name, license, speed, capacity, wheel, type);
		this.helm = helm;
	}

	public Integer getHelm() {
		return helm;
	}

	public void setHelm(Integer helm) {
		this.helm = helm;
	}

	
	
	


}
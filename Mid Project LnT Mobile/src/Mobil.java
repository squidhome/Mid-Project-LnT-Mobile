
public class Mobil extends Kendaraan {

	private Integer system;
	
	public Mobil(String brand, String name, String license, Integer speed, Integer capacity, Integer wheel, String type, Integer system) {
		super(brand, name, license, speed, capacity, wheel, type);
		this.system = system;
	}

	public Integer getSystem() {
		return system;
	}

	public void setSystem(Integer system) {
		this.system = system;
	}

	
	

}

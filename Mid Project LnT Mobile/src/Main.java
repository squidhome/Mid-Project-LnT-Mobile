import java.util.Scanner;
import java.util.Vector;

public class Main {
	
	Vector<Kendaraan> kendaraanList = new Vector<Kendaraan>(); 
	Scanner scan = new Scanner(System.in);

	public Main() {
		int end = 0, option;
		do {
			do {
				System.out.println("Vehicle");
				System.out.println("=======================");
				System.out.println("1. Input");
				System.out.println("2. View");
				System.out.println("3. Exit");
				System.out.println(">> ");
				
				option = scan.nextInt();
				scan.nextLine();
			} while (option < 1 || option > 4);
			
			if(option == 1) {
				add();
			} else if(option == 2) {
				view();
			} else if(option == 3) {
				end = 1;
			}
		} while (end == 0);
		
	}
	
	void add() {
		String type, type2, brand, name, license;
		int speed, cap, wheel, amount;

		do {
			System.out.println("Input type [Car | Motorcycle]: ");
			type = scan.nextLine();
		} while (!type.equals("Car") && !type.equals("Motorcycle"));
		
		do {
			System.out.println("Input brand [>= 5]: ");
			brand = scan.nextLine();
		} while (brand.length() < 5);
		
		do {
			System.out.println("Input name [>= 5]: ");
			name = scan.nextLine();
		} while (name.length() < 5);
		
		do {
			System.out.println("Input license: ");
			license = scan.nextLine();
		} while (!license.matches("[A-Z]{1}\\s[0-9]{4}\\s[A-Z]{3}"));
		
		do {
			System.out.println("Input top speed [100 <= topSpeed <= 250]: ");
			speed = scan.nextInt();
			scan.nextLine();
		} while (speed < 100 || speed > 250);
		
		do {
			System.out.println("Input gas capacity [30 <= gasCap <= 60]: ");
			cap = scan.nextInt();
			scan.nextLine();
		} while (cap < 30 || cap > 60);
		
		if(type.equals("Motorcycle")) {
			do {
				System.out.println("Input wheel [4 <= wheel <= 6]: ");
				wheel = scan.nextInt();
				scan.nextLine();
			} while (wheel < 2 || wheel > 3);
		} else {
			do {
				System.out.println("Input wheel [2 <= wheel <= 3]: ");
				wheel = scan.nextInt();
				scan.nextLine();
			} while (wheel < 4 || wheel > 6);
		}
		
		if(type.equals("Car")) {
			do {
				System.out.println("Input type [SUV | Supercar | Minivan]: ");
				type2 = scan.nextLine();
			} while (!type2.equals("SUV") && !type2.equals("Supercar") && !type2.equals("Minivan"));
		} else {
			do {
				System.out.println("Input type [Automatic | Manual]: ");
				type2 = scan.nextLine();
			} while (!type2.equals("Automatic") && !type2.equals("Manual"));
		}
		
		if(type.equals("Car")) {
			do {
				System.out.println("Entertainment system amount [>= 1]: ");
				amount = scan.nextInt();
				scan.nextLine();
				
			} while (amount < 1);
			
			kendaraanList.add(new Mobil(brand, name, license, speed, cap, wheel, type2, amount));
		} else {
			do {
				System.out.println("Helm amount [>= 1]: ");
				amount = scan.nextInt();
				scan.nextLine();
			} while (amount < 1);
			
			kendaraanList.add(new Motor(brand, name, license, speed, cap, wheel, type2, amount));
		}
		
		System.out.println("ENTER to return");
		scan.nextLine();
	}
	
	void view() {
		if(kendaraanList.isEmpty()) {
			System.out.println("Tidak ada kendaraan!!");
			System.out.println("Press enter to continue...");
			scan.nextLine();
		} else {
			System.out.println("| No. | Type | Name");
			int i = 0;
			for(Kendaraan kendaraan: kendaraanList) {
				if(kendaraan instanceof Mobil) {
					System.out.println("| " + (i + 1) + " |" + " Car | " + ((Mobil)kendaraan).getName());
				} else {
					System.out.println("| " + (i + 1) + " |" + " Motorcycle | " + ((Motor)kendaraan).getName());
				}
				i++;
			}
			Integer option;
			do {
				System.out.println("Pick a vehicle number to test drive [Enter '0' to exit]: ");
				option = scan.nextInt();
				scan.nextLine();
				if(option == 0) {
					return;
				}
			} while (option < 1 || option > kendaraanList.size());
			
			
			System.out.println("Brand: " + kendaraanList.get(option - 1).getBrand());
			System.out.println("Name: " + kendaraanList.get(option - 1).getName());
			System.out.println("License Plate: " + kendaraanList.get(option - 1).getLicense());
			System.out.println("Type: " + kendaraanList.get(option - 1).getType());
			System.out.println("Gas Capacity: " + kendaraanList.get(option - 1).getCapacity());
			System.out.println("Top Speed: " + kendaraanList.get(option - 1).getSpeed());
			System.out.println("Wheel(s): " + kendaraanList.get(option - 1).getWheel());
			
			if(kendaraanList.get(option - 1) instanceof Mobil) {
				System.out.println("Entertainment System: " + ((Mobil)kendaraanList.get(option - 1)).getSystem());
				System.out.println("Turning on entertainment system...");
				
				if(kendaraanList.get(option - 1).getType().equals("Supercar")) {
					System.out.println("Boosting!");
				}
				scan.nextLine();
			} else {
				System.out.println("Helm: " + ((Motor)kendaraanList.get(option - 1)).getHelm());
				System.out.println(((Motor)kendaraanList.get(option - 1)).getName() + " is standing!");
				scan.nextLine();
				
				int price;
				System.out.println("Input price: ");
				price = scan.nextInt();
				scan.nextLine();
				System.out.println("Price:" + price);
				scan.nextLine();
			}
			
		}
	}
	
	public static void main(String[] args) {
		new Main();
		
	}

}

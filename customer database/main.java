
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class main {
	static String guestOption;
	static List<admin> adminList = new ArrayList<>();
	static List<customer> customerList = new ArrayList<>();
	static item[] itemList = item.values();
	static customer currentCustomer;

	public static void main(String[] args) {
		admin Admin = new admin("a", "a");
		adminList.add(Admin);
		customer Customer = new customer("c", "c");
		customerList.add(Customer);
		while (true) {
			Menu();
		}
	}

	public static void Menu() {
		System.out.println("Welcome!!!");
		System.out.println("1. Login");
		System.out.println("2. Register");
		System.out.print("Choose option: ");
		Scanner input = new Scanner(System.in);
		int option = input.nextInt();

		switch (option) {
		case 1:
			guestOption = "Login";
			GuestMenu2();
			break;
		case 2:
			guestOption = "Register";
			GuestMenu2();
			break;
		case 3:
			return;
		default:
			System.out.println("Invalid option!");

		}

	}

	public static void GuestMenu2() {
		System.out.println("1. Admin");
		System.out.println("2. Customer");
		System.out.print("Choose option: ");
		Scanner input = new Scanner(System.in);
		int option = input.nextInt();

		switch (option) {
		case 1:
			guestOption += "Admin";
			Form();
			break;
		case 2:
			guestOption += "Customer";
			Form();
			break;
		default:
			System.out.println("Invalid !");

		}
	}

	public static void Form() {
		Scanner input = new Scanner(System.in);
		System.out.print("Username: ");
		String username = input.nextLine();
		System.out.print("Password: ");
		String password = input.nextLine();

		int index = getIndexAccount(username, password);

		switch (guestOption) {
		case "LoginAdmin":
			if (index == -1) {
				System.out.println("Username/password incorrect");

			} else {
				Admin();
			}
			break;
		case "RegisterAdmin":
			if (!checkUsername(username)) {
				admin newadmin = new admin(username, password);
				adminList.add(newadmin);
				Admin();
			} else {
				System.out.println("Username already exists!");
			}
			break;
		case "LoginCustomer":
			if (index == -1) {
				System.out.println("Username/password incorrect");
			} else {
				currentCustomer = customerList.get(index);
				CustomerMenu();
			}
			break;
		case "RegisterCustomer":
			if (!checkUsername(username)) {
				customer newcustomer = new customer(username, password);
				currentCustomer = newcustomer;
				customerList.add(newcustomer);
				CustomerMenu();
			} else {
				System.out.println("Username already exists!");

			}
			break;

		}
	}

	// get index of the account when login, return -1 if account doesn't exist
	public static int getIndexAccount(String username, String password) {
		if (guestOption.equals("LoginAdmin")) {
			for (int i = 0; i < adminList.size(); i++) {
				if (adminList.get(i).getUsername().equals(username)
						&& adminList.get(i).getPassword().equals(password)) {
					return i;
				}
			}
		} else {
			for (int i = 0; i < customerList.size(); i++) {
				if (customerList.get(i).getUsername().equals(username)
						&& customerList.get(i).getPassword().equals(password)) {
					return i;
				}
			}
		}
		return -1;
	}

	// check username exists, return true if exist
	public static boolean checkUsername(String username) {
		if (guestOption.equals("RegisterAdmin")) {
			for (int i = 0; i < adminList.size(); i++) {
				if (adminList.get(i).getUsername().equals(username)) {
					return true;
				}
			}
		} else {
			for (int i = 0; i < customerList.size(); i++) {
				if (customerList.get(i).getUsername().equals(username)) {
					return true;
				}
			}
		}
		return false;
	}

	public static void CustomerMenu() {
		while (true) {
			System.out.println("Welcome "+currentCustomer.getUsername());
			System.out.println("CUSTOMER");
			System.out.println("1. Shopping");
			System.out.println("2. MyCart");
			System.out.println("3. Log out");
			System.out.print("Choose option: ");

			Scanner input = new Scanner(System.in);
			int option = input.nextInt();

			switch (option) {
			case 1:
				ItemList();
				break;
			case 2:
				Cart();
				break;
			case 3:
				return;
			default:
				System.out.println("Invalid option!");

			}
		}

	}

	public static int ItemList() {
		while (true) {
			System.out.println("1. " + item.Laptops);
			System.out.println("2. " + item.Mouse);
			System.out.println("3. " + item.Keyboards);
			System.out.println("4. " + item.Desktops);
			System.out.println("5. " + item.Headphones);
			System.out.println("6. " + item.Routers);
			System.out.println("7. My Cart");
			System.out.println("8. Return");
			System.out.print("Choose item: ");

			Scanner input = new Scanner(System.in);
			int option = input.nextInt();
			if (option == 7) {
				Cart();
			} else if (option == 8) {
				return option;
			} else {
				System.out.print("Quantity: ");
				int quantity = input.nextInt();
				itemList[option - 1].setQuantity(quantity);
				currentCustomer.getMyCart().add(itemList[option - 1]);

			}
		}

	}

	public static void Cart() {
		int total = 0;
		List<item> cart = currentCustomer.getMyCart();
		
		System.out.println("MyCart: ");
		for(int i=0; i<cart.size();i++) {
			total+=cart.get(i).getQuantity()*cart.get(i).getPrice();
			System.out.print("["+ cart.get(i)+ ": "+cart.get(i).getQuantity()+"]");
		}
		System.out.println(" Total price: "+ total);
	}

	public static void Admin() {
		while (true) {
			System.out.println("ADMIN");
			System.out.println("1. Customer list");
			System.out.println("2. Log out");
			System.out.print("Choose option: ");

			Scanner input = new Scanner(System.in);
			int option = input.nextInt();

			switch (option) {
			case 1:
				for (customer Customer : customerList) {
					System.out.print(Customer);
					
				}
				System.out.println();
				break;
			case 2:
				return;
			default:
				System.out.println("Invalid option!");

			}
		}
	}
}

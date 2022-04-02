/**
 * Write a description of interface driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 *//**
 * Write a description of interface driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


import java.util.Scanner;




public class TestPizzaOrder {
	
	

	public static void main(String[] args) {
		
		try (Scanner reader = new Scanner(System.in)) {
			PizzaOrder order = new PizzaOrder();
			System.out.println("Welcome to  the pizza Ordering  system");
			System.out.println("Please put in your name");
			String tempName=reader.nextLine();
			String ownersName=("koyi");
		


			for(;;) {
				
				System.out.println("\n \n"
						+ "\n" + "Press 1 to add a pizza"
						+ "\n" + "Press 2 to proceed to checkout");
				
				int tempChoice = reader.nextInt();
				
				if(tempChoice == 1) {
					
					System.out.println("\n" + "What Size Pizza do you want" + "\n" + "Small \n" + "Medium \n" + "Large \n" + "X Large");
					String tempSize = reader.next();

					System.out.println("\n" + "How many Toppings do you want: " + "choose 1 to 12 toppings");
					int tempToppings = reader.nextInt();

					System.out.println("\n" + "Do you want extra cheese for £5 (Y/N)");
					char tempChoice2 = reader.next().charAt(0);
					
					Boolean tempHasExtraCheese;
					
					if(tempChoice2 == 'Y' | tempChoice2 == 'y') {
						tempHasExtraCheese = true;
					} else {
						tempHasExtraCheese = false;
					}
					
					order.addPizza(tempSize, tempToppings, tempHasExtraCheese);
				} else if(tempChoice == 2) {
					
					System.out.println("Customers Name:"+tempName);
					order.addTax();
					if (tempName.equalsIgnoreCase(ownersName)){
						order.discount();}
					else {
						order.printBill();
					}
					
					break;
				}
			}


			reader.close();
		}
	}

	
	
}

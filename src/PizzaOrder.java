/**
 * Write a description of interface driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PizzaOrder {
	
	private Pizza[] pizzas = new Pizza[10];
	private int numOfPizzas = 0;
	private double subTotal;
	private double total;
	private double discountTotal;
	
	

	
	public void addPizza(String size, int toppings, boolean hasExtraCheese) {
		
		pizzas[numOfPizzas] = new Pizza(size, toppings, hasExtraCheese);
		subTotal += pizzas[numOfPizzas].price();
		numOfPizzas++;
	}
	
	

	
	public void addTax() {
		
		total = subTotal * 1.05;
		
		if(subTotal < 1000) {
			total += 40;
		}
	}
	public void discount() {
		double discount = this.total * 0.2;
		System.out.println("eligible for 20% Discount ");
		this.discountTotal = this.total - discount;	
			
		System.out.println("\n \n \n " + "Bill for pizza order");
		System.out.println("================================================================================================================================================================" + "\n");
		
		for(int i = 0; i < this.numOfPizzas; i++) {
			
			System.out.println("Pizza" + (i + 1) + ": " + pizzas[i].getSize() + " size, ");
			System.out.print(pizzas[i].getToppings() + " toppings");
			
			if(pizzas[i].isHasExtraCheese()) {
				System.out.print(", has extra cheese");
			}
			
			System.out.println("					price = " + pizzas[i].price() + "£" + "\n");
		}
		
		System.out.println("================================================================================================================================================================" + "\n");
		
		System.out.println("SubTotal = " + this.subTotal);
		System.out.println("\n		" + "+ 5% VAT");
		if(this.subTotal < 1000) {
			System.out.println("\n		" + "+ 40£ delivery charge");
		} else {
			System.out.println("\n		" + "FREE DELIVERY");
		}
		
	
		System.out.println("eligible for 20% Discount ");

		System.out.println("================================================================================================================================================================" + "\n");
		
		System.out.println("Total = " + this.discountTotal);
	}
	

		
	public void printBill() {
		
		System.out.println("\n \n \n " + "Bill for pizza order");
		System.out.println("================================================================================================================================================================" + "\n");
		
		for(int i = 0; i < this.numOfPizzas; i++) {
			
			System.out.println("Pizza" + (i + 1) + ": " + pizzas[i].getSize() + " size, ");
			System.out.print(pizzas[i].getToppings() + " toppings");
			
			if(pizzas[i].isHasExtraCheese()) {
				System.out.print(", has extra cheese");
			}
			
			System.out.println("					price = " + pizzas[i].price() + "£" + "\n");
		}
		
		System.out.println("================================================================================================================================================================" + "\n");
		
		System.out.println("SubTotal = " + this.subTotal);
		System.out.println("\n		" + "+ 5% VAT");
		if(this.subTotal < 1000) {
			System.out.println("\n		" + "+ 40£ delivery charge");
		} else {
			System.out.println("\n		" + "FREE DELIVERY");
		}
		
		System.out.println("================================================================================================================================================================" + "\n");
		
		System.out.println("Total = " + this.total);
	}
	
}


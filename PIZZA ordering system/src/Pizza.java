/**
 * Write a description of interface driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


public class Pizza {
	
		
		private String size;
		private int toppings;
		private boolean hasExtraCheese;

		

		public Pizza(String size, int toppings, boolean hasExtraCheese) {
			
			this.size = size;
			this.toppings = toppings;
			this.hasExtraCheese = hasExtraCheese;
		}
		

		public String getSize() {
			return size;
		}

		public int getToppings() {
			return toppings;
		}
		
		public boolean isHasExtraCheese() {
			return hasExtraCheese;
		}

		public double price() {
			
			double price = 0;
			
			if(size.equals("Small")) {
				price += 399;
			} else if(size.equals("Medium")) {
				price += 450;
			} else if(size.equals("Large")) {
				price += 599;
			} else if(size.equals("X Large")) {
				price += 650;
			}
			
			if(toppings > 10) {
				price += 80;
			} else if(toppings > 8) {
				price += 70;
			} else if(toppings > 5) {
				price += 60;
			} else if(toppings > 3) {
				price += 50;
			}
			
			if(hasExtraCheese) {
				price += 50;
			}
			
			return price;
		}
	}

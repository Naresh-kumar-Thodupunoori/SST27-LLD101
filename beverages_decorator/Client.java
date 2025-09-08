package beverages_decorator;

public class Client {

	public static void main(String[] args) {
		

		
		Beverage coffee = new Cappuccino();
        System.out.println("Plain Cappuccino: " + coffee.cost());
		Beverage chocoCappuccino = new ChocolateDecorator(coffee);
		System.out.println("+ Chocolate: " + chocoCappuccino.cost());
		Beverage sweetChocoLatte = new SugarDecorator(new ChocolateDecorator(new Latte()));
		System.out.println("Latte + Chocolate + Sugar: " + sweetChocoLatte.cost());

	}

}
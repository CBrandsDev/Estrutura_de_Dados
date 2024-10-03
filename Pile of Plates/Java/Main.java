public class Main {

    public static void main(String[] args) {
        Stackable Pile = new Pile(5);
		Pile.stack("Glass plate");
		Pile.stack("Iron plate");
		System.out.println("You have a: " + Pile.spy() + " in top");		
		Pile.stack("Aluminum plate");
		Pile.stack("Porcelain plate");
		Pile.stack("Marble plate");		
		System.out.println("You have a: " + Pile.spy() + " in top");		
		Pile.unstack();
        System.out.println("You have a: " + Pile.spy() + " in top");
		Pile.update("Wood plate");
		System.out.println("The pile = "+Pile.print());


    }
}
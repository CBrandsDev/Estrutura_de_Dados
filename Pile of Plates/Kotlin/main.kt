fun main(args: Array<String>) {
        var Pile: Stackable = Pile(5)
		Pile.stack("Wood plate");
		Pile.stack("Marble plate");
		System.out.println("You have a: " + Pile.spy() + " in top");		
		Pile.stack("Porcelain plate");
		Pile.stack("Aluminium plate");
		Pile.stack("Iron plate");		
		System.out.println("You have a: " + Pile.spy() + " in top");		
		Pile.unstack();
        System.out.println("You have a: " + Pile.spy() + " in top");
		Pile.update("Glass plate");
		System.out.println("The pile = "+Pile.print());


}

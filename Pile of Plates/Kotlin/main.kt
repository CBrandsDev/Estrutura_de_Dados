fun main() {
        var Pile: Stackable = Pile(5)
		Pile.stack("Wood plate")
		Pile.stack("Marble plate")
		println("You have a: ${Pile.spy()} in top")
		Pile.stack("Porcelain plate")
		Pile.stack("Aluminium plate")
		Pile.stack("Iron plate")
		println("You have a: ${Pile.spy()} in top")	
		Pile.unstack()
        println("You have a: ${Pile.spy()} in top")
		Pile.update("Glass plate")
		println("The pile = ${Pile.print()}")


}

fun main() {
        var pile: Stackable = Pile(5)
		pile.stack("Wood plate")
		pile.stack("Marble plate")
		println("You have a: ${pile.spy()} in top")
		pile.stack("Porcelain plate")
		pile.stack("Aluminium plate")
		pile.stack("Iron plate")
		println("You have a: ${pile.spy()} in top")	
		pile.unstack()
        println("You have a: ${pile.spy()} in top")
		pile.update("Glass plate")
		println("The pile = ${pile.print()}")


}

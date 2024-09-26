fun main(args:Array<String>) {
    var Pile: Stackable = StaticPile(5)
    Pile.stack("Glass Plate")
    Pile.stack("Porcelain Plate")
    Pile.wash()
    Pile.refresh("Artesanal Plate")
    Pile.stack("Aluminium Plate")
    Pile.unstack()
    Pile.stack("Wooden Plate")
    Pile.wash()
    Pile.stack("Toy Plate")
    Pile.print()
}
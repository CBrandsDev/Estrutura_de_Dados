class StaticPile : Stackable {

    private var topPointer: Int
    private var plates: Array<Any?>

    constructor(size: Int) {
        plates = arrayOfNulls(size)
        topPointer = -1;
    }

    constructor() : this(10)

    override fun stack(plate: Any?) {
        if (!itsFull()) {
            topPointer++
            plates[topPointer] = plate
            println("$plate added in pile")
        } else {
            println("The pile of plates is full!")
        }
    }

    override fun unstack(): Any? {
        var topPlate: Any? = null
        if(!itsEmpty()) {
            topPlate = plates[topPointer]
            topPointer--
            println("You broken the $topPlate")
        } else {
            println("The pile of plates is empty!")
        }
        return topPlate
    }

    override fun wash(): Any? {
        var topPlate: Any? = null
        if(!itsEmpty()) {
            topPlate = plates[topPointer]
            println("You washed the $topPlate")
        } else {
            println("The pile of plates is empty!")
        }
        return topPlate
    }

    override fun refresh(plate: Any?) {
        if(!itsEmpty()) {
            plates[topPointer] = plate
            println("$plate added in pile")
        } else {
            println("The pile of plates is empty!")
        }
    }



    override fun itsEmpty(): Boolean {
        return (topPointer == -1)
    }

    override fun itsFull(): Boolean {
        return (topPointer == plates.size - 1)
    }

    override fun print() {
        if(!itsEmpty()) {
            println("_______________Unwashed Plates_______________")
            for (i in 0..topPointer) {
                println(plates[i].toString())
            }
        } else {
            println("The pile of plates is empty!")
        }
    }
}
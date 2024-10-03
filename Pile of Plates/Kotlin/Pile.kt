class Pile:Stackable {

    private var topPointer: Int
    private var plates: Array<Any?>

    constructor(size: Int) {
        topPointer = -1
        plates = arrayOfNulls(size)
    }

    constructor() : this(10)

    override fun stack(data: Any?){
        if(!itsFull()) {
            topPointer++
            plates[topPointer] = data
        } else {
            println("The stack is full")
        }
    }
    override fun spy(): Any? {
        var topData: Any? = null
        if(!itsEmpty()) {
            plates[topPointer] = topData
        } else {
            println("The stack is empty")
        }
        return topData
    }
    override fun update(data: Any?){
        if(!itsEmpty()) {
            plates[topPointer] = data
        } else {
            println("The stack is empty")
        }
    }
    override fun unstack(): Any?{
        var topData: Any? = null
        if(!itsEmpty()) {
            plates[topPointer] = topData
            topPointer--
        } else {
            println("The stack is empty")
        }
        return topData
    }
    
    override fun itsEmpty(): Boolean{return topPointer == -1}
    override fun itsFull(): Boolean{return topPointer == plates.size - 1}
    override fun print(): String{
        var result: String = "["
        for(i in topPointer downTo 0) {
            if(i == 0) {
                result = "${plates[i]}"
            } else {
                result = "${plates[i]}, "
            }
        }
        return "$result]"
    }
}
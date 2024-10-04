class Queue(private var size: Int = 10):Queueable {

    override fun enqueue(data: Any?) {} 
    override fun call(): Any? {}
    override fun update(data: Any?) {}
    override fun dequeue(): Any? {}
    // Aux Methods
    override fun itsEmpty(): Boolean {}                   
    override fun itsFull(): Boolean {}                   
    override fun print(): String {}
}



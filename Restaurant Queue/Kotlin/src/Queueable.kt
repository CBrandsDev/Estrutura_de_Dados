package queue
interface Queueable {
    // Main Methods
    fun enqueue(data: Any?) 
    fun call(): Any?
    fun update(data: Any?)
    fun dequeue(): Any?
    // Aux Methods
    fun itsEmpty(): Boolean                   
    fun itsFull(): Boolean                   
    fun print(): String                   
    
}
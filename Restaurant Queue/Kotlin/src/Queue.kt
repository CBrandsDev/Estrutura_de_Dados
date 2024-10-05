package queue

class Queue(private var size: Int = 10):Queueable {

    private var initialPointer: Int = 0
    private var finalPointer: Int = -1
    private var clients: Array<Any?> = arrayOfNulls(size)

    override fun enqueue(data: Any?) {
        if(!itsFull()) {
            finalPointer++
            clients[finalPointer] = data
        } else {
            println("The queue is full")
        }
    } 
    override fun call(): Any? {
        var firstClient: Any? = null
        if(!itsEmpty()) {
            firstClient = clients[initialPointer]
            println("The next customer is ${firstClient}")
        } else {
            println("The queue is empty")
        }
        return firstClient
    }

    override fun update(data: Any?) {
        if(!itsEmpty()) {
            clients[initialPointer] = data
        } else {
            println("The queue is empty")
        }
    }
    override fun dequeue(): Any? {
        var nextClient: Any? = null
        if(!itsEmpty()) {
            nextClient = clients[initialPointer]
            initialPointer++
        } else {
            println("The queue is empty")
        }
        return nextClient
    }
    
    override fun itsEmpty(): Boolean {return initialPointer == finalPointer +1}                   
    override fun itsFull(): Boolean {return finalPointer == clients.size -1}                   
    override fun print(): String {
        var result = "["
        for(i in initialPointer .. finalPointer) {
            if(i == finalPointer) {
                result += "${clients[i]}"
            } else {
                result += "${clients[i]}, "
            }
        }
        return "$result]"
    }
}



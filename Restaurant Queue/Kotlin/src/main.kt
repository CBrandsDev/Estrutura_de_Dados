package queue


fun main() {
    var queue: Queueable = Queue(10)
    queue.enqueue("Alisson");
    println(queue.call())	
    queue.enqueue("João")
    queue.enqueue("Ana")
    queue.enqueue("Otavio")
    queue.dequeue()
    queue.enqueue("Joana")
    queue.enqueue("Camila")
    println(queue.call())
    println(queue.call())	
    queue.enqueue("Jessica")
    queue.enqueue("Pedro")
    queue.enqueue("Gustavo")
    queue.enqueue("Rafael")				
    println(queue.print())
}
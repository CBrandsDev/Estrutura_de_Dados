interface Stackable {

    // Main methods                       CRUD Method
    fun stack(plate: Any?)    // Create : add a new item in the pile
    fun wash(): Any?           // Read   : return the top item value
    fun refresh(plate: Any?)    // Update : update the top item in the pile
    fun unstack(): Any?          // Delete : erase the top item in the pile

    // Auxiliary methods
    fun itsEmpty(): Boolean
    fun itsFull(): Boolean
    fun print()
}
interface Stackable {
    // Main Methods
    fun stack(data: Any?)
    fun spy(): Any?
    fun update(data: Any?)
    fun unstack(): Any?
    // Aux Methods
    fun itsEmpty(): Boolean
    fun itsFull(): Boolean
    fun print(): String

}
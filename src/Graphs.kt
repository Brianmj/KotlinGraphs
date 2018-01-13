open class Node() {
    private companion object {
        var counter = 0
        fun nextId() = counter++
    }

    val id: Int

    init {
        id = nextId()
    }
}

open class NavGraphNode : Node() {
    private var pos = Vec()

    var position: Vec
    get() = pos
    set(value){pos = value}

    override fun toString(): String {
        return "(x: ${position.xDir}, y: ${position.yDir})"
    }
}
open class Node {
    private companion object {
        var counter = 0
        fun nextId() = counter++
    }

    val id: Int

    init {
        id = nextId()
    }
}

class NavGraphNode : Node() {

}
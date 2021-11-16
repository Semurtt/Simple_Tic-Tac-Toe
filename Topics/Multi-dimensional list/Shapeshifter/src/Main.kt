fun main() {
    // Do not touch code below
    val inputList: MutableList<MutableList<String>> = mutableListOf()
    val n = readLine()!!.toInt()
    for (i in 0 until n) {
        val strings = readLine()!!.split(' ').toMutableList()
        inputList.add(strings)
    }
    val newList = mutableListOf(
        mutableListOf<String>(),
        mutableListOf<String>()
    )
    newList[0] = inputList.last()
    newList[newList.lastIndex] = inputList.first()
    println(newList)
}


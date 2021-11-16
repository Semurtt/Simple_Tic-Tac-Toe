fun main() {
    val n = readLine()!!.toInt()
    val income = mutableListOf<Int>()
    val taxes = mutableListOf<Int>()
    var eachTaxes = 0
    var maxTaxes = 0
    var temp = 0
    for (i in 0 until n) {
        income.add(readLine()!!.toInt())
    }
    for (i in 0 until n) {
        taxes.add(readLine()!!.toInt())
    }
    for (i in 0 until n) {
        eachTaxes = income[i] * taxes[i]
        if (eachTaxes > maxTaxes) {
            maxTaxes = eachTaxes
            temp = i
        }
    }
    println(temp + 1)
}

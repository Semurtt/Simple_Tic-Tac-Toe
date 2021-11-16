fun main() {
    val string = readLine()!!
    var count = 1
    var temp = 'z'
    if (string == string[0].toString()) {
        temp = string[0]
    }
    for (i in 0 until string.lastIndex) {
        if (string[i] == string[i + 1]) {
            count++
            temp = string[i]
        }
        if (string[i] != string[i + 1]) {
            print("${string[i]}$count")
            count = 1
            temp = string[i + 1]
        }
    }
    print("$temp$count")
}

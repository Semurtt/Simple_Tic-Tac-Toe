fun main() {
    val (a, b, c, n) = readLine()!!.split(" ")
    val upperCase = ('A'..'Z').joinToString("")
    val lowerCase = ('a'..'z').joinToString("")
    val digits = ('0'..'9').joinToString("")
    val cht = ('Z' downTo 'A').joinToString("")
    val aa = a.toInt()
    val bb = b.toInt()
    val cc = c.toInt()
    val nn = n.toInt() - aa - bb - cc
    var aaa = ""
    var bbb = ""
    var ccc = ""
    var nnn = ""
    if (aa > 25) {
        repeat(aa / 26) {
            aaa += upperCase.subSequence(0, 26).toString()
        }
    }
    aaa += upperCase.subSequence(0, aa % 26).toString()
    if (bb > 25) {
        repeat(bb / 26) {
            bbb += lowerCase.subSequence(0, 26).toString()
        }
    }
    bbb += lowerCase.subSequence(0, bb % 26).toString()
    if (cc > 9) {
        repeat(cc / 10) {
            ccc += digits.subSequence(0, 10).toString()
        }
    }
    ccc += digits.subSequence(0, cc % 10).toString()
    if (nn > 0) {
        if (nn > 25) {
            repeat(nn / 26) {
                nnn += cht.subSequence(0, 26).toString()
            }
        }
        nnn += cht.subSequence(0, nn % 26).toString()
    }
    println("$aaa$bbb$ccc$nnn")
}
package Kotlin基础.迭代事物

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/01/02
 *     desc   : 使用in运算符来检查一个值是否在区间中
 * </pre>
 */
fun isLetter(c :Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNotDigit(c : Char) = c !in '0'..'9'
fun recognize(c : Char) = when(c){
    in '0'..'9' -> "It's a digit!"
    in 'a'..'z',in 'A'..'Z' -> "It's a letter!"
    else -> "I don't know..."
}

fun main(args : Array<String>){
    println(isLetter('q'))
    println(isNotDigit('x'))
    println(recognize('8'))
}
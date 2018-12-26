package Kotlin基础.基本要素

fun max(a: Int, b: Int):Int {
    return if (a > b) a else b
}

/**
 * 只有表达式函数体可以省略函数的返回类型
 */
fun min(a :Int, b : Int) = if(a < b) a else b

fun main(args :Array<String>){
    println(max(1,2))
    println(min(1,2))
}
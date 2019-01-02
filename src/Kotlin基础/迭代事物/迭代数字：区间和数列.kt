package Kotlin基础.迭代事物

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/01/02
 *     desc   : 在Kotlin中没有常规的for循环，取而代之的是区间。
 *     区间的本质上就是两个值之间的间隔，这两个值通常是数字：一个起始值，一个结束值，
 *     使用..运算符来表示区间：
 *      val oneToTen = 1..10
 * </pre>
 */

fun fizzBuzz(i : Int) = when {
    i % 15 == 0 -> "FizzBuzz "
    i % 3 == 0 -> "Fizz "
    i % 5 == 0 -> "Buzz "
    else -> "$i "
}
fun main(args :Array<String>){
    for(i in 1..100){
        print(fizzBuzz(i))
    }
    println()
    /*
    迭代一个带步长的数列，允许跳过一些数字。
     */
    for(i in 100 downTo 1 step 2){
        print(fizzBuzz(i))
    }
}
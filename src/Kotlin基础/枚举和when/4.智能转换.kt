package Kotlin基础.枚举和when


/**
 * <pre>
 *     author : 残渊
 *     time   : 2018/12/28
 *     desc   : 代码块最后的表达式就是结果
 * </pre>
 */


interface Expr

class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr


fun eval(e: Expr): Int =
    when(e){
        is Num -> {
            println("num : ${e.value}")
            e.value
        }
        is Sum -> {
            val left = eval(e.left)
            val right = eval(e.right)
            println("Sum :$left + $right")
            left + right
        }
        else -> throw IllegalArgumentException("Unknown Exception")
    }

fun main(args: Array<String>) {
    println(eval(Sum(Sum(Num(1), Num(2)), Num(5))))
}
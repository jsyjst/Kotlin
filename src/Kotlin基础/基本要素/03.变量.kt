package Kotlin基础.基本要素

/**
 * 1.如果变量没有初始化器，需要显式的指定它的类型
 * 2.val(value)-不可变引用，对应java的final
 * 3.var(variable)-可变引用，这种值可以改变，对应java的普通变量
 */
fun main(args : Array<String>){
    val  message = "you are a good student"
    var answer = 100
    answer = 90
    println(answer)
    println(message)
}
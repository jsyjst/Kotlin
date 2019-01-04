package Kotlin基础.基本要素
import 函数的定义与调用.lastChar as last

/**
 * <pre>
 *     author : 残渊
 *     time   : 2018/12/26
 *     desc   : 更简单的字符串格式化,使用“$”代替java的“+”,如果需要在字符串中引用局部变量
 *              只需要在变量名称前面加上字符$
 * </pre>
 */
fun main(args : Array<String>){
    val name = if(args.isNotEmpty()) args[0] else "Kotlin"
    println("Hello,$name !")
    println("Hello ,${if(args.isNotEmpty()) args[0] else "Someone"}!")
    println("Kotlin".last())
}
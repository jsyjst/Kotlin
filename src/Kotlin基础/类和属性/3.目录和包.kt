package Kotlin基础.类和属性

import java.util.*

/**
 * <pre>
 *     author : 残渊
 *     time   : 2018/12/27
 *     desc   :
 * </pre>
 */

fun createRandomRectangle():Rectangle{
    val random = Random()
    return Rectangle(random.nextInt(),random.nextInt())
}
fun main(args : Array<String>){
    println(createRandomRectangle().isSquare)
}
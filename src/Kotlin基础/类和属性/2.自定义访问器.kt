package Kotlin基础.类和属性

/**
 * <pre>
 *     author : 残渊
 *     time   : 2018/12/27
 *     desc   :
 * </pre>
 */

class Rectangle(val height :Int ,val width : Int){
    val isSquare :Boolean
    get() =  height == width
}
fun main (args : Array<String>){
    val rectangle = Rectangle(41,43)
    println(rectangle.isSquare)
}
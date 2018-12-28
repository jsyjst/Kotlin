package Kotlin基础.枚举和when

/**
 * <pre>
 *     author : 残渊
 *     time   : 2018/12/28
 *     desc   : 枚举类，当我们声明每个枚举常量的时候，必须提供该常量的属性值。
 *     下面的例子展示了Kotlin中唯一必须使用分号的地方：如果要在枚举类中定义任何方法
 *     就要使用分号把枚举常量列表和方法定义分开
 * </pre>
 */

enum class Color(val r:Int ,val g:Int , val b: Int){
    RED(255,0,0),ORANGE(255,165,0),
    YELLOW(255,255,0),BLUE(0,0,255),
    GREEN(75,0,130);

    fun rgb() = (r*256+g)*256+b
}
fun main(args : Array<String>){
    println(Color.BLUE.rgb())
}
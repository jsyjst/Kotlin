package Kotlin基础.枚举和when
import Kotlin基础.枚举和when.Color.*;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2018/12/28
 *     desc   : when允许使用任何对象
 * </pre>
 */

/**
 * 混合两种颜色
 */
fun mix(c1:Color , c2 : Color) =
        when (setOf(c1,c2)){
            setOf(RED, YELLOW) -> ORANGE
            setOf(YELLOW, BLUE) -> GREEN
            else -> throw Exception("Dirty color")
        }
fun main (args : Array<String>){
    println(getMnemonic(mix(YELLOW ,RED)))
}
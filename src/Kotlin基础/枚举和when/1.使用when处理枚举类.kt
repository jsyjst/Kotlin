package Kotlin基础.枚举和when



/**
 * <pre>
 *     author : 残渊
 *     time   : 2018/12/28
 *     desc   :
 * </pre>
 */

fun getMnemonic(color : Color) =
    when (color){
        Color.BLUE -> "Blue"
        Color.GREEN -> "green"
        Color.ORANGE -> "orange"
        Color.RED -> "red"
        Color.YELLOW -> "yellow"
    }
fun getWarmth(color: Color) = when(color){
    Color.YELLOW,Color.RED,Color.ORANGE -> "warm"
    Color.GREEN -> "neutral"
    Color.BLUE -> "cold"
}
fun main (args : Array<String>){
    println(getMnemonic(Color.RED))
    println(getWarmth(Color.RED))
}
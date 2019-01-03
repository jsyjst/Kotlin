package Kotlin基础.迭代事物

import java.util.*

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/01/02
 *     desc   : 打印字符二进制表示的小程序
 * </pre>
 */


fun main (args : Array<String>) {
    val binaryReps = TreeMap<Char, String>()
    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps [c] = binary
    }
    for((letter,binary) in binaryReps){
        println("$letter = $binary")
    }
}
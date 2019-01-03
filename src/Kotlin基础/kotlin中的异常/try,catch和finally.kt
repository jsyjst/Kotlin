package Kotlin基础.kotlin中的异常

import java.io.BufferedReader
import java.io.StringReader

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/01/03
 *     desc   : 和java一样，使用带有catch和finally字句的try来处理异常
 * </pre>
 */

/**
 * 从给定的文件读取一行，尝试解析成数字，并返回这个数字；
 * 当这一行不是一个有效数字时返回null
 */
fun readNumber(reader : BufferedReader) :Int? {
    try{
        val line = reader.readLine()
        return Integer.parseInt(line)
    }catch (e : NumberFormatException) {
        return null
    }finally {
        reader.close()
    }
}
fun main(args : Array<String>){
    val reader = BufferedReader(StringReader("239"))
    println(readNumber(reader))
}
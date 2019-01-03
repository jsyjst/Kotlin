package Kotlin基础.kotlin中的异常

import java.io.BufferedReader
import java.io.StringReader

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/01/03
 *     desc   :
 * </pre>
 */
fun readNum(reader : BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    }catch (e : NumberFormatException){
        null
    }
    println(number)
}
fun main (args : Array<String>){
    val reader = BufferedReader(StringReader("not a number"))
    readNum(reader)
}
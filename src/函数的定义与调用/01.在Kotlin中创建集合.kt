package 函数的定义与调用

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/01/03
 *     desc   : Kotlin没有采取自己的集合类，而是采用了标准的java集合类
 * </pre>
 */
fun main(args : Array<String>){
    val set = hashSetOf(1,7,3)
    val list = arrayListOf(1,7,3)
    val map = hashMapOf(1 to "one",7 to "seven",53 to "fifty-three")

    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)

    val strings = listOf("first","second","fourteenth")
    println(strings.last())

    val number = setOf(1,14,2)
    println(number.max())
}
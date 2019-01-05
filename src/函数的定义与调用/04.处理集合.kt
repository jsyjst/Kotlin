package 函数的定义与调用

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/01/05
 *     desc   : 展示Kotlin标准库中用来处理集合的一些方法，另外涉及几个相关的语言特性：
 *     1.可变参数的关键字vararg，可以用来声明一个函数将可能有任意数量的参数
 *     2.一个中缀的表示法
 *     3.解构声明，用来把一个单独的组合值展开到多个变量中
 * </pre>
 */

fun main(args :Array<String>){
    val list = listOf("args: ",*args)
    println(list)

    val map = mapOf(1 to "one",2 to "two",6 to "six")
    println(map[1])

}

package 函数的定义与调用

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/01/06
 *     desc   :
 * </pre>
 */

fun main (args : Array<String>){

    println("12.345-6.A".split("\\.|-".toRegex()))
    println("12.345-6.A".split(".","-"))

    parsePath("/Users/yole/kotlin-book/chapter.adoc")

    /**
     * 多行字符串包含三重引号之间的所有字符，包括用于格式化代码的缩进
     * trimMargin来删除每行中的前缀和前面的空格
     * 一个三重引号的字符串可以包含换行，不用使用\n.也可以不必使用转义字符\
     */
    val kotlinlogo = """| //
                       .|//
                       .|/ \
    """.trimMargin(".")
    println(kotlinlogo)
}

fun parsePath(path :String){
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")

    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")

    println("Dir:$directory,name:$fileName,ext:$extension")
}


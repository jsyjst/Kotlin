package 函数的定义与调用
/**
 * 通过在元素中间添加分割符号，在最前面添加前缀，在最末尾添加后缀的方式把集合
 * 的元素逐一添加到stringBuilder的过程
 */
fun <T> joinToString(
        collection: Collection<T>,
        separator : String = ", ",
        prefix :String = "",
        postfix :String  = ""
) :String{
    val result = StringBuilder(prefix)
    for((index, element) in collection.withIndex()){
        if(index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/01/03
 *     desc   :
 * </pre>
 */

fun main(args :Array<String>){
    val list = listOf(1,2,3)
    println(joinToString(list,separator = ";",prefix = "(",postfix = ")"))
    println(joinToString(list))
    println(joinToString(list,"; "))
}


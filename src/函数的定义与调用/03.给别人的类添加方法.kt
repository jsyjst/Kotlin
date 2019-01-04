package 函数的定义与调用

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/01/04
 *     desc   : 扩展函数不允许打破它的封装性。和类内部定义的方法不同，
 *     扩展函数不能访问私有的或者受保护的成员
 * </pre>
 */

fun main(args : Array<String>){
    val list = listOf(1,2,3)
    println("Kotlin".lastChar())
    println(list.joinToString())
    println(listOf("one","two","three").join(" "))

    //重写成员函数
    val view : View = Button()
    view.click()
    view.showOff()
    
}

fun String.lastChar() :Char = get(length - 1)

/**
 * 给元素的集合类添加一个扩展函数
 */
fun <T> Collection<T>.joinToString(
        separator : String = ", ",
        prefix :String ="",
        postfix : String = ""
): String{
    val result = StringBuilder(prefix)
    for((index,element) in this.withIndex()){
        if(index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return  result.toString()
}
fun Collection<String>.join(
        separator : String = ", ",
        prefix :String ="",
        postfix : String = ""
)= joinToString(separator,prefix,postfix)

open class View{
    open fun click() = println("View clicked")
}
class Button : View(){
    override fun click() {
        println("Button clicked")
    }
}

/**
 * 同名扩展函数被调用时由变量的静态类型所决定，而不是这个变量的运行时的类型
 */
fun View.showOff() = println("I am a View!")
fun Button.showOff() = println("I am a Button!")
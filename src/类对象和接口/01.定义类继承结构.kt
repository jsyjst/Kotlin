package 类对象和接口

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/01/07
 *     desc   : 与java做比较。Kotlin的可见性和访问修饰符，它们与java中的类似
 *     但是还是有些不一样的默认行为。同时会认识一个新的用于限制一个类可能存在
 *     的子类的sealed修饰符
 * </pre>
 */


fun main (args : Array<String>){
    val button = Button()
    button.showOff()
    button.setFocus(true)
    button.click()
}

/**
 * 声明接口
 */
interface Clickable{
    fun click()
    fun showOff() = println("I'm clickAble!")
}
interface Focusable{
    fun setFocus(b : Boolean) =
            println("I ${if(b) "got" else "lost"} focus." )
    fun showOff() = println("I'm focusAble!")
}

class Button: Clickable,Focusable{
    override fun click() = println("I was clicked")
    /**
     * 如果同样的继承成员有不止一个的实现，必须提供一个显示实现
     * 使用尖括号加上父类型名字的super表面你想要调用哪一个父类的方法
     */
    override fun showOff() = super<Clickable>.showOff()
}

/**
 * java的类和方法默认是open的，而Kotlin中默认是final的
 * 如果你想允许创建一个类的子类，需要使用open修饰符来标示这个类
 * 此外，需要给每一个可以被重写的属性和方法添加open修饰符
 */
open class RichButton : Clickable {
    fun disable(){}
    open fun animate(){}
    override fun click() {} //这个函数重写了一个open函数并且它本身同样是open的，如果想改变此行为，显示标注final
}

abstract class Animated{
    abstract fun animate()

    open fun stopAnimating(){}

    fun animateTwice(){}
}
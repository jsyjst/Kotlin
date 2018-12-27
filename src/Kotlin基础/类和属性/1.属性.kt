package Kotlin基础.类和属性

/**
 * <pre>
 *     author : 残渊
 *     time   : 2018/12/27
 *     desc   : 在Kotlin中属性是头等的语言特性，完全替代了字段和访问器方法
 * </pre>
 */

class Person(
        val name:String,
        var isMarried : Boolean
)
fun main(args : Array<String>){
    var person = Person("Bob",true)
    println(person.name)
    person.isMarried = false
    println(person.isMarried)
}

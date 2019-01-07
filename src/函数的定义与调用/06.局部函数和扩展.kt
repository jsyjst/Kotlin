package 函数的定义与调用

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/01/06
 *     desc   :
 * </pre>
 */

class User(val id :Int,val name:String,val address:String)

fun main(args :Array<String>){
    saveUser(User(1,"jsyjst","5"))
}

fun User.validateBeforeSave(){
    fun validate(value :String,filedName:String){
        if(value.isEmpty()){
            throw  IllegalArgumentException(
                    "Can't save user $id : empty $filedName"
            )
        }
    }
    validate(name,"Name")
    validate(address,"Address")
}
fun saveUser(user: User){
    user.validateBeforeSave()
    //保存user到数据库
}
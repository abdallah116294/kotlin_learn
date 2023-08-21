fun main() {
    var name:String?= readln()
    if (name==null){
        name=null
    }
    val message=if(name!!.isNotEmpty())
    {
        "Hello $name"
    } else {
        "pleas enter your name"
    }
  println(message)
}
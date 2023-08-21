fun  main(){
//    var num1: String? = readln();
//    var num2:String?= readln();
    val  input1= readln()
    var operator:String?= readln();
    val  input2= readln()
  //  println(input1+operator+input2+"=")
    var result:Int?
    val num1= input1.toIntOrNull()
    val  num2= input2.toIntOrNull()
    when(operator){
        "+"-> if (num1 != null) {
            if (num2 != null) {
               result=(num1+num2)
                println(input1+operator+input2+"="+result)
            }
        }
        "-"->if (num1!=null){
            if (num2!=null){
              result=(num1-num2)
                println(input1+operator+input2+"="+result)
            }
        }
        "*"->if(num1!=null){
            if(num2!=null){
              result=(num2*num2)
                println(input1+operator+input2+"="+result)
            }
        }
        "/"->if (num1!=null){
            if (num2!=null){
                result=(num1/num2)
                println(input1 + operator + input2+ "=" + result)

            }
        }
        else->"not available"
    }
}
package basics

class WhenExpr {
}
fun main(){
    print(describe(obj = "hello"))
}
fun describe(obj: Any):String =
    when(obj){
        1 -> "one"
        "hello" -> "Greeting"
        else -> "a default"
    }
import java.lang.Integer.max

fun main() {
    var a=10
    var b=11
    b=b*10
    println("main="+b)
//    val c:Int=10
//    c=c*10
//    println(c)
    println(name(2,10))

}
fun name(num1:Int,num2:Int):Int{
    return max(num1,num2);
}
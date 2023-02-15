fun main(){
    printName("Alice")
   var remainder= modulus(172,134)
    println(remainder)
    var sum = addition(5,5,6,7,)
    println(sum)

    var me=fact("I am smart")

}
fun printName(name:String){
    println("hello"+" " +name)
}
fun modulus(num1:Int,num2:Int):Int{
    var remainder = num1 % num2
    return remainder
}
fun addition(x:Int,y:Int,w:Int,z:Int):Int{
    var sum = x+y+w+z
    return sum
}
fun fact(fact:String){
    var me = fact
    println(me)
}

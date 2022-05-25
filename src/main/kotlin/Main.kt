import java.util.*
import kotlin.collections.ArrayList
import kotlin.time.measureTimedValue
var sc=Scanner(System.`in`)
var ObjProduct=Product()

fun main(args:Array<String>){
    println("Welcome to Supermarket")
    sample()
}
fun sample(){
    println("1.Add product")
    println("2.Delete product")
    println("3.View Product")
    println("4.Search By Product type")
    println("5.Exit")
    println("Enter choice: ")
    val n=sc.next().toString().toInt()
    when(n){
        1->ObjProduct.addProduct()
        2->ObjProduct.deleteProduct()
        3->ObjProduct.displayProduct()
        4->ObjProduct.searchProductType()
        5->return
    }
}
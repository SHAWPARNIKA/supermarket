import java.util.Scanner

class Product {
    var sc=Scanner(System.`in`)
    var hashMap : HashMap<String, String> = HashMap<String, String> ()

    fun getInput(str:String):String{
        println("Enter $str")
        var input=sc.nextLine().toLowerCase()
        if(input==""){
            getInput("Enter valid $str")
        }
        return input
    }

    fun addProduct(){
        var proName=getInput("product name: ")
        var pro_type=getInput("product type: ")
        hashMap.put(proName,pro_type)
        println()
        sample()
    }

    fun deleteProduct(){
        var proName=getInput("Product name")
        if(proName in hashMap.keys){
            hashMap.remove(proName)
            println("Deleted Successfully")
        }
        else{
            println("Given item doesn't exist")
        }
        println()
        sample()
    }

    fun displayProduct(){
        println("Product\t\t\tProduct Type")
        for((key, value) in hashMap){
            println("$key\t\t\t$value")
        }
        println()
        sample()
    }

    fun searchProductType(){
        println("Enter the product type you need to search : ")
        var proType=sc.nextLine().toLowerCase()
        if(proType==""){
            println("Enter valid product name: ")
        }
        if (proType in hashMap.values) {
            val keys = hashMap.filterValues { it == proType }.keys
            println("Listing the products under $proType")
            println(keys)
        }
        else{
            println("Given product type doesn't exist")
        }
        println()
        sample()
    }
}
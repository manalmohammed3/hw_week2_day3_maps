fun main(args: Array<String>) {

    var manalMap = mutableMapOf("st1" to "rahaf" ,"st2" to "reem" ,"st3" to "maha" ,"st4" to "hanan")

    println(manalMap)
    //add
    manalMap.put("st5" , "eman")
    println(manalMap)

    //EDIT
    manalMap["ST2"]= "ELHAM"
    println(manalMap)

    //REMOVE
    manalMap.remove("st1")
    println(manalMap)
}

///////////////////////PART TOW
var fruitsMap = mutableMapOf("num1" to "apple" ,"num2" to "banana" ,"num3" to "kiwi" )
println(fruitsMap)

//create 3 elemment of list
myFruitsMap.putAll(listOff("pr1" to "peache" , "pr2" to "strawberry" ,"pr3" to "grape"))
println(myFruitsMap)



//bounus
var number1=5
for ( i in 1..number1){
    for(j in 1..i) {print("$j * $i  ")   }
    in(" ")        }
println()


}
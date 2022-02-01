import java.util.*

fun main(args: Array<String>){
    val language = "French"
    val score = 95
    println("Hello world! $language $score")

    val a = 1
    val b = 5
    var c = 10
    var booleanResult = true
    val result:Int = -a
    println("-a = $result, !booleanResult = $booleanResult")

    --c

    println("--c = $c")

    println()

    val max = if (a>b){
        println("a is larger than b")
        a
    }else{
        println("b is larger than a")
        b
    }

    println("max = $max")
    println()

    booleanResult = (a<=b) || (a>c)// result ==(a>b) and (a>c)
    println(booleanResult)

    val numbers = intArrayOf(1, 4, 42,-3)
    if (4 in numbers) {
        println("numbers array contains 4.")
    }else {
        println("numbers does not contain 4")
    }

    val value = intArrayOf(1, 2, 3, 4, -1)

    println(value[1])
    value[1]= 12

    println(value[1])
    println()

    val number1:Long = a.toLong()
    println(number1)

    val min = if (a>b) b else a
    println("min = $min")

    println()
    val flag = true
    if (flag == true){
        println("Hey Jude!")
    }

    println()
    println("Enter text: ")
    val stringInput = readLine()!!
    println("You entered: $stringInput")

    println()

    val reader = Scanner(System.`in`)
    println("Enter a number: ")
    val number:Int = reader.nextInt()
    println("You have entered: $number")

    println()
    println("Enter a long: ")
    val long : Long = reader.nextLong()
    println("You have entered: $long")

}
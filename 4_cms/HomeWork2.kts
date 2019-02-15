//import string.*
//import java.util.*
//import kotlin.system.exitProcess
//
//class HomeWork2 {
//
//    var number:Int = 0
//    var input:String =""
//    var operator:String = ""
//
//    @JvmStatic
//    fun main(args: Array<String>) {
//
//        // Input
//        val sc = Scanner(System.`in`)
//        input = sc.next()
//        operator = sc.next()
//
//        // Input Type Check
//        try {
//            number = input.toInt()
//        }catch (ex:Exception){
//            print("${ex} ${input}은 숫자가 아닙니다 !")
//            exitProcess(1)
//        }
//
//        // Implement GuGuDan
//        when(operator){
//
//            "+" -> for (i in 1..9) println("${number} + ${i} = ${number 더하자 i}")
//            "-" -> for (i in 1..9) println("${number} - ${i} = ${number 빼자 i}")
//            "*" -> for (i in 1..9) println("${number} * ${i} = ${number 곱하자 i}")
//            "/" -> for (i in 1..9) println("${number} / ${i} = ${number 나누자 i}")
//            else -> print("${operator}은 사칙연산기호(+ - * /)가 아닙니다.")
//
//        }
//
//    }
//
//}

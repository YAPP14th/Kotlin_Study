import java.lang.Exception
import java.lang.NumberFormatException
import java.util.*

class Hw2 {
    companion object {
        @JvmStatic
        @Throws(Exception::class)
        fun main(args: Array<String>){
            val scan1: Scanner = Scanner(System.`in`)
            val s=scan1.nextLine()
            val s2=s.split(" ")
            try{
                
                if(s2[1]=="+"||s2[1]=="-"||s2[1]=="*"||s2[1]=="/") {

                    when (s2[1]) {
                        "+" -> {
                            for (i in 1..9) {
                                var cul = s2[0].toInt() add i
                                println(s + " " + i + " = " + cul)
                            }
                        }
                        "-" -> {
                            for (i in 1..9) {
                                var cul = s2[0].toInt() minus i
                                println(s + " " + i + " = " + cul)
                            }
                        }
                        "/" -> {
                            for (i in 1..9) {
                                var cul = s2[0].toInt() prov i
                                println(s + " " + i + " = " + cul)
                            }
                        }
                        "*" -> {
                            for (i in 1..9) {
                                var cul = s2[0].toInt() comp i
                                println(s + " " + i + " = " + cul)
                            }
                        }
                    }
                }
                else
                    throw Exception(
                        "${s2[1]} 은 사칙연산이 아닙니다. "
                    )
            }
            catch(e: NumberFormatException) {
                println("${s2[0]} 은 숫자가 아님")
            }
        }
        private infix fun Int.add(that: Int):Int{
            return this + that
        }
        private infix fun Int.minus(that: Int):Int{
            return this - that
        }
        private infix fun Int.comp(that: Int):Int{
            return this * that
        }
        private infix fun Int.prov(that: Int):Int{
            return this / that
        }
    }
}
import java.util.*

class Hw1 {
    companion object {
        //@JvmStatic
        fun main(args: Array<String>) {

            val scan: Scanner= Scanner(System.`in`)
            val s= scan.nextLine()

            println("input : ${s}")

            print("output : ${checks(s)}")

        }

        fun checks(s: String): String{
            val min="-"
            var news= ""
            //equals 말고 ==씀
            if (s[0].toString()==min) {
                news=("$news${s[0]}")
                for (i in (s.length - 1) downTo 1) {
                    if(s[i].toString()!="0")
                        news=("$news${s[i]}")
                }
            }
            else {
                for (i in (s.length - 1) downTo 0) {
                    if(s[i].toString()!="0")
                        news=("$news${s[i]}")
                }
            }
            return news
        }


    }

}
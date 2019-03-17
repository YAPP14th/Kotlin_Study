package _6th

class _5_Step4 {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var a = 3
            var b = 4
            var number1 = 0

            if (a > b)
                number1 = a
            else
                number1 = b

            var number2 = if (a > b) a else b

            var number3 = 3
            var number4 = 4

            when {
                number3 == number4 -> System.out.println("두 개의 값은 같다")
                number3 != number4 -> System.out.println("두 개의 값은 다르다")
                number3 > number4 -> System.out.println("number1이 number2보다 값이 크다.")
                number3 < number4 -> System.out.println("number1이 number2보다 값이 작다.")
            }

            when (number3) {
                0 -> System.out.println("0이다")
                1 -> System.out.println("1이다")
                2 -> System.out.println("2이다")
                3 -> System.out.println("3이다")
            }
        }
    }
}
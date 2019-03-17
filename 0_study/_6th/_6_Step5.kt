package _6th

class _6_Step5 {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            for (i in 0..9) {
                System.out.println("3 x $i = ${i * 3}")
            }

            arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9).forEach { i ->
                System.out.println("3 x $i = ${i * 3}")
            }

            for (i in 1 until 100 step 2) {
                System.out.println("3 x $i = ${i * 3}")
            }

            for (i in 100 downTo 1 step 2) {
                System.out.println("3 x $i = ${i * 3}")
            }
        }
    }
}
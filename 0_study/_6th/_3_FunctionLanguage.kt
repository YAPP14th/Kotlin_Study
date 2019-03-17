package _6th

class _3_FunctionLanguage {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            add(3, 4, { addValue ->
                System.out.println(addValue)
            })

            add(3, 4, parameter)
        }

        fun add(a: Int, b: Int, callback: (Int) -> Unit) {
            callback(a + b)
        }

        var parameter = { addValue: Int ->
            System.out.println(addValue)
        }
    }
}
package _6th

class _4_Step3 {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var person1_1 = Person2("사람1", 24)
            var person1_2 = Person2(name = "사람2")
            var person1_3 = Person2(age = 24)
            var person1_4 = Person2(name = "사람4", age = 24)

            var person2_1 = Person2("사람1", 24)
            var person2_2 = Person2(name = "사람2")
            var person2_3 = Person2(age = 24)
            var person2_4 = Person2(name = "사람4", age = 24)
        }
    }
}

// Java와 비슷한 구조의 선언
class Person1 {
    var name: String = ""
    var age: Int = 0
}

// 생성자까지 동시에 처리
open class Person2 (
        var name: String = "",
        var age: Int = 0
)


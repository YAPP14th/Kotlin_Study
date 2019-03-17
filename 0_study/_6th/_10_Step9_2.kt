package _6th

interface _10_Step9_2 {
    // 에러 안남 (but override 필요)
    var commonVarField: Int
    val commonValField: Int

    // 에러 발생
    // var staticField : Int = 3

    // 일반 함수
    fun commonMethod(): Int {
        return commonVarField
    }

    // 추상 함수
    abstract fun abstractMethod()
}


package _6th

class _12_Step_11 {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            var children = Children("abcd", 3)
            // 이 아래의 종속을 풀어버리면 된다. (캡슐화)
            var newChildren = NewChildren(children)

            children.childrenMethod()
            // newChildren.childrenMethod()

            // children.tellYourTruth()
            newChildren.tellYourTruth()

            // 람다 내 함수를 실행 후, 변수 주입
            val childrenByLazy : Children by lazy {
                System.out.println("선언한다.")
                Children("abcd", 3)
            }
        }
    }
}

class NewChildren(children : Children) : ChildrenInterface by children {
    // 이 함수를 만약 안 쓰게 된다면
    fun tellYourTruth(){
        System.out.println("abcd")
    }
}

interface ChildrenInterface {
    fun abstractFunction()
}

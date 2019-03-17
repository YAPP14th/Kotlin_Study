package _6th

// DefaultFunction.kt

fun Person2.isEqual(person1 : Person2, person2 : Person2){
    when{
        person1.name == person2.name -> {
            System.out.println("두 사람의 이름은 같습니다.")
        }

        else -> {
            System.out.println("두 사람의 이름은 다릅니다.")
        }
    }
}
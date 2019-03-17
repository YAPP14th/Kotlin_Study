package _6th

class _11_Step10 {

}

class Children(name: String, age: Int) : Person2(name, age), ChildrenInterface{
    override fun abstractFunction() {
        System.out.println("My name is ${name}")
    }

    fun childrenMethod(){
        System.out.println("I'm ${name}")
    }

    inner class Admain {
        var name: String = this@Children.name
        var id: String = ""

        constructor(name: String) {
            this.name = name
            this.id = ""
        }

        constructor(name: String, id: String) {
            this.name = name
            this.id = id
        }


    }
}




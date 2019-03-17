package _6th

import java.util.*

class _7_Step6 {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            var linkedList = LinkedList<Int>()

            linkedList.add(0)
            linkedList.add(1)
            linkedList.add(2)
            linkedList.add(3)
            linkedList.add(4)
            linkedList.remove(3)

            var arrayList = ArrayList<Int>()

            arrayList.add(0)
            arrayList.add(1)
            arrayList.add(2)
            arrayList.add(3)
            arrayList.add(4)
            arrayList.remove(3)
        }
    }
}
package _6th

import java.text.SimpleDateFormat
import java.util.*

// DefaultFunction.kt

fun getArchivedDate(date: Date): Pair<String, String> {
    var sdf1 = SimpleDateFormat("MM.dd.")
    var sdf2 = SimpleDateFormat("yyyy")
    return Pair(sdf1.format(date), sdf2.format(date))
}

fun getUploadDate(date: Date): String {
    var sdf = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss")
    return sdf.format(date)
}

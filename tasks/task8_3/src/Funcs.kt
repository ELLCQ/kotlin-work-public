// Task 8.3: functions for temperature analysis

import kotlin.io.path.Path
import kotlin.io.path.forEachLine

typealias Record = Pair<String,Double>

fun fetchData(filename: String) = buildList {
    val filePath = Path(filename)
    filePath.forEachLine {
        line ->  line.split(',')
        val records = Pair(line[0], line[1])
        add(records)
    }
    // Finish the implementation of this function
}

// Challenge: compute average temperature with one line of code
// in main(), instead of using the function below!

//fun averageTemp(data: List<Record>): Double {
//    var sum = 0.0
//    for (record in data) {
//        sum += record.second
//    }
//    return sum / data.size
//}

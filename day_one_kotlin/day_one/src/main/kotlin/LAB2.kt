//import kotlin.random.Random
import java.util.*

fun main(){
    val random = Random()
    val collection = mutableListOf<Int>()

    repeat(100) {
        val randomNumber = random.nextInt(100) + 1
        collection.add(randomNumber)
    }

    val iterator = collection.iterator()
    run@ while (iterator.hasNext()) {
        val element = iterator.next()
        println(element)

        val isGreaterThan10 = element > 10
        val isPrint = isGreaterThan10 || continue@run {
            iterator.remove()
            false
        }

        if (!isPrint) {
            break
        }
    }
}
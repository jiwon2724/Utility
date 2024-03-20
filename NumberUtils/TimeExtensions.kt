suspend fun Int.second() {
    delay(this * 1000L)
}
    
suspend fun Double.second() {
    delay((this * 1000).toLong())
}

suspend fun Int.minutes() {
    delay(this * 60000L)
}

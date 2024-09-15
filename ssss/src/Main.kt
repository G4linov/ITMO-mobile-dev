fun main() {
    println("task#1")


    val collection: Map<String, Any> = mapOf("name" to "Дмитрий", "age" to 41, "fn" to 28)
    for ((key, value) in collection) {
        println("$key: $value")
    }

}
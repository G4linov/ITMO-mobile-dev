fun main() {

    println("task#1")
    val collection: Map<String, Any> = mapOf("name" to "Вячеслав", "age" to 25, "fn" to 4)
    for ((key, value) in collection) {
        println("$key: $value")
    }

    println("task#2")
    println("Введите свой возраст")
    val x = readLine()!!.toInt()

    println("Есть ли у Вас билет? (0 - нет, 1 - да)")
    val y = readLine().equals("1")

    println("Прошли ли Вы регистрацию? (0 - нет, 1 - да)")
    val z = readLine().equals("1")

    println("Есть ли у Вас VIP -статус? (0 - нет, 1 - да)")
    val v = readLine().equals("1")
    if (x >= 18 && y && z) {
        println("Добро пожаловать на наше мероприятие!!")
    } else if (y && v) {
        println("Добро пожаловать на наше мероприятие дорогой гость!!")
    } else {
        println("Свободен холоп!!!")
    }

}
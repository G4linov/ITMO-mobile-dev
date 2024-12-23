fun filterThree(input: MutableList<Int>): MutableList<Int> {
    var output: MutableList<Int> = mutableListOf()
    for (i in input) {
        if (modThree(i)) {
            output.add(i)
        }
    }
    return output
}


fun filterIntArray(input: MutableList<Int>): MutableList<Int> {
    var output: MutableList<Int> = mutableListOf()
    for (i in input) {
        if (chetnoe(i) == false) {
            output.add(i)
        }
    }
    return output
}

fun createIntArray(x: Int, y: Int): MutableList<Int> {
    var result: MutableList<Int> = mutableListOf(x)
    for (i in x + 1..y) {
        result.add(i)
    }
    return result
}

fun modThree(a: Int): Boolean {
    if (a % 3 == 0) {
        return true
    } else {
        return false
    }
}

fun chetnoe(z: Int): Boolean {
    if (z % 2 == 0) {
        return true
    } else {
        return false
    }
}


fun summa(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    val SKA: Map<String, List<String>> =
        mapOf("Северсталь" to listOf("6:3", "3:1", "5:2"), "Динамо Москва" to listOf("3:1", "6:1", "22:2"))


    for (i in SKA.keys) {
        for (j in SKA.get(i)!!)
            println("Результат игры СКА - $i $j")

    }

    val x: Int = 11
    val y: Int = 33
    val q = chetnoe(12)
    val intArray = createIntArray(1, 100)
    println("Сумма x и y: ${summa(x, y)}")
    println(q)
    println(modThree(33))
    println(createIntArray(1, 12))
    println(filterIntArray(intArray))
    println(filterThree(intArray))
}
/*
1. Вывод чисел от 1 до 35:
    - Напишите программу, которая выводит числа от 1 до 35 с использованием цикла for.

2. Сумма чисел, кратных 4, от 1 до N:
    - Напишите программу, которая вычисляет сумму чисел, кратных 4, от 1 до заданного числа N с использованием цикла while.

3. Поиск количества элементов, меньших заданного числа, в массиве:
    - Напишите программу, которая вычисляет количество элементов в массиве, которые меньше заданного числа, с использованием цикла for.

4. Проверка на делимость 6:
    - Напишите программу, которая проверяет, делится ли заданное число на 6 без остатка с использованием оператора if-else.
 */


fun main() {
    for (i in (1..35)) {
        println(i)
    }

    val n = 10;
    for (i in (1..n)) {
        if (i % 4 == 0) {
            println(i)
        }
    }

    val test = 10
    var myCount = 0
    val array = listOf(1,2,11,12)
    for (element in array) {
        if (element < test) {
            myCount++
        }
    }
    println(myCount)

    val number = 36
    if (number % 6 == 0){
        println("делится")
    }


    val massivKluchZnachenie: MutableMap<Char, Int> = mutableMapOf('a' to 0)
    var stroka = "sad bois"

    for (i in (0..<stroka.length)) {
        var tekyshiiSimvol = stroka[i]
        if (tekyshiiSimvol == ' ') {
            continue
        }
        if (massivKluchZnachenie.containsKey(tekyshiiSimvol)) {
            massivKluchZnachenie[tekyshiiSimvol] = massivKluchZnachenie[tekyshiiSimvol]!! + 1
        } else {
            massivKluchZnachenie[tekyshiiSimvol] = 1
        }
    }

    println(massivKluchZnachenie)




}
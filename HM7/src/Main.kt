class Employee() {
    var salary: Int = 0
    lateinit var name: String
    lateinit var surname: String
}

fun main() {
    val Employee = Employee()
    Employee.salary = 5555
    Employee.surname = "Krimin"
    Employee.name = "Dmitry"
    println(Employee.name+" "+Employee.surname+"@@"+Employee.salary)
    val names: List<String> = listOf("John", "Aaron", "Tim", "Ted", "Steven")
    val surnames: List<String> = listOf("Smith", "Dow", "Isaacson", "Pennyworth", "Jankins")
    println(names)
    println(surnames)
}
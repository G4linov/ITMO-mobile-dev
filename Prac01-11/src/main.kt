import kotlin.math.PI
import kotlin.math.sqrt

open class Shape {
    open val area: Double = 0.0
    open val perimeter: Double = 0.0
    open val description: String
        get() = "The area of ${this::class.simpleName} is ${area}. Perimeter - ${perimeter}"
}

class Circle(private val radius: Double) : Shape(){
    override val area: Double
        get() = PI * radius * radius
    override val perimeter: Double
        get() = 2 * PI * radius
}

open class Rectangle(open val width: Double, open val height: Double) : Shape() {
    override val area: Double
        get() = width * height
    override val perimeter: Double
        get() = 2 * (width * height)
}

class Ellipse(width: Double, height: Double) : Rectangle(width, height) {
    override val area: Double
        get() = PI * (width/ 2) * (height / 2)
    override val perimeter: Double
        get() = PI * (3 * (width + height) - sqrt((3 * width + height) * (width + 3 * height)))
}

data class Car(var model: String, var power: Int){
    val description: String
        get() = "The car model is ${model} with power of ${power} HP"

    fun increasePower(additionalPower: Int) {
        power += additionalPower
    }
}

fun main() {
    val circle = Circle(5.0)
    val rectangle = Rectangle(4.0, 7.0)
    val ellipse = Ellipse(6.0, 4.0)

    println(circle.description)
    println(rectangle.description)
    println(ellipse.description)

    val car = Car("Tesla model S", 400)
    println(car.description)
    car.increasePower(50)
    println(car.description)
}
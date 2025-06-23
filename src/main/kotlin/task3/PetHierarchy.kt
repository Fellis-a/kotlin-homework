package task3

fun main() {
    val tiger = Tiger(runSpeed = 50.0, swimSpeed = 10.0)
    val lion = Lion(runSpeed = 60.0, swimSpeed = 8.0)
    val salmon = Salmon(swimSpeed = 25.0)
    val tuna = Tuna(swimSpeed = 30.0)
    val shark = Shark(swimSpeed = 100.0)

    tiger.run()
    tiger.swim()
    println("Tiger total speed: ${tiger.totalSpeed}")

    lion.run()
    lion.swim()
    println("Lion total speed: ${lion.totalSpeed}")

    salmon.swim()
    println("Salmon total speed: ${salmon.totalSpeed}")

    tuna.swim()
    println("Tuna total speed: ${tuna.totalSpeed}")

    shark.swim()
    println("Tuna total speed: ${shark.totalSpeed}")
}

interface Runnable {
    val runSpeed: Double
    fun run()
}

interface Swimmable {
    val swimSpeed: Double
    fun swim()
}

abstract class Pet {
    abstract val totalSpeed: Double
}

abstract class Cat : Pet(), Runnable, Swimmable {
    override val totalSpeed: Double
        get() = runSpeed + swimSpeed

    override fun run() {
        println("I am a ${this::class.simpleName}, and I am running")
    }

    override fun swim() {
        println("I am a ${this::class.simpleName}, and I am swimming")
    }
}

abstract class Fish : Pet(), Swimmable {
    override val totalSpeed: Double
        get() = swimSpeed

    override fun swim() {
        println("I am a ${this::class.simpleName}, and I am swimming")
    }
}

class Tiger(
    override val runSpeed: Double,
    override val swimSpeed: Double
) : Cat()

class Lion(
    override val runSpeed: Double,
    override val swimSpeed: Double
) : Cat()

class Salmon(
    override val swimSpeed: Double
) : Fish()

class Tuna(
    override val swimSpeed: Double
) : Fish()

class Shark(
    override val swimSpeed: Double
) : Fish()


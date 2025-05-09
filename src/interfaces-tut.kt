interface human {
    val name: String
}

interface SuperHero : human {
    val ability: String

    // you can even omit the override here if class Avenger is already doing it
    override val name: String
}

// classes can have multiple interfaces like class C : A, B
class Avengers constructor(override val ability: String, override val name: String) : SuperHero {
    fun details() {
        println("${this.name} has ${this.ability}")
    }
}

fun b() {
    val spiderman = Avengers("Swing", "Peter Parker")
    spiderman.details()
}
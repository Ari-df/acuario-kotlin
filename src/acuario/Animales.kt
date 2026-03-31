package acuario

// Interfaz
interface AccionAnimal {
    fun hacerSonido()
}

// Clase abstracta
abstract class Animal(val nombre: String) {
    abstract val especie: String
}

// Subclases
class Perro(nombre: String) : Animal(nombre), AccionAnimal {
    override val especie = "Canino"
    override fun hacerSonido() = println("$nombre dice: ¡Guau!")
}

class Gato(nombre: String) : Animal(nombre), AccionAnimal {
    override val especie = "Felino"
    override fun hacerSonido() = println("$nombre dice: ¡Miau!")
}
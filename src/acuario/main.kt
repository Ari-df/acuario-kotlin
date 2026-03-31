import acuario.Acuario
import acuario.TanqueTorre
import acuario.Pez
import acuario.PezPayaso
import acuario.Tiburon
import acuario.Perro
import acuario.Gato

fun construirAcuario(){
    val acuario1= Acuario()
    acuario1.imprimirTamano()
    val acuario2= Acuario(ancho = 25)
    acuario2.imprimirTamano()
    val acuario3= Acuario(alto = 35, largo=110)
    acuario3.imprimirTamano()
    val acuario4= Acuario(ancho=25,alto=35,largo=110)
    acuario4.imprimirTamano()
    val acuario5  = Acuario(numeroDePeces = 29)
    acuario5.imprimirTamano()
    println("Volumen: ${acuario5.ancho*acuario5.largo*acuario5.alto/1000} l")
    val acuario6= Acuario(largo = 25,ancho=25, alto=40)
    acuario6.imprimirTamano()
    val miAcuario = Acuario(ancho=25,largo=25, alto = 40)
    miAcuario.imprimirTamano()
    val miTorre = TanqueTorre(diametro=25,alto=40)
    miTorre.imprimirTamano()
}
fun crearPeces(){
    val tiburon = Tiburon()
    println("Color de Tiburon: ${tiburon.color}")
    val pezPayaso = PezPayaso()
    tiburon.comer()
    println("Color de Pez Payaso: ${pezPayaso.color}")
    pezPayaso.comer()
}
fun crearAnimales() {
    val perro = Perro("Rex")
    val gato = Gato("Luna")

    println("${perro.nombre} es un ${perro.especie}")
    perro.hacerSonido()

    println("${gato.nombre} es un ${gato.especie}")
    gato.hacerSonido()
}
fun main(){
    //construirAcuario()
    //crearPeces()
    crearAnimales()
}
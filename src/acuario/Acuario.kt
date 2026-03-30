package acuario
import kotlin.math.PI

open class Acuario(var largo:Int=100,var ancho:Int=20,open var alto:Int=40)  {
    open var volumen : Int
        get() = ancho*alto/1000
        set(valor){
            alto = (valor*1000)/(ancho*largo)
        }
    open val forma = "rectangulo"
    open var agua: Double = 0.0
    get() = volumen*0.9
    fun imprimirTamano(){
        println("Ancho: $ancho cm \n" +
                "Largo: $largo cm \n"+
                "Alto: $alto cm \n")
        println("Volumen: $volumen l Agua: $agua l (${agua/volumen*100.0}% lleno)")
    }
    init{
        println("inicializando acuario")
    }
    constructor(numeroDePeces:Int):this(){
        val tanque = numeroDePeces * 2000 * 1.1
        alto = (tanque/(largo*ancho)).toInt()
    }
}
class TanqueTorre(override var alto:Int,var diametro:Int):Acuario(alto=alto, ancho=diametro, largo=diametro){
    override var volumen : Int
        get() = (ancho/2*largo/2*alto/1000* PI).toInt()
        set(valor){
            alto = ((valor*1000/PI)/(ancho/2*largo/2)).toInt()
        }
    override var agua = volumen*0.8
    override  val forma="cilindro"
}

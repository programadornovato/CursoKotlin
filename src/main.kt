import javax.swing.JOptionPane
import Matematicas.Basicas
fun main(args:Array<String>){
    var mat=Basicas(1,2)
    println("Suma=${mat.suma()}")
    println("Resta=${mat.resta()}")
    println("Multiplicacion=${mat.multiplicacion()}")
    println("Divicion=${mat.divicion()}")
}
import javax.swing.JOptionPane
import Matematicas.Basicas
fun main(args:Array<String>){
    var c1=MiClase()
    println("c1.normal=${c1.normal}")
    c1.normal="Modificando el atributo normal"
    println("c1.normal=${c1.normal}")
    println("MiClase.estatico=${MiClase.estatico}")
    MiClase.estatico="Modificando el atributo estatico"
    println("MiClase.estatico=${MiClase.estatico}")
}
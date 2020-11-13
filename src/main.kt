import java.lang.management.ManagementFactory
import javax.swing.JOptionPane

fun main(args:Array<String>){
    var v=Ventana("Este es mi titulo ${getPid()}")
    v.isVisible=true
}
fun getPid():String?{
    return ManagementFactory.getRuntimeMXBean().name
}

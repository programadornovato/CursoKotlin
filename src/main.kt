import java.lang.management.ManagementFactory
import javax.swing.JOptionPane

fun main(args:Array<String>){
    var v=Ventana("Este es mi titulo ${getPid()}")
    v.isVisible=true
    v.meteArgumentos(args)
    /*
    for(i in 1 .. 10){
        Thread.sleep(200)
        v.setLocation(i*30,i*30)
    }
    */
    //v.setLocation(500,500)
    //v.setBounds(500,500,500,500)
    v.setLocationRelativeTo(null)
}
fun getPid():String?{
    return ManagementFactory.getRuntimeMXBean().name
}

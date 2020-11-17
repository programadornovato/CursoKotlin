import java.awt.Color
import java.awt.Dimension
import javax.swing.BoxLayout
import javax.swing.JFrame
import javax.swing.JPanel
import javax.swing.WindowConstants

class Ventana(titulo:String?):JFrame(titulo){
    init {
        var d=Dimension(500,500)
        this.size=d
        defaultCloseOperation=WindowConstants.EXIT_ON_CLOSE
        //this.setLocation(500,500)
        agregarPanel()
    }
    fun agregarPanel(){
        var contenedor=JPanel()
        contenedor.background= Color.red
        this.contentPane.add(contenedor)
        var panel1=JPanel()
        var panel2=JPanel()
        var panel3=JPanel()
        contenedor.add(panel1)
        contenedor.add(panel2)
        contenedor.add(panel3)
        panel1.background= Color(38,166,166)
        panel2.background= Color(5,255,6)
        panel3.background= Color(150,126,6)
        contenedor.layout=BoxLayout(contenedor,BoxLayout.Y_AXIS)
        panel3.setVisible(false)
    }
}
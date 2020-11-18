import java.awt.Color
import java.awt.Dimension
import javax.swing.*

class Ventana(titulo:String?):JFrame(titulo){
    var panel1:JPanel?=null
    var panel2:JPanel?=null
    var panel3:JPanel?=null
    init {
        var d=Dimension(500,500)
        this.size=d
        defaultCloseOperation=WindowConstants.EXIT_ON_CLOSE
        //this.setLocation(500,500)
        agregarPanel()
        agregarEtiquetas()
    }
    fun agregarPanel(){
        var contenedor=JPanel()
        contenedor.background= Color.red
        this.contentPane.add(contenedor)
        panel1=JPanel()
        panel2=JPanel()
        panel3=JPanel()
        contenedor.add(panel1)
        contenedor.add(panel2)
        contenedor.add(panel3)
        panel1!!.background= Color(38,166,166)
        panel2!!.background= Color(5,255,6)
        panel3!!.background= Color(150,126,6)
        contenedor.layout=BoxLayout(contenedor,BoxLayout.X_AXIS)
        //panel3!!.setVisible(false)
    }
    fun agregarEtiquetas(){
        var e1=JLabel("<html>Hola humano yo soy la etiqueta 1 dentro del panel1</html>")
        var e2=JLabel("<html>Hola humano yo soy la etiqueta 2 dentro del panel2</html>")
        var e3=JLabel("<html>Hola humano yo soy la etiqueta 3 dentro del panel3</html>")
        panel1!!.add(e1)
        panel2!!.add(e2)
        panel3!!.add(e3)
        panel1!!.setLayout(null)
        panel2!!.setLayout(null)
        panel3!!.setLayout(null)
        e1.setBounds(10,90,120,60)
        e2.setBounds(10,90,120,60)
        e3.setBounds(10,90,120,60)
        e1.foreground=Color.white
        e3.foreground=Color.black
        e3.foreground=Color.white
        panel1!!.setVisible(false)
    }
}
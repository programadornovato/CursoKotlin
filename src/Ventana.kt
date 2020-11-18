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
        var e1=JLabel("<html>Hola1</html>")
        var e2=JLabel("<html>Hola2</html>")
        var e3=JLabel("<html>Hola3</html>")
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
        e2.foreground=Color.white
        e3.foreground=Color.white
        //panel1!!.setVisible(false)

        e1.background=Color.BLACK
        e2.background=Color.BLACK
        e3.background=Color.BLACK

        e1.setOpaque(true)
        e2.setOpaque(true)
        e3.setOpaque(true)

        /*
        HorizontalAlignment
        CENTER  = 0
        LEFT    = 2
        RIGHT   = 4

        VerticalAlignment
        TOP     = 1
        BOTTOM  = 3
	    */
        e1.horizontalAlignment=SwingConstants.LEFT
        e2.horizontalAlignment=SwingConstants.CENTER
        e3.horizontalAlignment=SwingConstants.RIGHT

        e1.verticalAlignment=SwingConstants.TOP
        e2.verticalAlignment=SwingConstants.BOTTOM
    }
}
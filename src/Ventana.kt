import java.awt.Color
import java.awt.Dimension
import java.awt.Font
import java.awt.Image
import javax.swing.*

class Ventana(titulo:String?):JFrame(titulo){
    var panel=ArrayList<JPanel>()
    var etiqueta=ArrayList<JLabel>()
    var num=4
    init {
        num=JOptionPane.showInputDialog("Humano ingresa la cantidad de paneles").toInt()
        var d=Dimension(num*150,500)
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
        for (i in 0 until num){
            panel.add(JPanel())
            contenedor.add(panel[i])
            panel[i].background= Color(i*50,i*50,i*50)
        }
        contenedor.layout=BoxLayout(contenedor,BoxLayout.X_AXIS)
    }
    fun agregarEtiquetas(){
        var logo=ImageIcon("src/images/kotlin.png")
        var logoMin=ImageIcon(logo.image.getScaledInstance(60,60, Image.SCALE_DEFAULT))
        for (i in 0 until num){
            etiqueta.add(JLabel("Hola ${i+1}",logoMin,SwingConstants.LEFT))
            etiqueta[i].foreground=Color.white
            panel[i].add(etiqueta[i])
        }
    }
}
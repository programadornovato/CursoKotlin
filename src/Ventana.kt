import java.awt.Dimension
import java.awt.Font
import java.awt.event.MouseEvent
import java.awt.event.MouseListener
import javax.swing.*

class Ventana ():JFrame(){
    var contenedor=JPanel()
    var etiquetaPide=JLabel("¿Quieres ser mi novi@?")
    var etiquetaAcepta=JLabel("¡¡Sabia que caerias en mis brazos!!")
    var botonSi=JButton("Si")
    var botonNo=JButton("No")
    init {
        var d=Dimension(500,350)
        this.size=d
        defaultCloseOperation=WindowConstants.EXIT_ON_CLOSE
        this.contentPane.add(contenedor)
        contenedor.layout=null
        contenido()
        eventos()
    }
    fun eventos(){
        eventoClickSi()
        eventoEntraNo()
    }
    fun eventoEntraNo(){
        var l:MouseListener=object :MouseListener{
            override fun mouseClicked(e: MouseEvent?) {
            }
            override fun mouseEntered(e: MouseEvent?) {
                var xRandom=(100..400).random()
                var yRandom=(30..270).random()
                botonNo.setLocation(xRandom,yRandom)
                println("xRandom=$xRandom,yRandom=$yRandom")
            }
            override fun mouseExited(e: MouseEvent?) {
            }
            override fun mousePressed(e: MouseEvent?) {
            }
            override fun mouseReleased(e: MouseEvent?) {
            }
        }
        botonNo.addMouseListener(l)
    }
    fun eventoClickSi(){
        var l:MouseListener=object :MouseListener{
            override fun mouseClicked(e: MouseEvent?) {
                etiquetaAcepta.isVisible=true
            }
            override fun mouseEntered(e: MouseEvent?) {
            }
            override fun mouseExited(e: MouseEvent?) {
            }
            override fun mousePressed(e: MouseEvent?) {
            }
            override fun mouseReleased(e: MouseEvent?) {
            }
        }
        botonSi.addMouseListener(l)
    }
    fun contenido(){
        etiquetaPide.setBounds(120,10,300,30)
        etiquetaPide.font=Font(Font.MONOSPACED,Font.ITALIC,20)
        contenedor.add(etiquetaPide)

        botonNo.setBounds(100,50,100,30)
        contenedor.add(botonNo)
        botonSi.setBounds(300,50,100,30)
        contenedor.add(botonSi)

        etiquetaAcepta.setBounds(1,250,450,30)
        etiquetaAcepta.font=Font(Font.MONOSPACED,Font.ITALIC,20)
        contenedor.add(etiquetaAcepta)
        etiquetaAcepta.isVisible=false
    }
}
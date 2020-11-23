import java.awt.Color
import java.awt.Dimension
import java.awt.Image
import java.awt.event.ActionListener
import java.awt.event.MouseEvent
import java.awt.event.MouseListener
import javax.swing.*


class Ventana ():JFrame(){
    var contenedor=JPanel()
    var etiqueta=JLabel()
    init {
        var d=Dimension(1000,350)
        this.size=d
        defaultCloseOperation=WindowConstants.EXIT_ON_CLOSE
        contenedor.background= Color.white
        this.contentPane.add(contenedor)
        contenedor.layout=null
        var logo=ImageIcon("src/images/neko.gif")
        var logoMin=ImageIcon(logo.image.getScaledInstance(300,200, Image.SCALE_DEFAULT))
        etiqueta.icon=logoMin
        etiqueta.setBounds(10,90,400,300)
        contenedor.add(etiqueta)
        boton()
    }
    fun boton(){
        var boton=JButton("Inicia")
        var i=0
        var l:MouseListener=object:MouseListener{
            override fun mouseClicked(e: MouseEvent?) {
                val timer = Timer(40, ActionListener {
                    etiqueta.setLocation(i,90)
                    repaint()
                    i=i+10
                    if(i>=800){
                        i=800
                    }
                    println("i=$i")
                })
                timer.isRepeats = true
                timer.isCoalesce = true
                timer.start()
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
        boton.setBounds(10,5,100,20)
        contenedor.add(boton)
        boton.addMouseListener(l)
    }
}
import java.awt.*
import java.awt.event.ActionListener
import java.awt.event.KeyEvent
import java.awt.event.MouseEvent
import java.awt.event.MouseListener
import javax.swing.*

class Ventana(titulo:String?):JFrame(titulo){
    var contenedor=JPanel()
    init {
        var d=Dimension(500,500)
        this.size=d
        defaultCloseOperation=WindowConstants.EXIT_ON_CLOSE
        this.contentPane.add(contenedor)
        contenedor.layout=null
        //evento()
        eventosRaton()
    }
    fun eventosRaton(){
        var boton=JButton("Humano ponte a jugar con tu raton (¡¡¡El de la compu!!!)")
        boton.setBounds(10,10,450,30)
        contenedor.add(boton)

        var caja=JTextField()
        caja.setBounds(10,50,400,30)
        contenedor.add(caja)

        var l:MouseListener=object :MouseListener{
            override fun mouseClicked(e: MouseEvent?) {
                //caja.text="mouseClicked"
            }
            override fun mouseEntered(e: MouseEvent?) {
                caja.text="mouseEntered"
            }
            override fun mouseExited(e: MouseEvent?) {
                caja.text="mouseExited"
            }
            override fun mousePressed(e: MouseEvent?) {
                caja.text="mousePressed"
            }
            override fun mouseReleased(e: MouseEvent?) {
                caja.text="mouseReleased"
            }
        }
        boton.addMouseListener(l)
    }
    fun evento(){
        var boton=JButton("Humano coloca tu miserable nombre en el cuadro de texto y da click aqui")
        boton.setBounds(10,10,450,30)
        contenedor.add(boton)

        var caja=JTextField()
        caja.setBounds(10,50,400,30)
        contenedor.add(caja)

        var etiqueta=JLabel()
        etiqueta.setBounds(10,100,400,30)
        contenedor.add(etiqueta)

        var accion=ActionListener{
            etiqueta.text="Hola ${caja.text}"
        }
        boton.addActionListener(accion)


    }
}
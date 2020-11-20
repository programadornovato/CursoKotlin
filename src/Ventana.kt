import java.awt.*
import java.awt.event.ActionListener
import java.awt.event.KeyEvent
import javax.swing.*

class Ventana(titulo:String?):JFrame(titulo){
    var contenedor=JPanel()
    init {
        var d=Dimension(500,500)
        this.size=d
        defaultCloseOperation=WindowConstants.EXIT_ON_CLOSE
        this.contentPane.add(contenedor)
        contenedor.layout=null
        evento()
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
import java.awt.*
import java.awt.event.*
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
        //eventosRaton()
        eventoTeclado()
    }
    fun eventoTeclado(){
        var caja=JTextField()
        caja.setBounds(10,10,400,30)
        contenedor.add(caja)

        var areaTexto=JTextArea()
        areaTexto.setBounds(10,50,400,200)
        contenedor.add(areaTexto)

        var l:KeyListener=object :KeyListener{
            override fun keyPressed(e: KeyEvent?) {
                areaTexto.append("keyPressed\n")
            }
            override fun keyTyped(e: KeyEvent?) {
                areaTexto.append("keyTyped\n")
            }
            override fun keyReleased(e: KeyEvent?) {
                //areaTexto.append("keyReleased\n")
                if(e!!.keyChar=='*'){
                    areaTexto.append("Soltaste el asterisco\n")
                }
                if(e!!.keyChar=='\n'){
                    areaTexto.append("Soltaste el enter\n")
                }
                if(e!!.keyChar==' '){
                    areaTexto.append("Soltaste el espacio\n")
                }
            }
        }
        caja.addKeyListener(l)
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
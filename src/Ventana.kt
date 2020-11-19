import java.awt.*
import java.awt.event.KeyEvent
import javax.swing.*

class Ventana(titulo:String?):JFrame(titulo){
    var panel=ArrayList<JPanel>()
    var etiqueta=ArrayList<JLabel>()
    var num=4
    var botonSwing:JButton?=null
    var botonAWT:Button?=null
    init {
        //num=JOptionPane.showInputDialog("Humano ingresa la cantidad de paneles").toInt()
        var d=Dimension(num*150,500)
        this.size=d
        defaultCloseOperation=WindowConstants.EXIT_ON_CLOSE
        //this.setLocation(500,500)
        //agregarPanel()
        //agregarEtiquetas()
        agregaBoton()
    }
    fun agregaBoton(){
        var logo=ImageIcon("src/images/kotlin.png")
        var logoMin=ImageIcon(logo.image.getScaledInstance(30,30, Image.SCALE_DEFAULT))

        var contenedor=JPanel()
        this.contentPane.add(contenedor)
        contenedor.layout=null
        botonSwing= JButton("Dame like!!!!",logoMin)
        contenedor.add(botonSwing)
        botonSwing!!.text="Que me des liiikeee!!!!"
        botonSwing!!.setBounds(100,100,300,40)
        botonSwing!!.isEnabled=true
        //botonSwing!!.mnemonic='F'.toInt()
        botonSwing!!.mnemonic=KeyEvent.VK_F
        botonSwing!!.icon=ImageIcon(ImageIcon("src/images/like.png").image.getScaledInstance(20,20,Image.SCALE_FAST))
        botonSwing!!.font= Font(Font.MONOSPACED,Font.ITALIC,12)
        botonSwing!!.foreground=Color.BLACK
        botonSwing!!.background=Color.WHITE

        botonAWT= Button("Soy AWT feo pero dame like!!!")
        contenedor.add(botonAWT)
        botonAWT!!.setBounds(100,200,180,40)
        botonAWT!!.label="Que me de like!!!!"
        botonAWT!!.isEnabled=true

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
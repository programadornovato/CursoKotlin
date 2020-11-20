import java.awt.*
import java.awt.event.KeyEvent
import javax.swing.*

class Ventana(titulo:String?):JFrame(titulo){
    var panel=ArrayList<JPanel>()
    var etiqueta=ArrayList<JLabel>()
    var num=4
    var botonSwing:JButton?=null
    var botonAWT:Button?=null
    var contenedor=JPanel()
    var radioBoton=ArrayList<JRadioButton>()
    init {
        //num=JOptionPane.showInputDialog("Humano ingresa la cantidad de paneles").toInt()
        var d=Dimension(num*150,500)
        this.size=d
        defaultCloseOperation=WindowConstants.EXIT_ON_CLOSE
        this.contentPane.add(contenedor)
        contenedor.layout=null
        //this.setLocation(500,500)
        //agregarPanel()
        //agregarEtiquetas()
        //agregaBoton()
        //agregarRadio()
        //agregarCampoTexto()
        //agregarAreaTexto()
        agregaListaDesplegable()
    }
    fun agregaListaDesplegable(){
        var lenguajes= arrayOf<String>(
                "Kotlin",
                "Java",
                "C++",
                "Python",
                "Javascript"
        )
        var listaDesplegable=JComboBox(lenguajes)
        listaDesplegable.setBounds(10,10,300,60)
        listaDesplegable.addItem("VisualBasic")
        //listaDesplegable.selectedIndex=3
        listaDesplegable.selectedItem="C++"
        println("Index seleccionado=${listaDesplegable.selectedIndex}")
        println("Valor seleccionado=${listaDesplegable.selectedItem}")
        contenedor.add(listaDesplegable)
    }
    fun agregarAreaTexto(){
        //contenedor.layout=null
        var areaTexto=JTextArea()
        areaTexto.text="Humano aqui va el texto\nHumano aqui va mas texto\nHumano aqui va el texto\n"
        areaTexto.append("Humano aqui va mas texto\n")
        areaTexto.append("Humano aqui va mas texto\n")
        areaTexto.append("Humano aqui va mas texto\n")
        areaTexto.append("Humano aqui va mas texto\n")
        areaTexto.append("Humano aqui va mas texto\n")
        areaTexto.append("Humano aqui va mas texto\n")
        areaTexto.columns=25
        areaTexto.rows=7
        //areaTexto.setBounds(20,20,50,50)
        var scroll=JScrollPane(areaTexto)
        //scroll.setBounds(20,20,50,50)
        areaTexto.isEnabled=true
        areaTexto.isEditable=false

        contenedor.add(scroll)
    }
    fun agregarCampoTexto(){
        var campoTexto1=JTextField()
        campoTexto1.text="HHHHHHHHHHHHHHHHHHHH"
        campoTexto1.font=Font(Font.MONOSPACED,Font.BOLD,20)
        //campoTexto1.setBounds(100,100,200,20)
        campoTexto1.columns=25
        contenedor.add(campoTexto1)

        var campoTexto2=JTextField()
        campoTexto2.text="HHHHHHHHHHHHHHHHHHHH"
        campoTexto2.font=Font(Font.MONOSPACED,Font.BOLD,30)
        //campoTexto2.setBounds(100,100,200,20)
        campoTexto2.columns=25
        campoTexto2.background=Color.BLUE
        campoTexto2.foreground=Color.YELLOW
        contenedor.add(campoTexto2)

    }
    fun agregarRadio(){
        var grupo=ButtonGroup()
        var textos= arrayOf(
                "Humano dame click",
                "No,no,no humano dame click a mi",
                "Humano dame click y unete a lado hocuro de fuerza"
        )
        for (i in textos.indices){
            radioBoton.add(JRadioButton())
            radioBoton[i].text=textos[i]
            radioBoton[i].setBounds(10,100 + i *50,550,50)
            radioBoton[i].font=Font(Font.MONOSPACED,Font.BOLD,16)
            grupo.add(radioBoton[i])
            contenedor.add(radioBoton[i])
            if(i==2){
                radioBoton[i].isSelected=true
            }
        }
        /*
        var rd=JRadioButton("Humano dame click")
        rd.setBounds(100,100,200,20)
        rd.isEnabled=true
        contenedor.add(rd)
        */
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
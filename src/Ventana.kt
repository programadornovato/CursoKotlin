import java.awt.Dimension
import javax.swing.JFrame
import javax.swing.WindowConstants

class Ventana(titulo:String?):JFrame(titulo){
    init {
        var d=Dimension(500,500)
        this.size=d
        defaultCloseOperation=WindowConstants.EXIT_ON_CLOSE
        //this.setLocation(500,500)
    }
}
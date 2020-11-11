import javax.swing.JOptionPane

fun main(args:Array<String>){
    var perimetro:Double=0.0
    var area:Double=0.0
    var c:Cuadrilatero
    var opcion=JOptionPane.showInputDialog("Humano que figura quieres calcular\n1.- Cuadrado\n2.- Rectangulo").toInt()
    if(opcion==1){
        var lado=JOptionPane.showInputDialog("Humano ingresa el lado de tu Cuadrado").toDouble()
        c=Cuadrilatero(lado)
    }else if(opcion==2){
        var ladoa=JOptionPane.showInputDialog("Humano ingresa el lado a de tu rectangulo").toDouble()
        var ladob=JOptionPane.showInputDialog("Humano ingresa el lado b de tu rectangulo").toDouble()
        c=Cuadrilatero(ladoa, ladob)
    }else{
        c=Cuadrilatero(0.0)
    }
    JOptionPane.showMessageDialog(null,"Humano este es tu piche perimetro ${c.perimetro} y tu pinche area ${c.area}")
}
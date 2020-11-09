import javax.swing.JOptionPane

fun main(args:Array<String>){
    var n1=JOptionPane.showInputDialog("Humano!!! ingresa un numero").toInt()
    var n2=JOptionPane.showInputDialog("Humano!!! ingresa otro pinche numero").toInt()
    var cal=Calculadora()
    var res=0
    res=cal.suma(n1,n2)
    JOptionPane.showMessageDialog(null,"Humano aqui esta tu pinche suma ${res}")
    res=cal.resta(n1,n2)
    JOptionPane.showMessageDialog(null,"Humano aqui esta tu pinche resta ${res}")
    res=cal.multiplicacion(n1,n2)
    JOptionPane.showMessageDialog(null,"Humano aqui esta tu pinche multiplicacion ${res}")
    var resD=cal.divicion(n1.toDouble(),n2.toDouble())
    JOptionPane.showMessageDialog(null,"Humano aqui esta tu pinche divicion ${resD}")
}
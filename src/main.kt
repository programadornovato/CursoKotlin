import javax.swing.JOptionPane

fun main(args:Array<String>){
    var a=Animal()
    a.comer()
    a.correr()
    var h=Humano()
    h.correr()
    h.comer()
    var p=Perro()
    p.comer()
    p.correr()
    var pajaro=Pajaro()
    pajaro.correr()
    pajaro.volar()
}
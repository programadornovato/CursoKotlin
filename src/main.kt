import javax.swing.JOptionPane

fun main(args:Array<String>){
    var p1=Persona("Juan","Perez",30,"654654")
    var e1=Estudiante("Maria","Lopez",20,"654654","654t",10.0)
    println("Datos de la persona nombre=${p1.nombre} apellido=${p1.apellido} edad=${p1.edad}")
    println("Datos del estudiante=${e1.nombre} apellido=${e1.apellido} edad=${e1.edad} codigo=${e1.codigoEstudiante}  calificacion=${e1.calificacion}")
}
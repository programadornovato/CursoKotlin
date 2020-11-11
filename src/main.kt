import javax.swing.JOptionPane

fun main(args:Array<String>){
    var cantAlumnos=JOptionPane.showInputDialog("Humano ingresa la cantidad de alumnos de tu escuela").toInt()
    var a=Array<Alumnos?>(cantAlumnos){null}
    for (i in 0 until cantAlumnos){
        var nombre=JOptionPane.showInputDialog("Humano ingresa el nombre del alumno ${i+1}")
        var aula=JOptionPane.showInputDialog("Humano ingresa el aula del alumno ${i+1}")[0]
        var calificacion=JOptionPane.showInputDialog("Humano ingresa la calificacion del alumno ${i+1}").toDouble()
        a[i]=Alumnos(nombre, aula)
        a[i]!!.calificacion=calificacion
    }
    var suma=0.0
    var promedio=0.0
    var cantAlumnosPorSalon=0
    var salon=JOptionPane.showInputDialog("Humano ingresa el salon de los alumnos a promediar")[0]
    for(i in 0 until cantAlumnos){
        if(salon==a[i]!!.aula){
            suma=suma+a[i]!!.calificacion
            cantAlumnosPorSalon++
        }
    }
    promedio=suma/cantAlumnosPorSalon
    JOptionPane.showMessageDialog(null,"El promedio de los alumnos del salon $salon es $promedio")
}
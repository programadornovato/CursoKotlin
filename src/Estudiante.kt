class Estudiante (nombre:String?,apellido:String?,edad:Int,curp:String?,var codigoEstudiante:String?,var calificacion:Double)
    :Persona(nombre!!,apellido!!,edad,curp!!){
    fun muestraNombre(){
        println("Nombre ${nombre}")
    }
    fun muestraApellido(){
        println("Apellido ${apellido}")
    }
    fun muestraEdad(){
        println("Edad ${edad}")
    }
}
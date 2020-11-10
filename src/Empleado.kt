class Empleado {
    var edad=0
        get() = field+1
        set(value) {
            if(value>=18 && value<=80){
                field = value
            }else{
                println("Semi Dios Estupido la edad debe de estar en un rango entre 18 y 80 años")
            }
        }
    var nombre:String?=null
        get() = field?.toUpperCase()
        set(value) {
            if(value!!.isEmpty()) {
                println("El nombre debe de tener texto")
            }else{
                field = value
            }
        }
    /*
    public fun setEdad(_edad:Int){
        if(_edad>=18 && _edad<=80){
            edad=_edad
        }else{
            println("Semi Dios Estupido la edad debe de estar en un rango entre 18 y 80 años")
        }
    }
    public fun getNombre(_nombre:String){
        if(_nombre?.isEmpty()){
            println("El nombre debe de tener texto")
        }else{
            nombre=_nombre
        }
    }
    */
}
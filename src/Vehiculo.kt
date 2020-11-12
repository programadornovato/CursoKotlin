open class Vehiculo (var matricula:String,var marca:String,var modelo:String){
    open fun entregarDatos():String{
        return "matricula=$matricula,marca=$marca,modelo$modelo"
    }
}
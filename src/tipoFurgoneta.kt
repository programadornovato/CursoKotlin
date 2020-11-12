class tipoFurgoneta(matricula:String?,marca:String?,modelo:String?,var carga:Int):Vehiculo(matricula!!,marca!!,modelo!!){
    override fun entregarDatos():String{
        return "matricula=$matricula,marca=$marca,modelo$modelo,carga=$carga"
    }
}
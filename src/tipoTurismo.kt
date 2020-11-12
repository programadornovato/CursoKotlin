class tipoTurismo(matricula:String?,marca:String?,modelo:String?,var numeroPuertas:Int):Vehiculo(matricula!!,marca!!,modelo!!){
    override fun entregarDatos():String{
        return "matricula=$matricula,marca=$marca,modelo$modelo,numeroPuertas=$numeroPuertas"
    }
}
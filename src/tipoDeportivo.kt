class tipoDeportivo(matricula:String?,marca:String?,modelo:String?,var cilindros:Int):Vehiculo(matricula!!,marca!!,modelo!!){
    override fun entregarDatos():String{
        return "matricula=$matricula,marca=$marca,modelo$modelo,cilindros=$cilindros"
    }
}
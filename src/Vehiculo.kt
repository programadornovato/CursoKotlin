class Vehiculo {
    var marca:String?=null
    var modelo:String?=null
    var sku:String?=null
    constructor(_marca:String,_modelo:String){
        marca=_marca
        modelo=_modelo
    }
    constructor(_sku:String){
        sku=_sku
    }
    fun acelerar(){
        if(marca!=null){
            println("El vehiculo $marca $modelo esta acelerando")
        }else{
            println("El vehiculo $sku esta acelerando")
        }
    }
    fun acelerar(km:Int){
        if(marca!=null){
            println("El vehiculo $marca $modelo esta acelerando a $km por hora")
        }else{
            println("El vehiculo $sku esta acelerando a $km por hora")
        }
    }
}
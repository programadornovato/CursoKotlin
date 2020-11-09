class Calculadora{
    fun suma(num1:Int,num2:Int):Int{
        var res=0
        if(num1>0 && num2>0){
            res=num1+num2
        }
        return res
    }
    fun resta(num1:Int,num2:Int):Int{
        var res=0
        if(num1>0 && num2>0){
            res=num1-num2
        }
        return res
    }
    fun multiplicacion(num1:Int,num2:Int):Int{
        var res=0
        if(num1>0 && num2>0){
            res=num1*num2
        }
        return res
    }
    fun divicion(num1:Double,num2:Double):Double{
        var res=0.0
        if(num1>0 && num2>0){
            res=num1/num2
        }
        return res
    }
}
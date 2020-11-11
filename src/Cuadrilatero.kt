class Cuadrilatero{
    private var lado1:Double
    private var lado2:Double
    constructor(lado:Double){
        lado1=lado
        lado2=lado
    }
    constructor(ladoa:Double,ladob:Double){
        lado1=ladoa
        lado2=ladob
    }
    var perimetro:Double=0.0
        get() {
            return (lado1+lado2)*2
        }
    var area:Double=0.0
        get(){
            return lado1*lado2
        }
}
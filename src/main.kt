import javax.swing.JOptionPane

fun main(args:Array<String>){
    //listaNormal()
    listaDinamica()
}
fun listaNormal(){
    var numElementos=JOptionPane.showInputDialog("Humano coloca la cantidad de elementos de tu lista").toInt()
    var listaEstatica= arrayOfNulls<Int>(numElementos)
    for(i in 0 until numElementos){
        listaEstatica[i]=JOptionPane.showInputDialog("Ingresa un numero").toInt()
    }
    println("Aqui esta tu pinche lista")
    listaEstatica.forEach {
        println(it)
    }
}
fun listaDinamica(){
    var listaDinamica=ArrayList<Int>()
    var respuesta:Char
    do {
        listaDinamica.add(JOptionPane.showInputDialog("Ingresa un numero").toInt())
        respuesta=JOptionPane.showInputDialog("Quieres continuar s/n")[0]
    }while ( respuesta=='s' || respuesta=='S' )
    println("Aqui esta tu pinche lista")
    listaDinamica.forEach {
        println(it)
    }

}
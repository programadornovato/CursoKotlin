import javax.swing.JOptionPane

fun main(args:Array<String>){
    var v= arrayOfNulls<Vehiculo>(4)
    v[0]=Vehiculo("XDSDF445","Nissan","2010")
    v[1]=tipoTurismo("XDFGHJ777","Nissan","2018",5)
    v[2]=tipoDeportivo("TTYYHH666","Nissan","2010",8)
    v[3]=tipoFurgoneta("FDSEEW5666","Nissan","2015",20)
    for (i in v.indices){
        println(v[i]!!.entregarDatos())
    }
}

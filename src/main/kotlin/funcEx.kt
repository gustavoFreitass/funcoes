fun main (){
    ano(2)
    quantiCaract("kkkk")
    cubo(3)
    milhas(1.0 )
    swap("\nAndando, aventura, Alabasta")
}

fun ano(a: Int) {
    val meses = a * 12
    val dias = a * 365
    val horas = dias * 24
    val minutos = horas * 60
    val segundos = minutos * 60
    return println( "\n$a anos equivalem à:" +
                    "\n$meses meses" +
                    "\n$dias dias"   +
                    "\n$horas horas" +
                    "\n$minutos minutos" +
                    "\n$segundos segundos"  )
}

fun quantiCaract(str: String) = println("\nA frase $str possui ${str.length} caracteres")

fun cubo(a: Int){
    val cu = a * a * a
    println("\nO cubo de $a é $cu")
}

fun milhas(km: Double ) {
    val m: Double = 1.6
    val convert = km * m
    println("\n${km}km em milhas equivale à $convert ")
}

fun swap(str: String) = println(str.lowercase().replace("a", "x"))


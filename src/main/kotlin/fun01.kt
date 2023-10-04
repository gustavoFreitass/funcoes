fun main(){
    helloWord()
    println("A soma de 10 e 5 é ${sum(10, 5)}")
    println("A divisão entre 10 e 3.5 é igual a ${div(10f, 3.5f)}")
    println(div(10f, 3.5f))
}

fun sum(a: Int, b: Int) = (a + b)

fun div(a: Float, b: Float) = (a / b)

fun helloWord() = println("hello word")


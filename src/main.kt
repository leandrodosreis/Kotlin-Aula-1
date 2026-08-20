import com.sun.jdi.DoubleType

//Comentarios

/*
Comentando
trecho
*/

/*
print
fun main(){
    println("Hello World!")
}
*/

/*
declaração de variaveis
fun main(){
    val pi = 3.14

    var idade = 27

    idade = 28
}
*/

/*
fun main(){
    var idade : Int =27

    idade = 28

    var altura = 1.80

    altura = 2.0
}
*/


//
//fun main() {
//    val texto: String = "Bom dia, pessoal"
//
//    println(texto)
//    println(texto.length)
//    println(texto.uppercase())
//    println(texto.contains("pessoal"))
//}

//fun main(){
//    val nome = "joao"
//
//    val idade = 25
//
//    println("Bom dia $nome logo logo voce fara ${idade + 1} anos   ")
//}

//fun main(){
//    val texto = """
//        texto
//        para
//        3
//    """
//
//    print(texto)
//}


//como definir um caracter como char ou seja caracter
//fun main(){
//
//    val caracter = '*'
//
//    println(caracter)
//}

//fun main(){
//    val bloqueado = false
//
//    println(bloqueado)
//}

//fun main(){
//    val populacao = 80.60000909098555
//
//    println(populacao)
//}

//
//fun main() {
//    val x: Int = 10
//    val y: Double = x.toDouble()
//    val z: Double = x
//}

//fun main(){
//    val a = 10
//    val b = 3
//
//    println( a + b)
//    println( a - b)
//    println( a / b)
//    println( a * b)
//    println( a % b)
//
//}

//fun main(){
//    val a = 10
//    val b = 5
//
//    println( a == b)
//    println( a != b)
//    println( a > b)
//    println( a < b)
//    println( a >= b)
//    println( a <= b)
//
//}

//fun main(){
//    var a = 10
//
//    a += 5
//    a -= 5
//    a *= 5
//    a /= 5
//    a %= 5
//println(a)
//}

//fun main(){
//    val a = 10
//
//    println(a && a)
//
//}


//fun nomeDaFuncao(){
//    println("oii")
//}
//fun main(){
//    nomeDaFuncao()
//}

//fun mandaSalve(nome: String){
//    println("oii, ${nome}")
//}
//fun main(){
//    mandaSalve("Leandro")
//}

//fun mandaSalve(nome: String = "mano"){
//    println("oii, ${nome}")
//}
//fun main(){
//    mandaSalve()
//}

//fun mandaSalve(nome: String = "mano", idade: Int = 12){
//    println("oii, ${nome} parabens pelo aniversario de ${idade}")
//}
//fun main(){
//    mandaSalve(idade = 13, nome = "Leandro")
//}

//fun soma(a: Int, b:Int): Int{
//
//    return a+b
//}
//fun main(){
//    val result = soma(a = 1, b = 2)
//    println(result)
//}

//fun soma(a: Int, b:Int) = a+b
//fun main(){
//    val result = soma(a = 1, b = 2)
//    println(result)
//}


////Arrow function lambda
//fun main(){
//    val soma: (Int, Int) -> Int = { a, b -> a - b }
//    val result = soma(2, 3)
//
//    println(result)
//}


//fun main(){
//    val idade = 19
//
//    if (idade > 18){
//        println("maior de idade")
//
//    }else if (idade < 18){
//        println("menor de idade")
//
//    }else{
//        println("Limbo")
//    }
//}

//fun main(){
//    val idade = 19
//
//    val status = if (idade > 18){
//        "maior de idade"
//
//        println("teste")
//        "teste2"
//        println("teste3")
//
//    }else if (idade < 18){
//        "menor de idade"
//
//    }else{
//        "Limbo"
//    }
//
//    println(status)
//}

//ternario
//fun main (){
//    val idade = 18
//
//    println(if(idade >= 18) "maior" else "menor")
//}

//fun main (){
//    val dia = 3
//
//    when(dia){
//
//        1 -> println("Domingo")
//        2 -> println("Segunda")
//        3 -> println("Terça")
//
//        else -> println("Dia Invalido")
//    }
//}

//fun main (){
//    val nota = 9
//
//    when(nota){
//
//        9,10 -> println("Excelente")
//        7,8 -> println("Bom")
//        6 -> println("Regular")
//
//        else -> println("Reprovado")
//    }
//}


//fun main (){
//    val dia = 3
//
//    val nomeDia = when(dia){
//
//        1 -> "Excelente"
//        2 -> "Bom"
//        3 -> "Regular"
//
//        else -> "Reprovado"
//    }
//
//    println(nomeDia)
//}


//fun main (){
//    val nota = 9
//
//    when{
//
//        nota >= 9 -> println("Excelente")
//        nota >= 6 -> println("Bom")
//
//        else -> println("Reprovado")
//    }
//}

//criando var nulas
//fun main (){
//    var nome: String? = "Leandro"
//
//    nome = null
//
//    if (nome != null) {
//        println(nome.length)
//    }
//}

//criando var nulas
//fun main (){
//    var nome: String? = null
//
//    println(nome?.length)
//}


//fun main (){
//    var numeros = arrayOf(1,2,3)
//
//    println(numeros[0])
//
//    numeros[1] = 50
//
//    println(numeros[1])
//}


//fun main (){
//    var frutas = listOf("banana","maça","maça")
//
//    println(frutas[0])
//
//}

fun main (){
    var frutas = listOf("banana","maça","maça")

    println(frutas.size)
    println(frutas.first())
    println(frutas.last())
    println(frutas.contains("maça"))

}
package model

open class Carro {

    var modelo : String = ""
        get() {
            return field.uppercase()
        }

    //field referese ao atributo em questao

    var ano: Int = 0
        set(value) {
            field = if (value >= 0) value else 0
        }

    private var kilometragem: Double = 0.0

    fun rodar(km: Double) {
        kilometragem += km
    }

    fun consultar(): Double {
        return kilometragem
    }

    open fun acelerar(){
        println("vrum-vrum")
    }
}

//class Carro(var modelo: String, var ano: Int, var portas: Int = 4) {
//
//    init {
//
//        println("Carro $modelo, ano $ano, Qtd de portas $portas")
//    }
//
//}
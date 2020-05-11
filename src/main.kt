fun main() {
    println("Bem vindo ao Bytebank");
    val contaAlex = Conta()
    contaAlex.titular = "Alex"
    contaAlex.numero = 1000
    contaAlex.saldo = 100.0

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1001
    contaFran.saldo = 300.0

    println("Titular: ${contaAlex.titular}")
    println("Número.: ${contaAlex.numero}")
    println("Saldo..: ${contaAlex.saldo}")

    println("Titular: ${contaFran.titular}")
    println("Número.: ${contaFran.numero}")
    println("Saldo..: ${contaFran.saldo}")

    deposita(contaAlex,50.0)
    println("Saldo..: ${contaAlex.saldo}")
    contaFran.saldo += 70.0

    println("Deponsitando na conta da Fran..: ${contaAlex.saldo}")
    deposita(contaFran, valor = 70.0)
    println("Saldo..: ${contaFran.saldo}")

}

fun deposita(conta: Conta, valor: Double) {
    conta.saldo += valor
}

private fun testaCopiasReferencia() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++
//    println("numeroX $numeroX")
//    println("numeroY $numeroY")

    val contaJoao = Conta()
    contaJoao.titular = "Joao"
    var contaMaria = contaJoao
    contaMaria.titular = "Maria"

    println("titular conta joao: $contaJoao")
    println("titular conta maria: $contaMaria")
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
}

private fun testaLacos() {
    var i = 0
    while (i < 5) {
        val titular = "Gabriel $i"
        val numeroConta = 1000 + i
        var saldo = i + 10.0
        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo do conta $saldo")
        println()
        i++;
    }


//    for (i in 5 downTo 1) {
//        if(i ==4){
//            continue
//        }
//        val titular = "Gabriel $i"
//        val numeroConta = 1000 + i
//        var saldo = i + 10.0
//
//        println("titular $titular")
//        println("número da conta $numeroConta")
//        println("saldo do conta $saldo")
//        println()
//    }
}

fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("Conta é positiva")
    } else if (saldo == 0.0) {
        println("Conta é neutra")
    } else {
        println("Conta é negativa")
    }

    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é neutra")
        else -> println("Conta é negativa")
    }
}


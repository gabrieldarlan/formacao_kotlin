fun main() {
    println("Bem vindo ao Bytebank");
    val contaAlex = Conta(titular = "Alex", numero = 1000)

    contaAlex.deposita(-200.0)

    val contaFran = Conta(numero = 1001, titular = "Fran")
    contaFran.deposita(300.0)

    println("Titular: ${contaAlex.titular}")
    println("Número.: ${contaAlex.numero}")
    println("Saldo..: ${contaAlex.saldo}")

    println("Titular: ${contaFran.titular}")
    println("Número.: ${contaFran.numero}")
    println("Saldo..: ${contaFran.saldo}")

//    println("Deponsitando na conto do Alex..: ${contaAlex.saldo}")
//    contaAlex.deposita(valor = 50.0)
//    println("Saldo..: ${contaAlex.saldo}")
//
//    println("Deponsitando na conta da Fran..: ${contaFran.saldo}")
//    contaFran.deposita(valor = 70.0)
//    println("Saldo..: ${contaFran.saldo}")
//
//    println("sacando na conta do alex")
//    contaAlex.saca(250.0)
//    println(contaAlex.saldo)
//
//    println("sacando na conta da fran")
//    contaFran.saca(valor = 100.0)
//    println(contaFran.saldo)
//
//    println("saque em excesso na conda do alex")
//    contaAlex.saca(valor = 100.0)
//    println(contaAlex.saldo)
//
//    println("saque em excesso na conta Da fran")
//    contaFran.saca(valor = 500.0)
//    println(contaFran.saldo)
//
//    println("*=======Saldo antes da transferencia====*")
//    println("Conta alex ${contaAlex.saldo}")
//    println("Conta fran ${contaFran.saldo}")
//    println("*=======================================*")
//
//    println("Transferencia da conta da Fran para o Alex")
//    if (contaFran.transfere(valor = 100.0, destino = contaAlex)) {
//        println("Transferencia realizada")
//    } else {
//        println("Falha na transferencia")
//    }
//    println("*==========Saldo depois do saque========*")
//    println("Conta alex ${contaAlex.saldo}")
//    println("Conta fran ${contaFran.saldo}")
//    println("*=======================================*")

}

class Conta(
    var titular: String,
    val numero: Int = 0
) {
    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (this.saldo >= valor) {
            saldo -= valor
            destino.saldo += valor
            return true
        } else return false
    }
}


private fun testaCopiasReferencia() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++
//    println("numeroX $numeroX")
//    println("numeroY $numeroY")

//    val contaJoao = Conta()
//    contaJoao.titular = "Joao"
//    var contaMaria = contaJoao
//    contaMaria.titular = "Maria"
//
//    println("titular conta joao: $contaJoao")
//    println("titular conta maria: $contaMaria")
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


fun main() {
    println("Bem vindo ao Bytebank");

}

private fun lacoDeRepeticao() {
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


package br.com.alura.bytebank.teste

fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("br.com.alura.modelo.Conta é positiva")
    } else if (saldo == 0.0) {
        println("br.com.alura.modelo.Conta é neutra")
    } else {
        println("br.com.alura.modelo.Conta é negativa")
    }

    when {
        saldo > 0.0 -> println("br.com.alura.modelo.Conta é positiva")
        saldo == 0.0 -> println("br.com.alura.modelo.Conta é neutra")
        else -> println("br.com.alura.modelo.Conta é negativa")
    }
}


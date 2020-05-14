package br.com.alura.teste

import br.com.alura.modelo.ContaCorrente
import br.com.alura.modelo.ContaPoupanca

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "Gabriel",
        numero = 1000
    )
    var contaPoupanca = ContaPoupanca(
        titular = "Samara",
        numero = 1001
    )
    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)
    println("saldo corrente ${contaCorrente.saldo}")
    println("saldo poupança ${contaPoupanca.saldo}")
    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)
    println("saldo após saque corrente ${contaCorrente.saldo}")
    println("saldo após saque poupança ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)
    println("saldo corrente após transferir para poupança ${contaCorrente.saldo}")
    println("saldo poupança após receber transferência ${contaPoupanca.saldo}")

    contaPoupanca.transfere(200.0, contaCorrente)
    println("saldo poupança após transferir para corrente ${contaPoupanca.saldo}")
    println("saldo corrente após receber transferência ${contaCorrente.saldo}")
}

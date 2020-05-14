package br.com.alura.teste

import br.com.alura.modelo.ContaCorrente
import br.com.alura.modelo.ContaPoupanca

private fun testaComportamentosConta() {
    val contaAlex = ContaPoupanca(titular = "Alex", numero = 1000)

    contaAlex.deposita(-200.0)

    val contaFran = ContaCorrente(numero = 1001, titular = "Fran")
    contaFran.deposita(300.0)

    println("Titular: ${contaAlex.titular}")
    println("Número.: ${contaAlex.numero}")
    println("Saldo..: ${contaAlex.saldo}")

    println("Titular: ${contaFran.titular}")
    println("Número.: ${contaFran.numero}")
    println("Saldo..: ${contaFran.saldo}")
    println("Deponsitando na conto do Alex..: ${contaAlex.saldo}")
    contaAlex.deposita(valor = 50.0)
    println("Saldo..: ${contaAlex.saldo}")

    println("Deponsitando na conta da Fran..: ${contaFran.saldo}")
    contaFran.deposita(valor = 70.0)
    println("Saldo..: ${contaFran.saldo}")

    println("sacando na conta do alex")
    contaAlex.saca(250.0)
    println(contaAlex.saldo)

    println("sacando na conta da fran")
    contaFran.saca(valor = 100.0)
    println(contaFran.saldo)

    println("saque em excesso na conda do alex")
    contaAlex.saca(valor = 100.0)
    println(contaAlex.saldo)

    println("saque em excesso na conta Da fran")
    contaFran.saca(valor = 500.0)
    println(contaFran.saldo)

    println("*=======Saldo antes da transferencia====*")
    println("br.com.alura.modelo.Conta alex ${contaAlex.saldo}")
    println("br.com.alura.modelo.Conta fran ${contaFran.saldo}")
    println("*=======================================*")

    println("Transferencia da conta da Fran para o Alex")
    if (contaFran.transfere(valor = 100.0, destino = contaAlex)) {
        println("Transferencia realizada")
    } else {
        println("Falha na transferencia")
    }
    println("*==========Saldo depois do saque========*")
    println("br.com.alura.modelo.Conta alex ${contaAlex.saldo}")
    println("br.com.alura.modelo.Conta fran ${contaFran.saldo}")
    println("*=======================================*")
}

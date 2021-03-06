package br.com.alura.bytebank.teste

import br.com.alura.bytebank.exception.FalhaAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaComportamentosConta() {
    val gabriel = Cliente(nome = "Gabriel", cpf = "12312312", senha = 1)
    val jaqueline = Cliente(nome = "Jaq", cpf = "809809809", senha = 2)

    val contaGabriel = ContaPoupanca(titular = gabriel, numero = 1000)

    contaGabriel.deposita(-200.0)

    val contaJaque = ContaCorrente(numero = 1001, titular = jaqueline)
    contaJaque.deposita(300.0)

    println("Titular: ${contaGabriel.titular}")
    println("Número.: ${contaGabriel.numero}")
    println("Saldo..: ${contaGabriel.saldo}")

    println("Titular: ${contaJaque.titular}")
    println("Número.: ${contaJaque.numero}")
    println("Saldo..: ${contaJaque.saldo}")
    println("Deponsitando na conto do gabriel..: ${contaGabriel.saldo}")
    contaGabriel.deposita(valor = 50.0)
    println("Saldo..: ${contaGabriel.saldo}")

    println("Deponsitando na conta da jaqueline..: ${contaJaque.saldo}")
    contaJaque.deposita(valor = 70.0)
    println("Saldo..: ${contaJaque.saldo}")

    println("sacando na conta do gabriel")
    contaGabriel.saca(250.0)
    println(contaGabriel.saldo)

    println("sacando na conta da jaqueline")
    contaJaque.saca(valor = 100.0)
    println(contaJaque.saldo)

    println("saque em excesso na conda do gabriel")
    contaGabriel.saca(valor = 100.0)
    println(contaGabriel.saldo)

    println("saque em excesso na conta Da jaqueline")
    contaJaque.saca(valor = 500.0)
    println(contaJaque.saldo)

    println("*=======Saldo antes da transferencia====*")
    println("Conta gabriel ${contaGabriel.saldo}")
    println("Conta jaqueline ${contaJaque.saldo}")
    println("*=======================================*")

    println("Transferencia da conta da jaqueline para o gabriel")

    try {
        contaJaque.transfere(valor = 100.0, destino = contaGabriel, senha = 1)
        println("Transferencia realizada")
    } catch (e: SaldoInsuficienteException) {
        println("Falha na transferencia")
        println("Saldo insuficiente")
        e.printStackTrace()
    } catch (e: FalhaAutenticacaoException) {
        println("Falha na autenticacao")
        println("Falha na Transferencia")
        e.printStackTrace()
    } catch (e: Exception) {
        println("Erro desconhecido")
        e.printStackTrace()
    }

    println("*==========Saldo depois do saque========*")
    println("Conta gabriel ${contaGabriel.saldo}")
    println("Conta jaqueline ${contaJaque.saldo}")
    println("*=======================================*")
}

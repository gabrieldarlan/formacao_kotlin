package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.exception.FalhaAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException
import java.lang.RuntimeException


abstract class Conta(

    var titular: Cliente,
    val numero: Int
) : Autenticavel {
    var saldo = 0.0
        protected set

    companion object {
        var total = 0
            private set
    }

    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha)
    }

    init {
        println("Criando conta")
        total++
    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta, senha: Int) {
        if (saldo < valor) {
            throw SaldoInsuficienteException(
                messagem =
                "O saldo é insuficiente, saldo atual: $saldo, valor a ser transferido $valor"
            )
        }
        if (!autentica(senha)) {
            throw FalhaAutenticacaoException()
        }
        saldo -= valor
        destino.saldo += valor
    }
}

class ContaCorrente(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if (this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
        }
    }
}

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }
}
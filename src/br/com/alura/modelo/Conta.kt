package br.com.alura.modelo

abstract class Conta(
    var titular: Cliente,
    val numero: Int
) {
    var saldo = 0.0
        protected set

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

   abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (this.saldo >= valor) {
            saldo -= valor
            destino.saldo += valor
            return true
        } else return false
    }
}
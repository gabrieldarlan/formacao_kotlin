abstract class Conta(
    var titular: String,
    var numero: Int = 0
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
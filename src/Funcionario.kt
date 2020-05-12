open class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {
    open val bonificacao: Double
        get() {
            println("bonificaçao funcionario")
            return this.salario * 0.1
        }
}


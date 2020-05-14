package br.com.alura.modelo

class Analista(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {
    override val bonificacao: Double
        get() {
            println("bonificacao analista")
            return this.salario * 0.1
        }

}

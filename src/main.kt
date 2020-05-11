fun main() {
    println("Bem vindo ao Bytebank");

    val funcionario = Funcionario(
        nome = "Gabriel",
        cpf = "39562057828",
        salario = 1000.0
    )

    println("Nome: ${funcionario.nome}")
    println("CPF: ${funcionario.cpf}")
    println("Salário: ${funcionario.salario}")

    println("bonificação ${funcionario.bonificacao()}")
}




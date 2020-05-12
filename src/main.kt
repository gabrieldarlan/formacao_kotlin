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

    var gerente = Gerente(
        nome = "Jaqueline",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 111
    )
    println()
    println("Nome: ${gerente.nome}")
    println("CPF: ${gerente.cpf}")
    println("Salário: ${gerente.salario}")
    println("Gerente bonificação ${gerente.bonificacao()}")

    if (gerente.autenticacao(senha = 111)) {
        println("Autenticou com sucesso")
    } else {
        println("falha na autenticacao")
    }

    var diretor = Diretor(
        nome = "Darlan",
        cpf = "11111111111",
        salario = 4000.0,
        senha = 112,
        plr = 2220.0
    )
    println()
    println("Nome: ${diretor.nome}")
    println("CPF: ${diretor.cpf}")
    println("Salário: ${diretor.salario}")
    println("PLR: ${diretor.plr}" )
    println("Gerente bonificação ${diretor.bonificacao()}")

    if (diretor.autenticacao(senha = 112)) {
        println("Autenticou com sucesso")
    } else {
        println("falha na autenticacao")
    }


}




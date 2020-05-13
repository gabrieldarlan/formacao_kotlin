private fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Gabriel",
        cpf = "111.111.111-11",
        salario = 1000.0,
        senha = 1000
    )
    val diretor = Diretor(
        nome = "Jaqueline",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 2000,
        plr = 200.0
    )

    var cliente = Cliente(
        nome="Darlan",
        cpf = "12321312312",
        senha = 123
    )

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(gerente, 1000)
    sistemaInterno.entra(diretor, 1000)
}
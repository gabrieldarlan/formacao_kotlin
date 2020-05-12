class SistemaInterno {

    fun entra(admin: FuncionarioAdmin, senha: Int) {
        when {
            admin.autentica(senha) -> println("Falha na autenticação")
            else -> println("Bem vindo ao bytebank")
        }
    }
}
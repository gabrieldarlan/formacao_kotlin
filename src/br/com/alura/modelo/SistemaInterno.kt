package br.com.alura.modelo

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int) {
        when {
            admin.autentica(senha) -> println("Falha na autenticação")
            else -> println("Bem vindo ao bytebank")
        }
    }
}
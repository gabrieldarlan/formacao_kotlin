package br.com.alura.modelo

class CalculadoraBonificacao {
    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario) {
        println("nome ${funcionario.nome}")
        this.total += funcionario.bonificacao
    }

//    fun registra(gerente: br.com.alura.modelo.Gerente) {
//        this.total += gerente.bonificacao
//    }
//
//    fun registra(diretor: br.com.alura.modelo.Diretor) {
//        this.total += diretor.bonificacao
//    }


}
package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco

fun main() {
    val enderecoNulo: Endereco? = Endereco(logradouro = "rua nena", complemento = "Casa 1")
    val logradouroNovo: String? = enderecoNulo?.logradouro
    enderecoNulo?.let {
        println(it.logradouro)
        val tamanhoComplemento: Int =
            it.complemento?.length ?: throw IllegalStateException("complemento não pode ser vazio")
        println(tamanhoComplemento)
    }
    teste("1")
    teste(1)

}

fun teste(valor: Any) {
    val numero: Int? = valor as? Int
    println(numero)
}


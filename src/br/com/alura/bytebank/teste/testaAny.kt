package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

public fun testaAny() {
    val endereco = Endereco()
    val enderecoNovo = Endereco()

//    println(endereco.equals(enderecoNovo))
    println(endereco.hashCode())
    println(enderecoNovo.hashCode())
    println(endereco.hashCode())
}
package br.com.alura.bytebank.exception


class SaldoInsuficienteException(messagem: String = "O saldo é insufiente") : Exception(messagem)
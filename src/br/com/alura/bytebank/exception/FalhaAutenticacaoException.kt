package br.com.alura.bytebank.exception

class FalhaAutenticacaoException(
    messagem: String = "Falha na autenticacao"
) : Exception(messagem)
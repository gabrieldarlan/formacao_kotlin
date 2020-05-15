package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereco

fun testaContasDiferentes() {

    val gabriel = Cliente(
        nome = "Gabriel",
        cpf = "12312312",
        senha = 1,
        endereco = Endereco(
            logradouro = "Rua Nena",
            numero = 18,
            bairro = "Vila Crett",
            cidade = "Carapicuíba",
            estado = "São Paulo",
            cep = "06386-310",
            complemento = "Casa 1"
        )
    )
    val jaqueline = Cliente(nome = "Jaq", cpf = "809809809", senha = 2)
    val contaCorrente = ContaCorrente(
        titular = gabriel,
        numero = 1000
    )
    var contaPoupanca = ContaPoupanca(
        titular = jaqueline,
        numero = 1001
    )
    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)
    println("saldo corrente ${contaCorrente.saldo}")
    println("saldo poupança ${contaPoupanca.saldo}")
    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)
    println("saldo após saque corrente ${contaCorrente.saldo}")
    println("saldo após saque poupança ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)
    println("saldo corrente após transferir para poupança ${contaCorrente.saldo}")
    println("saldo poupança após receber transferência ${contaPoupanca.saldo}")

    contaPoupanca.transfere(200.0, contaCorrente)
    println("saldo poupança após transferir para corrente ${contaPoupanca.saldo}")
    println("saldo corrente após receber transferência ${contaCorrente.saldo}")

    println("*============ENDERECO DO GABRIEL==================*")
    println(gabriel.endereco.logradouro)
    println(gabriel.endereco.numero)
    println(gabriel.endereco.bairro)
    println(gabriel.endereco.cep)
    println(gabriel.endereco.cidade)
    println(gabriel.endereco.estado)
}

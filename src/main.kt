import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.Conta
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.teste.testaContasDiferentes

fun main() {

    val jaque = object { // isso é um object expression
        val nome: String = "jaque"
        val cpf: String = "12312312312"
        val senha: Int = 1000

        fun autentica(senha: Int) = this.senha == senha
    }



    println("nome do cliente ${jaque.nome}")

    val cliente =
        Cliente(nome = "Gabriel", cpf = "395.620.578-28", senha = 123)
    val contaPoupanca = ContaPoupanca(titular = cliente, numero = 1000)
    val contaCorrente = ContaCorrente(titular = cliente, numero = 1000)
    testaContasDiferentes()


    println("Criando conta ${Conta.total}")
}




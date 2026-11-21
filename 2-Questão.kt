fun main(){
    val transacoes = arrayOf("TX-1001", "TX-1002", "TX-1003", "TX-1004", "TX-1005")

    val codigprocurado = "TX-1004"

    for (i in transacoes.indices){
        if (transacoes[i] == codigprocurado){
            println("Código $codigprocurado encontrado com sucesso!")
            println("Posição no array: $i")
            break
        }
    }
}
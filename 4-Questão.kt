fun main() {

    val numeros = IntArray(20) { it + 1 }

    var soma = 0

    for (i in numeros.indices step 2) {

        soma += numeros[i]
        println("Índice: $i | Valor: ${numeros[i]}")
    }

    println("\nSoma dos valores em índices pares: $soma")
}
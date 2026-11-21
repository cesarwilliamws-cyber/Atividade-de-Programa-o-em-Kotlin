fun main() {
    
    val matriz = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6)
    )

    val transposta = Array(3) { IntArray(2) }

    for (i in matriz.indices) {
        for (j in matriz[i].indices) {

            // Invertendo linhas e colunas
            transposta[j][i] = matriz[i][j]
        }
    }

    println("Matriz original (2x3):")

    for (linha in matriz) {
        println(linha.joinToString(" "))
    }

    println("\nMatriz transposta (3x2):")

    for (linha in transposta) {
        println(linha.joinToString(" "))
    }
}
fun main() {
    
    val matriz = arrayOf(
        intArrayOf(1, 2, 3, 4),
        intArrayOf(5, 6, 7, 8),
        intArrayOf(9, 10, 11, 12),
        intArrayOf(13, 14, 15, 16)
    )

    var soma = 0

    println("Matriz 4x4:")

    for (i in matriz.indices) {
        for (j in matriz[i].indices) {

            print("${matriz[i][j]}\t")

            if (i == j) {
                soma += matriz[i][j]
            }
        }

        println()
    }

    println("\nSoma da diagonal principal: $soma")
}
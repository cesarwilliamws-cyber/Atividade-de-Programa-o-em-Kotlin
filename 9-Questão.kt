fun main() {
    
    val matriz = arrayOf(
        intArrayOf(5, 0, 8),
        intArrayOf(0, 3, 7),
        intArrayOf(2, 0, 4)
    )

    var soma = 0

    for (i in matriz.indices) {
        for (j in matriz[i].indices) {

            if (matriz[i][j] == 0) {
                continue
            }

            if (matriz[i][j] > 0) {
                soma += matriz[i][j]
            }
        }
    }

    println("Soma dos valores positivos: $soma")
}
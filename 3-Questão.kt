fun main(){

    val temperaturas = doubleArrayOf(28.5, 30.0, 27.0, 32.5, 29.0, 31.0, 26.5)

    var soma = 0.0

    for (i in temperaturas.indices) {
        soma += temperaturas[i]
    }
    
    val media = soma / temperaturas.size

    println("Média semanal: %.2f".format(media))
    println("\nDias com temperatura acima da média:")

    for (i in temperaturas.indices) {

        if (temperaturas[i] > media) {
            println("Dia ${i + 1}: ${temperaturas[i]} °C")
        }
    }
}
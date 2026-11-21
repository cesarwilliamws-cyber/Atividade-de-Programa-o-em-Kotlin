fun main() {

    val notas = Array(3) { DoubleArray(2) }

    var somaTurma = 0.0

    notas[0][0] = 8.0
    notas[0][1] = 7.0

    notas[1][0] = 5.0
    notas[1][1] = 6.0

    notas[2][0] = 9.0
    notas[2][1] = 8.0

    for (i in notas.indices) {

        val media = (notas[i][0] + notas[i][1]) / 2

        println("Aluno ${i + 1}")
        println("Média: %.2f".format(media))

        if (media >= 7.0) {
            println("Situação: Aprovado")
        } else {
            println("Situação: Reprovado")
        }

        println()

        somaTurma += media
    }

    val mediaGeral = somaTurma / notas.size

    println("Média geral da turma: %.2f".format(mediaGeral))
}
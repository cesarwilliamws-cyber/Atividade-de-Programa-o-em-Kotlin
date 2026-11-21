fun main() {
    
    val tarefas = arrayOf(
        "Estudar Kotlin",
        "Fazer exercícios",
        "Organizar os arquivos",
        "Enviar atividade",
        "Revisar o conteúdo"
    )

    for ((indice, tarefa) in tarefas.withIndex()) {
        println("Tarefa ${indice + 1}: $tarefa")
    }
}
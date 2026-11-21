fun main(){
    val num = intArrayOf(10,20,30,40,50,60)
    println("Array original: ${num.joinToString(",")}")

    var esquerda = 0
    var direita = num.size - 1

    while (esquerda < direita){

        val temp = num[esquerda]
        num[esquerda]= num[direita]
        num[direita] = temp

        esquerda++
        direita--

    }
    println("Array invertido: ${num.joinToString(",")}")
}




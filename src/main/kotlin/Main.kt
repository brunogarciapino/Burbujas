fun main() {
    println("Introduzca la lista de números que desee ordenar (sólo números enteros y separados por comas): ")
    val input = readLine()
    val splitList = input?.split(",", ignoreCase = true, limit = 0)
    val numList: MutableList<Int> = mutableListOf()

    splitList?.forEach { numList.add(it.toInt()) }

    var cambio = true

    while(cambio) {
        cambio = false

        for(i in 0 until numList.size-1){
            if(numList[i] > numList[i+1]){
                val temp = numList[i]
                numList[i] = numList[i+1]
                numList[i + 1] = temp

                cambio = true
            }
        }
    }

    val numListReversed: MutableList<Int> = numList.asReversed()

    println("Aquí tenemos la lista ordenada de menor a mayor: $numList")
    println("Aquí tenemos la lista ordenada de mayor a menor: $numListReversed.")
}
fun main() {
    println("Introduce los numeros separados por comas.")
    val listaInput= readLine()?.split(',', ignoreCase = false, limit = 0)
    val listaMutable= mutableListOf<Int>()
    try {
        listaInput?.forEach { listaMutable.add(it.toInt())}
    }catch (_:Exception){ println("Solo se puede intoducir numeros")}
    listaMutable.sortedByDescending { it }
    println(listaMutable)
    println("Tu lista actualmente es $listaMutable")
    println("Tu lista ordenada de menor a mayor es: ${burbuja(listaMutable)}")
    val listaalreves: MutableList<Int> = listaMutable.asReversed()
    println("La lista ordenada de mayor a menor es: $listaalreves")
}
fun burbuja(lista: MutableList<Int>):List<Int>{
    var x: Int
    for(i in 0 until lista.size-1){
        for(j in 0 until lista.size-1){
            if(lista[j]>lista[j+1]){
                x=lista[j]
                lista[j]=lista[j+1]
                lista[j+1]=x
            }
        }

    }
    return lista.toList()
}
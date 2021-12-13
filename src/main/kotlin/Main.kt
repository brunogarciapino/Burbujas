import java.util.*
val repeticiones: Int = 5
fun ordenarBurbuja(listaNumeros: List<Int>): List<Int>{

    var contador1 = 0
    var contador2 = 1

    while (listaNumeros != listaNumeros.sortedByDescending { it }.reversed() )
    {
        if (listaNumeros[contador1] > listaNumeros[contador2])
        {
            Collections.swap(listaNumeros,contador1,contador2)
            contador1++
            contador2++
            when
            {
                contador2 == listaNumeros.size ->
                {
                    contador1 = 0
                    contador2= 1 }
            }
        }
        else{
            contador1++
            contador2++
            when
            {
                contador2 == listaNumeros.size ->
                {
                    contador1 = 0
                    contador2= 1 }
            }
        }
    }
    return listaNumeros
}


fun main() {

    val listaNumeros = mutableListOf<Int>()
    var numeroInput: Int = 0


    println("Introduce $repeticiones números")

    repeat(repeticiones) {
        numeroInput = readLine()?.toInt()!!
        listaNumeros.add(numeroInput)
    }

    println(listaNumeros)

    println("")
    println("Ordenado según el método de ordenación burbuja")
    println("")

    println(ordenarBurbuja(listaNumeros))
}
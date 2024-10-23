fun main(){
    esPar(2)
    esPar(3)
    compararTexto("Hola", "Hola")
    compararTexto("Hola", "Adios")
}


/*
   1. Escribe una función llamada esPar que tome un número como argumento
      y devuelva true si es par y false si es impar.
*/
fun esPar(num:Int):Boolean{
    var esPar = false


    if (num%2 == 0) esPar = true
    else esPar = false


    return esPar
}

/*
   2. Crea una función llamada compararTexto que tome dos cadenas de texto como argumentos
   y determine si son iguales utilizando tanto equals() como el operador ==.
*/
fun compararTexto(texto1:String, texto2:String){
    if (texto1 == texto2) println("(==) LAS DOS CADENAS SON IGUALES")
    if (texto1.equals(texto2)) println("(EQUALS) LAS DOS CADENAS SON IGUALES.")
    else print("NO SON IGUALES")
}


/*
   3. Implementa una función llamada esMayorQue10YMenorQue20 que tome dos números como argumentos y
   devuelva true si ambos números son mayores que 10 y menores que 20, y false en caso contrario.
*/
fun esMayorQue10YMenorQue20(num1:Int, num2:Int):Boolean{
    var esMayor = false
    if (num1 > 10 && num1 < 20)
        if(num2 > 10 && num2 < 20){
            esMayor = true
        }
    return esMayor
}


/*
   4. Crea una función llamada evaluarCalificacion que tome la calificación de un estudiante (un número entre 0 y 100)
   como argumento y devuelva una letra de calificación (A, B, C, D, F) utilizando una estructura when.
*/


fun evaluarCalificacion(nota:Int){
    var calificacion = ' '
    when (nota){
        in 90 .. 100 -> calificacion = 'A'
        in 80 .. 90 -> calificacion = 'B'
        in 70 .. 80 -> calificacion = 'C'
        in 60 .. 70 -> calificacion = 'D'
        in 0 .. 60 -> calificacion = 'F'
    }
}


/*
   5. Define una función llamada sumarNumeros que tome un número variable de argumentos
   utilizando vararg y devuelva la suma de todos los números.
*/
fun sumarNumeros(vararg args:Int):Int{
    var res = 0


    for (numero in args){
        res += numero
    }
    println(res)
    return(res)
}


/*
   6. Implementa una función llamada invertirArray que tome un array de números como argumento y
   devuelva un nuevo array con los elementos en orden inverso.
*/


fun invertirArray(arrayNums:IntArray):IntArray{
    var arrayInverso = IntArray (arrayNums.size)
    var contador = 0


    for (i in arrayNums.size-1 downTo 0){
        arrayInverso[i] = arrayNums[contador]
        contador++
    }


    println("ARRAY ORIGINAL: $arrayNums \n ARRAY INVERSO: $arrayInverso")
    return  arrayInverso
}


/*
   7. Crea una lista inmutable de nombres de frutas y agrega una fruta adicional a la lista.
*/
    fun agregarFruta(listaFrutas: List<String>, frutaAdicional: String): List<String> {
        return listaFrutas + frutaAdicional
}

/*
   8. Utiliza una lista mutable para almacenar nombres de colores y elimina un color de la lista.
*/
fun eliminarColor(colores: MutableList<String>, colorAEliminar: String) {
    colores.remove(colorAEliminar)
}


/*
   9. Escribe una función llamada imprimirNumeros que utilice un bucle for para imprimir los números del 1 al 10.
*/
fun imprimirNumeros(){
    for (i in 1 .. 10){
        println(i)
    }
}


/*
   10. Define una función llamada imprimirLista que tome una lista de números como argumento
    y utilice un bucle forEach para imprimir cada número en la lista.
*/
fun imprimirLista(lista: MutableList<Int>){
    for (numero in lista){
        println(numero)
    }
}


/*
   11. Implementa una función llamada imprimirNumerosHastaN que tome un número como argumento
    y utilice un bucle while para imprimir los números del 1 al número dado.
*/
fun imprimitNumerosHastaN(tope:Int){
    for (i in 0 .. tope){
        println(i)
    }
}


/*
   12. Crea una función llamada imprimirNumerosPositivos que utilice un bucle do-while para
   imprimir números positivos hasta que se alcance un número negativo.
*/
fun imprimirNumerosPositivos(num:Int){
    var contador = num
    do{
        print(contador)
        contador--
    }while (contador > -1)
}


/*
   13. Define una función llamada esPrimo que tome un número como argumento y devuelva true
    si es primo y false si no lo es. Utiliza una declaración return para salir de la función
    una vez que se determine si el número es primo.
*/
fun esPrimo(num1:Int):Boolean{
    for (i in 2 .. num1/2){
        if (num1%i == 0 ) return false
    }
    return true
}


/*


14. Implementa una función llamada encontrarPrimoMayorQue100 que utilice un bucle for para
encontrar el primer número primo mayor que 100. Utiliza una declaración break para salir
del bucle una vez que se encuentre el número primo.
*/
fun encontrarPrimoMayorQue100():Int{
    var res = 0


    for (i in 100 .. 200){
        var contador = 0
        for (j in 1 .. i/2){
            if (j%i == 0) contador++
            if (contador > 2) break
        }
        if (contador == 2){
            res = i
        }
    }
    println(res)
    return res
}

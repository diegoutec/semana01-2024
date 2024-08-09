//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // Solicitar al usuario que ingrese una cadena de caracteres
    println("Por favor, ingresa una cadena de caracteres:")
    val input = readlnOrNull() ?: "" // Leer la entrada del usuario

    // Inicializar el contador de vocales
    var contadorVocales = 0

    // Definir las vocales (tanto mayúsculas como minúsculas)
    val vocales = "aeiouAEIOU"

    // Iterar a través de cada caracter en la cadena ingresada
    for (caracter in input) {
        // Si el caracter está en la lista de vocales, incrementar el contador
        if (caracter in vocales) {
            contadorVocales++
        }
    }

    // Mostrar el número total de vocales encontradas
    println("El número total de vocales en la cadena es: $contadorVocales")
}

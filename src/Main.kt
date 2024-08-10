fun main() {
    // Solicitar el ingreso una cadena de caracteres
    println("Por favor, ingresa una cadena de caracteres:")
    val entrada = readlnOrNull() ?: "" // Leer la entrada del usuario

    // Contador de vocales
    var contadorVocales = 0

    // Definir las vocales (tanto mayúsculas como minúsculas)
    val vocales = "aeiouAEIOU"

    // Iterar a través de cada caracter en la cadena ingresada
    for (caracter in entrada) {
        // Si el caracter está en la lista de vocales, incrementar el contador
        if (caracter in vocales) {
            contadorVocales++
        }
    }

    // Mostrar el número total de vocales encontradas
    println("El número total de vocales ingresadas son: $contadorVocales")
}

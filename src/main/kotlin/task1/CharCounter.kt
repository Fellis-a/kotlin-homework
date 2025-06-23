package task1

fun main() {
    countCharInString("МолОко", 'о')

    countCharInString("Молоко", 'а')
}

fun countCharInString(inputString: String, targetChar: Char) {
    val count = inputString.count { it.equals(targetChar, ignoreCase = false) }

    if (count > 0) {
        println("Количество символов ‘${targetChar.uppercaseChar()}’ в строке \"$inputString\" == $count")
    } else {
        println("Символ ‘${targetChar.lowercaseChar()}’ в строке \"$inputString\" не найден")
    }
}


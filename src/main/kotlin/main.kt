fun main() {
    val likes = 61

    if (likes % 10 == 1 || likes == 1) {
        println("Нравится $likes человеку")
    } else if (likes % 11 == 1) {
        println("Нравится $likes людям")
    } else {
        println("Нравится $likes людям")
    }
}
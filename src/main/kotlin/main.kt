fun main() {
    val likes = 61

    if (likes % 2 == 1 || likes == 1) {
        println("Нравится $likes человеку")
    } else if (likes % 3 == 1) {
        println("Нравится $likes людям")
    } else {
        println("Нравится $likes людям")
    }
}
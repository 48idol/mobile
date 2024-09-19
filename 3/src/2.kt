fun main() {
    println("Введите 1 число")
    val s = readln()
    println("Введите 2 число")
    val t = readln()
    println("Введите 3 число")
    val n = readln()
    if ((s > t && s < n) || (s > n && s < t)) {
        println(s)
    }
    else if ((t > n && s > t) || (t < n && s < t)) {
        println(t)
    }
    else if ((t > n && n > s) || (n < s && n > t)) {
        println(n)
    }
    else if ((t == n) || (n==s) || (s == t))
        println("ошибка")
}
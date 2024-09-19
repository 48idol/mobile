import kotlin.math.max


fun main() {
    print("Введите первое число : ")
    var a = readLine()!!.toDouble()
    print("Введите второе число : ")
    var b = readLine()!!.toDouble()
    print("Введите третье число : ")
    var c = readLine()!!.toDouble()
    val result = max(max(a, b), c)
    println("$result")
}
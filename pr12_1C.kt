import kotlin.random.Random

class Pr12_1C {
    fun Input(): Int
    {
        print("Введите кол-во повторений функции: ")
        var Save = readLine()!!.toInt()
        if (Save > 0)
            return Save
        else
            println("Число должно быть больше нуля, устонавливается число: 1")
        return 1
    }
    fun RandomN()
    {
        try {
            println("Введите a")
            var a = readLine()!!.toInt()
            println("Введите b")
            var b = readLine()!!.toInt()
            var c: Int
            if (a > 0 && b > 0) {
                c = Random.nextInt(a, b)
                println("c = $c")
            }
            else
                println("не правильный ввод а и b")
        }
        catch (E: Exception){ println("Не правильный ввод")}
    }
}
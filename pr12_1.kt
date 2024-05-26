import kotlinx.coroutines.*
suspend fun main(){
    try {
        var Class: Pr12_1C = Pr12_1C()
        var K = Class.Input()
        GlobalScope.launch {
            for (i in 1..K) {
                println("$i раз")
                Class.RandomN()
            }
        }
        runBlocking { delay(60000L) }
    }
    catch (E: Exception) { println("Не правильный ввод")}
}


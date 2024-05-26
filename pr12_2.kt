import kotlinx.coroutines.*
suspend fun main(){
    var login = ""
    var parol = ""
    var crep = 0
    var IsOp = true
    var repos = mutableListOf<Pr12_2C>()
    try{
        while(true) {
            println("\nЗагрузка нового пользователя")
            print("Введите логин (exit для выхода): ")
            login = readLine()!!
            if (login == "exit") {
                IsOp = false
                break
            }
            print("Введите пароль (8 символов): ")
            parol = readLine()!!
            if (parol.length > 7)
            {
                print("Кол-во репозиториев: ")
                crep = readLine()!!.toInt()
                if (crep < 0)
                    println("Кол-во репозиториев должно быть больше нуля")
            }
            else
                println("Не верный пароль")
            var rp = Pr12_2C(login, parol, crep, IsOp)
            repos.add(rp)
        }
        println("\nЗагрузка")
        val softrepos = repos.first().RepSoft(repos)
        softrepos.forEach {
            println(it.GetInfo())
        }
    }
    catch (E: Exception) {println("Не правильный ввод")}
}


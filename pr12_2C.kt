import kotlinx.coroutines.delay
class Pr12_2C(var login: String, var parol: String, var crep: Int, var IsOp: Boolean){
    suspend fun RepSoft(repos: List<Pr12_2C>): List<Pr12_2C>
    {
        delay(2000L)
        return repos.filter{ it.IsOp }.sortedWith(compareBy { it.crep })
    }
    suspend fun GetInfo(): String
    {
        delay(1000L)
        return "Логин: $login, пароль: $parol, кол-во репозиториев: $crep"
    }
}
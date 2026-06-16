package SealedCLass

sealed class Result{

    data class Success(val data: String) : Result()
    data class Error(val messege: String) : Result()
    object Loading: Result()
}


fun processResult(result:Result) {

    when(result) {
        is Result.Error -> println("Error is occour : ${result.messege}")
        Result.Loading -> println("Loading is occours")
        is Result.Success -> println("Succcess : ${result.data}")
    }
}


fun main(){
    val success = Result.Success("User Profile fetched")
    val error = Result.Error("Something went wrong")
    val loading = Result.Loading

    processResult(success)
    processResult(error)
    processResult(loading)
}


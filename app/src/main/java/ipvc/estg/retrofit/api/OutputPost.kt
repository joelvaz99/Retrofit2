package ipvc.estg.retrofit.api


data class OutputPost(
    val error: Boolean,
    val mensagem: String,
    val user: User
)
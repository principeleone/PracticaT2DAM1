
package pe.edu.cibertec.practicat2dam1

data class PostResponse6(
    val posts: List<PostModel6>
)

data class PostModel6(
    val id: Int,
    val title: String,
    val body: String,
    val views: Int,
    val userId: Int
)
package pe.edu.cibertec.practicat2dam1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PostAdapter6(private val posts: List<PostModel6>) : RecyclerView.Adapter<PostAdapter6.PostViewHolder6>() {

    class PostViewHolder6(view: View) : RecyclerView.ViewHolder(view) {
        val txtTitle6: TextView = view.findViewById(R.id.txtTitle6)
        val txtBody6: TextView = view.findViewById(R.id.txtBody6)
        val txtViews6: TextView = view.findViewById(R.id.txtViews6)
        val txtUserId6: TextView = view.findViewById(R.id.txtUserId6)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder6 {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_post6, parent, false)
        return PostViewHolder6(view)
    }

    override fun onBindViewHolder(holder: PostViewHolder6, position: Int) {
        val post = posts[position]
        holder.txtTitle6.text = post.title
        holder.txtBody6.text = post.body
        holder.txtViews6.text = "Vistas: ${post.views}"
        holder.txtUserId6.text = "User ID: ${post.userId}"
    }

    override fun getItemCount(): Int = posts.size
}
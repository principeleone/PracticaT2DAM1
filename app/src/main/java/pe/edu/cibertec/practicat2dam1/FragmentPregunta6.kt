package pe.edu.cibertec.practicat2dam1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import pe.edu.cibertec.practicat2dam1.databinding.FragmentPregunta6Binding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class FragmentPregunta6 : Fragment() {

    private var _binding6: FragmentPregunta6Binding? = null
    private val binding6 get() = _binding6!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding6 = FragmentPregunta6Binding.inflate(inflater, container, false)
        return binding6.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)
        binding6.recyclerView6.layoutManager = LinearLayoutManager(requireContext())
        consumirApi6()
    }

    private fun consumirApi6() {
        RetrofitClient6.instance.getPosts().enqueue(object : Callback<PostResponse6> {

            override fun onResponse(call: Call<PostResponse6>, response: Response<PostResponse6>) {
                if (response.isSuccessful && response.body() != null) {
                    val listaPosts = response.body()!!.posts
                    val adapter6 = PostAdapter6(listaPosts)
                    binding6.recyclerView6.adapter = adapter6
                }
            }

            override fun onFailure(call: Call<PostResponse6>, t: Throwable) {
                Toast.makeText(requireContext(), "Error al consumir API: ${t.message}", Toast.LENGTH_SHORT).show()
            }
        })
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding6 = null
    }
}
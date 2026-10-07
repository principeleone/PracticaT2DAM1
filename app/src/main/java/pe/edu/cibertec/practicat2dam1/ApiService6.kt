package pe.edu.cibertec.practicat2dam1

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ApiService6 {
    @GET("posts")
    fun getPosts(): Call<PostResponse6>
}

object RetrofitClient6 {
    val instance: ApiService6 by lazy {
        Retrofit.Builder()
            .baseUrl("https://dummyjson.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService6::class.java)
    }
}
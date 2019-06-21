package android.jhaniteshkumar.com.hellointents

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
interface WSInterface {

        @GET("/todos")
        fun getTodoList() : Call<List<ToDoObject>>

        @GET("todos")
        fun listToDos(@Query("userId") userId: Int): Call<List<ToDoObject>>
    }


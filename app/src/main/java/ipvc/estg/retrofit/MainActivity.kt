package ipvc.estg.retrofit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import ipvc.estg.retrofit.adapter.UserAdapter
import ipvc.estg.retrofit.api.EndPoints
import ipvc.estg.retrofit.api.OutputPost
import ipvc.estg.retrofit.api.ServiceBuilder
import ipvc.estg.retrofit.api.User
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val request = ServiceBuilder.buildService(EndPoints::class.java)
        val call = request.getUsers()
    }

    fun getSingle(view: View) {
        val intent = Intent(this@MainActivity, LoginActivity::class.java)
        startActivityForResult(intent,1)

        /*
                val request = ServiceBuilder.buildService(EndPoints::class.java)
                val call = request.getUserById(2) // estaticamente o valor 2. deverá depois passar a ser dinamico

                call.enqueue(object : Callback<User>{
                    override fun onResponse(call: Call<User>, response: Response<User>) {
                        if (response.isSuccessful){
                            val c: User = response.body()!!
                            Toast.makeText(this@MainActivity, c.address.zipcode, Toast.LENGTH_SHORT).show()
                        }
                    }

                    override fun onFailure(call: Call<User>, t: Throwable) {
                        Toast.makeText(this@MainActivity, "${t.message}", Toast.LENGTH_SHORT).show()
                    }
                })*/
            }
    fun post(view: View) {

        val request = ServiceBuilder.buildService(EndPoints::class.java)
        val call = request.postTest("Maria","123")

        call.enqueue(object : Callback<OutputPost>{
            override fun onResponse(call: Call<OutputPost>, response: Response<OutputPost>) {
                if (response.isSuccessful){
                    if(response.body()?.error == false){
                        val c: OutputPost = response.body()!!
                        Toast.makeText(this@MainActivity,"login erroooo",  Toast.LENGTH_SHORT).show()
                    }else{
                        val c: OutputPost = response.body()!!
                        Toast.makeText(this@MainActivity, c.error.toString() + "-" + c.mensagem, Toast.LENGTH_SHORT).show()
                    }

                }
            }

            override fun onFailure(call: Call<OutputPost>, t: Throwable) {
                Toast.makeText(this@MainActivity, "${t.message}", Toast.LENGTH_SHORT).show()
            }
        })
    }


}
package ipvc.estg.retrofit

import android.app.Activity
import android.content.Intent
import android.os.Bundle

import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import ipvc.estg.retrofit.adapter.UserAdapter
import ipvc.estg.retrofit.api.EndPoints
import ipvc.estg.retrofit.api.OutputPost
import ipvc.estg.retrofit.api.ServiceBuilder
import ipvc.estg.retrofit.api.User
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Response
import retrofit2.Callback
import retrofit2.Call

//import javax.security.auth.callback.Callback

class LoginActivity : AppCompatActivity() {
    private lateinit var editWordView: EditText
    private lateinit var editWordView1: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
/*
        editWordView = findViewById(R.id.editTextEmail)
        editWordView1 = findViewById(R.id.editTextPassword)
        val button_login = findViewById<Button>(R.id.buttonLogin)

        button_login.setOnClickListener {

            val email = editWordView.text.toString().trim()
            val password = editWordView1.text.toString().trim()
            if (email.isEmpty()) {
                editWordView.error = "Email required"
                editWordView.requestFocus()
                return@setOnClickListener
            }


            if (password.isEmpty()) {
                editWordView1.error = "Password required"
                editWordView1.requestFocus()
                return@setOnClickListener
            }
            val request = ServiceBuilder.buildService(EndPoints::class.java)
            val call = request.postTest("ana","123abc")

            call.enqueue(object : Callback<OutputPost>{
                override fun onResponse(call: Call<OutputPost>, response: Response<OutputPost>) {
                    if (response.isSuccessful){
                        val c: OutputPost = response.body()!!
                        Toast.makeText(this@LoginActivity, c.username + "-" + c.password, Toast.LENGTH_SHORT).show()
                    }
                }

                override fun onFailure(call: Call<OutputPost>, t: Throwable) {
                    Toast.makeText(this@LoginActivity, "${t.message}", Toast.LENGTH_SHORT).show()
                }
            })

        }*/
    }
}
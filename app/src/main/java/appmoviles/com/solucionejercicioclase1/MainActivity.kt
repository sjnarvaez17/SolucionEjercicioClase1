package appmoviles.com.solucionejercicioclase1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    //Referenciar los views
    private var loginUsername: EditText? = null
    private var loginPasswordEt: EditText? = null
    private var loginLoginBtn: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginUsername = findViewById(R.id.login_username_et)
        loginPasswordEt = findViewById(R.id.login_password_et)
        loginLoginBtn = findViewById(R.id.login_login_btn)

        loginLoginBtn!!.setOnClickListener {
            val username = loginUsername!!.text.toString()
            val password = loginPasswordEt!!.text.toString()
            Toast.makeText(this@MainActivity, "$username:$password", Toast.LENGTH_LONG).show()
        }
    }

}

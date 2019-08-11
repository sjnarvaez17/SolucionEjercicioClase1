package appmoviles.com.solucionejercicioclase1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginLoginBtn.setOnClickListener {
            val username = loginUsername.text.toString()
            val password = loginPasswordEt.text.toString()

            if (username.isNotBlank() && password.isNotBlank()) showToast("$username:$password")
            else showToast("username or password is null")
        }
    }

    private fun showToast(message: String) = Toast.makeText(this@MainActivity, message, Toast.LENGTH_LONG).show()
}

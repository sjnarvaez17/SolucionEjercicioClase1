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
            Toast.makeText(this@MainActivity, "$username:$password", Toast.LENGTH_LONG).show()
        }
    }

}

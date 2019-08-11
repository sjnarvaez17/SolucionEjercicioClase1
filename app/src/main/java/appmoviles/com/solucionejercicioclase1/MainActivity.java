package appmoviles.com.solucionejercicioclase1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Referenciar los views
    private EditText loginUsername;
    private EditText loginPasswordEt;
    private Button loginLoginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginUsername = findViewById(R.id.login_username_et);
        loginPasswordEt = findViewById(R.id.login_password_et);
        loginLoginBtn = findViewById(R.id.login_login_btn);

        loginLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = loginUsername.getText().toString();
                String password = loginPasswordEt.getText().toString();
                Toast.makeText(MainActivity.this, username + ":" + password, Toast.LENGTH_LONG).show();
            }
        });
    }

}

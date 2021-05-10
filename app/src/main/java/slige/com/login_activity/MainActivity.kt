package slige.com.login_activity

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        signIn()

    }

    private fun signIn() {
        val email = findViewById<TextInputEditText>(R.id.email_edit_text)
        val password = findViewById<TextInputEditText>(R.id.password_edit_text)
        val signinButton = findViewById<MaterialButton>(R.id.next_button)

        signinButton.setOnClickListener() {
            if (email.toString().isNullOrEmpty() || password.toString().isNullOrEmpty()) {
                Toast.makeText(this, "Email is not provided", Toast.LENGTH_LONG).show()
            } else {
                if (email.toString() == "emokote@gmail.com" && password.toString() == "zuri123") {
                    val intent = Intent(this, ViewActivity::class.java)
                    startActivity(intent)
                } else{
                    Toast.makeText(this, "incorrect email or password", Toast.LENGTH_LONG).show()
                }

            }
        }
    }
}

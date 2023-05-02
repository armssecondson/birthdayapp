package android.example.birthdayapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import kotlin.reflect.KClass


private  <T> KClass<T>.java: MainActivity2
    get() {}

/**
 * This activity allows the user to continue to other items
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val next: Button = findViewById(R.id.button)
        // When a button is clicked, a next page is opened
        next.setOnClickListener {

            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }

}


package gonzalez.jesus.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.btnClick)
        val tvTextView = findViewById<TextView>(R.id.textView)
        var timesClicked = 0

        btnClickMe.setOnClickListener{
            timesClicked += 1

            tvTextView.text = timesClicked.toString()
            Toast.makeText(this, "Sigue aplastado el botón", Toast.LENGTH_SHORT).show()
        }
    }
}
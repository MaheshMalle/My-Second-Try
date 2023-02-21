package eu.learning.mysecondtry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var temp = 0

        val clickthetxt = findViewById<TextView>(R.id.textView1)
        clickthetxt.text = "good night ra"

        val clickthebtn = findViewById<Button>(R.id.mybutton)

        clickthebtn.setOnClickListener {
            clickthebtn.text = "HAHA u clicked me"
            temp += 1
            clickthetxt.text = temp.toString();
            Toast.makeText(this,"Hey i am Mahesh$temp", Toast.LENGTH_LONG).show()

        }







    }
}
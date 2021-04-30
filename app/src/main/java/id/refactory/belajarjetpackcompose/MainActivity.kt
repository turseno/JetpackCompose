package id.refactory.belajarjetpackcompose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)
        setContent {
            MaterialTheme {
                Card(
                    Shape = RoundedCornerShape(8.dp)
                ){


                }
            }

        }
    }

/*    private fun setContent(function: () -> Unit) {

    }
}

class MaterialTheme(function: () -> Unit) {

}*/

package id.seedgrow.rectangulararea

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

/**
 * @author Adi Suryantoeo (adisuryantoro17@gmail.com)
 * @version Rating, v 0.1 20/09/2019 09.03 AM by Adi Suryantoro
 **/

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetText")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edt_width_rectangular = edt_width_rectangular as EditText
        val edt_height_rectangular = edt_height_rectangular as EditText

        btn_count_rectangular_area.setOnClickListener {
            if (edt_width_rectangular.text.isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "Rectangle width cannot be empty",
                    Toast.LENGTH_LONG
                ).show()
            } else if (edt_height_rectangular.text.isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "Rectangle height cannot be empty",
                    Toast.LENGTH_LONG
                ).show()
            } else {
                val result =
                    (edt_width_rectangular.text.toString().toDouble()) * (edt_height_rectangular.text.toString().toDouble())
                tv_result_rectangular_area.text = "Area = $result"

            }

        }

    }
}

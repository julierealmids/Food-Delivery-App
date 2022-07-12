package dev.nakayiza.foodater

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import java.io.InputStream
import java.io.Reader
import java.nio.Buffer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionBar: ActionBar?=supportActionBar
        actionBar?.hide()
    }
    private fun_getRestaurantData():list<RestaurantModel?>?{
        val inputStream: InputStream =resources.openRawResource(R.raw.restaurant)
        val buffer=CharArray(size = 1024)
        try {
            val reader:Reader=Buffer

        }catch (e:Exception)
    }

}
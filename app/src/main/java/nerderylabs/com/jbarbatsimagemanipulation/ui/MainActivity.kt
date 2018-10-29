package nerderylabs.com.jbarbatsimagemanipulation.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import nerderylabs.com.jbarbatsimagemanipulation.R

class MainActivity : AppCompatActivity() {

    lateinit var imageAdapter: ImageAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupRecycler()
    }

    private fun setupRecycler() {

        imageAdapter = ImageAdapter(this)

    }
}

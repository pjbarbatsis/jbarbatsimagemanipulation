package nerderylabs.com.jbarbatsimagemanipulation.ui

import android.media.Image
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.ImageView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*
import nerderylabs.com.jbarbatsimagemanipulation.R

class MainActivity : AppCompatActivity() {

    private var xCoOrdinate: Float = 0.toFloat()
    private var yCoOrdinate: Float = 0.toFloat()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // probably a less annoying way to do this???
        populateImageView(R.drawable.image0, image_zero)
        populateImageView(R.drawable.image1, image_one)
        populateImageView(R.drawable.image2, image_two)
        populateImageView(R.drawable.image3, image_three)
        populateImageView(R.drawable.image4, image_four)
    }

    private fun populateImageView(drawable: Int, view: ImageView) {
        Picasso.with(this).load(drawable)
                .centerInside()
                .resize(600, 600)
                .into(view)
    }

}

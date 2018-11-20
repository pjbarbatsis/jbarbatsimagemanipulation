package nerderylabs.com.jbarbatsimagemanipulation.ui

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.ImageView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*
import nerderylabs.com.jbarbatsimagemanipulation.R

class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        populateImageView(R.drawable.image0, image_zero)
        populateImageView(R.drawable.image1, image_one)
        populateImageView(R.drawable.image2, image_two)
        populateImageView(R.drawable.image3, image_three)
        populateImageView(R.drawable.image4, image_four)

    }

    @SuppressLint("ClickableViewAccessibility")
    private fun populateImageView(drawable: Int, imageView: ImageView) {

        Picasso.with(this).load(drawable)
                .centerInside()
                .resize(600, 600)
                .into(imageView)

        // information: https://medium.com/@NumberShapes/kotlin-draggable-imageview-480c1573cde5
        val listener = View.OnTouchListener(function = {view, motionEvent ->
            if (motionEvent.action == MotionEvent.ACTION_MOVE) {

                view.y = motionEvent.rawY - view.height
                view.x = motionEvent.rawX - view.width/2
                view.bringToFront()
            }
            true
        })
        imageView.setOnTouchListener(listener)
    }



}

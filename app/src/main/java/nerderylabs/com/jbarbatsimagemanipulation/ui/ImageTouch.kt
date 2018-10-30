package nerderylabs.com.jbarbatsimagemanipulation.ui

import android.view.MotionEvent
import android.view.View
import android.widget.ImageView


// adapted from https://virtuooza.com/detecting-touch-gestures-using-ontouchlistener/

class ImageTouch: View.OnTouchListener {

    //Modes
    private val NONE = 0
    private val DRAG = 1

    //default
    private var mode = NONE



    override fun onTouch(v: View?, event: MotionEvent?): Boolean {
        val view = v as ImageView
        return true
    }

}
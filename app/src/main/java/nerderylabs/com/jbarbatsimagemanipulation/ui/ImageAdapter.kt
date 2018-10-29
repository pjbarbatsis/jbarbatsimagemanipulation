package nerderylabs.com.jbarbatsimagemanipulation.ui

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.image_list_item.view.*
import nerderylabs.com.jbarbatsimagemanipulation.R

class ImageAdapter(val context: Context) : RecyclerView.Adapter<ImageAdapter.ViewHolder>() {

    var images: List<Int> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onBindViewHolder(holder: ImageAdapter.ViewHolder?, position: Int) {

        //TODO: learn how to use picasso with drawables
        // Picasso.with(context).load()
    }

    override fun getItemCount(): Int {
        return images.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): {

        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.image_list_item, parent,
                false))

    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageDrawable = view.image_drawable
    }

}
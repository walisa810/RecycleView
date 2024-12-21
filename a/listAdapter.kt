package com.walisaalam.class3.RV

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.TextField
import androidx.compose.ui.res.dimensionResource
import androidx.recyclerview.widget.RecyclerView
import com.walisaalam.class3.R
import java.util.ArrayList
import java.util.zip.Inflater

class listAdapter(val itemlist: ArrayList<Item>): RecyclerView.Adapter<listAdapter.itemViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): itemViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_view,parent,false)
        val viewHolder = itemViewHolder(view)
        return viewHolder
    }

    override fun getItemCount(): Int {
        return itemlist.size
    }

    override fun onBindViewHolder(holder: itemViewHolder, position: Int) {
        holder.setData(itemlist[position],position)
        holder.itemView.setOnClickListener{
            Toast.makeText(holder.itemView.context,"Item Number $position clicked",Toast.LENGTH_LONG).show()
        }
    }

    class itemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val ivItemImage : ImageView
        val tvItemName : TextView
        val tvItemDescription : TextView
        init{
            ivItemImage = itemView.findViewById(R.id.ivItemImage)
            tvItemName = itemView.findViewById(R.id.tvItemName)
            tvItemDescription = itemView.findViewById(R.id.tvItemDescription)
        }

        fun setData(item :Item,position: Int){
            tvItemName.text = item.name
            tvItemDescription.text = item.description
            if(  position%2 == 0) ivItemImage.setImageResource(R.drawable.photo1)
            else ivItemImage.setImageResource(R.drawable.photo2)
//            val str = item.name - "Item "
//            if( (Integer.parseInt(item.name[1]))%2 == 0) ivItemImage.setImageDrawable(R.drawable.photo1)
        }
    }
}
package ie.setu.chefmaster

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DishAdapter(
    private val dishes: List<Dish>,
    private val onItemClick: (Dish) -> Unit
) : RecyclerView.Adapter<DishAdapter.DishViewHolder>() {

    inner class DishViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.dishImageView)
        val nameTextView: TextView = itemView.findViewById(R.id.dishNameTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DishViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.dish_item, parent, false)
        return DishViewHolder(view)
    }

    override fun onBindViewHolder(holder: DishViewHolder, position: Int) {
        val dish = dishes[position]
        holder.imageView.setImageResource(dish.imageResId)
        holder.nameTextView.text = dish.name

        holder.itemView.setOnClickListener {
            onItemClick(dish)
        }
    }

    override fun getItemCount() = dishes.size
}
package ie.setu.chefmaster

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ie.setu.chefmaster.DishAdapter
import ie.setu.chefmaster.DishDataSource
import ie.setu.chefmaster.R
import ie.setu.chefmaster.RecipeDetailActivity

class RecommendFragment : Fragment() {
    // 原MainActivity的RecyclerView内容移到这里
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_recommend, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.dishesRecyclerView)

        // 原MainActivity的RecyclerView配置代码
        recyclerView.layoutManager = GridLayoutManager(context, 2)
        recyclerView.adapter = DishAdapter(DishDataSource.dishes) { dish ->
            startActivity(Intent(context, RecipeDetailActivity::class.java).apply {
                putExtra("dish_id", dish.id)
            })
        }

        return view
    }
}
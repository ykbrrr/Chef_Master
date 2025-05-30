package ie.setu.chefmaster

import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RecipeDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_detail)

        val dishId = intent.getIntExtra("dish_id", -1)
        if (dishId == -1) {
            finish()
            return
        }

        val dish = DishDataSource.dishes.find { it.id == dishId }
        if (dish == null) {
            finish()
            return
        }

        // 设置菜谱信息
        findViewById<TextView>(R.id.recipeTitleTextView).text = dish.name
        findViewById<ImageView>(R.id.recipeImageView).setImageResource(dish.imageResId)

        // 添加食材
        val ingredientsContainer = findViewById<LinearLayout>(R.id.ingredientsContainer)
        dish.ingredients.forEach { ingredient ->
            val textView = TextView(this).apply {
                text = "• $ingredient"
                textSize = 16f
                setPadding(0, 4, 0, 4)
            }
            ingredientsContainer.addView(textView)
        }

        // 添加步骤
        val stepsContainer = findViewById<LinearLayout>(R.id.stepsContainer)
        dish.steps.forEachIndexed { index, step ->
            val textView = TextView(this).apply {
                text = "${index + 1}. $step"
                textSize = 16f
                setPadding(0, 4, 0, 4)
            }
            stepsContainer.addView(textView)
        }

        // 设置其他信息
        findViewById<TextView>(R.id.cookingTimeTextView).text = "烹饪时间: ${dish.cookingTime}"
        findViewById<TextView>(R.id.difficultyTextView).text = "难度: ${dish.difficulty}"
    }
}
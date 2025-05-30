package ie.setu.chefmaster

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import ie.setu.chefmaster.MainPagerAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager = findViewById<ViewPager2>(R.id.viewPager)
        viewPager.adapter = MainPagerAdapter(this) // 设置适配器

        // 绑定TabLayout和ViewPager（自动同步标签和页面）
        TabLayoutMediator(
            findViewById(R.id.tabLayout),
            viewPager
        ) { tab, position ->
            tab.text = when (position) {
                0 -> "推荐"
                1 -> "分类"
                else -> null
            }
        }.attach()
    }
}

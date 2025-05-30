package ie.setu.chefmaster

import ie.setu.chefmaster.RecommendFragment
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class MainPagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = 2 // 总页数

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> RecommendFragment() // 第0页是推荐
            1 -> CategoryFragment()  // 第1页是分类
            else -> throw Exception()
        }
    }
}
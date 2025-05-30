package ie.setu.chefmaster
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class CategoryFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // 这里先留空，后续实现分类逻辑
        return TextView(requireContext()).apply {
            text = "分类页面（待实现）"
            gravity = Gravity.CENTER
        }
    }
}
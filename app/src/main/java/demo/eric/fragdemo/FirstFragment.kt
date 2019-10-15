package demo.eric.fragdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

/**
 * Created by caoqiulin on 2019-09-25.
 */
class FirstFragment : Fragment() {

    internal var TAG = FirstFragment::class.java.simpleName

    companion object {
        val instance: FirstFragment? = null

    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val root = inflater.inflate(R.layout.fragment_first, container, false)
        root.findViewById<View>(R.id.btn_to_next).setOnClickListener {
            fragmentManager!!.beginTransaction()
                    .replace(R.id.fragmentMain, SecondFragment(), "f1")
                    .commit()
        }

        return root
    }
}

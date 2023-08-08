package com.khushalsapplication.app.modules.biriyani.ui

import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityBiriyaniBinding
import com.khushalsapplication.app.modules.biriyani.`data`.model.BiriyaniRowModel
import com.khushalsapplication.app.modules.biriyani.`data`.viewmodel.BiriyaniVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class BiriyaniActivity : BaseActivity<ActivityBiriyaniBinding>(R.layout.activity_biriyani) {
  private val viewModel: BiriyaniVM by viewModels<BiriyaniVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val biriyaniAdapter = BiriyaniAdapter(viewModel.biriyaniList.value?:mutableListOf())
    binding.recyclerBiriyani.adapter = biriyaniAdapter
    biriyaniAdapter.setOnItemClickListener(
    object : BiriyaniAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : BiriyaniRowModel) {
        onClickRecyclerBiriyani(view, position, item)
      }
    }
    )
    viewModel.biriyaniList.observe(this) {
      biriyaniAdapter.updateData(it)
    }
    binding.biriyaniVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerBiriyani(
    view: View,
    position: Int,
    item: BiriyaniRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "BIRIYANI_ACTIVITY"

  }
}

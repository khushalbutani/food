package com.khushalsapplication.app.modules.friedrice.ui

import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityFriedRiceBinding
import com.khushalsapplication.app.modules.friedrice.`data`.model.FriedRiceRowModel
import com.khushalsapplication.app.modules.friedrice.`data`.viewmodel.FriedRiceVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class FriedRiceActivity : BaseActivity<ActivityFriedRiceBinding>(R.layout.activity_fried_rice) {
  private val viewModel: FriedRiceVM by viewModels<FriedRiceVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val friedRiceAdapter = FriedRiceAdapter(viewModel.friedRiceList.value?:mutableListOf())
    binding.recyclerFriedRice.adapter = friedRiceAdapter
    friedRiceAdapter.setOnItemClickListener(
    object : FriedRiceAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : FriedRiceRowModel) {
        onClickRecyclerFriedRice(view, position, item)
      }
    }
    )
    viewModel.friedRiceList.observe(this) {
      friedRiceAdapter.updateData(it)
    }
    binding.friedRiceVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerFriedRice(
    view: View,
    position: Int,
    item: FriedRiceRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "FRIED_RICE_ACTIVITY"

  }
}

package com.khushalsapplication.app.modules.pavbhajione.ui

import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityPavBhajiOneBinding
import com.khushalsapplication.app.modules.pavbhajione.`data`.model.PavBhajiOneRowModel
import com.khushalsapplication.app.modules.pavbhajione.`data`.viewmodel.PavBhajiOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PavBhajiOneActivity :
    BaseActivity<ActivityPavBhajiOneBinding>(R.layout.activity_pav_bhaji_one) {
  private val viewModel: PavBhajiOneVM by viewModels<PavBhajiOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val pavBhajiOneAdapter =
    PavBhajiOneAdapter(viewModel.pavBhajiOneList.value?:mutableListOf())
    binding.recyclerPavBhajiOne.adapter = pavBhajiOneAdapter
    pavBhajiOneAdapter.setOnItemClickListener(
    object : PavBhajiOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : PavBhajiOneRowModel) {
        onClickRecyclerPavBhajiOne(view, position, item)
      }
    }
    )
    viewModel.pavBhajiOneList.observe(this) {
      pavBhajiOneAdapter.updateData(it)
    }
    binding.pavBhajiOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerPavBhajiOne(
    view: View,
    position: Int,
    item: PavBhajiOneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PAV_BHAJI_ONE_ACTIVITY"

  }
}

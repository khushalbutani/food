package com.khushalsapplication.app.modules.spicysalad.ui

import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivitySpicySaladBinding
import com.khushalsapplication.app.modules.spicysalad.`data`.model.SpicySaladRowModel
import com.khushalsapplication.app.modules.spicysalad.`data`.viewmodel.SpicySaladVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SpicySaladActivity : BaseActivity<ActivitySpicySaladBinding>(R.layout.activity_spicy_salad) {
  private val viewModel: SpicySaladVM by viewModels<SpicySaladVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val spicySaladAdapter = SpicySaladAdapter(viewModel.spicySaladList.value?:mutableListOf())
    binding.recyclerSpicySalad.adapter = spicySaladAdapter
    spicySaladAdapter.setOnItemClickListener(
    object : SpicySaladAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SpicySaladRowModel) {
        onClickRecyclerSpicySalad(view, position, item)
      }
    }
    )
    viewModel.spicySaladList.observe(this) {
      spicySaladAdapter.updateData(it)
    }
    binding.spicySaladVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerSpicySalad(
    view: View,
    position: Int,
    item: SpicySaladRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SPICY_SALAD_ACTIVITY"

  }
}

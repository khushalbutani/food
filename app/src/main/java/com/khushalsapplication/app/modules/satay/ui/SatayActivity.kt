package com.khushalsapplication.app.modules.satay.ui

import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivitySatayBinding
import com.khushalsapplication.app.modules.order.ui.OrderActivity
import com.khushalsapplication.app.modules.satay.`data`.model.SatayRowModel
import com.khushalsapplication.app.modules.satay.`data`.viewmodel.SatayVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SatayActivity : BaseActivity<ActivitySatayBinding>(R.layout.activity_satay) {
  private val viewModel: SatayVM by viewModels<SatayVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val satayAdapter = SatayAdapter(viewModel.satayList.value?:mutableListOf())
    binding.recyclerSatay.adapter = satayAdapter
    satayAdapter.setOnItemClickListener(
    object : SatayAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SatayRowModel) {
        onClickRecyclerSatay(view, position, item)
      }
    }
    )
    viewModel.satayList.observe(this) {
      satayAdapter.updateData(it)
    }
    binding.satayVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowaddtoorder.setOnClickListener {
      val destIntent = OrderActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerSatay(
    view: View,
    position: Int,
    item: SatayRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SATAY_ACTIVITY"

  }
}

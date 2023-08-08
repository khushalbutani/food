package com.khushalsapplication.app.modules.rotiprata.ui

import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityRotiPrataBinding
import com.khushalsapplication.app.modules.order.ui.OrderActivity
import com.khushalsapplication.app.modules.rotiprata.`data`.model.RotiPrataRowModel
import com.khushalsapplication.app.modules.rotiprata.`data`.viewmodel.RotiPrataVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class RotiPrataActivity : BaseActivity<ActivityRotiPrataBinding>(R.layout.activity_roti_prata) {
  private val viewModel: RotiPrataVM by viewModels<RotiPrataVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val rotiPrataAdapter = RotiPrataAdapter(viewModel.rotiPrataList.value?:mutableListOf())
    binding.recyclerRotiPrata.adapter = rotiPrataAdapter
    rotiPrataAdapter.setOnItemClickListener(
    object : RotiPrataAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : RotiPrataRowModel) {
        onClickRecyclerRotiPrata(view, position, item)
      }
    }
    )
    viewModel.rotiPrataList.observe(this) {
      rotiPrataAdapter.updateData(it)
    }
    binding.rotiPrataVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowaddtoorder.setOnClickListener {
      val destIntent = OrderActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerRotiPrata(
    view: View,
    position: Int,
    item: RotiPrataRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ROTI_PRATA_ACTIVITY"

  }
}

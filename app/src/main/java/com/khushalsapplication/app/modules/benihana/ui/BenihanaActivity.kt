package com.khushalsapplication.app.modules.benihana.ui

import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityBenihanaBinding
import com.khushalsapplication.app.modules.benihana.`data`.model.BenihanaRowModel
import com.khushalsapplication.app.modules.benihana.`data`.viewmodel.BenihanaVM
import com.khushalsapplication.app.modules.order.ui.OrderActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class BenihanaActivity : BaseActivity<ActivityBenihanaBinding>(R.layout.activity_benihana) {
  private val viewModel: BenihanaVM by viewModels<BenihanaVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val benihanaAdapter = BenihanaAdapter(viewModel.benihanaList.value?:mutableListOf())
    binding.recyclerBenihana.adapter = benihanaAdapter
    benihanaAdapter.setOnItemClickListener(
    object : BenihanaAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : BenihanaRowModel) {
        onClickRecyclerBenihana(view, position, item)
      }
    }
    )
    viewModel.benihanaList.observe(this) {
      benihanaAdapter.updateData(it)
    }
    binding.benihanaVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowaddtoorder.setOnClickListener {
      val destIntent = OrderActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerBenihana(
    view: View,
    position: Int,
    item: BenihanaRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "BENIHANA_ACTIVITY"

  }
}

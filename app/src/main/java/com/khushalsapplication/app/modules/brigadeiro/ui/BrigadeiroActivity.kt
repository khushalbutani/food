package com.khushalsapplication.app.modules.brigadeiro.ui

import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityBrigadeiroBinding
import com.khushalsapplication.app.modules.brigadeiro.`data`.model.BrigadeiroRowModel
import com.khushalsapplication.app.modules.brigadeiro.`data`.viewmodel.BrigadeiroVM
import com.khushalsapplication.app.modules.order.ui.OrderActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class BrigadeiroActivity : BaseActivity<ActivityBrigadeiroBinding>(R.layout.activity_brigadeiro) {
  private val viewModel: BrigadeiroVM by viewModels<BrigadeiroVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val brigadeiroAdapter = BrigadeiroAdapter(viewModel.brigadeiroList.value?:mutableListOf())
    binding.recyclerBrigadeiro.adapter = brigadeiroAdapter
    brigadeiroAdapter.setOnItemClickListener(
    object : BrigadeiroAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : BrigadeiroRowModel) {
        onClickRecyclerBrigadeiro(view, position, item)
      }
    }
    )
    viewModel.brigadeiroList.observe(this) {
      brigadeiroAdapter.updateData(it)
    }
    binding.brigadeiroVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowaddtoorder.setOnClickListener {
      val destIntent = OrderActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerBrigadeiro(
    view: View,
    position: Int,
    item: BrigadeiroRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "BRIGADEIRO_ACTIVITY"

  }
}

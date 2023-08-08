package com.khushalsapplication.app.modules.chowmein.ui

import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityChowMeinBinding
import com.khushalsapplication.app.modules.chowmein.`data`.model.ChowMeinRowModel
import com.khushalsapplication.app.modules.chowmein.`data`.viewmodel.ChowMeinVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ChowMeinActivity : BaseActivity<ActivityChowMeinBinding>(R.layout.activity_chow_mein) {
  private val viewModel: ChowMeinVM by viewModels<ChowMeinVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val chowMeinAdapter = ChowMeinAdapter(viewModel.chowMeinList.value?:mutableListOf())
    binding.recyclerChowMein.adapter = chowMeinAdapter
    chowMeinAdapter.setOnItemClickListener(
    object : ChowMeinAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ChowMeinRowModel) {
        onClickRecyclerChowMein(view, position, item)
      }
    }
    )
    viewModel.chowMeinList.observe(this) {
      chowMeinAdapter.updateData(it)
    }
    binding.chowMeinVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerChowMein(
    view: View,
    position: Int,
    item: ChowMeinRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CHOW_MEIN_ACTIVITY"

  }
}

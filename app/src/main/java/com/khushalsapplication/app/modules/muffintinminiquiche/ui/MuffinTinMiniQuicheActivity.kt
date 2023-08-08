package com.khushalsapplication.app.modules.muffintinminiquiche.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityMuffinTinMiniQuicheBinding
import com.khushalsapplication.app.modules.muffintinminiquiche.`data`.model.Listprotein3RowModel
import com.khushalsapplication.app.modules.muffintinminiquiche.`data`.viewmodel.MuffinTinMiniQuicheVM
import com.khushalsapplication.app.modules.trendingthisweek.ui.TrendingThisWeekActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MuffinTinMiniQuicheActivity :
    BaseActivity<ActivityMuffinTinMiniQuicheBinding>(R.layout.activity_muffin_tin_mini_quiche) {
  private val viewModel: MuffinTinMiniQuicheVM by viewModels<MuffinTinMiniQuicheVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listproteinAdapter =
    ListproteinAdapter(viewModel.listproteinList.value?:mutableListOf())
    binding.recyclerListprotein.adapter = listproteinAdapter
    listproteinAdapter.setOnItemClickListener(
    object : ListproteinAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listprotein3RowModel) {
        onClickRecyclerListprotein(view, position, item)
      }
    }
    )
    viewModel.listproteinList.observe(this) {
      listproteinAdapter.updateData(it)
    }
    binding.muffinTinMiniQuicheVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangle299.setOnClickListener {
      val destIntent = TrendingThisWeekActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListprotein(
    view: View,
    position: Int,
    item: Listprotein3RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "MUFFIN_TIN_MINI_QUICHE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MuffinTinMiniQuicheActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

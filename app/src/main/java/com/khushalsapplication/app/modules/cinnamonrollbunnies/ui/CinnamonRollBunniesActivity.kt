package com.khushalsapplication.app.modules.cinnamonrollbunnies.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityCinnamonRollBunniesBinding
import com.khushalsapplication.app.modules.cinnamonrollbunnies.`data`.model.Listprotein2RowModel
import com.khushalsapplication.app.modules.cinnamonrollbunnies.`data`.viewmodel.CinnamonRollBunniesVM
import com.khushalsapplication.app.modules.trendingthisweek.ui.TrendingThisWeekActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CinnamonRollBunniesActivity :
    BaseActivity<ActivityCinnamonRollBunniesBinding>(R.layout.activity_cinnamon_roll_bunnies) {
  private val viewModel: CinnamonRollBunniesVM by viewModels<CinnamonRollBunniesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listproteinAdapter =
    ListproteinAdapter(viewModel.listproteinList.value?:mutableListOf())
    binding.recyclerListprotein.adapter = listproteinAdapter
    listproteinAdapter.setOnItemClickListener(
    object : ListproteinAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listprotein2RowModel) {
        onClickRecyclerListprotein(view, position, item)
      }
    }
    )
    viewModel.listproteinList.observe(this) {
      listproteinAdapter.updateData(it)
    }
    binding.cinnamonRollBunniesVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangle294.setOnClickListener {
      val destIntent = TrendingThisWeekActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListprotein(
    view: View,
    position: Int,
    item: Listprotein2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CINNAMON_ROLL_BUNNIES_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CinnamonRollBunniesActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

package com.khushalsapplication.app.modules.misoramensoup.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityMisoRamenSoupBinding
import com.khushalsapplication.app.modules.misoramensoup.`data`.model.Listprotein5RowModel
import com.khushalsapplication.app.modules.misoramensoup.`data`.viewmodel.MisoRamenSoupVM
import com.khushalsapplication.app.modules.trendingthisweek.ui.TrendingThisWeekActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MisoRamenSoupActivity :
    BaseActivity<ActivityMisoRamenSoupBinding>(R.layout.activity_miso_ramen_soup) {
  private val viewModel: MisoRamenSoupVM by viewModels<MisoRamenSoupVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listproteinAdapter =
    ListproteinAdapter(viewModel.listproteinList.value?:mutableListOf())
    binding.recyclerListprotein.adapter = listproteinAdapter
    listproteinAdapter.setOnItemClickListener(
    object : ListproteinAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listprotein5RowModel) {
        onClickRecyclerListprotein(view, position, item)
      }
    }
    )
    viewModel.listproteinList.observe(this) {
      listproteinAdapter.updateData(it)
    }
    binding.misoRamenSoupVM = viewModel
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
    item: Listprotein5RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "MISO_RAMEN_SOUP_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MisoRamenSoupActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

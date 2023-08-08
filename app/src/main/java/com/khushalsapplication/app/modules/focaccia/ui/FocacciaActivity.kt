package com.khushalsapplication.app.modules.focaccia.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityFocacciaBinding
import com.khushalsapplication.app.modules.focaccia.`data`.model.FocacciaRowModel
import com.khushalsapplication.app.modules.focaccia.`data`.viewmodel.FocacciaVM
import com.khushalsapplication.app.modules.trendingthisweek.ui.TrendingThisWeekActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class FocacciaActivity : BaseActivity<ActivityFocacciaBinding>(R.layout.activity_focaccia) {
  private val viewModel: FocacciaVM by viewModels<FocacciaVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val focacciaAdapter = FocacciaAdapter(viewModel.focacciaList.value?:mutableListOf())
    binding.recyclerFocaccia.adapter = focacciaAdapter
    focacciaAdapter.setOnItemClickListener(
    object : FocacciaAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : FocacciaRowModel) {
        onClickRecyclerFocaccia(view, position, item)
      }
    }
    )
    viewModel.focacciaList.observe(this) {
      focacciaAdapter.updateData(it)
    }
    binding.focacciaVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangle294.setOnClickListener {
      val destIntent = TrendingThisWeekActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerFocaccia(
    view: View,
    position: Int,
    item: FocacciaRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "FOCACCIA_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FocacciaActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

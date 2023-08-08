package com.khushalsapplication.app.modules.penanglaksa.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityPenangLaksaBinding
import com.khushalsapplication.app.modules.penanglaksa.`data`.model.PenangLaksaRowModel
import com.khushalsapplication.app.modules.penanglaksa.`data`.viewmodel.PenangLaksaVM
import com.khushalsapplication.app.modules.trendingthisweek.ui.TrendingThisWeekActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PenangLaksaActivity : BaseActivity<ActivityPenangLaksaBinding>(R.layout.activity_penang_laksa)
    {
  private val viewModel: PenangLaksaVM by viewModels<PenangLaksaVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val penangLaksaAdapter =
    PenangLaksaAdapter(viewModel.penangLaksaList.value?:mutableListOf())
    binding.recyclerPenangLaksa.adapter = penangLaksaAdapter
    penangLaksaAdapter.setOnItemClickListener(
    object : PenangLaksaAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : PenangLaksaRowModel) {
        onClickRecyclerPenangLaksa(view, position, item)
      }
    }
    )
    viewModel.penangLaksaList.observe(this) {
      penangLaksaAdapter.updateData(it)
    }
    binding.penangLaksaVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangle294.setOnClickListener {
      val destIntent = TrendingThisWeekActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerPenangLaksa(
    view: View,
    position: Int,
    item: PenangLaksaRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PENANG_LAKSA_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PenangLaksaActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

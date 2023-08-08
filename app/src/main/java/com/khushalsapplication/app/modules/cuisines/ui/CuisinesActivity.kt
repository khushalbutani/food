package com.khushalsapplication.app.modules.cuisines.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityCuisinesBinding
import com.khushalsapplication.app.modules.browse.ui.BrowseActivity
import com.khushalsapplication.app.modules.cuisines.`data`.model.CuisinesRowModel
import com.khushalsapplication.app.modules.cuisines.`data`.viewmodel.CuisinesVM
import com.khushalsapplication.app.modules.japanese.ui.JapaneseActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CuisinesActivity : BaseActivity<ActivityCuisinesBinding>(R.layout.activity_cuisines) {
  private val viewModel: CuisinesVM by viewModels<CuisinesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val cuisinesAdapter = CuisinesAdapter(viewModel.cuisinesList.value?:mutableListOf())
    binding.recyclerCuisines.adapter = cuisinesAdapter
    cuisinesAdapter.setOnItemClickListener(
    object : CuisinesAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : CuisinesRowModel) {
        onClickRecyclerCuisines(view, position, item)
      }
    }
    )
    viewModel.cuisinesList.observe(this) {
      cuisinesAdapter.updateData(it)
    }
    binding.cuisinesVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangleNinetyFour.setOnClickListener {
      val destIntent = BrowseActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerCuisines(
    view: View,
    position: Int,
    item: CuisinesRowModel
  ): Unit {
    when(view.id) {
      R.id.imageRectangle117 -> {
        val destIntent = JapaneseActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "CUISINES_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CuisinesActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

package com.khushalsapplication.app.modules.frenchfries.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityFrenchFriesBinding
import com.khushalsapplication.app.modules.frenchfries.`data`.model.FrenchFriesRowModel
import com.khushalsapplication.app.modules.frenchfries.`data`.viewmodel.FrenchFriesVM
import com.khushalsapplication.app.modules.search.ui.SearchActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class FrenchFriesActivity : BaseActivity<ActivityFrenchFriesBinding>(R.layout.activity_french_fries)
    {
  private val viewModel: FrenchFriesVM by viewModels<FrenchFriesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val frenchFriesAdapter =
    FrenchFriesAdapter(viewModel.frenchFriesList.value?:mutableListOf())
    binding.recyclerFrenchFries.adapter = frenchFriesAdapter
    frenchFriesAdapter.setOnItemClickListener(
    object : FrenchFriesAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : FrenchFriesRowModel) {
        onClickRecyclerFrenchFries(view, position, item)
      }
    }
    )
    viewModel.frenchFriesList.observe(this) {
      frenchFriesAdapter.updateData(it)
    }
    binding.frenchFriesVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangle294.setOnClickListener {
      val destIntent = SearchActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerFrenchFries(
    view: View,
    position: Int,
    item: FrenchFriesRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "FRENCH_FRIES_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FrenchFriesActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

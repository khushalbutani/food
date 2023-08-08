package com.khushalsapplication.app.modules.corndogs.ui

import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityCornDogsBinding
import com.khushalsapplication.app.modules.corndogs.`data`.model.CornDogsRowModel
import com.khushalsapplication.app.modules.corndogs.`data`.viewmodel.CornDogsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CornDogsActivity : BaseActivity<ActivityCornDogsBinding>(R.layout.activity_corn_dogs) {
  private val viewModel: CornDogsVM by viewModels<CornDogsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val cornDogsAdapter = CornDogsAdapter(viewModel.cornDogsList.value?:mutableListOf())
    binding.recyclerCornDogs.adapter = cornDogsAdapter
    cornDogsAdapter.setOnItemClickListener(
    object : CornDogsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : CornDogsRowModel) {
        onClickRecyclerCornDogs(view, position, item)
      }
    }
    )
    viewModel.cornDogsList.observe(this) {
      cornDogsAdapter.updateData(it)
    }
    binding.cornDogsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerCornDogs(
    view: View,
    position: Int,
    item: CornDogsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CORN_DOGS_ACTIVITY"

  }
}

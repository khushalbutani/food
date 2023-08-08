package com.khushalsapplication.app.modules.sandwich.ui

import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivitySandwichBinding
import com.khushalsapplication.app.modules.sandwich.`data`.model.SandwichRowModel
import com.khushalsapplication.app.modules.sandwich.`data`.viewmodel.SandwichVM
import com.khushalsapplication.app.modules.search.ui.SearchActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SandwichActivity : BaseActivity<ActivitySandwichBinding>(R.layout.activity_sandwich) {
  private val viewModel: SandwichVM by viewModels<SandwichVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val sandwichAdapter = SandwichAdapter(viewModel.sandwichList.value?:mutableListOf())
    binding.recyclerSandwich.adapter = sandwichAdapter
    sandwichAdapter.setOnItemClickListener(
    object : SandwichAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SandwichRowModel) {
        onClickRecyclerSandwich(view, position, item)
      }
    }
    )
    viewModel.sandwichList.observe(this) {
      sandwichAdapter.updateData(it)
    }
    binding.sandwichVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangle294.setOnClickListener {
      val destIntent = SearchActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerSandwich(
    view: View,
    position: Int,
    item: SandwichRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SANDWICH_ACTIVITY"

  }
}

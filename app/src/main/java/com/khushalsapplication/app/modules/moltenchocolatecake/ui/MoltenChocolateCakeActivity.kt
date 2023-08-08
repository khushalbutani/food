package com.khushalsapplication.app.modules.moltenchocolatecake.ui

import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityMoltenChocolateCakeBinding
import com.khushalsapplication.app.modules.moltenchocolatecake.`data`.model.Listprotein4RowModel
import com.khushalsapplication.app.modules.moltenchocolatecake.`data`.viewmodel.MoltenChocolateCakeVM
import com.khushalsapplication.app.modules.trendingthisweek.ui.TrendingThisWeekActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MoltenChocolateCakeActivity :
    BaseActivity<ActivityMoltenChocolateCakeBinding>(R.layout.activity_molten_chocolate_cake) {
  private val viewModel: MoltenChocolateCakeVM by viewModels<MoltenChocolateCakeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listproteinAdapter =
    ListproteinAdapter(viewModel.listproteinList.value?:mutableListOf())
    binding.recyclerListprotein.adapter = listproteinAdapter
    listproteinAdapter.setOnItemClickListener(
    object : ListproteinAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listprotein4RowModel) {
        onClickRecyclerListprotein(view, position, item)
      }
    }
    )
    viewModel.listproteinList.observe(this) {
      listproteinAdapter.updateData(it)
    }
    binding.moltenChocolateCakeVM = viewModel
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
    item: Listprotein4RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "MOLTEN_CHOCOLATE_CAKE_ACTIVITY"

  }
}

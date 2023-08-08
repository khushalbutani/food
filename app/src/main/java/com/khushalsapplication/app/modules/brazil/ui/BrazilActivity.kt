package com.khushalsapplication.app.modules.brazil.ui

import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityBrazilBinding
import com.khushalsapplication.app.modules.brazil.`data`.model.BrazilRowModel
import com.khushalsapplication.app.modules.brazil.`data`.viewmodel.BrazilVM
import com.khushalsapplication.app.modules.cuisines.ui.CuisinesActivity
import com.khushalsapplication.app.modules.filter.ui.FilterActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class BrazilActivity : BaseActivity<ActivityBrazilBinding>(R.layout.activity_brazil) {
  private val viewModel: BrazilVM by viewModels<BrazilVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val brazilAdapter = BrazilAdapter(viewModel.brazilList.value?:mutableListOf())
    binding.recyclerBrazil.adapter = brazilAdapter
    brazilAdapter.setOnItemClickListener(
    object : BrazilAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : BrazilRowModel) {
        onClickRecyclerBrazil(view, position, item)
      }
    }
    )
    viewModel.brazilList.observe(this) {
      brazilAdapter.updateData(it)
    }
    binding.brazilVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtFilter.setOnClickListener {
      val destIntent = FilterActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleSeventySeven.setOnClickListener {
      val destIntent = CuisinesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerBrazil(
    view: View,
    position: Int,
    item: BrazilRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "BRAZIL_ACTIVITY"

  }
}

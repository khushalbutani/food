package com.khushalsapplication.app.modules.mexican.ui

import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityMexicanBinding
import com.khushalsapplication.app.modules.cuisines.ui.CuisinesActivity
import com.khushalsapplication.app.modules.filter.ui.FilterActivity
import com.khushalsapplication.app.modules.mexican.`data`.model.MexicanRowModel
import com.khushalsapplication.app.modules.mexican.`data`.viewmodel.MexicanVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MexicanActivity : BaseActivity<ActivityMexicanBinding>(R.layout.activity_mexican) {
  private val viewModel: MexicanVM by viewModels<MexicanVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val mexicanAdapter = MexicanAdapter(viewModel.mexicanList.value?:mutableListOf())
    binding.recyclerMexican.adapter = mexicanAdapter
    mexicanAdapter.setOnItemClickListener(
    object : MexicanAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : MexicanRowModel) {
        onClickRecyclerMexican(view, position, item)
      }
    }
    )
    viewModel.mexicanList.observe(this) {
      mexicanAdapter.updateData(it)
    }
    binding.mexicanVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangleSeventySeven.setOnClickListener {
      val destIntent = CuisinesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtFilter.setOnClickListener {
      val destIntent = FilterActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerMexican(
    view: View,
    position: Int,
    item: MexicanRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "MEXICAN_ACTIVITY"

  }
}

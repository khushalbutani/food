package com.khushalsapplication.app.modules.habanerostacogrill.ui

import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityHabanerosTacoGrillBinding
import com.khushalsapplication.app.modules.habanerostacogrill.`data`.model.Listprotein7RowModel
import com.khushalsapplication.app.modules.habanerostacogrill.`data`.viewmodel.HabanerosTacoGrillVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HabanerosTacoGrillActivity :
    BaseActivity<ActivityHabanerosTacoGrillBinding>(R.layout.activity_habaneros_taco_grill) {
  private val viewModel: HabanerosTacoGrillVM by viewModels<HabanerosTacoGrillVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listproteinAdapter =
    ListproteinAdapter(viewModel.listproteinList.value?:mutableListOf())
    binding.recyclerListprotein.adapter = listproteinAdapter
    listproteinAdapter.setOnItemClickListener(
    object : ListproteinAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listprotein7RowModel) {
        onClickRecyclerListprotein(view, position, item)
      }
    }
    )
    viewModel.listproteinList.observe(this) {
      listproteinAdapter.updateData(it)
    }
    binding.habanerosTacoGrillVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListprotein(
    view: View,
    position: Int,
    item: Listprotein7RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "HABANEROS_TACO_GRILL_ACTIVITY"

  }
}

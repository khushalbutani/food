package com.khushalsapplication.app.modules.churroicecreambowls.ui

import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityChurroIceCreamBowlsBinding
import com.khushalsapplication.app.modules.churroicecreambowls.`data`.model.Listprotein10RowModel
import com.khushalsapplication.app.modules.churroicecreambowls.`data`.viewmodel.ChurroIceCreamBowlsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ChurroIceCreamBowlsActivity :
    BaseActivity<ActivityChurroIceCreamBowlsBinding>(R.layout.activity_churro_ice_cream_bowls) {
  private val viewModel: ChurroIceCreamBowlsVM by viewModels<ChurroIceCreamBowlsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listproteinAdapter =
    ListproteinAdapter(viewModel.listproteinList.value?:mutableListOf())
    binding.recyclerListprotein.adapter = listproteinAdapter
    listproteinAdapter.setOnItemClickListener(
    object : ListproteinAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listprotein10RowModel) {
        onClickRecyclerListprotein(view, position, item)
      }
    }
    )
    viewModel.listproteinList.observe(this) {
      listproteinAdapter.updateData(it)
    }
    binding.churroIceCreamBowlsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListprotein(
    view: View,
    position: Int,
    item: Listprotein10RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CHURRO_ICE_CREAM_BOWLS_ACTIVITY"

  }
}

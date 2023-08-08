package com.khushalsapplication.app.modules.tirmisu.ui

import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityTirmisuBinding
import com.khushalsapplication.app.modules.tirmisu.`data`.model.TirmisuRowModel
import com.khushalsapplication.app.modules.tirmisu.`data`.viewmodel.TirmisuVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class TirmisuActivity : BaseActivity<ActivityTirmisuBinding>(R.layout.activity_tirmisu) {
  private val viewModel: TirmisuVM by viewModels<TirmisuVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val tirmisuAdapter = TirmisuAdapter(viewModel.tirmisuList.value?:mutableListOf())
    binding.recyclerTirmisu.adapter = tirmisuAdapter
    tirmisuAdapter.setOnItemClickListener(
    object : TirmisuAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : TirmisuRowModel) {
        onClickRecyclerTirmisu(view, position, item)
      }
    }
    )
    viewModel.tirmisuList.observe(this) {
      tirmisuAdapter.updateData(it)
    }
    binding.tirmisuVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerTirmisu(
    view: View,
    position: Int,
    item: TirmisuRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "TIRMISU_ACTIVITY"

  }
}

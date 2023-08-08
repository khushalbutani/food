package com.khushalsapplication.app.modules.boloderolo.ui

import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityBoloDeRoloBinding
import com.khushalsapplication.app.modules.boloderolo.`data`.model.BoloDeRoloRowModel
import com.khushalsapplication.app.modules.boloderolo.`data`.viewmodel.BoloDeRoloVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class BoloDeRoloActivity : BaseActivity<ActivityBoloDeRoloBinding>(R.layout.activity_bolo_de_rolo) {
  private val viewModel: BoloDeRoloVM by viewModels<BoloDeRoloVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val boloDeRoloAdapter = BoloDeRoloAdapter(viewModel.boloDeRoloList.value?:mutableListOf())
    binding.recyclerBoloDeRolo.adapter = boloDeRoloAdapter
    boloDeRoloAdapter.setOnItemClickListener(
    object : BoloDeRoloAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : BoloDeRoloRowModel) {
        onClickRecyclerBoloDeRolo(view, position, item)
      }
    }
    )
    viewModel.boloDeRoloList.observe(this) {
      boloDeRoloAdapter.updateData(it)
    }
    binding.boloDeRoloVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerBoloDeRolo(
    view: View,
    position: Int,
    item: BoloDeRoloRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "BOLO_DE_ROLO_ACTIVITY"

  }
}

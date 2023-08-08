package com.khushalsapplication.app.modules.muttonkeemasamosa.ui

import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityMuttonKeemaSamosaBinding
import com.khushalsapplication.app.modules.muttonkeemasamosa.`data`.model.Listprotein9RowModel
import com.khushalsapplication.app.modules.muttonkeemasamosa.`data`.viewmodel.MuttonKeemaSamosaVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MuttonKeemaSamosaActivity :
    BaseActivity<ActivityMuttonKeemaSamosaBinding>(R.layout.activity_mutton_keema_samosa) {
  private val viewModel: MuttonKeemaSamosaVM by viewModels<MuttonKeemaSamosaVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listproteinAdapter =
    ListproteinAdapter(viewModel.listproteinList.value?:mutableListOf())
    binding.recyclerListprotein.adapter = listproteinAdapter
    listproteinAdapter.setOnItemClickListener(
    object : ListproteinAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listprotein9RowModel) {
        onClickRecyclerListprotein(view, position, item)
      }
    }
    )
    viewModel.listproteinList.observe(this) {
      listproteinAdapter.updateData(it)
    }
    binding.muttonKeemaSamosaVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListprotein(
    view: View,
    position: Int,
    item: Listprotein9RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "MUTTON_KEEMA_SAMOSA_ACTIVITY"

  }
}

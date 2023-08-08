package com.khushalsapplication.app.modules.nigirisushi.ui

import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityNigiriSushiBinding
import com.khushalsapplication.app.modules.nigirisushi.`data`.model.NigiriSushiRowModel
import com.khushalsapplication.app.modules.nigirisushi.`data`.viewmodel.NigiriSushiVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class NigiriSushiActivity : BaseActivity<ActivityNigiriSushiBinding>(R.layout.activity_nigiri_sushi)
    {
  private val viewModel: NigiriSushiVM by viewModels<NigiriSushiVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val nigiriSushiAdapter =
    NigiriSushiAdapter(viewModel.nigiriSushiList.value?:mutableListOf())
    binding.recyclerNigiriSushi.adapter = nigiriSushiAdapter
    nigiriSushiAdapter.setOnItemClickListener(
    object : NigiriSushiAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : NigiriSushiRowModel) {
        onClickRecyclerNigiriSushi(view, position, item)
      }
    }
    )
    viewModel.nigiriSushiList.observe(this) {
      nigiriSushiAdapter.updateData(it)
    }
    binding.nigiriSushiVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerNigiriSushi(
    view: View,
    position: Int,
    item: NigiriSushiRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "NIGIRI_SUSHI_ACTIVITY"

  }
}

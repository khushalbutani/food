package com.khushalsapplication.app.modules.onioncheeseone.ui

import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityOnionCheeseOneBinding
import com.khushalsapplication.app.modules.onioncheeseone.`data`.model.Listprotein6RowModel
import com.khushalsapplication.app.modules.onioncheeseone.`data`.viewmodel.OnionCheeseOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class OnionCheeseOneActivity :
    BaseActivity<ActivityOnionCheeseOneBinding>(R.layout.activity_onion_cheese_one) {
  private val viewModel: OnionCheeseOneVM by viewModels<OnionCheeseOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listproteinAdapter =
    ListproteinAdapter(viewModel.listproteinList.value?:mutableListOf())
    binding.recyclerListprotein.adapter = listproteinAdapter
    listproteinAdapter.setOnItemClickListener(
    object : ListproteinAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listprotein6RowModel) {
        onClickRecyclerListprotein(view, position, item)
      }
    }
    )
    viewModel.listproteinList.observe(this) {
      listproteinAdapter.updateData(it)
    }
    binding.onionCheeseOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListprotein(
    view: View,
    position: Int,
    item: Listprotein6RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ONION_CHEESE_ONE_ACTIVITY"

  }
}

package com.khushalsapplication.app.modules.currynoodlesoup.ui

import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityCurryNoodleSoupBinding
import com.khushalsapplication.app.modules.currynoodlesoup.`data`.model.Listprotein8RowModel
import com.khushalsapplication.app.modules.currynoodlesoup.`data`.viewmodel.CurryNoodleSoupVM
import com.khushalsapplication.app.modules.order.ui.OrderActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CurryNoodleSoupActivity :
    BaseActivity<ActivityCurryNoodleSoupBinding>(R.layout.activity_curry_noodle_soup) {
  private val viewModel: CurryNoodleSoupVM by viewModels<CurryNoodleSoupVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listproteinAdapter =
    ListproteinAdapter(viewModel.listproteinList.value?:mutableListOf())
    binding.recyclerListprotein.adapter = listproteinAdapter
    listproteinAdapter.setOnItemClickListener(
    object : ListproteinAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listprotein8RowModel) {
        onClickRecyclerListprotein(view, position, item)
      }
    }
    )
    viewModel.listproteinList.observe(this) {
      listproteinAdapter.updateData(it)
    }
    binding.curryNoodleSoupVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowaddtoorder.setOnClickListener {
      val destIntent = OrderActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListprotein(
    view: View,
    position: Int,
    item: Listprotein8RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CURRY_NOODLE_SOUP_ACTIVITY"

  }
}

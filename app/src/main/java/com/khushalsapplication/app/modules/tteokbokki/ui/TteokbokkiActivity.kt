package com.khushalsapplication.app.modules.tteokbokki.ui

import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityTteokbokkiBinding
import com.khushalsapplication.app.modules.order.ui.OrderActivity
import com.khushalsapplication.app.modules.tteokbokki.`data`.model.TteokbokkiRowModel
import com.khushalsapplication.app.modules.tteokbokki.`data`.viewmodel.TteokbokkiVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class TteokbokkiActivity : BaseActivity<ActivityTteokbokkiBinding>(R.layout.activity_tteokbokki) {
  private val viewModel: TteokbokkiVM by viewModels<TteokbokkiVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val tteokbokkiAdapter = TteokbokkiAdapter(viewModel.tteokbokkiList.value?:mutableListOf())
    binding.recyclerTteokbokki.adapter = tteokbokkiAdapter
    tteokbokkiAdapter.setOnItemClickListener(
    object : TteokbokkiAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : TteokbokkiRowModel) {
        onClickRecyclerTteokbokki(view, position, item)
      }
    }
    )
    viewModel.tteokbokkiList.observe(this) {
      tteokbokkiAdapter.updateData(it)
    }
    binding.tteokbokkiVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowaddtoorder.setOnClickListener {
      val destIntent = OrderActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerTteokbokki(
    view: View,
    position: Int,
    item: TteokbokkiRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "TTEOKBOKKI_ACTIVITY"

  }
}

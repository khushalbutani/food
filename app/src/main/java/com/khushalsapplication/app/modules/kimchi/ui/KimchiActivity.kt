package com.khushalsapplication.app.modules.kimchi.ui

import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityKimchiBinding
import com.khushalsapplication.app.modules.kimchi.`data`.model.KimchiRowModel
import com.khushalsapplication.app.modules.kimchi.`data`.viewmodel.KimchiVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class KimchiActivity : BaseActivity<ActivityKimchiBinding>(R.layout.activity_kimchi) {
  private val viewModel: KimchiVM by viewModels<KimchiVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val kimchiAdapter = KimchiAdapter(viewModel.kimchiList.value?:mutableListOf())
    binding.recyclerKimchi.adapter = kimchiAdapter
    kimchiAdapter.setOnItemClickListener(
    object : KimchiAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : KimchiRowModel) {
        onClickRecyclerKimchi(view, position, item)
      }
    }
    )
    viewModel.kimchiList.observe(this) {
      kimchiAdapter.updateData(it)
    }
    binding.kimchiVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerKimchi(
    view: View,
    position: Int,
    item: KimchiRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "KIMCHI_ACTIVITY"

  }
}

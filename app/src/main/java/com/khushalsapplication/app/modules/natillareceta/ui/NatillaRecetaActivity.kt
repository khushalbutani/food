package com.khushalsapplication.app.modules.natillareceta.ui

import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityNatillaRecetaBinding
import com.khushalsapplication.app.modules.natillareceta.`data`.model.NatillaRecetaRowModel
import com.khushalsapplication.app.modules.natillareceta.`data`.viewmodel.NatillaRecetaVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class NatillaRecetaActivity :
    BaseActivity<ActivityNatillaRecetaBinding>(R.layout.activity_natilla_receta) {
  private val viewModel: NatillaRecetaVM by viewModels<NatillaRecetaVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val natillaRecetaAdapter =
    NatillaRecetaAdapter(viewModel.natillaRecetaList.value?:mutableListOf())
    binding.recyclerNatillaReceta.adapter = natillaRecetaAdapter
    natillaRecetaAdapter.setOnItemClickListener(
    object : NatillaRecetaAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : NatillaRecetaRowModel) {
        onClickRecyclerNatillaReceta(view, position, item)
      }
    }
    )
    viewModel.natillaRecetaList.observe(this) {
      natillaRecetaAdapter.updateData(it)
    }
    binding.natillaRecetaVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerNatillaReceta(
    view: View,
    position: Int,
    item: NatillaRecetaRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "NATILLA_RECETA_ACTIVITY"

  }
}

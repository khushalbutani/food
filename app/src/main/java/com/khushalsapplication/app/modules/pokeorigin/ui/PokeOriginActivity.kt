package com.khushalsapplication.app.modules.pokeorigin.ui

import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityPokeOriginBinding
import com.khushalsapplication.app.modules.pokeorigin.`data`.model.PokeOriginRowModel
import com.khushalsapplication.app.modules.pokeorigin.`data`.viewmodel.PokeOriginVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PokeOriginActivity : BaseActivity<ActivityPokeOriginBinding>(R.layout.activity_poke_origin) {
  private val viewModel: PokeOriginVM by viewModels<PokeOriginVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val pokeOriginAdapter = PokeOriginAdapter(viewModel.pokeOriginList.value?:mutableListOf())
    binding.recyclerPokeOrigin.adapter = pokeOriginAdapter
    pokeOriginAdapter.setOnItemClickListener(
    object : PokeOriginAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : PokeOriginRowModel) {
        onClickRecyclerPokeOrigin(view, position, item)
      }
    }
    )
    viewModel.pokeOriginList.observe(this) {
      pokeOriginAdapter.updateData(it)
    }
    binding.pokeOriginVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerPokeOrigin(
    view: View,
    position: Int,
    item: PokeOriginRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "POKE_ORIGIN_ACTIVITY"

  }
}

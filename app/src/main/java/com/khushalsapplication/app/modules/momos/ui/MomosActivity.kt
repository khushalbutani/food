package com.khushalsapplication.app.modules.momos.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityMomosBinding
import com.khushalsapplication.app.modules.momos.`data`.model.MomosRowModel
import com.khushalsapplication.app.modules.momos.`data`.viewmodel.MomosVM
import com.khushalsapplication.app.modules.search.ui.SearchActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MomosActivity : BaseActivity<ActivityMomosBinding>(R.layout.activity_momos) {
  private val viewModel: MomosVM by viewModels<MomosVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val momosAdapter = MomosAdapter(viewModel.momosList.value?:mutableListOf())
    binding.recyclerMomos.adapter = momosAdapter
    momosAdapter.setOnItemClickListener(
    object : MomosAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : MomosRowModel) {
        onClickRecyclerMomos(view, position, item)
      }
    }
    )
    viewModel.momosList.observe(this) {
      momosAdapter.updateData(it)
    }
    binding.momosVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangle294.setOnClickListener {
      val destIntent = SearchActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerMomos(
    view: View,
    position: Int,
    item: MomosRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "MOMOS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MomosActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

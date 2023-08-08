package com.khushalsapplication.app.modules.garlicbread.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityGarlicBreadBinding
import com.khushalsapplication.app.modules.garlicbread.`data`.model.GarlicBreadRowModel
import com.khushalsapplication.app.modules.garlicbread.`data`.viewmodel.GarlicBreadVM
import com.khushalsapplication.app.modules.search.ui.SearchActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class GarlicBreadActivity : BaseActivity<ActivityGarlicBreadBinding>(R.layout.activity_garlic_bread)
    {
  private val viewModel: GarlicBreadVM by viewModels<GarlicBreadVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val garlicBreadAdapter =
    GarlicBreadAdapter(viewModel.garlicBreadList.value?:mutableListOf())
    binding.recyclerGarlicBread.adapter = garlicBreadAdapter
    garlicBreadAdapter.setOnItemClickListener(
    object : GarlicBreadAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : GarlicBreadRowModel) {
        onClickRecyclerGarlicBread(view, position, item)
      }
    }
    )
    viewModel.garlicBreadList.observe(this) {
      garlicBreadAdapter.updateData(it)
    }
    binding.garlicBreadVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangle294.setOnClickListener {
      val destIntent = SearchActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerGarlicBread(
    view: View,
    position: Int,
    item: GarlicBreadRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "GARLIC_BREAD_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, GarlicBreadActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

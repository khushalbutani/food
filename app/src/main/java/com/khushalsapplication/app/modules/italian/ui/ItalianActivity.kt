package com.khushalsapplication.app.modules.italian.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityItalianBinding
import com.khushalsapplication.app.modules.italian.`data`.model.ItalianRowModel
import com.khushalsapplication.app.modules.italian.`data`.viewmodel.ItalianVM
import com.khushalsapplication.app.modules.pasta.ui.PastaActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ItalianActivity : BaseActivity<ActivityItalianBinding>(R.layout.activity_italian) {
  private val viewModel: ItalianVM by viewModels<ItalianVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val italianAdapter = ItalianAdapter(viewModel.italianList.value?:mutableListOf())
    binding.recyclerItalian.adapter = italianAdapter
    italianAdapter.setOnItemClickListener(
    object : ItalianAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ItalianRowModel) {
        onClickRecyclerItalian(view, position, item)
      }
    }
    )
    viewModel.italianList.observe(this) {
      italianAdapter.updateData(it)
    }
    binding.italianVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerItalian(
    view: View,
    position: Int,
    item: ItalianRowModel
  ): Unit {
    when(view.id) {
      R.id.linearRowrectangleeightyone -> {
        val destIntent = PastaActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "ITALIAN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ItalianActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

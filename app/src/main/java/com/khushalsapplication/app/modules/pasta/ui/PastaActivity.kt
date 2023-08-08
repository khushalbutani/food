package com.khushalsapplication.app.modules.pasta.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityPastaBinding
import com.khushalsapplication.app.modules.italian.ui.ItalianActivity
import com.khushalsapplication.app.modules.pasta.`data`.model.PastaRowModel
import com.khushalsapplication.app.modules.pasta.`data`.viewmodel.PastaVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PastaActivity : BaseActivity<ActivityPastaBinding>(R.layout.activity_pasta) {
  private val viewModel: PastaVM by viewModels<PastaVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val pastaAdapter = PastaAdapter(viewModel.pastaList.value?:mutableListOf())
    binding.recyclerPasta.adapter = pastaAdapter
    pastaAdapter.setOnItemClickListener(
    object : PastaAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : PastaRowModel) {
        onClickRecyclerPasta(view, position, item)
      }
    }
    )
    viewModel.pastaList.observe(this) {
      pastaAdapter.updateData(it)
    }
    binding.pastaVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangleNinetyFour.setOnClickListener {
      val destIntent = ItalianActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerPasta(
    view: View,
    position: Int,
    item: PastaRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PASTA_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PastaActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

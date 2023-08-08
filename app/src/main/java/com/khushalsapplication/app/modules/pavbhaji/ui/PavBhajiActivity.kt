package com.khushalsapplication.app.modules.pavbhaji.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityPavBhajiBinding
import com.khushalsapplication.app.modules.pavbhaji.`data`.model.PavBhajiRowModel
import com.khushalsapplication.app.modules.pavbhaji.`data`.viewmodel.PavBhajiVM
import com.khushalsapplication.app.modules.search.ui.SearchActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PavBhajiActivity : BaseActivity<ActivityPavBhajiBinding>(R.layout.activity_pav_bhaji) {
  private val viewModel: PavBhajiVM by viewModels<PavBhajiVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val pavBhajiAdapter = PavBhajiAdapter(viewModel.pavBhajiList.value?:mutableListOf())
    binding.recyclerPavBhaji.adapter = pavBhajiAdapter
    pavBhajiAdapter.setOnItemClickListener(
    object : PavBhajiAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : PavBhajiRowModel) {
        onClickRecyclerPavBhaji(view, position, item)
      }
    }
    )
    viewModel.pavBhajiList.observe(this) {
      pavBhajiAdapter.updateData(it)
    }
    binding.pavBhajiVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangle294.setOnClickListener {
      val destIntent = SearchActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerPavBhaji(
    view: View,
    position: Int,
    item: PavBhajiRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PAV_BHAJI_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PavBhajiActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

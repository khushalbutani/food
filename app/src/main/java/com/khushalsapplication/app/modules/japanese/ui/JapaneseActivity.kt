package com.khushalsapplication.app.modules.japanese.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityJapaneseBinding
import com.khushalsapplication.app.modules.cuisines.ui.CuisinesActivity
import com.khushalsapplication.app.modules.filter.ui.FilterActivity
import com.khushalsapplication.app.modules.japanese.`data`.model.JapaneseRowModel
import com.khushalsapplication.app.modules.japanese.`data`.viewmodel.JapaneseVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class JapaneseActivity : BaseActivity<ActivityJapaneseBinding>(R.layout.activity_japanese) {
  private val viewModel: JapaneseVM by viewModels<JapaneseVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val japaneseAdapter = JapaneseAdapter(viewModel.japaneseList.value?:mutableListOf())
    binding.recyclerJapanese.adapter = japaneseAdapter
    japaneseAdapter.setOnItemClickListener(
    object : JapaneseAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : JapaneseRowModel) {
        onClickRecyclerJapanese(view, position, item)
      }
    }
    )
    viewModel.japaneseList.observe(this) {
      japaneseAdapter.updateData(it)
    }
    binding.japaneseVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtFilter.setOnClickListener {
      val destIntent = FilterActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleSeventySeven.setOnClickListener {
      val destIntent = CuisinesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerJapanese(
    view: View,
    position: Int,
    item: JapaneseRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "JAPANESE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, JapaneseActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

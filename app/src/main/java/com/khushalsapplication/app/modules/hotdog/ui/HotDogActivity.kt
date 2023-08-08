package com.khushalsapplication.app.modules.hotdog.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityHotDogBinding
import com.khushalsapplication.app.modules.hotdog.`data`.model.HotDogRowModel
import com.khushalsapplication.app.modules.hotdog.`data`.viewmodel.HotDogVM
import com.khushalsapplication.app.modules.search.ui.SearchActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HotDogActivity : BaseActivity<ActivityHotDogBinding>(R.layout.activity_hot_dog) {
  private val viewModel: HotDogVM by viewModels<HotDogVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val hotDogAdapter = HotDogAdapter(viewModel.hotDogList.value?:mutableListOf())
    binding.recyclerHotDog.adapter = hotDogAdapter
    hotDogAdapter.setOnItemClickListener(
    object : HotDogAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : HotDogRowModel) {
        onClickRecyclerHotDog(view, position, item)
      }
    }
    )
    viewModel.hotDogList.observe(this) {
      hotDogAdapter.updateData(it)
    }
    binding.hotDogVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangle294.setOnClickListener {
      val destIntent = SearchActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerHotDog(
    view: View,
    position: Int,
    item: HotDogRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "HOT_DOG_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HotDogActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

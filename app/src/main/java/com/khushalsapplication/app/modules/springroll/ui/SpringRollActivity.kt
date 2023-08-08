package com.khushalsapplication.app.modules.springroll.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivitySpringRollBinding
import com.khushalsapplication.app.modules.search.ui.SearchActivity
import com.khushalsapplication.app.modules.springroll.`data`.model.SpringRollRowModel
import com.khushalsapplication.app.modules.springroll.`data`.viewmodel.SpringRollVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SpringRollActivity : BaseActivity<ActivitySpringRollBinding>(R.layout.activity_spring_roll) {
  private val viewModel: SpringRollVM by viewModels<SpringRollVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val springRollAdapter = SpringRollAdapter(viewModel.springRollList.value?:mutableListOf())
    binding.recyclerSpringRoll.adapter = springRollAdapter
    springRollAdapter.setOnItemClickListener(
    object : SpringRollAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SpringRollRowModel) {
        onClickRecyclerSpringRoll(view, position, item)
      }
    }
    )
    viewModel.springRollList.observe(this) {
      springRollAdapter.updateData(it)
    }
    binding.springRollVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangle294.setOnClickListener {
      val destIntent = SearchActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerSpringRoll(
    view: View,
    position: Int,
    item: SpringRollRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SPRING_ROLL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SpringRollActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

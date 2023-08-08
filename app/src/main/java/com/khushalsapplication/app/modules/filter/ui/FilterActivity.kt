package com.khushalsapplication.app.modules.filter.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityFilterBinding
import com.khushalsapplication.app.modules.browse.ui.BrowseActivity
import com.khushalsapplication.app.modules.filter.`data`.viewmodel.FilterVM
import kotlin.String
import kotlin.Unit

class FilterActivity : BaseActivity<ActivityFilterBinding>(R.layout.activity_filter) {
  private val viewModel: FilterVM by viewModels<FilterVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.filterVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtCancel.setOnClickListener {
      val destIntent = BrowseActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FILTER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FilterActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

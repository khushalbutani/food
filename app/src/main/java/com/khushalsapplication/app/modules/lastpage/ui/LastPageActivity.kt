package com.khushalsapplication.app.modules.lastpage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityLastPageBinding
import com.khushalsapplication.app.modules.lastpage.`data`.viewmodel.LastPageVM
import kotlin.String
import kotlin.Unit

class LastPageActivity : BaseActivity<ActivityLastPageBinding>(R.layout.activity_last_page) {
  private val viewModel: LastPageVM by viewModels<LastPageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.lastPageVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "LAST_PAGE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LastPageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

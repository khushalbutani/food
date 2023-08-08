package com.khushalsapplication.app.modules.successfullydeleted.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivitySuccessfullyDeletedBinding
import com.khushalsapplication.app.modules.lastpage.ui.LastPageActivity
import com.khushalsapplication.app.modules.successfullydeleted.`data`.viewmodel.SuccessfullyDeletedVM
import kotlin.String
import kotlin.Unit

class SuccessfullyDeletedActivity :
    BaseActivity<ActivitySuccessfullyDeletedBinding>(R.layout.activity_successfully_deleted) {
  private val viewModel: SuccessfullyDeletedVM by viewModels<SuccessfullyDeletedVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.successfullyDeletedVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnOk.setOnClickListener {
      val destIntent = LastPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SUCCESSFULLY_DELETED_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SuccessfullyDeletedActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

package com.khushalsapplication.app.modules.theappisnotworkingproperly.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityTheAppIsNotWorkingProperlyBinding
import com.khushalsapplication.app.modules.continuewithdeletionone.ui.ContinueWithDeletionOneActivity
import com.khushalsapplication.app.modules.deleteaccount.ui.DeleteAccountActivity
import com.khushalsapplication.app.modules.reportissueswiththeapp.ui.ReportIssuesWithTheAppActivity
import com.khushalsapplication.app.modules.theappisnotworkingproperly.`data`.viewmodel.TheAppIsNotWorkingProperlyVM
import kotlin.String
import kotlin.Unit

class TheAppIsNotWorkingProperlyActivity :
    BaseActivity<ActivityTheAppIsNotWorkingProperlyBinding>(R.layout.activity_the_app_is_not_working_properly)
    {
  private val viewModel: TheAppIsNotWorkingProperlyVM by viewModels<TheAppIsNotWorkingProperlyVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.theAppIsNotWorkingProperlyVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangleNinetyFour.setOnClickListener {
      val destIntent = DeleteAccountActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangle274.setOnClickListener {
      val destIntent = ReportIssuesWithTheAppActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangle278.setOnClickListener {
      val destIntent = ContinueWithDeletionOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "THE_APP_IS_NOT_WORKING_PROPERLY_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TheAppIsNotWorkingProperlyActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

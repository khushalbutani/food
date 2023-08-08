package com.khushalsapplication.app.modules.continuewithdeletionone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityContinueWithDeletionOneBinding
import com.khushalsapplication.app.modules.continuewithdeletionone.`data`.viewmodel.ContinueWithDeletionOneVM
import com.khushalsapplication.app.modules.deleteaccount.ui.DeleteAccountActivity
import com.khushalsapplication.app.modules.setting.ui.SettingActivity
import kotlin.String
import kotlin.Unit

class ContinueWithDeletionOneActivity :
    BaseActivity<ActivityContinueWithDeletionOneBinding>(R.layout.activity_continue_with_deletion_one)
    {
  private val viewModel: ContinueWithDeletionOneVM by viewModels<ContinueWithDeletionOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.continueWithDeletionOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtBacktosetting.setOnClickListener {
      val destIntent = DeleteAccountActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleNinetyFour.setOnClickListener {
      val destIntent = SettingActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CONTINUE_WITH_DELETION_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ContinueWithDeletionOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

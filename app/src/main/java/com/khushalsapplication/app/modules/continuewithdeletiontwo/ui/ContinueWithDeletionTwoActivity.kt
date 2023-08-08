package com.khushalsapplication.app.modules.continuewithdeletiontwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityContinueWithDeletionTwoBinding
import com.khushalsapplication.app.modules.continuewithdeletiontwo.`data`.viewmodel.ContinueWithDeletionTwoVM
import com.khushalsapplication.app.modules.deleteaccount.ui.DeleteAccountActivity
import com.khushalsapplication.app.modules.youresendingmetoomanyemailsnotifications.ui.YouReSendingMeTooManyEmailsNotificationsActivity
import kotlin.String
import kotlin.Unit

class ContinueWithDeletionTwoActivity :
    BaseActivity<ActivityContinueWithDeletionTwoBinding>(R.layout.activity_continue_with_deletion_two)
    {
  private val viewModel: ContinueWithDeletionTwoVM by viewModels<ContinueWithDeletionTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.continueWithDeletionTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtBacktosetting.setOnClickListener {
      val destIntent = DeleteAccountActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleNinetyFour.setOnClickListener {
      val destIntent = YouReSendingMeTooManyEmailsNotificationsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CONTINUE_WITH_DELETION_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ContinueWithDeletionTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

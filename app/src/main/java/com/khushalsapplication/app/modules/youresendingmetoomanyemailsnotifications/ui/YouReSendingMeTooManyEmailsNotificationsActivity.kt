package com.khushalsapplication.app.modules.youresendingmetoomanyemailsnotifications.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityYouReSendingMeTooManyEmailsNotificationsBinding
import com.khushalsapplication.app.modules.continuewithdeletiontwo.ui.ContinueWithDeletionTwoActivity
import com.khushalsapplication.app.modules.deleteaccount.ui.DeleteAccountActivity
import com.khushalsapplication.app.modules.editnotificationsettings.ui.EditNotificationSettingsActivity
import com.khushalsapplication.app.modules.youresendingmetoomanyemailsnotifications.`data`.viewmodel.YouReSendingMeTooManyEmailsNotificationsVM
import kotlin.String
import kotlin.Unit

class YouReSendingMeTooManyEmailsNotificationsActivity :
    BaseActivity<ActivityYouReSendingMeTooManyEmailsNotificationsBinding>(R.layout.activity_you_re_sending_me_too_many_emails_notifications)
    {
  private val viewModel: YouReSendingMeTooManyEmailsNotificationsVM by
      viewModels<YouReSendingMeTooManyEmailsNotificationsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.youReSendingMeTooManyEmailsNotificationsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangle278.setOnClickListener {
      val destIntent = ContinueWithDeletionTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangle274.setOnClickListener {
      val destIntent = EditNotificationSettingsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleNinetyFour.setOnClickListener {
      val destIntent = DeleteAccountActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "YOU_RE_SENDING_ME_TOO_MANY_EMAILS_NOTIFICATIONS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, YouReSendingMeTooManyEmailsNotificationsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

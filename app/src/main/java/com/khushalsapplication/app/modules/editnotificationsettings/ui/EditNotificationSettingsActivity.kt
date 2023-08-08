package com.khushalsapplication.app.modules.editnotificationsettings.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityEditNotificationSettingsBinding
import com.khushalsapplication.app.modules.editnotificationsettings.`data`.viewmodel.EditNotificationSettingsVM
import com.khushalsapplication.app.modules.youresendingmetoomanyemailsnotifications.ui.YouReSendingMeTooManyEmailsNotificationsActivity
import kotlin.String
import kotlin.Unit

class EditNotificationSettingsActivity :
    BaseActivity<ActivityEditNotificationSettingsBinding>(R.layout.activity_edit_notification_settings)
    {
  private val viewModel: EditNotificationSettingsVM by viewModels<EditNotificationSettingsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.editNotificationSettingsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtNotificationPr.setOnClickListener {
      val destIntent = YouReSendingMeTooManyEmailsNotificationsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "EDIT_NOTIFICATION_SETTINGS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EditNotificationSettingsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

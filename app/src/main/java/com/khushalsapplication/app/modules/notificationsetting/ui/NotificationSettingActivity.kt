package com.khushalsapplication.app.modules.notificationsetting.ui

import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityNotificationSettingBinding
import com.khushalsapplication.app.modules.notificationsetting.`data`.viewmodel.NotificationSettingVM
import com.khushalsapplication.app.modules.setting.ui.SettingActivity
import kotlin.String
import kotlin.Unit

class NotificationSettingActivity :
    BaseActivity<ActivityNotificationSettingBinding>(R.layout.activity_notification_setting) {
  private val viewModel: NotificationSettingVM by viewModels<NotificationSettingVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.notificationSettingVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangleNinetyFour.setOnClickListener {
      val destIntent = SettingActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "NOTIFICATION_SETTING_ACTIVITY"

  }
}

package com.khushalsapplication.app.modules.notificationsetting.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.notificationsetting.`data`.model.NotificationSettingModel
import org.koin.core.KoinComponent

class NotificationSettingVM : ViewModel(), KoinComponent {
  val notificationSettingModel: MutableLiveData<NotificationSettingModel> =
      MutableLiveData(NotificationSettingModel())

  var navArguments: Bundle? = null
}

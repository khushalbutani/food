package com.khushalsapplication.app.modules.editnotificationsettings.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.editnotificationsettings.`data`.model.EditNotificationSettingsModel
import org.koin.core.KoinComponent

class EditNotificationSettingsVM : ViewModel(), KoinComponent {
  val editNotificationSettingsModel: MutableLiveData<EditNotificationSettingsModel> =
      MutableLiveData(EditNotificationSettingsModel())

  var navArguments: Bundle? = null
}

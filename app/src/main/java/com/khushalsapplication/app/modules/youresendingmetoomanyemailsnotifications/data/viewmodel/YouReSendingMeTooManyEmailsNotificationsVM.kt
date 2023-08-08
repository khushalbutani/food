package com.khushalsapplication.app.modules.youresendingmetoomanyemailsnotifications.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.youresendingmetoomanyemailsnotifications.`data`.model.YouReSendingMeTooManyEmailsNotificationsModel
import org.koin.core.KoinComponent

class YouReSendingMeTooManyEmailsNotificationsVM : ViewModel(), KoinComponent {
  val youReSendingMeTooManyEmailsNotificationsModel:
      MutableLiveData<YouReSendingMeTooManyEmailsNotificationsModel> =
      MutableLiveData(YouReSendingMeTooManyEmailsNotificationsModel())

  var navArguments: Bundle? = null
}

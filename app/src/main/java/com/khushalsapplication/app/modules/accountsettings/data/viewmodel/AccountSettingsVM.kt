package com.khushalsapplication.app.modules.accountsettings.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.accountsettings.`data`.model.AccountSettingsModel
import org.koin.core.KoinComponent

class AccountSettingsVM : ViewModel(), KoinComponent {
  val accountSettingsModel: MutableLiveData<AccountSettingsModel> =
      MutableLiveData(AccountSettingsModel())

  var navArguments: Bundle? = null
}

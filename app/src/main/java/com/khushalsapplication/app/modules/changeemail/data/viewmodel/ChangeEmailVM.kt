package com.khushalsapplication.app.modules.changeemail.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.changeemail.`data`.model.ChangeEmailModel
import org.koin.core.KoinComponent

class ChangeEmailVM : ViewModel(), KoinComponent {
  val changeEmailModel: MutableLiveData<ChangeEmailModel> = MutableLiveData(ChangeEmailModel())

  var navArguments: Bundle? = null
}

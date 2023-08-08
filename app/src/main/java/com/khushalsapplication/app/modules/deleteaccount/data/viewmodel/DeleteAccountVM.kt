package com.khushalsapplication.app.modules.deleteaccount.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.deleteaccount.`data`.model.DeleteAccountModel
import org.koin.core.KoinComponent

class DeleteAccountVM : ViewModel(), KoinComponent {
  val deleteAccountModel: MutableLiveData<DeleteAccountModel> =
      MutableLiveData(DeleteAccountModel())

  var navArguments: Bundle? = null
}

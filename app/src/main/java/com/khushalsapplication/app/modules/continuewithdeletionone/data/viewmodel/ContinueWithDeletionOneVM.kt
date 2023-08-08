package com.khushalsapplication.app.modules.continuewithdeletionone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.continuewithdeletionone.`data`.model.ContinueWithDeletionOneModel
import org.koin.core.KoinComponent

class ContinueWithDeletionOneVM : ViewModel(), KoinComponent {
  val continueWithDeletionOneModel: MutableLiveData<ContinueWithDeletionOneModel> =
      MutableLiveData(ContinueWithDeletionOneModel())

  var navArguments: Bundle? = null
}

package com.khushalsapplication.app.modules.continuewithdeletion.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.continuewithdeletion.`data`.model.ContinueWithDeletionModel
import org.koin.core.KoinComponent

class ContinueWithDeletionVM : ViewModel(), KoinComponent {
  val continueWithDeletionModel: MutableLiveData<ContinueWithDeletionModel> =
      MutableLiveData(ContinueWithDeletionModel())

  var navArguments: Bundle? = null
}

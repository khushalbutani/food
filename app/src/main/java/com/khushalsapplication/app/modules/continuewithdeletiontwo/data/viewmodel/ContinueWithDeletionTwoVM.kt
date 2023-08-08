package com.khushalsapplication.app.modules.continuewithdeletiontwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.continuewithdeletiontwo.`data`.model.ContinueWithDeletionTwoModel
import org.koin.core.KoinComponent

class ContinueWithDeletionTwoVM : ViewModel(), KoinComponent {
  val continueWithDeletionTwoModel: MutableLiveData<ContinueWithDeletionTwoModel> =
      MutableLiveData(ContinueWithDeletionTwoModel())

  var navArguments: Bundle? = null
}

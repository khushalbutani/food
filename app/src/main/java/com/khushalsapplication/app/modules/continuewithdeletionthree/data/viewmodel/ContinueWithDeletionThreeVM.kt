package com.khushalsapplication.app.modules.continuewithdeletionthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.continuewithdeletionthree.`data`.model.ContinueWithDeletionThreeModel
import org.koin.core.KoinComponent

class ContinueWithDeletionThreeVM : ViewModel(), KoinComponent {
  val continueWithDeletionThreeModel: MutableLiveData<ContinueWithDeletionThreeModel> =
      MutableLiveData(ContinueWithDeletionThreeModel())

  var navArguments: Bundle? = null
}

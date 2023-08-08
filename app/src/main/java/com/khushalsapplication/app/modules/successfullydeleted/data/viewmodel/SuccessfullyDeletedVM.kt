package com.khushalsapplication.app.modules.successfullydeleted.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.successfullydeleted.`data`.model.SuccessfullyDeletedModel
import org.koin.core.KoinComponent

class SuccessfullyDeletedVM : ViewModel(), KoinComponent {
  val successfullyDeletedModel: MutableLiveData<SuccessfullyDeletedModel> =
      MutableLiveData(SuccessfullyDeletedModel())

  var navArguments: Bundle? = null
}

package com.khushalsapplication.app.modules.theappisnotworkingproperly.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.theappisnotworkingproperly.`data`.model.TheAppIsNotWorkingProperlyModel
import org.koin.core.KoinComponent

class TheAppIsNotWorkingProperlyVM : ViewModel(), KoinComponent {
  val theAppIsNotWorkingProperlyModel: MutableLiveData<TheAppIsNotWorkingProperlyModel> =
      MutableLiveData(TheAppIsNotWorkingProperlyModel())

  var navArguments: Bundle? = null
}

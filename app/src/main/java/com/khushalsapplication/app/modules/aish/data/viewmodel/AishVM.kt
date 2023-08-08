package com.khushalsapplication.app.modules.aish.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.aish.`data`.model.AishModel
import org.koin.core.KoinComponent

class AishVM : ViewModel(), KoinComponent {
  val aishModel: MutableLiveData<AishModel> = MutableLiveData(AishModel())

  var navArguments: Bundle? = null
}

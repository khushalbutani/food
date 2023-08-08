package com.khushalsapplication.app.modules.starbuks.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.starbuks.`data`.model.StarbuksModel
import org.koin.core.KoinComponent

class StarbuksVM : ViewModel(), KoinComponent {
  val starbuksModel: MutableLiveData<StarbuksModel> = MutableLiveData(StarbuksModel())

  var navArguments: Bundle? = null
}

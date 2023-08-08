package com.khushalsapplication.app.modules.localfood.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.localfood.`data`.model.LocalfoodModel
import org.koin.core.KoinComponent

class LocalfoodVM : ViewModel(), KoinComponent {
  val localfoodModel: MutableLiveData<LocalfoodModel> = MutableLiveData(LocalfoodModel())

  var navArguments: Bundle? = null
}

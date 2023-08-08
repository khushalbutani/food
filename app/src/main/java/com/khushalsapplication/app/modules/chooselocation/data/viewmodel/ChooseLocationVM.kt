package com.khushalsapplication.app.modules.chooselocation.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.chooselocation.`data`.model.ChooseLocationModel
import org.koin.core.KoinComponent

class ChooseLocationVM : ViewModel(), KoinComponent {
  val chooseLocationModel: MutableLiveData<ChooseLocationModel> =
      MutableLiveData(ChooseLocationModel())

  var navArguments: Bundle? = null
}

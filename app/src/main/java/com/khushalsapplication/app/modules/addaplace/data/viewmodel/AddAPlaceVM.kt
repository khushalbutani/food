package com.khushalsapplication.app.modules.addaplace.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.addaplace.`data`.model.AddAPlaceModel
import org.koin.core.KoinComponent

class AddAPlaceVM : ViewModel(), KoinComponent {
  val addAPlaceModel: MutableLiveData<AddAPlaceModel> = MutableLiveData(AddAPlaceModel())

  var navArguments: Bundle? = null
}

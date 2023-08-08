package com.khushalsapplication.app.modules.ballygungeplace.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.ballygungeplace.`data`.model.BallygungePlaceModel
import org.koin.core.KoinComponent

class BallygungePlaceVM : ViewModel(), KoinComponent {
  val ballygungePlaceModel: MutableLiveData<BallygungePlaceModel> =
      MutableLiveData(BallygungePlaceModel())

  var navArguments: Bundle? = null
}

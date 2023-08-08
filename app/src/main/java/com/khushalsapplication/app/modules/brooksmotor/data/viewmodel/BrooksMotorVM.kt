package com.khushalsapplication.app.modules.brooksmotor.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.brooksmotor.`data`.model.BrooksMotorModel
import org.koin.core.KoinComponent

class BrooksMotorVM : ViewModel(), KoinComponent {
  val brooksMotorModel: MutableLiveData<BrooksMotorModel> = MutableLiveData(BrooksMotorModel())

  var navArguments: Bundle? = null
}

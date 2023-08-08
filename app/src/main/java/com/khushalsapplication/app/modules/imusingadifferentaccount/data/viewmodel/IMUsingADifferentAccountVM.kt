package com.khushalsapplication.app.modules.imusingadifferentaccount.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.imusingadifferentaccount.`data`.model.IMUsingADifferentAccountModel
import org.koin.core.KoinComponent

class IMUsingADifferentAccountVM : ViewModel(), KoinComponent {
  val iMUsingADifferentAccountModel: MutableLiveData<IMUsingADifferentAccountModel> =
      MutableLiveData(IMUsingADifferentAccountModel())

  var navArguments: Bundle? = null
}

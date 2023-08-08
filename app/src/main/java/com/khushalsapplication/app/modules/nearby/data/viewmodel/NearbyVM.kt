package com.khushalsapplication.app.modules.nearby.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.nearby.`data`.model.NearbyModel
import org.koin.core.KoinComponent

class NearbyVM : ViewModel(), KoinComponent {
  val nearbyModel: MutableLiveData<NearbyModel> = MutableLiveData(NearbyModel())

  var navArguments: Bundle? = null
}

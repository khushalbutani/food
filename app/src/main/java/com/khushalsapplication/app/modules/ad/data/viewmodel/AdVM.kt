package com.khushalsapplication.app.modules.ad.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.ad.`data`.model.AdModel
import org.koin.core.KoinComponent

class AdVM : ViewModel(), KoinComponent {
  val adModel: MutableLiveData<AdModel> = MutableLiveData(AdModel())

  var navArguments: Bundle? = null
}

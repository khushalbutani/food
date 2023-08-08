package com.khushalsapplication.app.modules.ad1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.ad1.`data`.model.Ad1Model
import org.koin.core.KoinComponent

class Ad1VM : ViewModel(), KoinComponent {
  val ad1Model: MutableLiveData<Ad1Model> = MutableLiveData(Ad1Model())

  var navArguments: Bundle? = null
}

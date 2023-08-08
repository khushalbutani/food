package com.khushalsapplication.app.modules.riverbamboo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.riverbamboo.`data`.model.RiverBambooModel
import org.koin.core.KoinComponent

class RiverBambooVM : ViewModel(), KoinComponent {
  val riverBambooModel: MutableLiveData<RiverBambooModel> = MutableLiveData(RiverBambooModel())

  var navArguments: Bundle? = null
}

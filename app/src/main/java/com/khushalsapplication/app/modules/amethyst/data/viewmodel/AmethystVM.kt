package com.khushalsapplication.app.modules.amethyst.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.amethyst.`data`.model.AmethystModel
import org.koin.core.KoinComponent

class AmethystVM : ViewModel(), KoinComponent {
  val amethystModel: MutableLiveData<AmethystModel> = MutableLiveData(AmethystModel())

  var navArguments: Bundle? = null
}

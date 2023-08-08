package com.khushalsapplication.app.modules.theembassy.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.theembassy.`data`.model.TheEmbassyModel
import org.koin.core.KoinComponent

class TheEmbassyVM : ViewModel(), KoinComponent {
  val theEmbassyModel: MutableLiveData<TheEmbassyModel> = MutableLiveData(TheEmbassyModel())

  var navArguments: Bundle? = null
}

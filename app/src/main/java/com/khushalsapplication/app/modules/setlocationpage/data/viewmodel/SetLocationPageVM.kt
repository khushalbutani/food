package com.khushalsapplication.app.modules.setlocationpage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.setlocationpage.`data`.model.SetLocationPageModel
import org.koin.core.KoinComponent

class SetLocationPageVM : ViewModel(), KoinComponent {
  val setLocationPageModel: MutableLiveData<SetLocationPageModel> =
      MutableLiveData(SetLocationPageModel())

  var navArguments: Bundle? = null
}

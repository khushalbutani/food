package com.khushalsapplication.app.modules.other.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.other.`data`.model.OtherModel
import org.koin.core.KoinComponent

class OtherVM : ViewModel(), KoinComponent {
  val otherModel: MutableLiveData<OtherModel> = MutableLiveData(OtherModel())

  var navArguments: Bundle? = null
}

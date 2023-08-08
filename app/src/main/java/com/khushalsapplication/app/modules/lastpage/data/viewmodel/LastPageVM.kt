package com.khushalsapplication.app.modules.lastpage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.lastpage.`data`.model.LastPageModel
import org.koin.core.KoinComponent

class LastPageVM : ViewModel(), KoinComponent {
  val lastPageModel: MutableLiveData<LastPageModel> = MutableLiveData(LastPageModel())

  var navArguments: Bundle? = null
}

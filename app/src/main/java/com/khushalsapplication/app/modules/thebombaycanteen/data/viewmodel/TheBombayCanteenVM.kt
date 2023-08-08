package com.khushalsapplication.app.modules.thebombaycanteen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.thebombaycanteen.`data`.model.TheBombayCanteenModel
import org.koin.core.KoinComponent

class TheBombayCanteenVM : ViewModel(), KoinComponent {
  val theBombayCanteenModel: MutableLiveData<TheBombayCanteenModel> =
      MutableLiveData(TheBombayCanteenModel())

  var navArguments: Bundle? = null
}

package com.khushalsapplication.app.modules.checkout.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.checkout.`data`.model.CheckOutModel
import org.koin.core.KoinComponent

class CheckOutVM : ViewModel(), KoinComponent {
  val checkOutModel: MutableLiveData<CheckOutModel> = MutableLiveData(CheckOutModel())

  var navArguments: Bundle? = null
}

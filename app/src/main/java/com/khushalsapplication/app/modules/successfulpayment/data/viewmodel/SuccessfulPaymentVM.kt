package com.khushalsapplication.app.modules.successfulpayment.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.successfulpayment.`data`.model.SuccessfulPaymentModel
import org.koin.core.KoinComponent

class SuccessfulPaymentVM : ViewModel(), KoinComponent {
  val successfulPaymentModel: MutableLiveData<SuccessfulPaymentModel> =
      MutableLiveData(SuccessfulPaymentModel())

  var navArguments: Bundle? = null
}

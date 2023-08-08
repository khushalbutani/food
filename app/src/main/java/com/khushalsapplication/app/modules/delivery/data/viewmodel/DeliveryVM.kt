package com.khushalsapplication.app.modules.delivery.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.delivery.`data`.model.DeliveryModel
import com.khushalsapplication.app.modules.delivery.`data`.model.DeliveryRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class DeliveryVM : ViewModel(), KoinComponent {
  val deliveryModel: MutableLiveData<DeliveryModel> = MutableLiveData(DeliveryModel())

  var navArguments: Bundle? = null

  val deliveryList: MutableLiveData<MutableList<DeliveryRowModel>> =
      MutableLiveData(mutableListOf())
}

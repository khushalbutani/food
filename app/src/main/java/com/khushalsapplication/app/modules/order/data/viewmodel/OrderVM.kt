package com.khushalsapplication.app.modules.order.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.order.`data`.model.OrderModel
import org.koin.core.KoinComponent

class OrderVM : ViewModel(), KoinComponent {
  val orderModel: MutableLiveData<OrderModel> = MutableLiveData(OrderModel())

  var navArguments: Bundle? = null
}

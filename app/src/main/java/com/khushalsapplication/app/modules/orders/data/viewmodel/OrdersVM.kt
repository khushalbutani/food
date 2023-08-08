package com.khushalsapplication.app.modules.orders.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.orders.`data`.model.OrdersModel
import com.khushalsapplication.app.modules.orders.`data`.model.OrdersRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class OrdersVM : ViewModel(), KoinComponent {
  val ordersModel: MutableLiveData<OrdersModel> = MutableLiveData(OrdersModel())

  var navArguments: Bundle? = null

  val ordersList: MutableLiveData<MutableList<OrdersRowModel>> = MutableLiveData(mutableListOf())
}

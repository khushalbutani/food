package com.khushalsapplication.app.modules.pizza.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.pizza.`data`.model.PizzaModel
import com.khushalsapplication.app.modules.pizza.`data`.model.PizzaRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PizzaVM : ViewModel(), KoinComponent {
  val pizzaModel: MutableLiveData<PizzaModel> = MutableLiveData(PizzaModel())

  var navArguments: Bundle? = null

  val pizzaList: MutableLiveData<MutableList<PizzaRowModel>> = MutableLiveData(mutableListOf())
}

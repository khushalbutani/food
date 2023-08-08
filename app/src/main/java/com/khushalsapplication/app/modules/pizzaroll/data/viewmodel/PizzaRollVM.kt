package com.khushalsapplication.app.modules.pizzaroll.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.pizzaroll.`data`.model.PizzaRollModel
import com.khushalsapplication.app.modules.pizzaroll.`data`.model.PizzaRollRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PizzaRollVM : ViewModel(), KoinComponent {
  val pizzaRollModel: MutableLiveData<PizzaRollModel> = MutableLiveData(PizzaRollModel())

  var navArguments: Bundle? = null

  val pizzaRollList: MutableLiveData<MutableList<PizzaRollRowModel>> =
      MutableLiveData(mutableListOf())
}

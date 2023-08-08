package com.khushalsapplication.app.modules.onioncheese.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.onioncheese.`data`.model.OnionCheeseModel
import com.khushalsapplication.app.modules.onioncheese.`data`.model.OnionCheeseRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class OnionCheeseVM : ViewModel(), KoinComponent {
  val onionCheeseModel: MutableLiveData<OnionCheeseModel> = MutableLiveData(OnionCheeseModel())

  var navArguments: Bundle? = null

  val onionCheeseList: MutableLiveData<MutableList<OnionCheeseRowModel>> =
      MutableLiveData(mutableListOf())
}

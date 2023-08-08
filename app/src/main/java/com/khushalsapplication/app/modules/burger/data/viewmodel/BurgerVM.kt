package com.khushalsapplication.app.modules.burger.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.burger.`data`.model.BurgerModel
import com.khushalsapplication.app.modules.burger.`data`.model.BurgerRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class BurgerVM : ViewModel(), KoinComponent {
  val burgerModel: MutableLiveData<BurgerModel> = MutableLiveData(BurgerModel())

  var navArguments: Bundle? = null

  val burgerList: MutableLiveData<MutableList<BurgerRowModel>> = MutableLiveData(mutableListOf())
}

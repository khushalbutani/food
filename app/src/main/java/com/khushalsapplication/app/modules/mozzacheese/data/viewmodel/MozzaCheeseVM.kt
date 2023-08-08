package com.khushalsapplication.app.modules.mozzacheese.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.mozzacheese.`data`.model.MozzaCheeseModel
import com.khushalsapplication.app.modules.mozzacheese.`data`.model.MozzaCheeseRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MozzaCheeseVM : ViewModel(), KoinComponent {
  val mozzaCheeseModel: MutableLiveData<MozzaCheeseModel> = MutableLiveData(MozzaCheeseModel())

  var navArguments: Bundle? = null

  val mozzaCheeseList: MutableLiveData<MutableList<MozzaCheeseRowModel>> =
      MutableLiveData(mutableListOf())
}

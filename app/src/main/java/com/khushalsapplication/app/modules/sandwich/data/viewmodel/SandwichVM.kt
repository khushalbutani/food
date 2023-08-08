package com.khushalsapplication.app.modules.sandwich.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.sandwich.`data`.model.SandwichModel
import com.khushalsapplication.app.modules.sandwich.`data`.model.SandwichRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SandwichVM : ViewModel(), KoinComponent {
  val sandwichModel: MutableLiveData<SandwichModel> = MutableLiveData(SandwichModel())

  var navArguments: Bundle? = null

  val sandwichList: MutableLiveData<MutableList<SandwichRowModel>> =
      MutableLiveData(mutableListOf())
}

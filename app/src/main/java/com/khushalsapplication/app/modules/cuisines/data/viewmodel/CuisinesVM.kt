package com.khushalsapplication.app.modules.cuisines.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.cuisines.`data`.model.CuisinesModel
import com.khushalsapplication.app.modules.cuisines.`data`.model.CuisinesRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CuisinesVM : ViewModel(), KoinComponent {
  val cuisinesModel: MutableLiveData<CuisinesModel> = MutableLiveData(CuisinesModel())

  var navArguments: Bundle? = null

  val cuisinesList: MutableLiveData<MutableList<CuisinesRowModel>> =
      MutableLiveData(mutableListOf())
}

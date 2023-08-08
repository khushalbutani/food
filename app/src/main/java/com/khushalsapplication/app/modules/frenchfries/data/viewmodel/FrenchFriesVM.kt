package com.khushalsapplication.app.modules.frenchfries.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.frenchfries.`data`.model.FrenchFriesModel
import com.khushalsapplication.app.modules.frenchfries.`data`.model.FrenchFriesRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class FrenchFriesVM : ViewModel(), KoinComponent {
  val frenchFriesModel: MutableLiveData<FrenchFriesModel> = MutableLiveData(FrenchFriesModel())

  var navArguments: Bundle? = null

  val frenchFriesList: MutableLiveData<MutableList<FrenchFriesRowModel>> =
      MutableLiveData(mutableListOf())
}

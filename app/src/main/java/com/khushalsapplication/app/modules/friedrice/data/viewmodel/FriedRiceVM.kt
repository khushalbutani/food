package com.khushalsapplication.app.modules.friedrice.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.friedrice.`data`.model.FriedRiceModel
import com.khushalsapplication.app.modules.friedrice.`data`.model.FriedRiceRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class FriedRiceVM : ViewModel(), KoinComponent {
  val friedRiceModel: MutableLiveData<FriedRiceModel> = MutableLiveData(FriedRiceModel())

  var navArguments: Bundle? = null

  val friedRiceList: MutableLiveData<MutableList<FriedRiceRowModel>> =
      MutableLiveData(mutableListOf())
}

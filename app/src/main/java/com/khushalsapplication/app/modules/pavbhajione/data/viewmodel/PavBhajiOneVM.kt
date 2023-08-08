package com.khushalsapplication.app.modules.pavbhajione.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.pavbhajione.`data`.model.PavBhajiOneModel
import com.khushalsapplication.app.modules.pavbhajione.`data`.model.PavBhajiOneRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PavBhajiOneVM : ViewModel(), KoinComponent {
  val pavBhajiOneModel: MutableLiveData<PavBhajiOneModel> = MutableLiveData(PavBhajiOneModel())

  var navArguments: Bundle? = null

  val pavBhajiOneList: MutableLiveData<MutableList<PavBhajiOneRowModel>> =
      MutableLiveData(mutableListOf())
}

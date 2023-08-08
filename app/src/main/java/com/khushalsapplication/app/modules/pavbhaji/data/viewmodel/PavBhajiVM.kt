package com.khushalsapplication.app.modules.pavbhaji.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.pavbhaji.`data`.model.PavBhajiModel
import com.khushalsapplication.app.modules.pavbhaji.`data`.model.PavBhajiRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PavBhajiVM : ViewModel(), KoinComponent {
  val pavBhajiModel: MutableLiveData<PavBhajiModel> = MutableLiveData(PavBhajiModel())

  var navArguments: Bundle? = null

  val pavBhajiList: MutableLiveData<MutableList<PavBhajiRowModel>> =
      MutableLiveData(mutableListOf())
}

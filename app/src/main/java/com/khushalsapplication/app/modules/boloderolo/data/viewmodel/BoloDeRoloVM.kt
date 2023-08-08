package com.khushalsapplication.app.modules.boloderolo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.boloderolo.`data`.model.BoloDeRoloModel
import com.khushalsapplication.app.modules.boloderolo.`data`.model.BoloDeRoloRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class BoloDeRoloVM : ViewModel(), KoinComponent {
  val boloDeRoloModel: MutableLiveData<BoloDeRoloModel> = MutableLiveData(BoloDeRoloModel())

  var navArguments: Bundle? = null

  val boloDeRoloList: MutableLiveData<MutableList<BoloDeRoloRowModel>> =
      MutableLiveData(mutableListOf())
}

package com.khushalsapplication.app.modules.sliders.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.sliders.`data`.model.SlidersModel
import com.khushalsapplication.app.modules.sliders.`data`.model.SlidersRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SlidersVM : ViewModel(), KoinComponent {
  val slidersModel: MutableLiveData<SlidersModel> = MutableLiveData(SlidersModel())

  var navArguments: Bundle? = null

  val slidersList: MutableLiveData<MutableList<SlidersRowModel>> = MutableLiveData(mutableListOf())
}

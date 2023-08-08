package com.khushalsapplication.app.modules.spicysalad.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.spicysalad.`data`.model.SpicySaladModel
import com.khushalsapplication.app.modules.spicysalad.`data`.model.SpicySaladRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SpicySaladVM : ViewModel(), KoinComponent {
  val spicySaladModel: MutableLiveData<SpicySaladModel> = MutableLiveData(SpicySaladModel())

  var navArguments: Bundle? = null

  val spicySaladList: MutableLiveData<MutableList<SpicySaladRowModel>> =
      MutableLiveData(mutableListOf())
}

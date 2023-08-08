package com.khushalsapplication.app.modules.satay.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.satay.`data`.model.SatayModel
import com.khushalsapplication.app.modules.satay.`data`.model.SatayRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SatayVM : ViewModel(), KoinComponent {
  val satayModel: MutableLiveData<SatayModel> = MutableLiveData(SatayModel())

  var navArguments: Bundle? = null

  val satayList: MutableLiveData<MutableList<SatayRowModel>> = MutableLiveData(mutableListOf())
}

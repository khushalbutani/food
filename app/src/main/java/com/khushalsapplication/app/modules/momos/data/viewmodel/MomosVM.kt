package com.khushalsapplication.app.modules.momos.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.momos.`data`.model.MomosModel
import com.khushalsapplication.app.modules.momos.`data`.model.MomosRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MomosVM : ViewModel(), KoinComponent {
  val momosModel: MutableLiveData<MomosModel> = MutableLiveData(MomosModel())

  var navArguments: Bundle? = null

  val momosList: MutableLiveData<MutableList<MomosRowModel>> = MutableLiveData(mutableListOf())
}

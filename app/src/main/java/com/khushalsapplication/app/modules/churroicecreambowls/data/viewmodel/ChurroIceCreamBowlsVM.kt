package com.khushalsapplication.app.modules.churroicecreambowls.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.churroicecreambowls.`data`.model.ChurroIceCreamBowlsModel
import com.khushalsapplication.app.modules.churroicecreambowls.`data`.model.Listprotein10RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ChurroIceCreamBowlsVM : ViewModel(), KoinComponent {
  val churroIceCreamBowlsModel: MutableLiveData<ChurroIceCreamBowlsModel> =
      MutableLiveData(ChurroIceCreamBowlsModel())

  var navArguments: Bundle? = null

  val listproteinList: MutableLiveData<MutableList<Listprotein10RowModel>> =
      MutableLiveData(mutableListOf())
}

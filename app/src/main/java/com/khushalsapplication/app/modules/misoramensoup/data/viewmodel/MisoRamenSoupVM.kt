package com.khushalsapplication.app.modules.misoramensoup.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.misoramensoup.`data`.model.Listprotein5RowModel
import com.khushalsapplication.app.modules.misoramensoup.`data`.model.MisoRamenSoupModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MisoRamenSoupVM : ViewModel(), KoinComponent {
  val misoRamenSoupModel: MutableLiveData<MisoRamenSoupModel> =
      MutableLiveData(MisoRamenSoupModel())

  var navArguments: Bundle? = null

  val listproteinList: MutableLiveData<MutableList<Listprotein5RowModel>> =
      MutableLiveData(mutableListOf())
}

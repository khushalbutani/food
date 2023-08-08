package com.khushalsapplication.app.modules.currynoodlesoup.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.currynoodlesoup.`data`.model.CurryNoodleSoupModel
import com.khushalsapplication.app.modules.currynoodlesoup.`data`.model.Listprotein8RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CurryNoodleSoupVM : ViewModel(), KoinComponent {
  val curryNoodleSoupModel: MutableLiveData<CurryNoodleSoupModel> =
      MutableLiveData(CurryNoodleSoupModel())

  var navArguments: Bundle? = null

  val listproteinList: MutableLiveData<MutableList<Listprotein8RowModel>> =
      MutableLiveData(mutableListOf())
}

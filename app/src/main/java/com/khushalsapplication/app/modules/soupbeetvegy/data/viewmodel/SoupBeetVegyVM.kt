package com.khushalsapplication.app.modules.soupbeetvegy.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.soupbeetvegy.`data`.model.ListproteinRowModel
import com.khushalsapplication.app.modules.soupbeetvegy.`data`.model.SoupBeetVegyModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SoupBeetVegyVM : ViewModel(), KoinComponent {
  val soupBeetVegyModel: MutableLiveData<SoupBeetVegyModel> = MutableLiveData(SoupBeetVegyModel())

  var navArguments: Bundle? = null

  val listproteinList: MutableLiveData<MutableList<ListproteinRowModel>> =
      MutableLiveData(mutableListOf())
}

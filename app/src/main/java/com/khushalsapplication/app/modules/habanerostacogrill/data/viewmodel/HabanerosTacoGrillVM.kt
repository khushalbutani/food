package com.khushalsapplication.app.modules.habanerostacogrill.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.habanerostacogrill.`data`.model.HabanerosTacoGrillModel
import com.khushalsapplication.app.modules.habanerostacogrill.`data`.model.Listprotein7RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HabanerosTacoGrillVM : ViewModel(), KoinComponent {
  val habanerosTacoGrillModel: MutableLiveData<HabanerosTacoGrillModel> =
      MutableLiveData(HabanerosTacoGrillModel())

  var navArguments: Bundle? = null

  val listproteinList: MutableLiveData<MutableList<Listprotein7RowModel>> =
      MutableLiveData(mutableListOf())
}

package com.khushalsapplication.app.modules.muttonkeemasamosa.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.muttonkeemasamosa.`data`.model.Listprotein9RowModel
import com.khushalsapplication.app.modules.muttonkeemasamosa.`data`.model.MuttonKeemaSamosaModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MuttonKeemaSamosaVM : ViewModel(), KoinComponent {
  val muttonKeemaSamosaModel: MutableLiveData<MuttonKeemaSamosaModel> =
      MutableLiveData(MuttonKeemaSamosaModel())

  var navArguments: Bundle? = null

  val listproteinList: MutableLiveData<MutableList<Listprotein9RowModel>> =
      MutableLiveData(mutableListOf())
}

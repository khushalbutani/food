package com.khushalsapplication.app.modules.penanglaksa.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.penanglaksa.`data`.model.PenangLaksaModel
import com.khushalsapplication.app.modules.penanglaksa.`data`.model.PenangLaksaRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PenangLaksaVM : ViewModel(), KoinComponent {
  val penangLaksaModel: MutableLiveData<PenangLaksaModel> = MutableLiveData(PenangLaksaModel())

  var navArguments: Bundle? = null

  val penangLaksaList: MutableLiveData<MutableList<PenangLaksaRowModel>> =
      MutableLiveData(mutableListOf())
}

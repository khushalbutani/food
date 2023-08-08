package com.khushalsapplication.app.modules.natillareceta.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.natillareceta.`data`.model.NatillaRecetaModel
import com.khushalsapplication.app.modules.natillareceta.`data`.model.NatillaRecetaRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class NatillaRecetaVM : ViewModel(), KoinComponent {
  val natillaRecetaModel: MutableLiveData<NatillaRecetaModel> =
      MutableLiveData(NatillaRecetaModel())

  var navArguments: Bundle? = null

  val natillaRecetaList: MutableLiveData<MutableList<NatillaRecetaRowModel>> =
      MutableLiveData(mutableListOf())
}

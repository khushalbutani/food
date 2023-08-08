package com.khushalsapplication.app.modules.muffintinminiquiche.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.muffintinminiquiche.`data`.model.Listprotein3RowModel
import com.khushalsapplication.app.modules.muffintinminiquiche.`data`.model.MuffinTinMiniQuicheModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MuffinTinMiniQuicheVM : ViewModel(), KoinComponent {
  val muffinTinMiniQuicheModel: MutableLiveData<MuffinTinMiniQuicheModel> =
      MutableLiveData(MuffinTinMiniQuicheModel())

  var navArguments: Bundle? = null

  val listproteinList: MutableLiveData<MutableList<Listprotein3RowModel>> =
      MutableLiveData(mutableListOf())
}

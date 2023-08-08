package com.khushalsapplication.app.modules.cinnamonrollbunnies.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.cinnamonrollbunnies.`data`.model.CinnamonRollBunniesModel
import com.khushalsapplication.app.modules.cinnamonrollbunnies.`data`.model.Listprotein2RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CinnamonRollBunniesVM : ViewModel(), KoinComponent {
  val cinnamonRollBunniesModel: MutableLiveData<CinnamonRollBunniesModel> =
      MutableLiveData(CinnamonRollBunniesModel())

  var navArguments: Bundle? = null

  val listproteinList: MutableLiveData<MutableList<Listprotein2RowModel>> =
      MutableLiveData(mutableListOf())
}

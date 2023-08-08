package com.khushalsapplication.app.modules.spain.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.spain.`data`.model.SpainModel
import com.khushalsapplication.app.modules.spain.`data`.model.SpainRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SpainVM : ViewModel(), KoinComponent {
  val spainModel: MutableLiveData<SpainModel> = MutableLiveData(SpainModel())

  var navArguments: Bundle? = null

  val spainList: MutableLiveData<MutableList<SpainRowModel>> = MutableLiveData(mutableListOf())
}

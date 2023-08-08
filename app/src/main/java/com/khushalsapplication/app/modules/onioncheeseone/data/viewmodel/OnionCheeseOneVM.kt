package com.khushalsapplication.app.modules.onioncheeseone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.onioncheeseone.`data`.model.Listprotein6RowModel
import com.khushalsapplication.app.modules.onioncheeseone.`data`.model.OnionCheeseOneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class OnionCheeseOneVM : ViewModel(), KoinComponent {
  val onionCheeseOneModel: MutableLiveData<OnionCheeseOneModel> =
      MutableLiveData(OnionCheeseOneModel())

  var navArguments: Bundle? = null

  val listproteinList: MutableLiveData<MutableList<Listprotein6RowModel>> =
      MutableLiveData(mutableListOf())
}

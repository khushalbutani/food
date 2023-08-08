package com.khushalsapplication.app.modules.italian.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.italian.`data`.model.ItalianModel
import com.khushalsapplication.app.modules.italian.`data`.model.ItalianRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ItalianVM : ViewModel(), KoinComponent {
  val italianModel: MutableLiveData<ItalianModel> = MutableLiveData(ItalianModel())

  var navArguments: Bundle? = null

  val italianList: MutableLiveData<MutableList<ItalianRowModel>> = MutableLiveData(mutableListOf())
}

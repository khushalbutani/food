package com.khushalsapplication.app.modules.mexican.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.mexican.`data`.model.MexicanModel
import com.khushalsapplication.app.modules.mexican.`data`.model.MexicanRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MexicanVM : ViewModel(), KoinComponent {
  val mexicanModel: MutableLiveData<MexicanModel> = MutableLiveData(MexicanModel())

  var navArguments: Bundle? = null

  val mexicanList: MutableLiveData<MutableList<MexicanRowModel>> = MutableLiveData(mutableListOf())
}

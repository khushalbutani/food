package com.khushalsapplication.app.modules.kimchi.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.kimchi.`data`.model.KimchiModel
import com.khushalsapplication.app.modules.kimchi.`data`.model.KimchiRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class KimchiVM : ViewModel(), KoinComponent {
  val kimchiModel: MutableLiveData<KimchiModel> = MutableLiveData(KimchiModel())

  var navArguments: Bundle? = null

  val kimchiList: MutableLiveData<MutableList<KimchiRowModel>> = MutableLiveData(mutableListOf())
}

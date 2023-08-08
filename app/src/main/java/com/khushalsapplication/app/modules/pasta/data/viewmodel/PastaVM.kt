package com.khushalsapplication.app.modules.pasta.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.pasta.`data`.model.PastaModel
import com.khushalsapplication.app.modules.pasta.`data`.model.PastaRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PastaVM : ViewModel(), KoinComponent {
  val pastaModel: MutableLiveData<PastaModel> = MutableLiveData(PastaModel())

  var navArguments: Bundle? = null

  val pastaList: MutableLiveData<MutableList<PastaRowModel>> = MutableLiveData(mutableListOf())
}

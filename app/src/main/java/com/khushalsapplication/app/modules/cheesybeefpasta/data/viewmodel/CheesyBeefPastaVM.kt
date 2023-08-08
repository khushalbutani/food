package com.khushalsapplication.app.modules.cheesybeefpasta.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.cheesybeefpasta.`data`.model.CheesyBeefPastaModel
import com.khushalsapplication.app.modules.cheesybeefpasta.`data`.model.Listprotein1RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CheesyBeefPastaVM : ViewModel(), KoinComponent {
  val cheesyBeefPastaModel: MutableLiveData<CheesyBeefPastaModel> =
      MutableLiveData(CheesyBeefPastaModel())

  var navArguments: Bundle? = null

  val listproteinList: MutableLiveData<MutableList<Listprotein1RowModel>> =
      MutableLiveData(mutableListOf())
}

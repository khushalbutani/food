package com.khushalsapplication.app.modules.japanese.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.japanese.`data`.model.JapaneseModel
import com.khushalsapplication.app.modules.japanese.`data`.model.JapaneseRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class JapaneseVM : ViewModel(), KoinComponent {
  val japaneseModel: MutableLiveData<JapaneseModel> = MutableLiveData(JapaneseModel())

  var navArguments: Bundle? = null

  val japaneseList: MutableLiveData<MutableList<JapaneseRowModel>> =
      MutableLiveData(mutableListOf())
}

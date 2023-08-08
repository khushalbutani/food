package com.khushalsapplication.app.modules.korean.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.korean.`data`.model.KoreanModel
import com.khushalsapplication.app.modules.korean.`data`.model.KoreanRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class KoreanVM : ViewModel(), KoinComponent {
  val koreanModel: MutableLiveData<KoreanModel> = MutableLiveData(KoreanModel())

  var navArguments: Bundle? = null

  val koreanList: MutableLiveData<MutableList<KoreanRowModel>> = MutableLiveData(mutableListOf())
}

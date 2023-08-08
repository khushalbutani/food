package com.khushalsapplication.app.modules.trendingthisweek.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.trendingthisweek.`data`.model.Listrectangle151RowModel
import com.khushalsapplication.app.modules.trendingthisweek.`data`.model.TrendingThisWeekModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class TrendingThisWeekVM : ViewModel(), KoinComponent {
  val trendingThisWeekModel: MutableLiveData<TrendingThisWeekModel> =
      MutableLiveData(TrendingThisWeekModel())

  var navArguments: Bundle? = null

  val listrectangle151List: MutableLiveData<MutableList<Listrectangle151RowModel>> =
      MutableLiveData(mutableListOf())
}

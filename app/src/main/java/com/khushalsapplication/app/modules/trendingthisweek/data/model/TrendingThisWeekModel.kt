package com.khushalsapplication.app.modules.trendingthisweek.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class TrendingThisWeekModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTrendingthisw: String? =
      MyApp.getInstance().resources.getString(R.string.msg_trending_this_w)

)

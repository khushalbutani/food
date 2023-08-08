package com.khushalsapplication.app.modules.japanese.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class JapaneseModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFilter: String? = MyApp.getInstance().resources.getString(R.string.lbl_filter)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_japanese)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRestaurantsCounter: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_84_restaurants)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFeatured: String? = MyApp.getInstance().resources.getString(R.string.lbl_featured)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSushiToday: String? = MyApp.getInstance().resources.getString(R.string.lbl_sushi_today)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSushijapanF: String? = MyApp.getInstance().resources.getString(R.string.msg_sushi_japan_f)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.msg_order_from_1500)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForty: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_0)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAllRestaurants: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_all_restaurants)

)

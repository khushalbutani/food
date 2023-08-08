package com.khushalsapplication.app.modules.mexican.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MexicanModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFilter: String? = MyApp.getInstance().resources.getString(R.string.lbl_filter)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMexican: String? = MyApp.getInstance().resources.getString(R.string.lbl_mexican)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRestaurantsCounter: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_38_restaurants)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFeatured: String? = MyApp.getInstance().resources.getString(R.string.lbl_featured)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMexicanToday: String? = MyApp.getInstance().resources.getString(R.string.lbl_mexican_today)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTacosMexican: String? = MyApp.getInstance().resources.getString(R.string.msg_tacos_mexican)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.msg_order_from_150r)
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

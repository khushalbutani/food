package com.khushalsapplication.app.modules.indian.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class IndianModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFilter: String? = MyApp.getInstance().resources.getString(R.string.lbl_filter)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIndian: String? = MyApp.getInstance().resources.getString(R.string.lbl_indian)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRestaurantsCounter: String? =
      MyApp.getInstance().resources.getString(R.string.msg_1562_restaurant)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFeatured: String? = MyApp.getInstance().resources.getString(R.string.lbl_featured)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIndianToday: String? = MyApp.getInstance().resources.getString(R.string.lbl_indian_today)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGulabjamun: String? = MyApp.getInstance().resources.getString(R.string.lbl_gulab_jamun)
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

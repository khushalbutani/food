package com.khushalsapplication.app.modules.singapore.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SingaporeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFilter: String? = MyApp.getInstance().resources.getString(R.string.lbl_filter)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountry: String? = MyApp.getInstance().resources.getString(R.string.lbl_singapore)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRestaurantsCounter: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_78_restaurants)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFeatured: String? = MyApp.getInstance().resources.getString(R.string.lbl_featured)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountryOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_singapore_today)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeeknightchick: String? =
      MyApp.getInstance().resources.getString(R.string.msg_weeknight_chick)
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

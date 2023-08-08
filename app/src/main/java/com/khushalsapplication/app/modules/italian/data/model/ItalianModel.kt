package com.khushalsapplication.app.modules.italian.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ItalianModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFilter: String? = MyApp.getInstance().resources.getString(R.string.lbl_filter)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_italian)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRestaurantsCounter: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_358_restaurants)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFeatured: String? = MyApp.getInstance().resources.getString(R.string.lbl_featured)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_authentic_itali)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSpaghettiItal: String? =
      MyApp.getInstance().resources.getString(R.string.msg_spaghetti_ital)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.msg_order_from_1500)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThirtyTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAllRestaurants: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_all_restaurants)

)

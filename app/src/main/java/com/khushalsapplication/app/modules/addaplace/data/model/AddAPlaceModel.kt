package com.khushalsapplication.app.modules.addaplace.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AddAPlaceModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAddaPlace: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_a_place)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterRestauran: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_restauran)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRestaurantName: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_restaurant_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOneHundredEight: String? = MyApp.getInstance().resources.getString(R.string.lbl6)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup314: String? = MyApp.getInstance().resources.getString(R.string.msg_restaurant_s_ph)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSelectlocation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_select_location)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOneHundredNine: String? = MyApp.getInstance().resources.getString(R.string.lbl6)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAreyoutheown: String? =
      MyApp.getInstance().resources.getString(R.string.msg_are_you_the_own)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAdditionalRequ: String? =
      MyApp.getInstance().resources.getString(R.string.msg_additional_requ)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_is_there_any_mo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddaboutther: String? =
      MyApp.getInstance().resources.getString(R.string.msg_add_about_the_r)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFieldsmarked: String? = MyApp.getInstance().resources.getString(R.string.msg_fields_marked)

)

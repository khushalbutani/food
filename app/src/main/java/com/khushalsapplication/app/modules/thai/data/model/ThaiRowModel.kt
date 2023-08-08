package com.khushalsapplication.app.modules.thai.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ThaiRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCurrynoodleso: String? =
      MyApp.getInstance().resources.getString(R.string.msg_curry_noodle_so)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFortyNine: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_9)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_thai_s_classic)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeOne: String? = MyApp.getInstance().resources.getString(R.string.msg_order_from_500r)

)

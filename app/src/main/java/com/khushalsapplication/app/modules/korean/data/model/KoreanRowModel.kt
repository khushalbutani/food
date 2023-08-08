package com.khushalsapplication.app.modules.korean.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class KoreanRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtKimchi: String? = MyApp.getInstance().resources.getString(R.string.lbl_kimchi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFortyNine: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_9)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtClassicalcabba: String? =
      MyApp.getInstance().resources.getString(R.string.msg_classical_cabba)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeOne: String? = MyApp.getInstance().resources.getString(R.string.msg_order_from_200r)

)

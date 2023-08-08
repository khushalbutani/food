package com.khushalsapplication.app.modules.mexican.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MexicanRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHabanerosTaco: String? =
      MyApp.getInstance().resources.getString(R.string.msg_habaneros_taco)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFortyNine: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_9)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_mexico_s_classi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeOne: String? = MyApp.getInstance().resources.getString(R.string.msg_order_from_500r)

)

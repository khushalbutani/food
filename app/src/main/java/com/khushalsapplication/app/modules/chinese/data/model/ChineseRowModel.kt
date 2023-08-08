package com.khushalsapplication.app.modules.chinese.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ChineseRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtChowMein: String? = MyApp.getInstance().resources.getString(R.string.lbl_chow_mein)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFortyNine: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_9)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_chinese_s_class)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeOne: String? = MyApp.getInstance().resources.getString(R.string.msg_order_from_200r)

)

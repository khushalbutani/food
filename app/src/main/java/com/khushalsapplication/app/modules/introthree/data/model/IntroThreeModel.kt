package com.khushalsapplication.app.modules.introthree.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class IntroThreeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSkip: String? = MyApp.getInstance().resources.getString(R.string.lbl_skip)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_order_from_the)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_order_with_easy)

)

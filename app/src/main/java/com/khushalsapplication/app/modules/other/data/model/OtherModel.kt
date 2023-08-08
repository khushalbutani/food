package com.khushalsapplication.app.modules.other.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class OtherModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNext: String? = MyApp.getInstance().resources.getString(R.string.lbl_next)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_anything_else_y)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_do_you_have_any)

)

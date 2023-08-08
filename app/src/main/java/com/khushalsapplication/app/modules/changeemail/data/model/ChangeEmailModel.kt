package com.khushalsapplication.app.modules.changeemail.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ChangeEmailModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtChangeemail: String? = MyApp.getInstance().resources.getString(R.string.lbl_change_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_to_change_your)

)

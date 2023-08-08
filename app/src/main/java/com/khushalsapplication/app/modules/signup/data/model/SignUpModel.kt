package com.khushalsapplication.app.modules.signup.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SignUpModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcomeuser: String? = MyApp.getInstance().resources.getString(R.string.lbl_welcome_user)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignuptojoin: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_sign_up_to_join)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup151: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup150: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtByclickingsig: String? =
      MyApp.getInstance().resources.getString(R.string.msg_by_clicking_sig)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_have_an_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup152Value: String? = null
)

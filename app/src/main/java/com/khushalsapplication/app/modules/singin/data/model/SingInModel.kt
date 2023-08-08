package com.khushalsapplication.app.modules.singin.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SingInModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcomeback: String? = MyApp.getInstance().resources.getString(R.string.lbl_welcome_back)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignintocont: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_in_to_cont)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForgotpassword: String? =
      MyApp.getInstance().resources.getString(R.string.msg_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSigninwithFa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_in_with_fa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_don_t_have_an_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupThirtyFourValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupThirtyFiveValue: String? = null
)

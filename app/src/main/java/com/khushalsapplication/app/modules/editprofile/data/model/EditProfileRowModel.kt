package com.khushalsapplication.app.modules.editprofile.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class EditProfileRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPhoneNumber: String? = MyApp.getInstance().resources.getString(R.string.lbl_phone_number)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNinetyOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_91)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAdd: String? = MyApp.getInstance().resources.getString(R.string.lbl_add)

)

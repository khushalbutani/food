package com.khushalsapplication.app.modules.editprofile.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class EditProfileModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCompleteYourP: String? =
      MyApp.getInstance().resources.getString(R.string.msg_complete_your_p)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChangePhoto: String? = MyApp.getInstance().resources.getString(R.string.lbl_change_photo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtName: String? = MyApp.getInstance().resources.getString(R.string.lbl_name2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPinkyPatel: String? = MyApp.getInstance().resources.getString(R.string.lbl_pinky_patel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBirthday: String? = MyApp.getInstance().resources.getString(R.string.lbl_birthday)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDdmmyyyy: String? = MyApp.getInstance().resources.getString(R.string.lbl_dd_mm_yyyy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGender: String? = MyApp.getInstance().resources.getString(R.string.lbl_gender)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChooseyourgen: String? =
      MyApp.getInstance().resources.getString(R.string.msg_choose_your_gen)

)

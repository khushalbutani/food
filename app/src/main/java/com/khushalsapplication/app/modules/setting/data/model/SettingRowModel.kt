package com.khushalsapplication.app.modules.setting.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SettingRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtProfilephoto: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile_photo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_change_your_nam)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEditprofile: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit_profile)

)

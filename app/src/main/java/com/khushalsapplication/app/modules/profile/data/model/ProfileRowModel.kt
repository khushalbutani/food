package com.khushalsapplication.app.modules.profile.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMyHome: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_95_kelampok_kas)

)

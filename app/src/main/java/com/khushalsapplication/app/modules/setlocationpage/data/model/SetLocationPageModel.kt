package com.khushalsapplication.app.modules.setlocationpage.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SetLocationPageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHinicetomee: String? = MyApp.getInstance().resources.getString(R.string.msg_hi_nice_to_mee)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSetyourlocati: String? =
      MyApp.getInstance().resources.getString(R.string.msg_set_your_locati)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUsecurrentloc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_use_current_loc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeonlyaccess: String? =
      MyApp.getInstance().resources.getString(R.string.msg_we_only_access)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrsetyourloc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_or_set_your_loc)

)

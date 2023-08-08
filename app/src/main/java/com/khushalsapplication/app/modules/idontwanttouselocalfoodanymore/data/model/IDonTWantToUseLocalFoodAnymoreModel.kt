package com.khushalsapplication.app.modules.idontwanttouselocalfoodanymore.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class IDonTWantToUseLocalFoodAnymoreModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNext: String? = MyApp.getInstance().resources.getString(R.string.lbl_next)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIdontwantto: String? =
      MyApp.getInstance().resources.getString(R.string.msg_i_don_t_want_to2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_do_you_have_any)

)

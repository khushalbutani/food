package com.khushalsapplication.app.modules.reportissueswiththeapp.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ReportIssuesWithTheAppModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSendFeedback: String? = MyApp.getInstance().resources.getString(R.string.lbl_send_feedback)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tell_us_what_yo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup384: String? = MyApp.getInstance().resources.getString(R.string.lbl_enter_feedback)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNeedhelpwith: String? =
      MyApp.getInstance().resources.getString(R.string.msg_need_help_with)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGetinstanthel: String? =
      MyApp.getInstance().resources.getString(R.string.msg_get_instant_hel)

)

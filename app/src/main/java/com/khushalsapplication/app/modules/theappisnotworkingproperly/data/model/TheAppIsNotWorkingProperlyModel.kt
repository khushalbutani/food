package com.khushalsapplication.app.modules.theappisnotworkingproperly.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class TheAppIsNotWorkingProperlyModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFacingissuesw: String? =
      MyApp.getInstance().resources.getString(R.string.msg_facing_issues_w)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_feel_free_tp_re)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReportissuesw: String? =
      MyApp.getInstance().resources.getString(R.string.msg_report_issues_w)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWouldyourathe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_would_you_rathe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_continue_with_d)

)

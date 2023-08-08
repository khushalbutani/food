package com.khushalsapplication.app.modules.notifications.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class NotificationsRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPlanninghelps: String? =
      MyApp.getInstance().resources.getString(R.string.msg_planning_helps)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtManypeopleund: String? =
      MyApp.getInstance().resources.getString(R.string.msg_many_people_und)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_23_mins_ago)

)

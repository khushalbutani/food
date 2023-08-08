package com.khushalsapplication.app.modules.youresendingmetoomanyemailsnotifications.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class YouReSendingMeTooManyEmailsNotificationsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtToomanycommun: String? =
      MyApp.getInstance().resources.getString(R.string.msg_too_many_commun)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_to_receive_fewe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEditnotificati: String? =
      MyApp.getInstance().resources.getString(R.string.msg_edit_notificati)
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

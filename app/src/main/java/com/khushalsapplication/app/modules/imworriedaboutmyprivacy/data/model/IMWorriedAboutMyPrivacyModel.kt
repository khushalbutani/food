package com.khushalsapplication.app.modules.imworriedaboutmyprivacy.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class IMWorriedAboutMyPrivacyModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPrivacyconcern: String? =
      MyApp.getInstance().resources.getString(R.string.msg_privacy_concern)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_if_you_re_worri)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContactLocalfo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_contact_localfo)
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

package com.khushalsapplication.app.modules.continuewithdeletiontwo.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ContinueWithDeletionTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtYoureaboutto: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_re_about_to)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_all_the_data_as)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBacktosetting: String? =
      MyApp.getInstance().resources.getString(R.string.msg_back_to_setting)

)

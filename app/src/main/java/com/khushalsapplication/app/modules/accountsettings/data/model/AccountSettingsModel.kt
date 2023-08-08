package com.khushalsapplication.app.modules.accountsettings.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AccountSettingsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup355: String? = MyApp.getInstance().resources.getString(R.string.msg_account_setting2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChangeemail: String? = MyApp.getInstance().resources.getString(R.string.lbl_change_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDeleteaccount: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_delete_account)

)

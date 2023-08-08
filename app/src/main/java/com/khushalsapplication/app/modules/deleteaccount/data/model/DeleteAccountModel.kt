package com.khushalsapplication.app.modules.deleteaccount.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DeleteAccountModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDeleteaccount: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_delete_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWhywouldyoul: String? =
      MyApp.getInstance().resources.getString(R.string.msg_why_would_you_l)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIdontwantto: String? =
      MyApp.getInstance().resources.getString(R.string.msg_i_don_t_want_to)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_i_m_using_a_dif)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_i_m_worried_abo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYouresending: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_re_sending)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTheappisnot: String? = MyApp.getInstance().resources.getString(R.string.msg_the_app_is_not)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOther: String? = MyApp.getInstance().resources.getString(R.string.lbl_other)

)

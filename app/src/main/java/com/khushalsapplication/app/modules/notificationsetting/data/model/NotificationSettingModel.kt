package com.khushalsapplication.app.modules.notificationsetting.`data`.model

import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class NotificationSettingModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNotificationPr: String? =
      MyApp.getInstance().resources.getString(R.string.msg_notification_pr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnableall: String? = MyApp.getInstance().resources.getString(R.string.lbl_enable_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_activate_all_no)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_receive_newslet)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWhatsbrewingi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_whats_brewing_i)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNewsletters: String? = MyApp.getInstance().resources.getString(R.string.lbl_newsletters)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPromosandoffe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_promos_and_offe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_receive_updates)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAndmoneysavin: String? =
      MyApp.getInstance().resources.getString(R.string.msg_and_money_savin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmailOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPush: String? = MyApp.getInstance().resources.getString(R.string.lbl_push)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmailTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSocialnotifica: String? =
      MyApp.getInstance().resources.getString(R.string.msg_social_notifica)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_get_notified_wh)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPushOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_push)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_receive_updates2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmailThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrdersandpurc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_orders_and_purc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPushTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_push)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtImportantupdat: String? =
      MyApp.getInstance().resources.getString(R.string.msg_important_updat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReceiveimporta: String? =
      MyApp.getInstance().resources.getString(R.string.msg_receive_importa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmailFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)

)

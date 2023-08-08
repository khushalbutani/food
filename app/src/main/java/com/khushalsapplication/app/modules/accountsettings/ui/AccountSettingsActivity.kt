package com.khushalsapplication.app.modules.accountsettings.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityAccountSettingsBinding
import com.khushalsapplication.app.modules.accountsettings.`data`.viewmodel.AccountSettingsVM
import com.khushalsapplication.app.modules.changeemail.ui.ChangeEmailActivity
import com.khushalsapplication.app.modules.deleteaccount.ui.DeleteAccountActivity
import com.khushalsapplication.app.modules.setting.ui.SettingActivity
import kotlin.String
import kotlin.Unit

class AccountSettingsActivity :
    BaseActivity<ActivityAccountSettingsBinding>(R.layout.activity_account_settings) {
  private val viewModel: AccountSettingsVM by viewModels<AccountSettingsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.accountSettingsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangleNinetyFour.setOnClickListener {
      val destIntent = SettingActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangle273.setOnClickListener {
      val destIntent = ChangeEmailActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangle274.setOnClickListener {
      val destIntent = DeleteAccountActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ACCOUNT_SETTINGS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AccountSettingsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

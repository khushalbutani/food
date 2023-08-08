package com.khushalsapplication.app.modules.changeemail.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityChangeEmailBinding
import com.khushalsapplication.app.modules.accountsettings.ui.AccountSettingsActivity
import com.khushalsapplication.app.modules.changeemail.`data`.viewmodel.ChangeEmailVM
import kotlin.String
import kotlin.Unit

class ChangeEmailActivity : BaseActivity<ActivityChangeEmailBinding>(R.layout.activity_change_email)
    {
  private val viewModel: ChangeEmailVM by viewModels<ChangeEmailVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.changeEmailVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangleNinetyFour.setOnClickListener {
      val destIntent = AccountSettingsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CHANGE_EMAIL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ChangeEmailActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

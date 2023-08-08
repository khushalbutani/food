package com.khushalsapplication.app.modules.deleteaccount.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityDeleteAccountBinding
import com.khushalsapplication.app.modules.accountsettings.ui.AccountSettingsActivity
import com.khushalsapplication.app.modules.deleteaccount.`data`.viewmodel.DeleteAccountVM
import com.khushalsapplication.app.modules.idontwanttouselocalfoodanymore.ui.IDonTWantToUseLocalFoodAnymoreActivity
import com.khushalsapplication.app.modules.imusingadifferentaccount.ui.IMUsingADifferentAccountActivity
import com.khushalsapplication.app.modules.imworriedaboutmyprivacy.ui.IMWorriedAboutMyPrivacyActivity
import com.khushalsapplication.app.modules.other.ui.OtherActivity
import com.khushalsapplication.app.modules.theappisnotworkingproperly.ui.TheAppIsNotWorkingProperlyActivity
import com.khushalsapplication.app.modules.youresendingmetoomanyemailsnotifications.ui.YouReSendingMeTooManyEmailsNotificationsActivity
import kotlin.String
import kotlin.Unit

class DeleteAccountActivity :
    BaseActivity<ActivityDeleteAccountBinding>(R.layout.activity_delete_account) {
  private val viewModel: DeleteAccountVM by viewModels<DeleteAccountVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.deleteAccountVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangle273.setOnClickListener {
      val destIntent = IDonTWantToUseLocalFoodAnymoreActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangle274.setOnClickListener {
      val destIntent = IMUsingADifferentAccountActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangle281.setOnClickListener {
      val destIntent = TheAppIsNotWorkingProperlyActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleNinetyFour.setOnClickListener {
      val destIntent = AccountSettingsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangle282.setOnClickListener {
      val destIntent = OtherActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangle277.setOnClickListener {
      val destIntent = IMWorriedAboutMyPrivacyActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangle278.setOnClickListener {
      val destIntent = YouReSendingMeTooManyEmailsNotificationsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "DELETE_ACCOUNT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DeleteAccountActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

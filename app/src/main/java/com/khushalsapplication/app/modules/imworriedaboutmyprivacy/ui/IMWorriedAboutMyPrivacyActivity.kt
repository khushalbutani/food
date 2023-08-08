package com.khushalsapplication.app.modules.imworriedaboutmyprivacy.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityIMWorriedAboutMyPrivacyBinding
import com.khushalsapplication.app.modules.contactlocalfoodsupport.ui.ContactLocalfoodSupportActivity
import com.khushalsapplication.app.modules.continuewithdeletion.ui.ContinueWithDeletionActivity
import com.khushalsapplication.app.modules.imworriedaboutmyprivacy.`data`.viewmodel.IMWorriedAboutMyPrivacyVM
import com.khushalsapplication.app.modules.setting.ui.SettingActivity
import kotlin.String
import kotlin.Unit

class IMWorriedAboutMyPrivacyActivity :
    BaseActivity<ActivityIMWorriedAboutMyPrivacyBinding>(R.layout.activity_i_m_worried_about_my_privacy)
    {
  private val viewModel: IMWorriedAboutMyPrivacyVM by viewModels<IMWorriedAboutMyPrivacyVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iMWorriedAboutMyPrivacyVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangle274.setOnClickListener {
      val destIntent = ContactLocalfoodSupportActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangle278.setOnClickListener {
      val destIntent = ContinueWithDeletionActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleNinetyFour.setOnClickListener {
      val destIntent = SettingActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "I_M_WORRIED_ABOUT_MY_PRIVACY_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, IMWorriedAboutMyPrivacyActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

package com.khushalsapplication.app.modules.contactlocalfoodsupport.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityContactLocalfoodSupportBinding
import com.khushalsapplication.app.modules.contactlocalfoodsupport.`data`.viewmodel.ContactLocalfoodSupportVM
import com.khushalsapplication.app.modules.imworriedaboutmyprivacy.ui.IMWorriedAboutMyPrivacyActivity
import kotlin.String
import kotlin.Unit

class ContactLocalfoodSupportActivity :
    BaseActivity<ActivityContactLocalfoodSupportBinding>(R.layout.activity_contact_localfood_support)
    {
  private val viewModel: ContactLocalfoodSupportVM by viewModels<ContactLocalfoodSupportVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.contactLocalfoodSupportVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangleNinetyFour.setOnClickListener {
      val destIntent = IMWorriedAboutMyPrivacyActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CONTACT_LOCALFOOD_SUPPORT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ContactLocalfoodSupportActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

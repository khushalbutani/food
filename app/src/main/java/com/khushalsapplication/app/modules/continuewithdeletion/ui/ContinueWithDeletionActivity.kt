package com.khushalsapplication.app.modules.continuewithdeletion.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityContinueWithDeletionBinding
import com.khushalsapplication.app.modules.continuewithdeletion.`data`.viewmodel.ContinueWithDeletionVM
import com.khushalsapplication.app.modules.deleteaccount.ui.DeleteAccountActivity
import com.khushalsapplication.app.modules.imworriedaboutmyprivacy.ui.IMWorriedAboutMyPrivacyActivity
import kotlin.String
import kotlin.Unit

class ContinueWithDeletionActivity :
    BaseActivity<ActivityContinueWithDeletionBinding>(R.layout.activity_continue_with_deletion) {
  private val viewModel: ContinueWithDeletionVM by viewModels<ContinueWithDeletionVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.continueWithDeletionVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangleNinetyFour.setOnClickListener {
      val destIntent = IMWorriedAboutMyPrivacyActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtBacktosetting.setOnClickListener {
      val destIntent = DeleteAccountActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CONTINUE_WITH_DELETION_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ContinueWithDeletionActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

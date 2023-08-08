package com.khushalsapplication.app.modules.other.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityOtherBinding
import com.khushalsapplication.app.modules.continuewithdeletionthree.ui.ContinueWithDeletionThreeActivity
import com.khushalsapplication.app.modules.other.`data`.viewmodel.OtherVM
import kotlin.String
import kotlin.Unit

class OtherActivity : BaseActivity<ActivityOtherBinding>(R.layout.activity_other) {
  private val viewModel: OtherVM by viewModels<OtherVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.otherVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtNext.setOnClickListener {
      val destIntent = ContinueWithDeletionThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "OTHER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OtherActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

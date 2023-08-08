package com.khushalsapplication.app.modules.continuewithdeletionthree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityContinueWithDeletionThreeBinding
import com.khushalsapplication.app.modules.continuewithdeletionthree.`data`.viewmodel.ContinueWithDeletionThreeVM
import com.khushalsapplication.app.modules.deleteaccount.ui.DeleteAccountActivity
import kotlin.String
import kotlin.Unit

class ContinueWithDeletionThreeActivity :
    BaseActivity<ActivityContinueWithDeletionThreeBinding>(R.layout.activity_continue_with_deletion_three)
    {
  private val viewModel: ContinueWithDeletionThreeVM by viewModels<ContinueWithDeletionThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.continueWithDeletionThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtBacktosetting.setOnClickListener {
      val destIntent = DeleteAccountActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CONTINUE_WITH_DELETION_THREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ContinueWithDeletionThreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

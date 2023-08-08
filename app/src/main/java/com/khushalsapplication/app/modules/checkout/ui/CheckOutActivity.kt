package com.khushalsapplication.app.modules.checkout.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityCheckOutBinding
import com.khushalsapplication.app.modules.checkout.`data`.viewmodel.CheckOutVM
import com.khushalsapplication.app.modules.order.ui.OrderActivity
import kotlin.String
import kotlin.Unit

class CheckOutActivity : BaseActivity<ActivityCheckOutBinding>(R.layout.activity_check_out) {
  private val viewModel: CheckOutVM by viewModels<CheckOutVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.checkOutVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangleNinetyFour.setOnClickListener {
      val destIntent = OrderActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CHECK_OUT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CheckOutActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

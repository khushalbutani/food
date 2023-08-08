package com.khushalsapplication.app.modules.order.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityOrderBinding
import com.khushalsapplication.app.modules.checkout.ui.CheckOutActivity
import com.khushalsapplication.app.modules.order.`data`.viewmodel.OrderVM
import kotlin.String
import kotlin.Unit

class OrderActivity : BaseActivity<ActivityOrderBinding>(R.layout.activity_order) {
  private val viewModel: OrderVM by viewModels<OrderVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.orderVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnCheckout.setOnClickListener {
      val destIntent = CheckOutActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ORDER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OrderActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

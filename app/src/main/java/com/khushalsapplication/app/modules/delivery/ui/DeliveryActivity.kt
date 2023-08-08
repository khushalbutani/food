package com.khushalsapplication.app.modules.delivery.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityDeliveryBinding
import com.khushalsapplication.app.modules.browse.ui.BrowseActivity
import com.khushalsapplication.app.modules.delivery.`data`.model.DeliveryRowModel
import com.khushalsapplication.app.modules.delivery.`data`.viewmodel.DeliveryVM
import com.khushalsapplication.app.modules.favorites.ui.FavoritesActivity
import com.khushalsapplication.app.modules.notifications.ui.NotificationsActivity
import com.khushalsapplication.app.modules.profile.ui.ProfileActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class DeliveryActivity : BaseActivity<ActivityDeliveryBinding>(R.layout.activity_delivery) {
  private val viewModel: DeliveryVM by viewModels<DeliveryVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val deliveryAdapter = DeliveryAdapter(viewModel.deliveryList.value?:mutableListOf())
    binding.recyclerDelivery.adapter = deliveryAdapter
    deliveryAdapter.setOnItemClickListener(
    object : DeliveryAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : DeliveryRowModel) {
        onClickRecyclerDelivery(view, position, item)
      }
    }
    )
    viewModel.deliveryList.observe(this) {
      deliveryAdapter.updateData(it)
    }
    binding.deliveryVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangle143.setOnClickListener {
      val destIntent = FavoritesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleThirtyEight.setOnClickListener {
      val destIntent = BrowseActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleNinetyFour.setOnClickListener {
      val destIntent = BrowseActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleSeventySix.setOnClickListener {
      val destIntent = ProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleFortyOne.setOnClickListener {
      val destIntent = NotificationsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerDelivery(
    view: View,
    position: Int,
    item: DeliveryRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "DELIVERY_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DeliveryActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

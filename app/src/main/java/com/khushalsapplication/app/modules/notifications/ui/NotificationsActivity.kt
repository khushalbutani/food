package com.khushalsapplication.app.modules.notifications.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityNotificationsBinding
import com.khushalsapplication.app.modules.browse.ui.BrowseActivity
import com.khushalsapplication.app.modules.favorites.ui.FavoritesActivity
import com.khushalsapplication.app.modules.notifications.`data`.model.NotificationsRowModel
import com.khushalsapplication.app.modules.notifications.`data`.viewmodel.NotificationsVM
import com.khushalsapplication.app.modules.orders.ui.OrdersActivity
import com.khushalsapplication.app.modules.profile.ui.ProfileActivity
import com.khushalsapplication.app.modules.search.ui.SearchActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class NotificationsActivity :
    BaseActivity<ActivityNotificationsBinding>(R.layout.activity_notifications) {
  private val viewModel: NotificationsVM by viewModels<NotificationsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val notificationsAdapter =
    NotificationsAdapter(viewModel.notificationsList.value?:mutableListOf())
    binding.recyclerNotifications.adapter = notificationsAdapter
    notificationsAdapter.setOnItemClickListener(
    object : NotificationsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : NotificationsRowModel) {
        onClickRecyclerNotifications(view, position, item)
      }
    }
    )
    viewModel.notificationsList.observe(this) {
      notificationsAdapter.updateData(it)
    }
    binding.notificationsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangleSeventySix.setOnClickListener {
      val destIntent = ProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleFortyThree.setOnClickListener {
      val destIntent = SearchActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleForty.setOnClickListener {
      val destIntent = FavoritesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleThirtyEight.setOnClickListener {
      val destIntent = BrowseActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleThirtyNine.setOnClickListener {
      val destIntent = OrdersActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerNotifications(
    view: View,
    position: Int,
    item: NotificationsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "NOTIFICATIONS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NotificationsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

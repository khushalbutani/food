package com.khushalsapplication.app.modules.orders.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityOrdersBinding
import com.khushalsapplication.app.modules.browse.ui.BrowseActivity
import com.khushalsapplication.app.modules.favorites.ui.FavoritesActivity
import com.khushalsapplication.app.modules.filter.ui.FilterActivity
import com.khushalsapplication.app.modules.notifications.ui.NotificationsActivity
import com.khushalsapplication.app.modules.orders.`data`.model.OrdersRowModel
import com.khushalsapplication.app.modules.orders.`data`.viewmodel.OrdersVM
import com.khushalsapplication.app.modules.profile.ui.ProfileActivity
import com.khushalsapplication.app.modules.search.ui.SearchActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class OrdersActivity : BaseActivity<ActivityOrdersBinding>(R.layout.activity_orders) {
  private val viewModel: OrdersVM by viewModels<OrdersVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val ordersAdapter = OrdersAdapter(viewModel.ordersList.value?:mutableListOf())
    binding.recyclerOrders.adapter = ordersAdapter
    ordersAdapter.setOnItemClickListener(
    object : OrdersAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : OrdersRowModel) {
        onClickRecyclerOrders(view, position, item)
      }
    }
    )
    viewModel.ordersList.observe(this) {
      ordersAdapter.updateData(it)
    }
    binding.ordersVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtFilter.setOnClickListener {
      val destIntent = FilterActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangle134.setOnClickListener {
      val destIntent = SearchActivity.getIntent(this, null)
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
    binding.imageRectangle143.setOnClickListener {
      val destIntent = FavoritesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleThirtyEight.setOnClickListener {
      val destIntent = BrowseActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerOrders(
    view: View,
    position: Int,
    item: OrdersRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ORDERS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OrdersActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

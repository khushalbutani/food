package com.khushalsapplication.app.modules.favorites.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityFavoritesBinding
import com.khushalsapplication.app.modules.browse.ui.BrowseActivity
import com.khushalsapplication.app.modules.favorites.`data`.model.FavoritesRowModel
import com.khushalsapplication.app.modules.favorites.`data`.viewmodel.FavoritesVM
import com.khushalsapplication.app.modules.notifications.ui.NotificationsActivity
import com.khushalsapplication.app.modules.orders.ui.OrdersActivity
import com.khushalsapplication.app.modules.profile.ui.ProfileActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class FavoritesActivity : BaseActivity<ActivityFavoritesBinding>(R.layout.activity_favorites) {
  private val viewModel: FavoritesVM by viewModels<FavoritesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val favoritesAdapter = FavoritesAdapter(viewModel.favoritesList.value?:mutableListOf())
    binding.recyclerFavorites.adapter = favoritesAdapter
    favoritesAdapter.setOnItemClickListener(
    object : FavoritesAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : FavoritesRowModel) {
        onClickRecyclerFavorites(view, position, item)
      }
    }
    )
    viewModel.favoritesList.observe(this) {
      favoritesAdapter.updateData(it)
    }
    binding.favoritesVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangleThirtyNine.setOnClickListener {
      val destIntent = OrdersActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleThirtyEight.setOnClickListener {
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

  fun onClickRecyclerFavorites(
    view: View,
    position: Int,
    item: FavoritesRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "FAVORITES_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FavoritesActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

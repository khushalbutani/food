package com.khushalsapplication.app.modules.profile.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityProfileBinding
import com.khushalsapplication.app.modules.browse.ui.BrowseActivity
import com.khushalsapplication.app.modules.favorites.ui.FavoritesActivity
import com.khushalsapplication.app.modules.notifications.ui.NotificationsActivity
import com.khushalsapplication.app.modules.orders.ui.OrdersActivity
import com.khushalsapplication.app.modules.profile.`data`.model.ProfileRowModel
import com.khushalsapplication.app.modules.profile.`data`.viewmodel.ProfileVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ProfileActivity : BaseActivity<ActivityProfileBinding>(R.layout.activity_profile) {
  private val viewModel: ProfileVM by viewModels<ProfileVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val profileAdapter = ProfileAdapter(viewModel.profileList.value?:mutableListOf())
    binding.recyclerProfile.adapter = profileAdapter
    profileAdapter.setOnItemClickListener(
    object : ProfileAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ProfileRowModel) {
        onClickRecyclerProfile(view, position, item)
      }
    }
    )
    viewModel.profileList.observe(this) {
      profileAdapter.updateData(it)
    }
    binding.profileVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangleThirtyEightOne.setOnClickListener {
      val destIntent = BrowseActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleThirtyNineOne.setOnClickListener {
      val destIntent = OrdersActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleFortyOne1.setOnClickListener {
      val destIntent = FavoritesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleFortyOneOne.setOnClickListener {
      val destIntent = NotificationsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerProfile(
    view: View,
    position: Int,
    item: ProfileRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PROFILE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProfileActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

package com.khushalsapplication.app.modules.clubsandwich.ui

import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityClubSandwichBinding
import com.khushalsapplication.app.modules.clubsandwich.`data`.model.ClubSandwichRowModel
import com.khushalsapplication.app.modules.clubsandwich.`data`.viewmodel.ClubSandwichVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ClubSandwichActivity :
    BaseActivity<ActivityClubSandwichBinding>(R.layout.activity_club_sandwich) {
  private val viewModel: ClubSandwichVM by viewModels<ClubSandwichVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val clubSandwichAdapter =
    ClubSandwichAdapter(viewModel.clubSandwichList.value?:mutableListOf())
    binding.recyclerClubSandwich.adapter = clubSandwichAdapter
    clubSandwichAdapter.setOnItemClickListener(
    object : ClubSandwichAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ClubSandwichRowModel) {
        onClickRecyclerClubSandwich(view, position, item)
      }
    }
    )
    viewModel.clubSandwichList.observe(this) {
      clubSandwichAdapter.updateData(it)
    }
    binding.clubSandwichVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerClubSandwich(
    view: View,
    position: Int,
    item: ClubSandwichRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CLUB_SANDWICH_ACTIVITY"

  }
}

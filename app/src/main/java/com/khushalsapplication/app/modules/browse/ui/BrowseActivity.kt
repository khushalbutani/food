package com.khushalsapplication.app.modules.browse.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityBrowseBinding
import com.khushalsapplication.app.modules.browse.`data`.model.ListbigdoubleRowModel
import com.khushalsapplication.app.modules.browse.`data`.model.ListlanguageRowModel
import com.khushalsapplication.app.modules.browse.`data`.model.Listrectangle173RowModel
import com.khushalsapplication.app.modules.browse.`data`.model.ListriverbambooRowModel
import com.khushalsapplication.app.modules.browse.`data`.viewmodel.BrowseVM
import com.khushalsapplication.app.modules.collections.ui.CollectionsActivity
import com.khushalsapplication.app.modules.cuisines.ui.CuisinesActivity
import com.khushalsapplication.app.modules.delivery.ui.DeliveryActivity
import com.khushalsapplication.app.modules.favorites.ui.FavoritesActivity
import com.khushalsapplication.app.modules.notifications.ui.NotificationsActivity
import com.khushalsapplication.app.modules.orders.ui.OrdersActivity
import com.khushalsapplication.app.modules.profile.ui.ProfileActivity
import com.khushalsapplication.app.modules.search.ui.SearchActivity
import com.khushalsapplication.app.modules.trendingthisweek.ui.TrendingThisWeekActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class BrowseActivity : BaseActivity<ActivityBrowseBinding>(R.layout.activity_browse) {
  private val viewModel: BrowseVM by viewModels<BrowseVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listlanguageAdapter =
    ListlanguageAdapter(viewModel.listlanguageList.value?:mutableListOf())
    binding.recyclerListlanguage.adapter = listlanguageAdapter
    listlanguageAdapter.setOnItemClickListener(
    object : ListlanguageAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListlanguageRowModel) {
        onClickRecyclerListlanguage(view, position, item)
      }
    }
    )
    viewModel.listlanguageList.observe(this) {
      listlanguageAdapter.updateData(it)
    }
    val listriverbambooAdapter =
    ListriverbambooAdapter(viewModel.listriverbambooList.value?:mutableListOf())
    binding.recyclerListriverbamboo.adapter = listriverbambooAdapter
    listriverbambooAdapter.setOnItemClickListener(
    object : ListriverbambooAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListriverbambooRowModel) {
        onClickRecyclerListriverbamboo(view, position, item)
      }
    }
    )
    viewModel.listriverbambooList.observe(this) {
      listriverbambooAdapter.updateData(it)
    }
    val listrectangle173Adapter =
    Listrectangle173Adapter(viewModel.listrectangle173List.value?:mutableListOf())
    binding.recyclerListrectangle173.adapter = listrectangle173Adapter
    listrectangle173Adapter.setOnItemClickListener(
    object : Listrectangle173Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listrectangle173RowModel) {
        onClickRecyclerListrectangle173(view, position, item)
      }
    }
    )
    viewModel.listrectangle173List.observe(this) {
      listrectangle173Adapter.updateData(it)
    }
    val listbigdoubleAdapter =
    ListbigdoubleAdapter(viewModel.listbigdoubleList.value?:mutableListOf())
    binding.recyclerListbigdouble.adapter = listbigdoubleAdapter
    listbigdoubleAdapter.setOnItemClickListener(
    object : ListbigdoubleAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListbigdoubleRowModel) {
        onClickRecyclerListbigdouble(view, position, item)
      }
    }
    )
    viewModel.listbigdoubleList.observe(this) {
      listbigdoubleAdapter.updateData(it)
    }
    binding.browseVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtSeeAllOne.setOnClickListener {
      val destIntent = TrendingThisWeekActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangle150.setOnClickListener {
      val destIntent = TrendingThisWeekActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtSeeAllFour.setOnClickListener {
      val destIntent = DeliveryActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtSeeAllThree.setOnClickListener {
      val destIntent = CollectionsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangle176.setOnClickListener {
      val destIntent = DeliveryActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangle172.setOnClickListener {
      val destIntent = CollectionsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtSearch.setOnClickListener {
      val destIntent = SearchActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleFortyOne.setOnClickListener {
      val destIntent = NotificationsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleSeventySix.setOnClickListener {
      val destIntent = ProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtSeeAll.setOnClickListener {
      val destIntent = CuisinesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangle147.setOnClickListener {
      val destIntent = CuisinesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleThirtyNine.setOnClickListener {
      val destIntent = OrdersActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleForty.setOnClickListener {
      val destIntent = FavoritesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListlanguage(
    view: View,
    position: Int,
    item: ListlanguageRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListriverbamboo(
    view: View,
    position: Int,
    item: ListriverbambooRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListrectangle173(
    view: View,
    position: Int,
    item: Listrectangle173RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListbigdouble(
    view: View,
    position: Int,
    item: ListbigdoubleRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "BROWSE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, BrowseActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

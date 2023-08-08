package com.khushalsapplication.app.modules.trendingthisweek.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityTrendingThisWeekBinding
import com.khushalsapplication.app.modules.browse.ui.BrowseActivity
import com.khushalsapplication.app.modules.cheesybeefpasta.ui.CheesyBeefPastaActivity
import com.khushalsapplication.app.modules.cinnamonrollbunnies.ui.CinnamonRollBunniesActivity
import com.khushalsapplication.app.modules.focaccia.ui.FocacciaActivity
import com.khushalsapplication.app.modules.misoramensoup.ui.MisoRamenSoupActivity
import com.khushalsapplication.app.modules.mozzacheese.ui.MozzaCheeseActivity
import com.khushalsapplication.app.modules.muffintinminiquiche.ui.MuffinTinMiniQuicheActivity
import com.khushalsapplication.app.modules.onioncheese.ui.OnionCheeseActivity
import com.khushalsapplication.app.modules.penanglaksa.ui.PenangLaksaActivity
import com.khushalsapplication.app.modules.pizzaroll.ui.PizzaRollActivity
import com.khushalsapplication.app.modules.sliders.ui.SlidersActivity
import com.khushalsapplication.app.modules.soupbeetvegy.ui.SoupBeetVegyActivity
import com.khushalsapplication.app.modules.trendingthisweek.`data`.model.Listrectangle151RowModel
import com.khushalsapplication.app.modules.trendingthisweek.`data`.viewmodel.TrendingThisWeekVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class TrendingThisWeekActivity :
    BaseActivity<ActivityTrendingThisWeekBinding>(R.layout.activity_trending_this_week) {
  private val viewModel: TrendingThisWeekVM by viewModels<TrendingThisWeekVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listrectangle151Adapter =
    Listrectangle151Adapter(viewModel.listrectangle151List.value?:mutableListOf())
    binding.recyclerListrectangle151.adapter = listrectangle151Adapter
    listrectangle151Adapter.setOnItemClickListener(
    object : Listrectangle151Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listrectangle151RowModel) {
        onClickRecyclerListrectangle151(view, position, item)
      }
    }
    )
    viewModel.listrectangle151List.observe(this) {
      listrectangle151Adapter.updateData(it)
    }
    binding.trendingThisWeekVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangleNinetyFour.setOnClickListener {
      val destIntent = BrowseActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListrectangle151(
    view: View,
    position: Int,
    item: Listrectangle151RowModel
  ): Unit {
    when(view.id) {
      R.id.imageRectangle117 -> {
        val destIntent = SoupBeetVegyActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      R.id.linearRowrectangle151 -> {
        onClickRecyclerListrectangle151LinearRowrectangle151(view, position, item)
      }
    }
  }

  fun onClickRecyclerListrectangle151LinearRowrectangle151(
    view: View,
    position: Int,
    item: Listrectangle151RowModel
  ): Unit {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 -> {
        val destIntent = PenangLaksaActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      1 -> {
        val destIntent = PizzaRollActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      2 -> {
        val destIntent = FocacciaActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      3 -> {
        val destIntent = SlidersActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      4 -> {
        val destIntent = MisoRamenSoupActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      5 -> {
        val destIntent = CinnamonRollBunniesActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      6 -> {
        val destIntent = MuffinTinMiniQuicheActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      7 -> {
        val destIntent = MuffinTinMiniQuicheActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      8 -> {
        val destIntent = MozzaCheeseActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      9 -> {
        val destIntent = CheesyBeefPastaActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      10 -> {
        val destIntent = SoupBeetVegyActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      11 -> {
        val destIntent = OnionCheeseActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "TRENDING_THIS_WEEK_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TrendingThisWeekActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

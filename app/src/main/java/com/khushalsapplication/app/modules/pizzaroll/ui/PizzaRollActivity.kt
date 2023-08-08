package com.khushalsapplication.app.modules.pizzaroll.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityPizzaRollBinding
import com.khushalsapplication.app.modules.pizzaroll.`data`.model.PizzaRollRowModel
import com.khushalsapplication.app.modules.pizzaroll.`data`.viewmodel.PizzaRollVM
import com.khushalsapplication.app.modules.trendingthisweek.ui.TrendingThisWeekActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PizzaRollActivity : BaseActivity<ActivityPizzaRollBinding>(R.layout.activity_pizza_roll) {
  private val viewModel: PizzaRollVM by viewModels<PizzaRollVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val pizzaRollAdapter = PizzaRollAdapter(viewModel.pizzaRollList.value?:mutableListOf())
    binding.recyclerPizzaRoll.adapter = pizzaRollAdapter
    pizzaRollAdapter.setOnItemClickListener(
    object : PizzaRollAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : PizzaRollRowModel) {
        onClickRecyclerPizzaRoll(view, position, item)
      }
    }
    )
    viewModel.pizzaRollList.observe(this) {
      pizzaRollAdapter.updateData(it)
    }
    binding.pizzaRollVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangle294.setOnClickListener {
      val destIntent = TrendingThisWeekActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerPizzaRoll(
    view: View,
    position: Int,
    item: PizzaRollRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PIZZA_ROLL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PizzaRollActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

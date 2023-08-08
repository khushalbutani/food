package com.khushalsapplication.app.modules.browse.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.browse.`data`.model.BrowseModel
import com.khushalsapplication.app.modules.browse.`data`.model.ListbigdoubleRowModel
import com.khushalsapplication.app.modules.browse.`data`.model.ListlanguageRowModel
import com.khushalsapplication.app.modules.browse.`data`.model.Listrectangle173RowModel
import com.khushalsapplication.app.modules.browse.`data`.model.ListriverbambooRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class BrowseVM : ViewModel(), KoinComponent {
  val browseModel: MutableLiveData<BrowseModel> = MutableLiveData(BrowseModel())

  var navArguments: Bundle? = null

  val listlanguageList: MutableLiveData<MutableList<ListlanguageRowModel>> =
      MutableLiveData(mutableListOf())

  val listriverbambooList: MutableLiveData<MutableList<ListriverbambooRowModel>> =
      MutableLiveData(mutableListOf())

  val listrectangle173List: MutableLiveData<MutableList<Listrectangle173RowModel>> =
      MutableLiveData(mutableListOf())

  val listbigdoubleList: MutableLiveData<MutableList<ListbigdoubleRowModel>> =
      MutableLiveData(mutableListOf())
}

package com.khushalsapplication.app.modules.collections.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khushalsapplication.app.modules.collections.`data`.model.CollectionsModel
import com.khushalsapplication.app.modules.collections.`data`.model.CollectionsRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CollectionsVM : ViewModel(), KoinComponent {
  val collectionsModel: MutableLiveData<CollectionsModel> = MutableLiveData(CollectionsModel())

  var navArguments: Bundle? = null

  val collectionsList: MutableLiveData<MutableList<CollectionsRowModel>> =
      MutableLiveData(mutableListOf())
}

package com.afirium.vacinationreminder.Commons

import android.app.Application
import com.afirium.vacinationreminder.Data.Repo
import com.afirium.vacinationreminder.Data.DB
import com.afirium.vacinationreminder.ViewModel.MyModelViewFactory

object  DependencyManager {
     lateinit  var modelViewFactory : MyModelViewFactory

    fun initDependencies(application : Application){
        val database = DB.getInstance(application)
        Repo.init(database!!)
        val childRepo = Repo.getInstance()
        modelViewFactory =
            MyModelViewFactory(childRepo)
    }


}
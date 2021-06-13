package com.trian.myapplication.utils

import androidx.lifecycle.ViewModel
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.storage.FirebaseStorage

open class MyViewModel:ViewModel() {
    protected var auth:FirebaseAuth? = null
    protected lateinit var storage:FirebaseStorage
    protected lateinit var db:FirebaseFirestore
    init {

        auth= FirebaseAuth.getInstance()
        storage= FirebaseStorage.getInstance()
        db= FirebaseFirestore.getInstance()
    }
}
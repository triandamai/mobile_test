package com.trian.myapplication.ui.activity.auth

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.trian.myapplication.utils.MyViewModel
import kotlinx.coroutines.runBlocking
import kotlin.coroutines.EmptyCoroutineContext

class AuthViewModel : MyViewModel() {

    var  userAuth:MutableLiveData<FirebaseUser> = MutableLiveData();
    var loading:MutableLiveData<Boolean> = MutableLiveData()
    fun processAuth( email:String, password:String){
        loading.postValue(true)
        auth?.signInWithEmailAndPassword(email,password)
            ?.addOnCompleteListener {
                loading.postValue(false)
            userAuth.value = it.result?.user;
        }
            ?.addOnFailureListener {
            userAuth.value = null
        }
    }


}
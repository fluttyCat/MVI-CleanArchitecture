package com.github.mvibase.presentation

import androidx.lifecycle.ViewModel


abstract class BaseMviViewModel<I : BaseMviIntent, A : BaseMviAction, S : BaseMviViewState, E : BaseMviViewEvent>
    : ViewModel() {

    companion object {
        const val TAG = "IntentViewModel"
    }
}
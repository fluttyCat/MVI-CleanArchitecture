package com.github.mvibase.presentation

import androidx.lifecycle.ViewModel


abstract class MviViewModel<I : MviIntent, A : BaseMviAction, S : MviViewState, E : MviViewEvent>
    : ViewModel() {

    companion object {
        const val TAG = "IntentViewModel"
    }
}
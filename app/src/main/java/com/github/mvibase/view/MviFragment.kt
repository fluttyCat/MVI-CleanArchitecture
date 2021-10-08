package com.github.mvibase.view

import androidx.viewbinding.ViewBinding
import com.github.mvibase.presentation.MviViewModel
import com.github.mvibase.presentation.MviViewEvent
import com.github.mvibase.presentation.MviViewState
import com.github.mvibase.presentation.MviIntent

class MviFragment<VB : ViewBinding, I : MviIntent, S : MviViewState, E : MviViewEvent, VM : MviViewModel<I, *, S, E>> :
    BaseMviFragment<VB>() {
}
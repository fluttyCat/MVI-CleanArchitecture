package com.github.mvibase.presentation


/**
 * Object representing a UI that will
 * a) emit its intents to a view model,
 * b) subscribes to a view model for rendering its UI.
 *
 * @param I Top class of the [MviIntent] that the [BaseMviView] will be emitting.
 * @param S Top class of the [MviViewState] the [BaseMviView] will be subscribing to.
 */

interface BaseMviView<I : MviIntent, in S : MviViewState>
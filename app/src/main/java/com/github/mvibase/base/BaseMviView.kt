package com.github.mvibase.base


/**
 * Object representing a UI that will
 * a) emit its intents to a view model,
 * b) subscribes to a view model for rendering its UI.
 *
 * @param I Top class of the [BaseMviIntent] that the [BaseMviView] will be emitting.
 * @param S Top class of the [BaseMviViewState] the [BaseMviView] will be subscribing to.
 */

interface BaseMviView<I : BaseMviIntent, in S : BaseMviViewState>
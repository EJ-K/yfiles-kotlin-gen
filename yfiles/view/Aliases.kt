// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

package yfiles.view

/**
 * A callback method for animations.
 * @param [time] The current (relative) animation time which is a double between 0.0 for the start of the animation and 1.0 for the end of the animation.
 * @see [IAnimation]
 * @see [Animator]
 */
typealias AnimationCallback = (time: Double) -> Unit

/**
 * A callback which will be called to free the resources that are occupied by the given `removedVisual` when the visual will be removed.
 * @param [context] A valid render context.
 * @param [removedVisual] The visual whose resources need to be freed.
 * @param [dispose] Indicates that the visual is not going to be used again in any case and can be disposed for good. In the case that this parameter is set to `true`, clients should take this as a signal to free the resources used by the `removedVisual`. If this parameter is set to false, the visual is eventually made visible in the scene graph of the [CanvasComponent] again and may therefore be reused.
 * @return The removed visual if it should be cached, `null` otherwise.
 * @see [IRenderContext.setDisposeCallback]
 */
typealias DisposeVisualCallback<TVisual> = (context: IRenderContext, removedVisual: TVisual, dispose: Boolean) -> TVisual

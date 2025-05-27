// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.geometry.Rect
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * Used by [CanvasComponent] to limit the interactive movement of the viewport.
 * @see [bounds]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportLimiter">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [ViewportLimiter] class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportLimiter%23ViewportLimiter-constructor-ViewportLimiter">Online Documentation</a>
 */
external open class ViewportLimiter  () : YObject {

/**
 * Gets or sets the maximal allowed navigable bounds for the viewport.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportLimiter%23bounds">Online Documentation</a>
 */
final var bounds: Rect?
/**
 * Gets or sets a value indicating whether both dimensions of [bounds] need to be honored.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportLimiter%23honorBothDimensions">Online Documentation</a>
 */
final var honorBothDimensions: Boolean
/**
 * Gets or sets the policy how the viewport is limited if the current viewport is **not** within the limits.
 * 
 * The default is [ViewportLimitingPolicy.TOWARDS_LIMIT].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportLimiter%23limitingPolicy">Online Documentation</a>
 */
final var limitingPolicy: ViewportLimitingPolicy
/**
 * Gets the to bounds that should be honored for the upcoming call.
 * @param [canvas] The canvas control.
 * @param [suggestedViewport] The suggested viewport.
 * @return The bounds to honor or `null` if there are no restrictions.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportLimiter%23ViewportLimiter-method-getCurrentBounds">Online Documentation</a>
 */
 open protected   fun getCurrentBounds( canvas: CanvasComponent ,
 suggestedViewport: Rect ):Rect?
/**
 * Inspects the desired or suggested new viewport for the given control and returns a valid viewport to use.
 * @param [canvas] The canvas control on which the viewport should be applied.
 * @param [suggestedViewport] The suggested viewport.
 * @param [forceStrictLimits] Whether to force [ViewportLimitingPolicy.STRICT] limiting. Passing `true` overrides the [limitingPolicy]. This is used for example by [CanvasComponent.fitContent] or [ICommand.ZOOM_TO_CURRENT_ITEM][yfiles.input.ICommand.ZOOM_TO_CURRENT_ITEM] where larger viewport changes are expected.
 * @return The viewport that should be used.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportLimiter%23ViewportLimiter-method-limitViewport">Online Documentation</a>
 */
 open   fun limitViewport( canvas: CanvasComponent ,
 suggestedViewport: Rect ,
 forceStrictLimits: Boolean  = definedExternally):Rect

companion object : ClassMetadata<ViewportLimiter> {
}
}

inline fun ViewportLimiter(
    block: ViewportLimiter.() -> Unit
): ViewportLimiter {
    return ViewportLimiter()
        .apply(block)
}

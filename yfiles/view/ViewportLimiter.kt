// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import js.array.ReadonlyArray
import yfiles.geometry.Insets
import yfiles.geometry.Point
import yfiles.geometry.Rect
import yfiles.geometry.Size
import yfiles.lang.ClassMetadata

/**
 * Used by [CanvasComponent] to limit the interactive movement of the viewport.
 * @see [bounds]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportLimiter">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [ViewportLimiter] class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportLimiter%23ViewportLimiter-constructor-ViewportLimiter">Online Documentation</a>
 */
open external class ViewportLimiter ()  {
  /**
   * Gets or sets the maximal allowed navigable bounds for the viewport.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportLimiter%23bounds">Online Documentation</a>
   */
  final var bounds: Rect?
  
  /**
   * Gets or sets the percentage of the width and height of the viewport that should be reserved *at least* when [viewportContentMargins][ViewportLimiter] are defined.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportLimiter%23minimumViewportContentRatio">Online Documentation</a>
   */
  final var minimumViewportContentRatio: Size
  
  /**
   * Gets or sets the policy on how the viewport is limited if the current viewport is **not** within the limits.
   * 
   * The default is [WITHIN_MARGINS][ViewportLimitingPolicy].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportLimiter%23policy">Online Documentation</a>
   */
  final var policy: ViewportLimitingPolicy
  
  /**
   * Gets or sets a value that describes how [bounds][ViewportLimiter] should be treated.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportLimiter%23strictBoundsContainment">Online Documentation</a>
   */
  final var strictBoundsContainment: Boolean
  
  /**
   * Gets or sets a value that determines whether the [CanvasComponent]'s [contentBounds][CanvasComponent] should be implicitly used as the [bounds][ViewportLimiter] to limit against.
   * @see [getCurrentBoundingPolygon]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportLimiter%23useContentBounds">Online Documentation</a>
   */
  final var useContentBounds: Boolean
  
  /**
   * Gets or sets the margins in the view coordinate system around the tight [bounds][ViewportLimiter] in world coordinates.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportLimiter%23viewportContentMargins">Online Documentation</a>
   */
  final var viewportContentMargins: Insets
  
  /**
   * Gets the bounding polygon that should be honored for the upcoming limiting call.
   * @param [canvasComponent] The canvas control.
   * @param [requestedViewport] The requested new viewport.
   * @param [mode] The current limiting mode for the request.
   * @return The bounds in the world coordinate system in the form of a strictly convex polygon where the points are given in clockwise order. `null` if there are no restrictions.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportLimiter%23ViewportLimiter-method-getCurrentBoundingPolygon">Online Documentation</a>
   */
  protected open fun getCurrentBoundingPolygon(
    canvasComponent: CanvasComponent,
    requestedViewport: ViewportDescriptor,
    mode: ViewportLimitingMode,
  ): ReadonlyArray<Point>?
  
  /**
   * Inspects the requested new [viewport][ViewportDescriptor] for the given [CanvasComponent] and returns a valid viewport to use.
   * @param [canvasComponent] The canvas on which the viewport should be applied.
   * @param [requestedViewport] The viewport as requested by the caller.
   * @param [mode] A context that describes the current request. Specifically, this controls whether the current viewport should be honored and/or whether this change is an incremental, interactive, or programmatically triggered change. This is used for example by [fitContent][CanvasComponent] or [ZOOM_TO_CURRENT_ITEM][yfiles.input.Command] where larger viewport changes are expected, whereas interactive drags and scrollbar movements can be handled more gracefully depending on context.
   * @return A valid viewport that should be used.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportLimiter%23ViewportLimiter-method-limitViewport">Online Documentation</a>
   */
  open fun limitViewport(
    canvasComponent: CanvasComponent,
    requestedViewport: ViewportDescriptor,
    mode: ViewportLimitingMode,
  ): ViewportDescriptor
  
  companion object : ClassMetadata<ViewportLimiter> {
  }
}

inline fun ViewportLimiter(
    block: ViewportLimiter.() -> Unit
): ViewportLimiter {
    return ViewportLimiter()
        .apply(block)
}

// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.geometry.Insets
import yfiles.geometry.Point
import yfiles.geometry.Rect
import yfiles.lang.ClassMetadata
import yfiles.lang.TimeSpan

/**
 * Animates changing the viewport bounds and the zoom factor for a [CanvasComponent].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportAnimation">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [ViewportAnimation].
 * @param [canvasComponent] The canvas control.
 * @param [target] The target world bounds for the animation.
 * @param [preferredDuration] The preferred duration. One second if omitted.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportAnimation%23ViewportAnimation-constructor-ViewportAnimation">Online Documentation</a>
 */
open external class ViewportAnimation (
  canvasComponent: CanvasComponent,
  target: Rect,
  preferredDuration: TimeSpan?,
) : IAnimation {
  /**
   * Gets or sets whether to respect the [viewportLimiter][CanvasComponent] of the [CanvasComponent] whose [viewport][CanvasComponent] is animated.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportAnimation%23considerViewportLimiter">Online Documentation</a>
   */
  final var considerViewportLimiter: Boolean
  
  /**
   * Gets or sets the maximum zoom level to use after the animation.
   * 
   * The default is [POSITIVE_INFINITY][Number].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportAnimation%23maximumTargetZoom">Online Documentation</a>
   */
  final var maximumTargetZoom: Double
  
  /**
   * Gets or sets the preferred duration of the animation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportAnimation%23preferredDuration">Online Documentation</a>
   */
  final override var preferredDuration: TimeSpan
  
  /**
   * Gets or sets the scroll bar visibility that will be used during the animation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportAnimation%23scrollBarVisibility">Online Documentation</a>
   */
  final var scrollBarVisibility: ScrollBarVisibility
  
  /**
   * Gets or sets the target world bounds.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportAnimation%23target">Online Documentation</a>
   */
  final var target: Rect
  
  /**
   * Gets or sets the margins in view coordinate dimensions to use at the target zoom level.
   * 
   * The default is `(0,0,0,0)`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportAnimation%23targetMargins">Online Documentation</a>
   */
  final var targetMargins: Insets
  
  /**
   * Gets or sets the mode of the viewport limiting if [considerViewportLimiter][ViewportAnimation] is `true`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportAnimation%23viewportLimitingMode">Online Documentation</a>
   */
  final var viewportLimitingMode: ViewportLimitingMode
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportAnimation%23ViewportAnimation-method-animate">Online Documentation</a>
   */
  override fun animate(
    time: Double,
  )
  
  /**
   * Effectively applies the center point value.
   * @param [focus] The point to set as [center][CanvasComponent].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportAnimation%23ViewportAnimation-method-applyCenterPoint">Online Documentation</a>
   */
  protected open fun applyCenterPoint(
    focus: Point,
  )
  
  /**
   * Effectively applies the viewpoint value.
   * @param [focus] The point to set the [viewPoint][CanvasComponent] to.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportAnimation%23ViewportAnimation-method-applyViewPoint">Online Documentation</a>
   */
  protected open fun applyViewPoint(
    focus: Point,
  )
  
  /**
   * Effectively applies the zoom value.
   * @param [value] The zoom value to apply.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportAnimation%23ViewportAnimation-method-applyZoom">Online Documentation</a>
   */
  protected open fun applyZoom(
    value: Double,
  )
  
  /**
   * Cleans up and cancels this viewport animation so that subsequent calls to [animate][ViewportAnimation] or [cleanUp][ViewportAnimation] won't affect the viewport anymore.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportAnimation%23ViewportAnimation-method-cancel">Online Documentation</a>
   */
  open fun cancel()
  
  /**
   * Cleans up after the animation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportAnimation%23ViewportAnimation-method-cleanUp">Online Documentation</a>
   */
  override fun cleanUp()
  
  /**
   * Initializes this animation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportAnimation%23ViewportAnimation-method-initialize">Online Documentation</a>
   */
  override fun initialize()
  
  companion object : ClassMetadata<ViewportAnimation> {
  }
}

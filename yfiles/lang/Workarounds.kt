// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.lang

/**
 * This object is a container for all workarounds introduced for different environments.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Workarounds">Online Documentation</a>
 */

external object Workarounds {
  /**
   * Specifies whether repeated key events for modifier keys that are held down should be considered.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Workarounds%23considerRepeatedModifierKeyEvents">Online Documentation</a>
   */
  final var considerRepeatedModifierKeyEvents: Boolean
  
  /**
   * Makes sure that no `setTimeout(fn,0)` calls are "lost" by flushing Dispatcher actions on mouse move (enabled by default).
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Workarounds%23cr570845">Online Documentation</a>
   */
  final var cr570845: Int
  
  /**
   * Specifies whether WebGL2 rendering mode should use asynchronous, non-blocking, parallel shader compilation if available.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Workarounds%23disableParallelShaderCompilation">Online Documentation</a>
   */
  final var disableParallelShaderCompilation: Boolean
  
  /**
   * Specifies whether the browser's popover API should be omitted when displaying tooltip and context menus.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Workarounds%23disablePopoverUsage">Online Documentation</a>
   */
  final var disablePopoverUsage: Boolean
  
  /**
   * Prevents calling `preventDefault` on touch events by early exiting [maybePreventPointerDefault][yfiles.view.CanvasComponent].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Workarounds%23ff1729465">Online Documentation</a>
   */
  final var ff1729465: Boolean
  
  /**
   * Corrects the button state of mouse events if the `CTRL` modifer is pressed and the values of the `MouseEvent.button` and `MouseEvent.buttons` properties don't match.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Workarounds%23ff1837973">Online Documentation</a>
   */
  final var ff1837973: Boolean
  
  /**
   * Specifies whether the default yFiles stylesheet should be loaded automatically.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Workarounds%23loadDefaultCSS">Online Documentation</a>
   */
  final var loadDefaultCSS: Boolean
  
  /**
   * Optionally provides values to control how mouse wheels behave and are distinguished from track pad pinches and pans.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Workarounds%23mouseWheelParameters">Online Documentation</a>
   */
  final var mouseWheelParameters: Any /* Partial<{mouseWheelThreshold: number;mouseWheelMax: number;mouseWheelFactor: number;trackpadPinchMax: number;trackpadPinchFactor: number;trackpadPanMax: number;trackpadPanFactor: number;resetTime: number;}> | undefined */?
  
  /**
   * Specifies whether the shaders used for WebGL2 selection styles should be compiled before they are actually rendered.
   * 
   * The default value is `false`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Workarounds%23precompileWebGLSelectionShaders">Online Documentation</a>
   */
  final var precompileWebGLSelectionShaders: Boolean
  
  /**
   * Specifies the maximum duration in milliseconds of the leave animation of a tooltip.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Workarounds%23toolTipLeaveAnimationMaximumDuration">Online Documentation</a>
   */
  final var toolTipLeaveAnimationMaximumDuration: Int
  
  /**
   * Specifies whether `preventDefault()` should be called on `touchstart` events in case `PointerEvents` are available on the device.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Workarounds%23touchstartPreventDefault">Online Documentation</a>
   */
  final var touchstartPreventDefault: Boolean
  
  /**
   * Specifies the duration in milliseconds that WebGL2 label rendering is allowed to take in each frame.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Workarounds%23webGLStaggeredLabelRenderingDuration">Online Documentation</a>
   */
  final var webGLStaggeredLabelRenderingDuration: Int
}

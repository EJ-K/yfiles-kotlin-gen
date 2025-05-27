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
 * Avoids setting `SVGElement.transform.baseVal` (obsolete).
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Workarounds%23cr320635">Online Documentation</a>
 */
final var cr320635: Boolean
/**
 * Prevents artificial `mousedown` events in Chrome (obsolete).
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Workarounds%23cr433873">Online Documentation</a>
 */
final var cr433873: Boolean
/**
 * Makes sure that no `setTimeout(fn,0)` calls are "lost" by flushing Dispatcher actions on mouse move (enabled by default).
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Workarounds%23cr570845">Online Documentation</a>
 */
final var cr570845: Int
/**
 * Re-applies the SVG transform matrix once the GraphComponent's `<svg>` element is the DOM (obsolete).
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Workarounds%23cr701075">Online Documentation</a>
 */
final var cr701075: Boolean
/**
 * Specifies whether WebGL2 rendering mode should use asynchronous, non-blocking, parallel shader compilation if available.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Workarounds%23disableParallelShaderCompilation">Online Documentation</a>
 */
final var disableParallelShaderCompilation: Boolean
/**
 * Changes attribute names with only upper case characters in string template styles to lower case attribute names.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Workarounds%23edge2057021">Online Documentation</a>
 */
final var edge2057021: Boolean
/**
 * Prevents calling `preventDefault` on touch events by early exiting [yfiles.view.CanvasComponent.maybePreventPointerDefault].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Workarounds%23ff1729465">Online Documentation</a>
 */
final var ff1729465: Boolean
/**
 * Corrects the button state of mouse events if the `CTRL` modifer is pressed and the values of the `MouseEvent.button` and `MouseEvent.buttons` properties don't match.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Workarounds%23ff1837973">Online Documentation</a>
 */
final var ff1837973: Boolean
/**
 * Sets the CSS `pointer-events` property to `none` for `<use>` elements in visual templates such as handles (enabled by default).
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Workarounds%23ie205775">Online Documentation</a>
 */
final var ie205775: Boolean
/**
 * Refers to the same workaround as [ie2337112].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Workarounds%23ie233711">Online Documentation</a>
 */
final var ie233711: Boolean
/**
 * Fix broken `href` attributes in DOM elements after they have been reinserted, reappended, or replaced.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Workarounds%23ie2337112">Online Documentation</a>
 */
final var ie2337112: Boolean
/**
 * GWT: Array.isArray causes JavaScript error in Internet Explorer with GWT.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Workarounds%23ie7766782">Online Documentation</a>
 */
final var ie7766782: Boolean
/**
 * Replaces each non-newline whitespace in label text with '`\u00A0`'.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Workarounds%23ie964525">Online Documentation</a>
 */
final var ie964525: Boolean
/**
 * Specifies whether the default yFiles stylesheet should be loaded automatically.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Workarounds%23loadDefaultCSS">Online Documentation</a>
 */
final var loadDefaultCSS: Boolean
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
/**
 * Ignores bogus mouse events during and shortly after touch input.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Workarounds%23wk203237">Online Documentation</a>
 */
final var wk203237: Int
}

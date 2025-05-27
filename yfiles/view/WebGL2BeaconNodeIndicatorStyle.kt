// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * A selection, highlight, or focus style which renders a beacon effect around nodes using WebGL2.
 * @see [WebGL2NodeIndicatorStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2BeaconNodeIndicatorStyle">Online Documentation</a>
 * 
 * @constructor Creates a new beacon indicator style for nodes with WebGL2.
 * @param [shape] The shape of the node. Defaults to [WebGL2NodeIndicatorShape.NODE_SHAPE].
 * @param [type] The type of the beacon. Defaults to [WebGL2BeaconAnimationType.FADE].
 * @param [color] The color of the beacon. Defaults to black if not specified.
 * @param [pulseWidth] The thickness of a single beacon pulse. Defaults to 4.
 * @param [pulseCount] How many beacon pulses should be simultaneously visible. Defaults to 1.
 * @param [pulseDistance] The distance between multiple beacon pulses. Defaults to 20.
 * @param [magnitude] The distance the beacon extends to. Defaults to 50.
 * @param [smooth] Whether to draw each pulse smoothly or with hard edges. Defaults to `true`.
 * @param [zoomPolicy] How the style is affected by the current zoom level. Defaults to [StyleDecorationZoomPolicy.VIEW_COORDINATES].
 * @param [enterTransition] The transition to use when an element enters the indicator state. No visible transition by default.
 *   If no transition or a [WebGL2TransitionProperties.SCALE] transition is specified, the beacon animation will immediately start when a node enters the indicator state.
 * @param [leaveTransition] The transition to use when an element leaves the indicator state. No visible transition by default.
 *   If no transition is specified, the beacon animation will stop immediately when the node leaves the indicator state. If an [WebGL2TransitionProperties.OPACITY] transition is specified, the beacon animation will continue for the duration of the transition while fading out. If a [WebGL2TransitionProperties.SCALE] transition is specified, the beacon animation will finish it's current iteration and will not start another iteration, even if there is transition time remaining.
 * @param [timing] Specifies the timing function to use for the beacon animation. Defaults to "1s linear infinite normal".
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2BeaconNodeIndicatorStyle%23WebGL2BeaconNodeIndicatorStyle-constructor-WebGL2BeaconNodeIndicatorStyle">Online Documentation</a>
 */
external open class WebGL2BeaconNodeIndicatorStyle  ( shape: WebGL2NodeIndicatorShape  = definedExternally,
 type: WebGL2BeaconAnimationType?  = definedExternally,
 color: Color?  = definedExternally,
 pulseWidth: Double  = definedExternally,
 pulseCount: Int  = definedExternally,
 pulseDistance: Double  = definedExternally,
 magnitude: Double  = definedExternally,
 smooth: Boolean  = definedExternally,
 zoomPolicy: StyleDecorationZoomPolicy  = definedExternally,
 enterTransition: WebGL2Transition?  = definedExternally,
 leaveTransition: WebGL2Transition?  = definedExternally,
 timing: WebGL2AnimationTiming?  = definedExternally) : YObject {

/**
 * Gets the values that specify how the beacon should be animated.
 * 
 * The default is "1s linear infinite normal".
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2BeaconNodeIndicatorStyle%23animationTiming">Online Documentation</a>
 */
final val animationTiming: WebGL2AnimationTiming
/**
 * Gets the color of the indicator style.
 * 
 * The default value is taken from the [CanvasComponent.theme].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2BeaconNodeIndicatorStyle%23color">Online Documentation</a>
 */
final val color: Color
/**
 * Gets the transition to apply when this style gets newly applied to a node visualization.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2BeaconNodeIndicatorStyle%23enterTransition">Online Documentation</a>
 */
final val enterTransition: WebGL2Transition
/**
 * Gets the transition to apply when this style gets removed from a node visualization.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2BeaconNodeIndicatorStyle%23leaveTransition">Online Documentation</a>
 */
final val leaveTransition: WebGL2Transition
/**
 * The distance the beacon extends to.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2BeaconNodeIndicatorStyle%23magnitude">Online Documentation</a>
 */
final val magnitude: Double
/**
 * How many beacon pulses should be simultaneously visible.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2BeaconNodeIndicatorStyle%23pulseCount">Online Documentation</a>
 */
final val pulseCount: Int
/**
 * The distance between multiple beacon pulses.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2BeaconNodeIndicatorStyle%23pulseDistance">Online Documentation</a>
 */
final val pulseDistance: Double
/**
 * Gets thickness of a single beacon pulse.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2BeaconNodeIndicatorStyle%23pulseWidth">Online Documentation</a>
 */
final val pulseWidth: Double
/**
 * Gets the shape of this style.
 * 
 * The default value is [WebGL2NodeIndicatorShape.NODE_SHAPE].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2BeaconNodeIndicatorStyle%23shape">Online Documentation</a>
 */
final val shape: WebGL2NodeIndicatorShape
/**
 * Whether to draw each pulse smoothly or with hard edges.
 * 
 * The default is `true`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2BeaconNodeIndicatorStyle%23smooth">Online Documentation</a>
 */
final val smooth: Boolean
/**
 * Gets the type of the indicator style.
 * 
 * The default value is [WebGL2BeaconAnimationType.FADE].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2BeaconNodeIndicatorStyle%23type">Online Documentation</a>
 */
final val type: WebGL2BeaconAnimationType
/**
 * Gets how the style is affected by the current zoom level.
 * 
 * The default value is [StyleDecorationZoomPolicy.VIEW_COORDINATES].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2BeaconNodeIndicatorStyle%23zoomPolicy">Online Documentation</a>
 */
final val zoomPolicy: StyleDecorationZoomPolicy

companion object : ClassMetadata<WebGL2BeaconNodeIndicatorStyle> {
}
}

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
 * A style for use in WebGL2 rendering to render the selection, highlight, or focus indicator of nodes.
 * @see [WebGL2BeaconNodeIndicatorStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2NodeIndicatorStyle">Online Documentation</a>
 * 
 * @constructor Creates a new indicator style for nodes with WebGL2.
 * @param [shape] The shape of the node. Defaults to [WebGL2NodeIndicatorShape.NODE_SHAPE].
 * @param [type] The type of the indicator. Defaults to a suitable value based on the [CanvasComponent.theme].
 * @param [thickness] The total thickness of the indicator style. Defaults to a suitable value based on the [CanvasComponent.theme].
 * @param [primaryColor] The primary color of the indicator style. Defaults to a suitable value based on the [CanvasComponent.theme].
 * @param [secondaryColor] The secondary color used for the outline or background of the indicator style. Defaults to a suitable value based on the [CanvasComponent.theme].
 * @param [margins] The margins around the node layout. Defaults to `0`.
 * @param [zoomPolicy] How the style is affected by the current zoom level. Defaults to [StyleDecorationZoomPolicy.VIEW_COORDINATES].
 * @param [enterTransition] The transition to use when an element enters the indicator state. No visible transition by default.
 * @param [leaveTransition] The transition to use when an element leaves the indicator state. No visible transition by default.
 * @param [dashStrokeAnimation] The values that specify how the dash/dotted strokes should be animated. [No visible animation][WebGL2AnimationTiming.INSTANT] by default.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2NodeIndicatorStyle%23WebGL2NodeIndicatorStyle-constructor-WebGL2NodeIndicatorStyle">Online Documentation</a>
 */
external  class WebGL2NodeIndicatorStyle  ( shape: WebGL2NodeIndicatorShape  = definedExternally,
 type: WebGL2IndicatorType?  = definedExternally,
 thickness: Double?  = definedExternally,
 primaryColor: Color?  = definedExternally,
 secondaryColor: Color?  = definedExternally,
 margins: Double  = definedExternally,
 zoomPolicy: StyleDecorationZoomPolicy  = definedExternally,
 enterTransition: WebGL2Transition?  = definedExternally,
 leaveTransition: WebGL2Transition?  = definedExternally,
 dashStrokeAnimation: WebGL2AnimationTiming?  = definedExternally) : YObject {

/**
 * Gets the values that specify how the dash/dotted strokes should be animated.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2NodeIndicatorStyle%23dashStrokeAnimation">Online Documentation</a>
 */
final val dashStrokeAnimation: WebGL2AnimationTiming
/**
 * Gets the transition to apply when this style gets newly applied to a node visualization.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2NodeIndicatorStyle%23enterTransition">Online Documentation</a>
 */
final val enterTransition: WebGL2Transition
/**
 * Gets the transition to apply when this style gets removed from a node visualization.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2NodeIndicatorStyle%23leaveTransition">Online Documentation</a>
 */
final val leaveTransition: WebGL2Transition
/**
 * Gets the margins around the node layout.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2NodeIndicatorStyle%23margins">Online Documentation</a>
 */
final val margins: Double
/**
 * Gets the primary color of the indicator style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2NodeIndicatorStyle%23primaryColor">Online Documentation</a>
 */
final val primaryColor: Color
/**
 * Gets the secondary color of the indicator style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2NodeIndicatorStyle%23secondaryColor">Online Documentation</a>
 */
final val secondaryColor: Color
/**
 * Gets the shape of this style.
 * 
 * The default value is [WebGL2NodeIndicatorShape.NODE_SHAPE].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2NodeIndicatorStyle%23shape">Online Documentation</a>
 */
final val shape: WebGL2NodeIndicatorShape
/**
 * Gets the total thickness of the indicator style.
 * 
 * The default value is taken from the [CanvasComponent.theme].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2NodeIndicatorStyle%23thickness">Online Documentation</a>
 */
final val thickness: Double
/**
 * Gets the type of the indicator style.
 * 
 * The default value is taken from the [CanvasComponent.theme].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2NodeIndicatorStyle%23type">Online Documentation</a>
 */
final val type: WebGL2IndicatorType
/**
 * Gets how the style is affected by the current zoom level.
 * 
 * The default value is [StyleDecorationZoomPolicy.VIEW_COORDINATES].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2NodeIndicatorStyle%23zoomPolicy">Online Documentation</a>
 */
final val zoomPolicy: StyleDecorationZoomPolicy

companion object : ClassMetadata<WebGL2NodeIndicatorStyle> {
}
}

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
 * A 3-segment edge style for use in WebGL2 rendering.
 * @see [WebGL2ArcEdgeStyle]
 * @see [WebGL2PolylineEdgeStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2BridgeEdgeStyle">Online Documentation</a>
 * 
 * @constructor Creates a new 3-segment bridge edge style that is rendered with WebGL2.
 * @param [height] The deviation of the bridge from the straight-line. Defaults to `0`.
 * @param [fanLength] The value for the [fanLength] property. Defaults to `0.2`.
 * @param [stroke] The color and thickness of the edge. Defaults to [WebGL2Stroke.BLACK].
 * @param [sourceArrow] The arrow at the edge's source end. Defaults to [WebGL2ArrowType.NONE].
 * @param [targetArrow] The arrow at the edge's target end. Defaults to [WebGL2ArrowType.NONE].
 * @param [selfLoopDistance] The distance between the node's layout and its self-loop control points. Defaults to `20`.
 * @param [effect] The effect around the edge. Defaults to [WebGL2Effect.NONE].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2BridgeEdgeStyle%23WebGL2BridgeEdgeStyle-constructor-WebGL2BridgeEdgeStyle">Online Documentation</a>
 */
external  class WebGL2BridgeEdgeStyle  ( height: Double  = definedExternally,
 fanLength: Double  = definedExternally,
 stroke: WebGL2Stroke?  = definedExternally,
 sourceArrow: WebGL2ArrowType  = definedExternally,
 targetArrow: WebGL2ArrowType  = definedExternally,
 selfLoopDistance: Double  = definedExternally,
 effect: WebGL2Effect  = definedExternally) : YObject {

/**
 * Gets the applied effects on this style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2BridgeEdgeStyle%23effect">Online Documentation</a>
 */
final val effect: WebGL2Effect
/**
 * Gets the length of the "fan" part of the style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2BridgeEdgeStyle%23fanLength">Online Documentation</a>
 */
final val fanLength: Double
/**
 * Gets the deviation of the bridge from the straight-line.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2BridgeEdgeStyle%23height">Online Documentation</a>
 */
final val height: Double
/**
 * Gets the distance between the node's layout and its self-loop control points.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2BridgeEdgeStyle%23selfLoopDistance">Online Documentation</a>
 */
final val selfLoopDistance: Double
/**
 * Gets the arrow at the edge's source end.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2BridgeEdgeStyle%23sourceArrow">Online Documentation</a>
 */
final val sourceArrow: WebGL2ArrowType
/**
 * Gets the stroke that specifies the color and thickness of the edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2BridgeEdgeStyle%23stroke">Online Documentation</a>
 */
final val stroke: WebGL2Stroke
/**
 * Gets the arrow at the edge's target end.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2BridgeEdgeStyle%23targetArrow">Online Documentation</a>
 */
final val targetArrow: WebGL2ArrowType

companion object : ClassMetadata<WebGL2BridgeEdgeStyle> {
}
}

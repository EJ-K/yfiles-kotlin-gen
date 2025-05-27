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
 * A polygonal edge style for use in WebGL2 rendering.
 * @see [WebGL2ArcEdgeStyle]
 * @see [WebGL2BridgeEdgeStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2PolylineEdgeStyle">Online Documentation</a>
 * 
 * @constructor Creates a new polyline edge style that is rendered with WebGL.
 * @param [stroke] The color and thickness of the edge. Defaults to [WebGL2Stroke.BLACK].
 * @param [sourceArrow] The arrow at the edge's source end. Defaults to [WebGL2ArrowType.NONE].
 * @param [targetArrow] The arrow at the edge's target end. Defaults to [WebGL2ArrowType.NONE].
 * @param [selfLoopDistance] The distance between the node's layout and its self-loop control points. Defaults to `20`.
 * @param [smoothingLength] The smoothing length used to create smooth bends. A value of `0` will disable smoothing. The default value is `0`.
 * @param [effect] The effect around the edge. Defaults to [WebGL2Effect.NONE].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2PolylineEdgeStyle%23WebGL2PolylineEdgeStyle-constructor-WebGL2PolylineEdgeStyle">Online Documentation</a>
 */
external  class WebGL2PolylineEdgeStyle  ( stroke: WebGL2Stroke?  = definedExternally,
 sourceArrow: WebGL2ArrowType  = definedExternally,
 targetArrow: WebGL2ArrowType  = definedExternally,
 selfLoopDistance: Double  = definedExternally,
 smoothingLength: Double  = definedExternally,
 effect: WebGL2Effect  = definedExternally) : YObject {

/**
 * Gets the applied effects on this style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2PolylineEdgeStyle%23effect">Online Documentation</a>
 */
final val effect: WebGL2Effect
/**
 * Gets the distance between the node's layout and its self-loop control points.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2PolylineEdgeStyle%23selfLoopDistance">Online Documentation</a>
 */
final val selfLoopDistance: Double
/**
 * Gets the smoothing length used for creating smooth bends.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2PolylineEdgeStyle%23smoothingLength">Online Documentation</a>
 */
final val smoothingLength: Double
/**
 * Gets the arrow at the edge's source end.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2PolylineEdgeStyle%23sourceArrow">Online Documentation</a>
 */
final val sourceArrow: WebGL2ArrowType
/**
 * Gets the stroke that specifies the color and thickness of the edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2PolylineEdgeStyle%23stroke">Online Documentation</a>
 */
final val stroke: WebGL2Stroke
/**
 * Gets the arrow at the edge's target end.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2PolylineEdgeStyle%23targetArrow">Online Documentation</a>
 */
final val targetArrow: WebGL2ArrowType

companion object : ClassMetadata<WebGL2PolylineEdgeStyle> {
}
}

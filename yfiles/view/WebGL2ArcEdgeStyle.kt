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
 * An arced edge style for use in WebGL2 rendering.
 * @see [WebGL2BridgeEdgeStyle]
 * @see [WebGL2PolylineEdgeStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2ArcEdgeStyle">Online Documentation</a>
 * 
 * @constructor Creates a new arc edge style that is rendered with WebGL2.
 * @param [height] The [height] of the arc. Defaults to `0`.
 * @param [fixedHeight] Whether to interpret [height] as an absolute value. Defaults to `true`.
 * @param [stroke] The color and thickness of the edge. Defaults to [WebGL2Stroke.BLACK].
 * @param [sourceArrow] The arrow at the edge's source end. Defaults to [WebGL2ArrowType.NONE].
 * @param [targetArrow] The arrow at the edge's target end. Defaults to [WebGL2ArrowType.NONE].
 * @param [selfLoopDistance] The distance between the node's layout and its self-loop control points. Defaults to `20`.
 * @param [effect] The effect around the edge. Defaults to [WebGL2Effect.NONE].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2ArcEdgeStyle%23WebGL2ArcEdgeStyle-constructor-WebGL2ArcEdgeStyle">Online Documentation</a>
 */
external  class WebGL2ArcEdgeStyle  ( height: Double  = definedExternally,
 fixedHeight: Boolean  = definedExternally,
 stroke: WebGL2Stroke?  = definedExternally,
 sourceArrow: WebGL2ArrowType  = definedExternally,
 targetArrow: WebGL2ArrowType  = definedExternally,
 selfLoopDistance: Double  = definedExternally,
 effect: WebGL2Effect  = definedExternally) : YObject {

/**
 * Gets the applied effects on this style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2ArcEdgeStyle%23effect">Online Documentation</a>
 */
final val effect: WebGL2Effect
/**
 * Gets a value that specifies whether to interpret [height] as an absolute value.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2ArcEdgeStyle%23fixedHeight">Online Documentation</a>
 */
final val fixedHeight: Boolean
/**
 * Gets the height of the arc.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2ArcEdgeStyle%23height">Online Documentation</a>
 */
final val height: Double
/**
 * Gets the distance between the node's layout and its self-loop control points.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2ArcEdgeStyle%23selfLoopDistance">Online Documentation</a>
 */
final val selfLoopDistance: Double
/**
 * Gets the arrow at the edge's source end.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2ArcEdgeStyle%23sourceArrow">Online Documentation</a>
 */
final val sourceArrow: WebGL2ArrowType
/**
 * Gets the stroke that specifies the color and thickness of the edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2ArcEdgeStyle%23stroke">Online Documentation</a>
 */
final val stroke: WebGL2Stroke
/**
 * Gets the arrow at the edge's target end.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2ArcEdgeStyle%23targetArrow">Online Documentation</a>
 */
final val targetArrow: WebGL2ArrowType

companion object : ClassMetadata<WebGL2ArcEdgeStyle> {
}
}

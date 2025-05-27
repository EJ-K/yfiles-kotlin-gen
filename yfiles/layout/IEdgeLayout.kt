// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.algorithms.YPoint
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * An [IEdgeLayout] encapsulates the layout information for an edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeLayout">Online Documentation</a>
 */
external interface IEdgeLayout : YObject {
/**
 * Gets or sets the relative coordinates of the first end point of this layout.
 * @see [LayoutGraph.getCenterX]
 * @see [LayoutGraph.getCenterY]
 * @see [INodeLayout.x]
 * @see [INodeLayout.y]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeLayout%23sourcePoint">Online Documentation</a>
 */
var sourcePoint: YPoint
/**
 * Gets or sets the relative coordinates of the second end point of this layout.
 * @see [LayoutGraph.getCenterX]
 * @see [LayoutGraph.getCenterY]
 * @see [INodeLayout.x]
 * @see [INodeLayout.y]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeLayout%23targetPoint">Online Documentation</a>
 */
var targetPoint: YPoint
/**
 * Adds a control point to the end of the control point sequence.
 * @param [x] the absolute x-coordinate of the new control point
 * @param [y] the absolute y-coordinate of the new control point
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeLayout%23IEdgeLayout-method-addPoint">Online Documentation</a>
 */
   fun addPoint( x: Double ,
 y: Double )
/**
 * Removes all control points from this edge layout.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeLayout%23IEdgeLayout-method-clearPoints">Online Documentation</a>
 */
   fun clearPoints()
/**
 * Returns the control point at the given position in the sequence of control points.
 * @param [index] the position of the control point in the control point sequence
 * @return the absolute coordinates of the control point at the given index
 * @see [setPoint]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeLayout%23IEdgeLayout-method-getPoint">Online Documentation</a>
 */
   fun getPoint( index: Int ):YPoint
/**
 * Returns the number of control points of the edge.
 * @return the number of control points
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeLayout%23IEdgeLayout-method-pointCount">Online Documentation</a>
 */
   fun pointCount():Int
/**
 * Sets the absolute coordinates of the control point at the given position in the sequence of control points.
 * @param [index] the position of the changing control point in the sequence
 * @param [x] the new absolute x-coordinate of the control point at the given index
 * @param [y] the new absolute y-coordinate of the control point at the given index
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeLayout%23IEdgeLayout-method-setPoint">Online Documentation</a>
 */
   fun setPoint( index: Int ,
 x: Double ,
 y: Double )

companion object : InterfaceMetadata<IEdgeLayout> {
}
}

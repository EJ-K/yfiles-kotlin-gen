// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.tree

import yfiles.algorithms.BorderLine
import yfiles.algorithms.Edge
import yfiles.algorithms.Rectangle2D
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject
import yfiles.layout.IEdgeLayout
import yfiles.layout.LayoutGraph

/**
 * A [SubtreeShape] represents the position and the borders of a subtree.
 * @see [getBorderLine]
 * @see [connectorX]
 * @see [connectorY]
 * @see [addBoundsToShape]
 * @see [addTargetPoint]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubtreeShape">Online Documentation</a>
 */
external  class SubtreeShape 
private constructor () : YObject {

/**
 * Gets the current bounds of this [SubtreeShape] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubtreeShape%23bounds">Online Documentation</a>
 */
final val bounds: Rectangle2D
/**
 * Gets the direction of the last connector segment.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubtreeShape%23connectorDirection">Online Documentation</a>
 */
final val connectorDirection: ConnectorDirection
/**
 * Gets the current x-coordinate of the connection point to which the layout algorithm connects the ingoing edge.
 * @see [addTargetPoint]
 * @see [appendTargetPoints]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubtreeShape%23connectorX">Online Documentation</a>
 */
final val connectorX: Double
/**
 * Gets the current y-coordinate of the connection point to which the layout algorithm connects the ingoing edge.
 * @see [addTargetPoint]
 * @see [appendTargetPoints]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubtreeShape%23connectorY">Online Documentation</a>
 */
final val connectorY: Double
/**
 * Gets the bounds of the [INodeLayout][yfiles.layout.INodeLayout] of the root node of this [SubtreeShape] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubtreeShape%23coreBounds">Online Documentation</a>
 */
final val coreBounds: Rectangle2D
/**
 * Gets the current maximum x-coordinate of this [SubtreeShape] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubtreeShape%23maxX">Online Documentation</a>
 */
final val maxX: Double
/**
 * Gets the current maximum y-coordinate of this [SubtreeShape] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubtreeShape%23maxY">Online Documentation</a>
 */
final val maxY: Double
/**
 * Gets the current minimum x-coordinate of this [SubtreeShape] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubtreeShape%23minX">Online Documentation</a>
 */
final val minX: Double
/**
 * Gets the current minimum y-coordinate of this [SubtreeShape] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubtreeShape%23minY">Online Documentation</a>
 */
final val minY: Double
/**
 * Gets the current x-coordinate of the origin of this [SubtreeShape] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubtreeShape%23originX">Online Documentation</a>
 */
final val originX: Double
/**
 * Gets the current y-coordinate of the origin of this [SubtreeShape] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubtreeShape%23originY">Online Documentation</a>
 */
final val originY: Double
/**
 * Extends this [SubtreeShape] instance by the given rectangle.
 * @param [x] the x-coordinate of the upper-left corner of the rectangle
 * @param [y] the y-coordinate of the upper-left corner of the rectangle
 * @param [width] the width of the rectangle
 * @param [height] the height of the rectangle
 * @see [getBorderLine]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubtreeShape%23SubtreeShape-method-addBoundsToShape">Online Documentation</a>
 */
 final   fun addBoundsToShape( x: Double ,
 y: Double ,
 width: Double ,
 height: Double )
/**
 * Adds all edge segments of the given edge to this [SubtreeShape] instance.
 * @param [graph] the input graph
 * @param [edge] the given edge
 * @see [getBorderLine]
 * @see [addLineSegment]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubtreeShape%23SubtreeShape-method-addEdgeSegments">Online Documentation</a>
 */
 final   fun addEdgeSegments( graph: LayoutGraph ,
 edge: Edge )
/**
 * Extends this [SubtreeShape] instance by the given segment.
 * @param [x1] the x-coordinate of the first point of the segment
 * @param [y1] the y-coordinate of the first point of the segment
 * @param [x2] the x-coordinate of the second point of the segment
 * @param [y2] the y-coordinate of the second point of the segment
 * @see [getBorderLine]
 * @see [addEdgeSegments]
 * @see [updateConnectorShape]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubtreeShape%23SubtreeShape-method-addLineSegment">Online Documentation</a>
 */
 final   fun addLineSegment( x1: Double ,
 y1: Double ,
 x2: Double ,
 y2: Double )
/**
 * Adds another point to the connector.
 * @param [x] the current x-coordinate of the point
 * @param [y] the current y-coordinate of the point
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubtreeShape%23SubtreeShape-method-addTargetPoint">Online Documentation</a>
 */
 final   fun addTargetPoint( x: Double ,
 y: Double )
/**
 * Appends all target points that have previously been added to this shape to the given [IEdgeLayout] instance.
 * @param [edgeLayout] the [IEdgeLayout] that will be modified
 * @see [addTargetPoint]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubtreeShape%23SubtreeShape-method-appendTargetPoints">Online Documentation</a>
 */
 final   fun appendTargetPoints( edgeLayout: IEdgeLayout )
/**
 * Copies the state of this [SubtreeShape] instance to the given shape applying a modification matrix.
 * @param [toShape] the given shape that gets the assigned values
 * @param [modificationMatrix] the matrix that may add geometrical modifications
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubtreeShape%23SubtreeShape-method-assignValuesTo">Online Documentation</a>
 */
 final   fun assignValuesTo( toShape: SubtreeShape ,
 modificationMatrix: RotatableNodePlacerMatrix )
/**
 * Creates a clone of this [SubtreeShape] instance, modifying it using the provided modification matrix.
 * @param [matrix] the matrix that defines the modification for the new instance
 * @return the clone of this [SubtreeShape] instance
 * @see [RotatableNodePlacerMatrix.DEFAULT]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubtreeShape%23SubtreeShape-method-createCopy">Online Documentation</a>
 */
 final   fun createCopy( matrix: RotatableNodePlacerMatrix ):SubtreeShape
/**
 * Returns the [BorderLine] instance that describes the [SubtreeShape] at the given side.
 * @param [index] one of the predefined borderline directions
 * @return the [BorderLine] instance for the given side
 * @throws ArgumentError if the given index is invalid
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubtreeShape%23SubtreeShape-method-getBorderLine">Online Documentation</a>
 */
 final   fun getBorderLine( index: Int ):BorderLine
/**
 * Merges the given [SubtreeShape] instance with this [SubtreeShape] instance.
 * @param [other] the [SubtreeShape] to be merged with this [SubtreeShape]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubtreeShape%23SubtreeShape-method-mergeWith">Online Documentation</a>
 */
 final   fun mergeWith( other: SubtreeShape )
/**
 * Moves this [SubtreeShape] instance and its connector by the given offsets.
 * @param [dx] the delta x-offset by which this shape will be moved
 * @param [dy] the delta y-offset by which this shape will be moved
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubtreeShape%23SubtreeShape-method-move">Online Documentation</a>
 */
 final   fun move( dx: Double ,
 dy: Double )
/**
 * Adds the line segments of the connector to the bounds of this [SubtreeShape] instance.
 * @see [addTargetPoint]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubtreeShape%23SubtreeShape-method-updateConnectorShape">Online Documentation</a>
 */
 final   fun updateConnectorShape()

companion object : ClassMetadata<SubtreeShape> {
}
}

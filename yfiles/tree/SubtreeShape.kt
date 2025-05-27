// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.tree

import yfiles.geometry.Rect
import yfiles.lang.ClassMetadata
import yfiles.layout.BorderLine
import yfiles.layout.LayoutEdge
import yfiles.layout.LayoutGraph
import yfiles.layout.Side

/**
 * A [SubtreeShape] represents the position and the borders of a subtree.
 * @see [getBorderLine]
 * @see [connectorX]
 * @see [connectorY]
 * @see [addBoundsToShape]
 * @see [addTargetPoint]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubtreeShape">Online Documentation</a>
 */
external class SubtreeShape private constructor()  {
  /**
   * Gets the current bounds of this [SubtreeShape] instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubtreeShape%23bounds">Online Documentation</a>
   */
  final val bounds: Rect
  
  /**
   * Gets the direction of the last connector segment.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubtreeShape%23connectorDirection">Online Documentation</a>
   */
  final val connectorDirection: SubtreeConnectorDirection
  
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
   * Gets the bounds of the [NodeLayout][yfiles.layout.NodeLayout] of the root node of this [SubtreeShape] instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubtreeShape%23coreBounds">Online Documentation</a>
   */
  final val coreBounds: Rect
  
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
   * @param [bounds] the bounds that should be added to the shape
   * @see [getBorderLine]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubtreeShape%23SubtreeShape-method-addBoundsToShape">Online Documentation</a>
   */
  fun addBoundsToShape(
    bounds: Rect,
  )
  
  /**
   * Adds all edge segments of the given edge to this [SubtreeShape] instance.
   * @param [graph] the input graph
   * @param [edge] the given edge
   * @see [getBorderLine]
   * @see [addLineSegment]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubtreeShape%23SubtreeShape-method-addEdgeSegments">Online Documentation</a>
   */
  fun addEdgeSegments(
    graph: LayoutGraph,
    edge: LayoutEdge,
  )
  
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
  fun addLineSegment(
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
  )
  
  /**
   * Adds another point to the connector.
   * @param [x] the current x-coordinate of the point
   * @param [y] the current y-coordinate of the point
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubtreeShape%23SubtreeShape-method-addTargetPoint">Online Documentation</a>
   */
  fun addTargetPoint(
    x: Double,
    y: Double,
  )
  
  /**
   * Appends all target points that have previously been added to this shape to the given [LayoutEdge] instance.
   * @param [edge] the [LayoutEdge] that will be modified
   * @see [addTargetPoint]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubtreeShape%23SubtreeShape-method-appendTargetPoints">Online Documentation</a>
   */
  fun appendTargetPoints(
    edge: LayoutEdge,
  )
  
  /**
   * Creates a clone of this [SubtreeShape] instance, modifying it using the provided transformation matrix.
   * @param [transform] The transform that defines the modification for the new instance
   * @return The clone of this [SubtreeShape] instance
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubtreeShape%23SubtreeShape-method-createCopy">Online Documentation</a>
   */
  fun createCopy(
    transform: SubtreeTransform  = definedExternally,
  ): SubtreeShape
  
  /**
   * Returns the [BorderLine] instance that describes the [SubtreeShape] at the given side.
   * @param [side] one of the predefined borderline directions
   * @return the [BorderLine] instance for the given side
   * @throws ArgumentError if the given index is invalid
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubtreeShape%23SubtreeShape-method-getBorderLine">Online Documentation</a>
   */
  fun getBorderLine(
    side: Side,
  ): BorderLine
  
  /**
   * Merges the given [SubtreeShape] instance with this [SubtreeShape] instance.
   * @param [other] the [SubtreeShape] to be merged with this [SubtreeShape]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubtreeShape%23SubtreeShape-method-mergeWith">Online Documentation</a>
   */
  fun mergeWith(
    other: SubtreeShape,
  )
  
  /**
   * Moves this [SubtreeShape] instance and its connector by the given offsets.
   * @param [dx] the delta x-offset by which this shape will be moved
   * @param [dy] the delta y-offset by which this shape will be moved
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubtreeShape%23SubtreeShape-method-move">Online Documentation</a>
   */
  fun move(
    dx: Double,
    dy: Double,
  )
  
  /**
   * Adds the line segments of the connector to the bounds of this [SubtreeShape] instance.
   * @see [addTargetPoint]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubtreeShape%23SubtreeShape-method-updateConnectorShape">Online Documentation</a>
   */
  fun updateConnectorShape()
  
  companion object : ClassMetadata<SubtreeShape> {
  }
}

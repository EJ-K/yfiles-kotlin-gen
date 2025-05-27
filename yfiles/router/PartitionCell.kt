// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.collections.IList
import yfiles.geometry.Rect
import yfiles.lang.ClassMetadata
import yfiles.layout.LayoutGridCellDescriptor
import yfiles.layout.LayoutNode

/**
 * A [PartitionCell] represents a rectangular part of an [IRouterPartition] as result of the decomposition process for the path search algorithm of [EdgeRouter].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCell">Online Documentation</a>
 * 
 * @constructor Creates a new [PartitionCell] of the given [IRouterPartition] with the location and the size of the given rectangle.
 * @param [bounds] The bounds describing the size and location of the partition cell
 * @param [partition] The partition to which the partition cell belongs
 * @see [IRouterPartition]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCell%23PartitionCell-constructor-PartitionCell">Online Documentation</a>
 * 
 * @property bounds
 * Gets the bounds of this [PartitionCell].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCell%23bounds">Online Documentation</a>
 * 
 * @property partition
 * Gets the [partition][IRouterPartition] to which this [PartitionCell] belongs.
 * @see [IRouterPartition]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCell%23partition">Online Documentation</a>
 */
external class PartitionCell (
final val bounds: Rect,
final val partition: IRouterPartition?)  {
  /**
   * Gets the height of this [PartitionCell].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCell%23height">Online Documentation</a>
   */
  final val height: Double
  
  /**
   * Gets a unique identifier of this [PartitionCell].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCell%23id">Online Documentation</a>
   */
  final val id: Int
  
  /**
   * Gets the x-coordinate of the right border of this [PartitionCell].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCell%23maxX">Online Documentation</a>
   */
  final val maxX: Double
  
  /**
   * Gets the y-coordinate of the bottom border of this [PartitionCell].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCell%23maxY">Online Documentation</a>
   */
  final val maxY: Double
  
  /**
   * Gets the x-coordinate of the left border of this [PartitionCell].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCell%23minX">Online Documentation</a>
   */
  final val minX: Double
  
  /**
   * Gets the y-coordinate of the upper border of this [PartitionCell].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCell%23minY">Online Documentation</a>
   */
  final val minY: Double
  
  /**
   * Gets the width of this [PartitionCell].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCell%23width">Online Documentation</a>
   */
  final val width: Double
  
  /**
   * Returns the list of nodes whose bounds cover or intersect this cell.
   * @return the nodes whose bounds cover or intersect this cell
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCell%23PartitionCell-method-getIntersectingNodes">Online Documentation</a>
   */
  fun getIntersectingNodes(): IList<out LayoutNode>
  
  /**
   * Returns the [LayoutGridCellDescriptor] of the [LayoutGrid][yfiles.layout.LayoutGrid] covering this cell.
   * @return the [LayoutGridCellDescriptor] of the [LayoutGrid][yfiles.layout.LayoutGrid] covering this cell
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCell%23PartitionCell-method-getLayoutGridCellDescriptor">Online Documentation</a>
   */
  fun getLayoutGridCellDescriptor(): LayoutGridCellDescriptor?
  
  /**
   * Returns the list of nodes in [node-to-edge distance][EdgeRouter] of this cell.
   * @return the nodes in [node-to-edge distance][EdgeRouter] of this cell
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCell%23PartitionCell-method-getNodesInNodeToEdgeDistance">Online Documentation</a>
   */
  fun getNodesInNodeToEdgeDistance(): IList<out LayoutNode>
  
  companion object : ClassMetadata<PartitionCell> {
  }
}

// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

/**
 * Routing types for segments routed by the [EdgeRouter].
 * @see [EdgeCellInfo.type]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RoutingType">Online Documentation</a>
 */

sealed external class RoutingType {
  /**
   * A routing type representing a straight crossing of the [PartitionCell], i.e., a single orthogonal segment enters and exits the cell.
   * 
   * Value - `0`
   * @see [EdgeCellInfo.type]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RoutingType%23STRAIGHT">Online Documentation</a>
   */
  object STRAIGHT: RoutingType
  
  /**
   * A routing type representing a crossing of the [PartitionCell] with three segments, i.e., the item enters and exits the cell using the same direction but has an orthogonal middle segment between the entering and exiting segments.
   * 
   * Value - `1`
   * @see [EdgeCellInfo.type]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RoutingType%23STRAIGHT_BENDING">Online Documentation</a>
   */
  object STRAIGHT_BENDING: RoutingType
  
  /**
   * A routing type representing a crossing of the [PartitionCell] with a single bend, i.e., the item enters the cell in one direction, makes a bend, and exits the cell in an orthogonal direction.
   * 
   * Value - `2`
   * @see [EdgeCellInfo.type]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RoutingType%23BENDING">Online Documentation</a>
   */
  object BENDING: RoutingType
  
  /**
   * A routing type representing a crossing of the [PartitionCell] by making a U-turn, i.e., the item enters and exits the cell on the same side using two turns and an orthogonal middle segment.
   * 
   * Value - `3`
   * @see [EdgeCellInfo.type]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RoutingType%23U_TURN">Online Documentation</a>
   */
  object U_TURN: RoutingType
  
  /**
   * A routing type representing the source or target end of an item being in the cell, i.e., the enter and/or exit interval is `null`.
   * 
   * Value - `4`
   * @see [EdgeCellInfo.type]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RoutingType%23END">Online Documentation</a>
   */
  object END: RoutingType
}

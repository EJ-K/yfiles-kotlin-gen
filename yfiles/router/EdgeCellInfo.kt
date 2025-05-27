// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import js.array.ReadonlyArray
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject
import yfiles.layout.Direction

/**
 * This class encapsulates the information that determines the route of a specific item within a specific [partition cell][PartitionCell].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeCellInfo">Online Documentation</a>
 * 
 * @constructor Creates a new [EdgeCellInfo] instance.
 * @param [item] the item whose routing in the cell is described
 * @param [cell] the cell in which the item is routed
 * @param [enterInterval] the interval that the item uses to enter the cell
 * @param [exitInterval] the interval that the item uses to exit the cell
 * @param [enterDirection] the direction in which the item enters the cell
 * @param [exitDirection] the direction in which the item exits the cell
 * @param [enterSegmentIndex] the index of the item segment that enters the cell
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeCellInfo%23EdgeCellInfo-constructor-EdgeCellInfo">Online Documentation</a>
 * 
 * @property item
 * Gets the item that is routed within the [partition cell][cell].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeCellInfo%23item">Online Documentation</a>
 * 
 * @property cell
 * Gets the [partition cell][PartitionCell] within which the item is routed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeCellInfo%23cell">Online Documentation</a>
 * 
 * @property enterInterval
 * Gets the [interval][OrthogonalInterval] that is used to enter this cell.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeCellInfo%23enterInterval">Online Documentation</a>
 * 
 * @property exitInterval
 * Gets the [interval][OrthogonalInterval] that is used to exit this cell.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeCellInfo%23exitInterval">Online Documentation</a>
 * 
 * @property enterDirection
 * Gets the [direction][Direction] in which this cell is entered.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeCellInfo%23enterDirection">Online Documentation</a>
 * 
 * @property exitDirection
 * Gets the [direction][Direction] in which this cell is exited.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeCellInfo%23exitDirection">Online Documentation</a>
 * 
 * @property enterSegmentIndex
 * Gets or sets the index of the segment that enters this cell.
 * 
 * Default value - `0`
 * @throws ArgumentError if the given index is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeCellInfo%23enterSegmentIndex">Online Documentation</a>
 */
external open class EdgeCellInfo  (
open val item: Any,
open val cell: PartitionCell,
open val enterInterval: OrthogonalInterval,
open val exitInterval: OrthogonalInterval,
open val enterDirection: Direction,
open val exitDirection: Direction,
open var enterSegmentIndex: Int) : YObject {

/**
 * Gets the number of bends within this cell.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeCellInfo%23bendCount">Online Documentation</a>
 */
open val bendCount: Int
/**
 * Calculates the list of [CellSegmentInfo]s for the segment parts that lie within the associated [partition cell][cell].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeCellInfo%23cellSegmentInfos">Online Documentation</a>
 */
open val cellSegmentInfos: ReadonlyArray<CellSegmentInfo>
/**
 * Gets or sets the [segment group][SegmentGroup] containing the entering segment.
 * 
 * Default value - `null`. The entering segment does not belong to any [segment group][SegmentGroup].
 * @see [SegmentGroup.commonLocationRange]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeCellInfo%23enterSegmentGroup">Online Documentation</a>
 */
open var enterSegmentGroup: SegmentGroup?
/**
 * Gets or sets the [segment group][SegmentGroup] containing the exiting segment.
 * 
 * Default value - `null`. The exiting segment does not belong to any [segment group][SegmentGroup].
 * @see [SegmentGroup.commonLocationRange]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeCellInfo%23exitSegmentGroup">Online Documentation</a>
 */
open var exitSegmentGroup: SegmentGroup?
/**
 * Gets or sets the index of the segment that exits this cell.
 * 
 * Default value - `0`
 * @throws ArgumentError if the given index is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeCellInfo%23exitSegmentIndex">Online Documentation</a>
 */
open var exitSegmentIndex: Int
/**
 * Gets the routing type within this cell.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeCellInfo%23type">Online Documentation</a>
 */
open val type: RoutingType

companion object : ClassMetadata<EdgeCellInfo> {
}
}

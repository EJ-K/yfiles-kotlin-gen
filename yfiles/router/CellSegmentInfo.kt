// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.lang.ClassMetadata
import yfiles.layout.Direction

/**
 * This class stores information about the part of an item segment that lies inside a specified [partition cell][PartitionCell].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CellSegmentInfo">Online Documentation</a>
 * 
 * @constructor Creates a new [CellSegmentInfo] instance.
 * @param [item] the item to which the segment of this info belongs
 * @param [segmentIndex] the index of the segment to which this info belongs
 * @param [direction] the direction to which the segment of this info points
 * @param [locationRange] the range within which the common location of this segment has to lie
 * @param [minExtension] the minimum interval in extension direction this segment part is known to intersect
 * @param [maxExtension] the maximum interval in extension direction this segment part will span
 * @param [cell] the partition cell within which this part of the edge segment lies
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CellSegmentInfo%23CellSegmentInfo-constructor-CellSegmentInfo">Online Documentation</a>
 * 
 * @property direction
 * Gets the direction to which the segment of this info points.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CellSegmentInfo%23direction">Online Documentation</a>
 * 
 * @property cell
 * Gets the [partition cell][PartitionCell] within which this part of the edge segment lies.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CellSegmentInfo%23cell">Online Documentation</a>
 */
external open class CellSegmentInfo  (
 item: Any ,
 segmentIndex: Int ,
override val direction: Direction,
 locationRange: Interval ,
 minExtension: Interval ,
 maxExtension: Interval ,
open val cell: PartitionCell) : SegmentInfoBase {

companion object : ClassMetadata<CellSegmentInfo> {
}
}

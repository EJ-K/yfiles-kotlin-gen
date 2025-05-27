// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.algorithms.LineSegment
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject
import yfiles.layout.Direction

/**
 * This class stores location information for orthogonal item segments.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SegmentInfoBase">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [SegmentInfoBase].
 * @param [item] the item to which the segment of this info belongs
 * @param [segmentIndex] the index of the segment to which this info belongs
 * @param [direction] the direction to which the segment of this info points
 * @param [locationRange] the range within which the common location of this segment has to lie
 * @param [minExtension] the minimum interval in extension direction this segment is known to intersect
 * @param [maxExtension] the maximum interval in extension direction this segment will span
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SegmentInfoBase%23SegmentInfoBase-constructor-SegmentInfoBase(Object,number,Direction,Interval,Interval,Interval)">Online Documentation</a>
 * 
 * @property segmentIndex
 * Gets the index of the segment of this info.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SegmentInfoBase%23segmentIndex">Online Documentation</a>
 * 
 * @property direction
 * Gets the [Direction] to which the segment of this info points.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SegmentInfoBase%23direction">Online Documentation</a>
 * 
 * @property locationRange
 * Gets the range, i.e., the interval within which the segment should be placed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SegmentInfoBase%23locationRange">Online Documentation</a>
 * 
 * @property minExtension
 * Gets the minimum known extension of the segment, i.e., the minimum interval that this segment will cover in any case.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SegmentInfoBase%23minExtension">Online Documentation</a>
 * 
 * @property maxExtension
 * Gets the maximum extension that this segment can span.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SegmentInfoBase%23maxExtension">Online Documentation</a>
 */
external abstract class SegmentInfoBase 
protected constructor (
 item: Any ,
open val segmentIndex: Int,
open val direction: Direction,
open val locationRange: Interval,
open val minExtension: Interval,
open val maxExtension: Interval) : YObject {
/**
 * Creates a new instance of [SegmentInfoBase] using a line segment to describe the edge segment.
 * @param [item] the item to which this segment info belongs
 * @param [segmentIndex] the index of the segment to which this info belongs
 * @param [segment] a line segment describing the item segment
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SegmentInfoBase%23SegmentInfoBase-constructor-SegmentInfoBase(Object,number,LineSegment)">Online Documentation</a>
 */
protected constructor( item: Any ,
 segmentIndex: Int ,
 segment: LineSegment )

/**
 * Gets whether or not this segment info is fixed, i.e., a [fixed location][location] has been determined within its [location range][locationRange].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SegmentInfoBase%23fixed">Online Documentation</a>
 */
open val fixed: Boolean
/**
 * Gets or sets the [fixed] location within the [location range][locationRange] for this segment info.
 * 
 * Default value - `0`. No fixed location for the segment info has been set.
 * @throws InvalidOperationError if the segment info already has a fixed location
 * @throws ArgumentError if the given location does not lie within the location range
 * @see [fixed]
 * @see [locationRange]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SegmentInfoBase%23location">Online Documentation</a>
 */
open var location: Double
/**
 * Gets or sets the preferred placement of this segment within its location range.
 * 
 * Default value - [Alignment.ANY]. The segment can be placed anywhere within its location range.
 * @throws ArgumentError if an unknown alignment is given
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SegmentInfoBase%23preferredAlignment">Online Documentation</a>
 */
open var preferredAlignment: Alignment
/**
 * Gets or sets the segment group to which this segment info belongs.
 * @see [SegmentGroup.commonLocationRange]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SegmentInfoBase%23segmentGroup">Online Documentation</a>
 */
open var segmentGroup: SegmentGroup
/**
 * Gets whether or not the associated segment is vertical.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SegmentInfoBase%23vertical">Online Documentation</a>
 */
open val vertical: Boolean

companion object : ClassMetadata<SegmentInfoBase> {
}
}

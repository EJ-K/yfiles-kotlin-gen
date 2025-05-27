// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.algorithms.Edge
import yfiles.algorithms.LineSegment
import yfiles.collections.IList
import yfiles.lang.ClassMetadata
import yfiles.layout.Direction

/**
 * A [SegmentInfo] holds information about the possible location of an orthogonal edge segment.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SegmentInfo">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [SegmentInfo] using a [LineSegment] to describe the edge segment.
 * @param [edge] the edge to which the segment of this info belongs
 * @param [segmentIndex] the index of the segment to which this info belongs
 * @param [segment] a line segment describing the edge segment
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SegmentInfo%23SegmentInfo-constructor-SegmentInfo(Edge,number,LineSegment)">Online Documentation</a>
 */
external open class SegmentInfo  ( edge: Edge ,
 segmentIndex: Int ,
 segment: LineSegment ) : SegmentInfoBase {
/**
 * Creates a new instance of [SegmentInfo] with the given information.
 * @param [edge] the edge to which the segment of this info belongs
 * @param [segmentIndex] the index of the segment to which this info belongs
 * @param [direction] the direction to which the segment of this info points
 * @param [locationRange] the range within which the common location of this segment has to lie
 * @param [minExtension] the minimum interval in extension direction this segment is known to intersect
 * @param [maxExtension] the maximum interval in extension direction this segment will span
 * @param [cellSegmentInfos] the list of [CellSegmentInfo] objects upon which this segment info is built
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SegmentInfo%23SegmentInfo-constructor-SegmentInfo(Edge,number,Direction,Interval,Interval,Interval,IList)">Online Documentation</a>
 */
 constructor( edge: Edge ,
 segmentIndex: Int ,
 direction: Direction ,
 locationRange: Interval ,
 minExtension: Interval ,
 maxExtension: Interval ,
 cellSegmentInfos: IList<out CellSegmentInfo> )

/**
 * Gets or sets whether or not this edge segment has the restriction of a strong [PortConstraint][yfiles.layout.PortConstraint].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SegmentInfo%23atStrongPortConstraint">Online Documentation</a>
 */
open var atStrongPortConstraint: Boolean
/**
 * Gets the edge to which the segment of this info belongs.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SegmentInfo%23edge">Online Documentation</a>
 */
open val edge: Edge
/**
 * Sets the [segment group][SegmentGroup] for this segment info and its associated [CellSegmentInfo]s.
 * @see [SegmentGroup]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SegmentInfo%23segmentGroup">Online Documentation</a>
 */
override var segmentGroup: SegmentGroup
/**
 * Returns the number of [CellSegmentInfo] of this segment info.
 * @return the number of [CellSegmentInfo] of this segment info
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SegmentInfo%23SegmentInfo-method-cellSegmentInfoCount">Online Documentation</a>
 */
 open   fun cellSegmentInfoCount():Int
/**
 * Returns the [CellSegmentInfo] at the given index of this segment info.
 * @param [index] the index of the [CellSegmentInfo] to return
 * @return the [CellSegmentInfo] at the given index of this segment info
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SegmentInfo%23SegmentInfo-method-getCellSegmentInfo">Online Documentation</a>
 */
 open   fun getCellSegmentInfo( index: Int ):CellSegmentInfo

companion object : ClassMetadata<SegmentInfo> {
}
}

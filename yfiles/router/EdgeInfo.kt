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
import yfiles.algorithms.Edge
import yfiles.algorithms.LineSegment
import yfiles.algorithms.YList
import yfiles.algorithms.YPoint
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * This class encapsulates the information required to route an edge with a path routing algorithm.
 * @see [ChannelBasedPathRouting]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeInfo">Online Documentation</a>
 * 
 * @constructor Creates a new [EdgeInfo] instance.
 * @param [edge] the edge to create the info for
 * @param [path] the path that will be used for routing the edge
 * @param [configuration] the [configuration][PathSearchConfiguration] of the path search algorithm
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeInfo%23EdgeInfo-constructor-EdgeInfo">Online Documentation</a>
 * 
 * @property edge
 * Gets the edge whose route is described by this [EdgeInfo] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeInfo%23edge">Online Documentation</a>
 */
external open class EdgeInfo  (
open val edge: Edge,
 path: Path ,
 configuration: PathSearchConfiguration ) : YObject {

/**
 * Gets a list of [EdgeCellInfo]s describing how the edge traverses each [PartitionCell] on its path.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeInfo%23edgeCellInfos">Online Documentation</a>
 */
open val edgeCellInfos: ReadonlyArray<EdgeCellInfo>
/**
 * Gets whether the path of this [edge] is fixed or should be routed by the path search algorithm.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeInfo%23fixed">Online Documentation</a>
 */
open val fixed: Boolean
/**
 * Gets or sets the location of the strong source port that the edge uses.
 * 
 * Default value - `null`. No strong source port location for the edge is specified.
 * @throws ArgumentError if the first segment is already fixed and the given port location contradicts the segment's fixed location
 * @see [SegmentInfoBase.location]
 * @see [SegmentInfo.atStrongPortConstraint]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeInfo%23strongSourcePort">Online Documentation</a>
 */
open var strongSourcePort: YPoint?
/**
 * Gets or sets the location of the strong target port that the edge uses.
 * 
 * Default value - `null`. No strong target port location for the edge is specified.
 * @throws ArgumentError if the last segment is already fixed and the given port location contradicts the segment's fixed location
 * @see [SegmentInfoBase.location]
 * @see [SegmentInfo.atStrongPortConstraint]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeInfo%23strongTargetPort">Online Documentation</a>
 */
open var strongTargetPort: YPoint?
/**
 * Calculates an array of [LineSegment]s created by the [calculated path points][calculatePathPoints].
 * @return an array of [LineSegment]s created by the calculated path points
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeInfo%23EdgeInfo-method-calculateLineSegments">Online Documentation</a>
 */
 open   fun calculateLineSegments():ReadonlyArray<LineSegment>
/**
 * Calculates a list of [YPoint]s containing the source port, bend and target port locations.
 * @return a list of [YPoint]s containing the source port, bend and target port locations
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeInfo%23EdgeInfo-method-calculatePathPoints">Online Documentation</a>
 */
 open   fun calculatePathPoints():YList<YPoint>
/**
 * Returns the [EdgeCellInfo] of the given [CellEntrance] in the path.
 * @param [entrance] the entrance for which the [EdgeCellInfo] will be returned
 * @return the [EdgeCellInfo] of the given [CellEntrance] in the path
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeInfo%23EdgeInfo-method-getEdgeCellInfo">Online Documentation</a>
 */
 open   fun getEdgeCellInfo( entrance: CellEntrance ):EdgeCellInfo
/**
 * Returns the [SegmentInfo] of the segment following the segment of the given [SegmentInfo].
 * @param [segment] the segment info for which the next segment info will be returned
 * @return the segment info of the segment following the segment of the given segment info
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeInfo%23EdgeInfo-method-getNextSegment">Online Documentation</a>
 */
 open   fun getNextSegment( segment: SegmentInfo ):SegmentInfo
/**
 * Returns the [SegmentInfo] of the segment preceding the segment of the given [SegmentInfo].
 * @param [segment] the segment info for which the previous segment info will be returned
 * @return the segment info of the segment preceding the segment of the given segment info
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeInfo%23EdgeInfo-method-getPreviousSegment">Online Documentation</a>
 */
 open   fun getPreviousSegment( segment: SegmentInfo ):SegmentInfo
/**
 * Returns the [SegmentInfo] of the edge segment with the given index.
 * @param [segmentIndex] the index of the edge segment for which the segment info will be returned
 * @return the [SegmentInfo] of the edge segment with the given index
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeInfo%23EdgeInfo-method-getSegmentInfo">Online Documentation</a>
 */
 open   fun getSegmentInfo( segmentIndex: Int ):SegmentInfo
/**
 * Returns the number of segments of the edge.
 * @return the number of segments of the edge
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeInfo%23EdgeInfo-method-segmentCount">Online Documentation</a>
 */
 open   fun segmentCount():Int

companion object : ClassMetadata<EdgeInfo> {
}
}

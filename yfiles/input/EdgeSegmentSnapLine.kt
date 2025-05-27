// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.geometry.Point
import yfiles.graph.IEdge
import yfiles.graph.Tag
import yfiles.lang.ClassMetadata

/**
 * A specialized [SnapLine] that is parallel to an edge segment and stores that edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeSegmentSnapLine">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [PointBasedSnapLine] class.
 * @param [edge] The edge to assign to [edge].
 * @param [from] The first location that delimits this snap line.
 * @param [to] The second location that delimits this snap line.
 * @param [segmentSource] The location that represents the source of the related segment on this line.
 * @param [segmentTarget] The location that represents the target of the related segment on this line.
 * @param [distance] The distance of this snap line from its related edge segment.
 * @param [segmentIndex] The segment index of the related edge segment.
 * @param [tag] A tag that is associated with this snap line.
 * @param [weight] The weight (importance) of this snap line.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeSegmentSnapLine%23EdgeSegmentSnapLine-constructor-EdgeSegmentSnapLine(IEdge,Point,Point,Point,Point,number,number,Object,number)">Online Documentation</a>
 * 
 * @property edge
 * Gets the edge that is associated with this snap line.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeSegmentSnapLine%23edge">Online Documentation</a>
 * 
 * @property segmentSource
 * Gets the location that represents the source of the related segment on this line.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeSegmentSnapLine%23segmentSource">Online Documentation</a>
 * 
 * @property segmentTarget
 * Gets the location that represents the target of the related segment on this line.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeSegmentSnapLine%23segmentTarget">Online Documentation</a>
 * 
 * @property distance
 * Gets the distance of this snap line from its related edge segment.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeSegmentSnapLine%23distance">Online Documentation</a>
 * 
 * @property segmentIndex
 * Gets the segment index of the related edge segment.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeSegmentSnapLine%23segmentIndex">Online Documentation</a>
 */
external open class EdgeSegmentSnapLine  (
final val edge: IEdge,
 from: Point ,
 to: Point ,
final val segmentSource: Point,
final val segmentTarget: Point,
final val distance: Double,
final val segmentIndex: Int,
 tag: Tag? ,
 weight: Double ) : SnapLine {
/**
 * Initializes a new instance of the [PointBasedSnapLine] class.
 * @param [edge] The edge to assign to [edge].
 * @param [segmentSource] The location that represents the source of the related segment on this line. In addition, this location is used as [SnapLine.from] location.
 * @param [segmentTarget] The location that represents the target of the related segment on this line. In addition, this location is used as [SnapLine.to] location.
 * @param [distance] The distance of this snap line from its related edge segment.
 * @param [segmentIndex] The segment index of the related edge segment.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeSegmentSnapLine%23EdgeSegmentSnapLine-constructor-EdgeSegmentSnapLine(IEdge,Point,Point,number,number)">Online Documentation</a>
 */
 constructor( edge: IEdge ,
 segmentSource: Point ,
 segmentTarget: Point ,
 distance: Double ,
 segmentIndex: Int )

/**
 * Gets the direction vector of this snap line.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeSegmentSnapLine%23direction">Online Documentation</a>
 */
final val direction: Point
/**
 * Gets or sets the location of the source marker of this snap line.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeSegmentSnapLine%23sourceMarker">Online Documentation</a>
 */
final var sourceMarker: Point?
/**
 * Gets or sets the location of the target marker of this snap line.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeSegmentSnapLine%23targetMarker">Online Documentation</a>
 */
final var targetMarker: Point?

companion object : ClassMetadata<EdgeSegmentSnapLine> {
}
}

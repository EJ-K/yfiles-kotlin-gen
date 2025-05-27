// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import yfiles.geometry.GeneralPath
import yfiles.geometry.Tangent
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * Interface that is used mainly by [IEdgeStyleRenderer] implementations to reveal geometric details about the visualization of an edge's path.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPathGeometry">Online Documentation</a>
 */
external interface IPathGeometry : YObject {
/**
 * Returns a representation of the visible path of the edge in form of a [GeneralPath]
 * @return An instance that describes the visible path or `null` if this is not applicable for the current geometry.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPathGeometry%23IPathGeometry-method-getPath">Online Documentation</a>
 */
   fun getPath():GeneralPath?
/**
 * Returns the number of "segments" this edge's path consists of.
 * @return the number of segments or `-1` if there is no such thing as a segment for this edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPathGeometry%23IPathGeometry-method-getSegmentCount">Online Documentation</a>
 */
   fun getSegmentCount():Int
/**
 * Calculates the tangent on the edge's path at the given ratio point.
 * @param [ratio] a value in [0,1] where 0 is the source's end and 1 is at the target's end of the visible edge path
 * @return The tangential line, if any exists.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPathGeometry%23IPathGeometry-method-getTangent">Online Documentation</a>
 */
   fun getTangent( ratio: Double ):Tangent?
/**
 * Calculates the tangent on the edge's path at the given ratio point for the given segment.
 * @param [segmentIndex] the segment to use for the calculation
 * @param [ratio] a value in [0,1] where 0 is the source's end and 1 is at the target's end of the segment
 * @return The tangential line, if any exists.
 * @see [getTangent]
 * @see [getSegmentCount]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPathGeometry%23IPathGeometry-method-getTangentForSegment">Online Documentation</a>
 */
   fun getTangentForSegment( segmentIndex: Int ,
 ratio: Double ):Tangent?

companion object : InterfaceMetadata<IPathGeometry> {
}
}

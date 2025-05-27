// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.orthogonal

import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * This class provides layout information for the edges of the graph.
 * @see [OrthogonalLayout.EDGE_LAYOUT_DESCRIPTOR_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayoutEdgeLayoutDescriptor">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [EdgeLayoutDescriptor] with the default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayoutEdgeLayoutDescriptor%23EdgeLayoutDescriptor-constructor-EdgeLayoutDescriptor">Online Documentation</a>
 */
@JsName("OrthogonalLayoutEdgeLayoutDescriptor")
external open class EdgeLayoutDescriptor  () : YObject {

/**
 * Gets or sets the minimum length of the first segment of the edge path (at the source node).
 * 
 * Default value - `15.0`
 * @throws ArgumentError if the minimum length of the first segment is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayoutEdgeLayoutDescriptor%23minimumFirstSegmentLength">Online Documentation</a>
 */
open var minimumFirstSegmentLength: Double
/**
 * Gets or sets the minimum length of the last segment of the edge path (at the target node).
 * 
 * Default value - `15.0`
 * @throws ArgumentError if the minimum length of the last segment is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayoutEdgeLayoutDescriptor%23minimumLastSegmentLength">Online Documentation</a>
 */
open var minimumLastSegmentLength: Double
/**
 * Gets or sets the minimum segment length of an edge.
 * 
 * Default value - `15.0`
 * @throws ArgumentError if the minimum length is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayoutEdgeLayoutDescriptor%23minimumSegmentLength">Online Documentation</a>
 */
open var minimumSegmentLength: Double
/**
 * Creates a copy of this [EdgeLayoutDescriptor] instance.
 * @return a copy of this [EdgeLayoutDescriptor] instance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayoutEdgeLayoutDescriptor%23EdgeLayoutDescriptor-method-createCopy">Online Documentation</a>
 */
 open   fun createCopy():EdgeLayoutDescriptor

companion object : ClassMetadata<EdgeLayoutDescriptor> {
}
}

inline fun EdgeLayoutDescriptor(
    block: EdgeLayoutDescriptor.() -> Unit
): EdgeLayoutDescriptor {
    return EdgeLayoutDescriptor()
        .apply(block)
}

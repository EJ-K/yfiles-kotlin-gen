// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.seriesparallel

import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * An [EdgeLayoutDescriptor] provides routing details for an edge that are considered by [SeriesParallelLayout].
 * @see [SeriesParallelLayout.EDGE_LAYOUT_DESCRIPTOR_DP_KEY]
 * @see [SeriesParallelLayout.defaultEdgeLayoutDescriptor]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayoutEdgeLayoutDescriptor">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [EdgeLayoutDescriptor] with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayoutEdgeLayoutDescriptor%23EdgeLayoutDescriptor-constructor-EdgeLayoutDescriptor">Online Documentation</a>
 */
@JsName("SeriesParallelLayoutEdgeLayoutDescriptor")
external open class EdgeLayoutDescriptor  () : YObject {

/**
 * Gets or sets the minimum length for the first segment of the associated edge.
 * 
 * Default value - `15`
 * @throws ArgumentError for negative minimum segment lengths
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayoutEdgeLayoutDescriptor%23minimumFirstSegmentLength">Online Documentation</a>
 */
open var minimumFirstSegmentLength: Double
/**
 * Gets or sets the minimum length for the last segment of the associated edge.
 * 
 * Default value - `15`
 * @throws ArgumentError for negative minimum segment lengths
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayoutEdgeLayoutDescriptor%23minimumLastSegmentLength">Online Documentation</a>
 */
open var minimumLastSegmentLength: Double
/**
 * Gets or sets the minimum length for the associated edge.
 * 
 * Default value - `0`
 * @throws ArgumentError for negative edge lengths
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayoutEdgeLayoutDescriptor%23minimumLength">Online Documentation</a>
 */
open var minimumLength: Double
/**
 * Creates a copy of this [EdgeLayoutDescriptor] instance.
 * @return a copy of this [EdgeLayoutDescriptor] instance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SeriesParallelLayoutEdgeLayoutDescriptor%23EdgeLayoutDescriptor-method-createCopy">Online Documentation</a>
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

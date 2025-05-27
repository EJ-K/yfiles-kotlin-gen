// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.algorithms.YPointPath
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * A [EdgeRouterBusDescriptor] defines settings for edges routed on a common bus by [EdgeRouter].
 * @see [EdgeRouter.BUS_DESCRIPTOR_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterBusDescriptor">Online Documentation</a>
 * 
 * @constructor Creates a new instance of a [EdgeRouterBusDescriptor] with the default values.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterBusDescriptor%23EdgeRouterBusDescriptor-constructor-EdgeRouterBusDescriptor">Online Documentation</a>
 */
external open class EdgeRouterBusDescriptor  () : YObject {

/**
 * Gets or sets whether or not bus edges ending at the same node are automatically grouped such that they share a common bus connection.
 * 
 * Default value - `true`. Edges ending at the same node are automatically grouped.
 * @see [PortConstraintKeys.SOURCE_GROUP_ID_DP_KEY][yfiles.layout.PortConstraintKeys.SOURCE_GROUP_ID_DP_KEY]
 * @see [PortConstraintKeys.TARGET_GROUP_ID_DP_KEY][yfiles.layout.PortConstraintKeys.TARGET_GROUP_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterBusDescriptor%23automaticEdgeGrouping">Online Documentation</a>
 */
open var automaticEdgeGrouping: Boolean
/**
 * Gets or sets the user-specified bus path that represents the backbone for edges associated with this bus.
 * 
 * Default value - `null`. The algorithm automatically detects a suitable bus.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterBusDescriptor%23busPoints">Online Documentation</a>
 */
open var busPoints: YPointPath?
/**
 * Gets the [point path][YPointPath] that describes the bus computed by the [EdgeRouter].
 * @see [busPoints]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterBusDescriptor%23computedBusPoints">Online Documentation</a>
 */
open val computedBusPoints: YPointPath?
/**
 * Gets or sets the preferred minimum length of backbone segments.
 * 
 * Default value - `100.0`
 * @throws ArgumentError if the given minimum length is smaller than `1.0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterBusDescriptor%23minimumBackboneSegmentLength">Online Documentation</a>
 */
open var minimumBackboneSegmentLength: Double
/**
 * Gets or sets whether or not the algorithm may create buses that consist of multiple backbone segments.
 * 
 * Default value - `true`. The algorithm may create buses that consist of multiple backbone segments.
 * @see [busPoints]
 * @see [minimumBackboneSegmentLength]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterBusDescriptor%23multipleBackboneSegments">Online Documentation</a>
 */
open var multipleBackboneSegments: Boolean

companion object : ClassMetadata<EdgeRouterBusDescriptor> {
}
}

inline fun EdgeRouterBusDescriptor(
    block: EdgeRouterBusDescriptor.() -> Unit
): EdgeRouterBusDescriptor {
    return EdgeRouterBusDescriptor()
        .apply(block)
}

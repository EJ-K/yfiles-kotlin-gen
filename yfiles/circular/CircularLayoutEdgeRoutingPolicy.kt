// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.circular

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * @see [CircularLayout.edgeRoutingPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayoutEdgeRoutingPolicy">Online Documentation</a>
 */
external sealed class CircularLayoutEdgeRoutingPolicy: YEnum<CircularLayoutEdgeRoutingPolicy> {
   companion object: EnumMetadata<CircularLayoutEdgeRoutingPolicy> {
       /**
 * An edge routing policy specifying that there all edges are routed inside the circle and on its border as simple straight lines.
 * 
 * Value - `0`
 * @see [CircularLayout.edgeRoutingPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayoutEdgeRoutingPolicy%23INTERIOR">Online Documentation</a>
 */
val INTERIOR: CircularLayoutEdgeRoutingPolicy

/**
 * An edge routing policy specifying that the algorithm automatically determines which edges to route internally and which externally.
 * 
 * Value - `1`
 * @see [CircularLayout.edgeRoutingPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayoutEdgeRoutingPolicy%23AUTOMATIC">Online Documentation</a>
 */
val AUTOMATIC: CircularLayoutEdgeRoutingPolicy

/**
 * An edge routing policy specifying that all edges are routed around the exterior of the circle, except the ones that connect two neighboring nodes.
 * 
 * Value - `2`
 * @see [CircularLayout.edgeRoutingPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayoutEdgeRoutingPolicy%23EXTERIOR">Online Documentation</a>
 */
val EXTERIOR: CircularLayoutEdgeRoutingPolicy

/**
 * An exterior edge routing policy specifying that exterior edges are explicitly marked by the user and the remaining edges are routed on the interior.
 * 
 * Value - `3`
 * @see [CircularLayout.edgeRoutingPolicy]
 * @see [CircularLayout.EXTERIOR_EDGES_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayoutEdgeRoutingPolicy%23MARKED_EXTERIOR">Online Documentation</a>
 */
val MARKED_EXTERIOR: CircularLayoutEdgeRoutingPolicy
   }
}

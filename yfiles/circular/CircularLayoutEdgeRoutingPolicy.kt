// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.circular

/**
 * Provides options for controlling the routing of edges within a [CircularLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayoutEdgeRoutingPolicy">Online Documentation</a>
 */

sealed external class CircularLayoutEdgeRoutingPolicy {
  /**
   * Routes all edges inside the circle or on its border as simple straight lines.
   * 
   * Value - `0`
   * @see [CircularLayout.edgeRoutingPolicy]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayoutEdgeRoutingPolicy%23INTERIOR">Online Documentation</a>
   */
  object INTERIOR: CircularLayoutEdgeRoutingPolicy
  
  /**
   * Automatically determines internal and external routing of edges for optimal layout readability.
   * 
   * Value - `1`
   * @see [CircularLayout.edgeRoutingPolicy]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayoutEdgeRoutingPolicy%23AUTOMATIC">Online Documentation</a>
   */
  object AUTOMATIC: CircularLayoutEdgeRoutingPolicy
  
  /**
   * Routes all edges around the exterior of the circle, except those connecting neighboring nodes.
   * 
   * Value - `2`
   * @see [CircularLayout.edgeRoutingPolicy]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayoutEdgeRoutingPolicy%23EXTERIOR">Online Documentation</a>
   */
  object EXTERIOR: CircularLayoutEdgeRoutingPolicy
}

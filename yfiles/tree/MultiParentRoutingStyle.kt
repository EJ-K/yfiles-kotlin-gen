// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.tree

/**
 * Specifies the routing styles for edges in a multi-parent structure.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiParentRoutingStyle">Online Documentation</a>
 */

sealed external class MultiParentRoutingStyle {
  /**
   * Routing style for routing non-shared edge segments in a polyline fashion.
   * 
   * Value - `0`
   * @see [MultiParentDescriptor.edgeRoutingStyle]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiParentRoutingStyle%23POLYLINE">Online Documentation</a>
   */
  object POLYLINE: MultiParentRoutingStyle
  
  /**
   * Routing style for routing non-shared edge segments in an orthogonal fashion.
   * 
   * Value - `1`
   * @see [MultiParentDescriptor.edgeRoutingStyle]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiParentRoutingStyle%23ORTHOGONAL">Online Documentation</a>
   */
  object ORTHOGONAL: MultiParentRoutingStyle
  
  /**
   * Routing style for routing non-shared edge segments straight.
   * 
   * Value - `2`
   * @see [MultiParentDescriptor.edgeRoutingStyle]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiParentRoutingStyle%23STRAIGHT_LINE">Online Documentation</a>
   */
  object STRAIGHT_LINE: MultiParentRoutingStyle
}

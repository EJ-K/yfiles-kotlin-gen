// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.tree

import yfiles.lang.ClassMetadata

/**
 * The [MultiParentDescriptor] provides style information for multi-parent structures.
 * @see [TreeLayoutData.multiParentDescriptors]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiParentDescriptor">Online Documentation</a>
 * 
 * @constructor Creates a new [MultiParentDescriptor] instance with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiParentDescriptor%23MultiParentDescriptor-constructor-MultiParentDescriptor">Online Documentation</a>
 */
external class MultiParentDescriptor ()  {
  /**
   * Gets or sets the routing style for edges that connect to nodes which constitute a multi-parent structure.
   * 
   * Default value - [MultiParentRoutingStyle.ORTHOGONAL]
   * @throws ArgumentError If the given routing style is unknown
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiParentDescriptor%23edgeRoutingStyle">Online Documentation</a>
   */
  final var edgeRoutingStyle: MultiParentRoutingStyle
  
  /**
   * Gets or sets the minimum distance between the nodes of a multi-parent structure and the bus connecting these nodes.
   * 
   * Default value - `10`
   * @throws ArgumentError if the given bus distance is negative
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiParentDescriptor%23minimumBusDistance">Online Documentation</a>
   */
  final var minimumBusDistance: Double
  
  /**
   * Gets or sets the minimum distance between two nodes belonging to the same multi-parent structure.
   * 
   * Default value - `15`
   * @throws ArgumentError if the given node distance is negative
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiParentDescriptor%23minimumNodeDistance">Online Documentation</a>
   */
  final var minimumNodeDistance: Double
  
  /**
   * Gets or sets the relative vertical alignment of nodes belonging to the same multi-parent structure.
   * 
   * Default value - `0.5`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiParentDescriptor%23verticalAlignment">Online Documentation</a>
   */
  final var verticalAlignment: Double
  
  companion object : ClassMetadata<MultiParentDescriptor> {
  }
}

inline fun MultiParentDescriptor(
    block: MultiParentDescriptor.() -> Unit
): MultiParentDescriptor {
    return MultiParentDescriptor()
        .apply(block)
}

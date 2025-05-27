// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.tree

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * @see [DefaultNodePlacer]
 * @see [DefaultNodePlacer.routingStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayoutEdgeRoutingStyle">Online Documentation</a>
 */
@JsName("TreeLayoutEdgeRoutingStyle")
external sealed class RoutingStyle: YEnum<RoutingStyle> {
   companion object: EnumMetadata<RoutingStyle> {
       /**
 * Routing style specifier which defines that edge paths are routed orthogonally with the bends located in the channel between the root node and the child nodes.
 * 
 * Value - `1`
 * @see [DefaultNodePlacer.routingStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayoutEdgeRoutingStyle%23FORK">Online Documentation</a>
 */
val FORK: RoutingStyle

/**
 * Routing style specifier which defines that edge paths are routed orthogonally with just one bend.
 * 
 * Value - `2`
 * @see [DefaultNodePlacer.routingStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayoutEdgeRoutingStyle%23FORK_AT_ROOT">Online Documentation</a>
 */
val FORK_AT_ROOT: RoutingStyle

/**
 * Routing style specifier which defines that edge paths are routed with a straight segment to the center of the child nodes.
 * 
 * Value - `3`
 * @see [DefaultNodePlacer.routingStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayoutEdgeRoutingStyle%23STRAIGHT">Online Documentation</a>
 */
val STRAIGHT: RoutingStyle

/**
 * Routing style constant which defines that edge paths are routed with a straight segment to the connector of the [SubtreeShape] of the child nodes.
 * 
 * Value - `4`
 * @see [DefaultNodePlacer.routingStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayoutEdgeRoutingStyle%23POLYLINE">Online Documentation</a>
 */
val POLYLINE: RoutingStyle
   }
}

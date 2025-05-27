// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Routing policies for edge routing algorithms to specify whether a new path is calculated in any case or if the existing routes determine whether a new path is necessary.
 * @see [BusDescriptor]
 * @see [BusDescriptor.routingPolicy]
 * @see [ChannelEdgeRouter.routingPolicy]
 * @see [EdgeLayoutDescriptor.routingPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RoutingPolicy">Online Documentation</a>
 */
external sealed class RoutingPolicy: YEnum<RoutingPolicy> {
   companion object: EnumMetadata<RoutingPolicy> {
       /**
 * A routing policy that indicates that a new route is calculated in any case.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RoutingPolicy%23ALWAYS">Online Documentation</a>
 */
val ALWAYS: RoutingPolicy

/**
 * A routing policy that indicates that based on the current path it is automatically determined whether an edge is routed, and if so, the edge gets a whole new path.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RoutingPolicy%23PATH_AS_NEEDED">Online Documentation</a>
 */
val PATH_AS_NEEDED: RoutingPolicy

/**
 * A routing policy that indicates that based on the current path it is automatically determined whether the edge is routed, and if so, only the necessary segments are changed.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RoutingPolicy%23SEGMENTS_AS_NEEDED">Online Documentation</a>
 */
val SEGMENTS_AS_NEEDED: RoutingPolicy
   }
}

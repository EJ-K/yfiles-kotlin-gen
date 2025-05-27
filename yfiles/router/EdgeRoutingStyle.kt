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
 * Routing styles for edges routed by the [EdgeRouter].
 * @see [EdgeLayoutDescriptor.routingStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterEdgeRoutingStyle">Online Documentation</a>
 */
@JsName("EdgeRouterEdgeRoutingStyle")
external sealed class EdgeRoutingStyle: YEnum<EdgeRoutingStyle> {
   companion object: EnumMetadata<EdgeRoutingStyle> {
       /**
 * A routing style constant specifying that the edge should be orthogonal.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterEdgeRoutingStyle%23ORTHOGONAL">Online Documentation</a>
 */
val ORTHOGONAL: EdgeRoutingStyle

/**
 * A routing style constant specifying that the edge should be octilinear.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterEdgeRoutingStyle%23OCTILINEAR">Online Documentation</a>
 */
val OCTILINEAR: EdgeRoutingStyle

/**
 * A routing style constant specifying that the edge should be curved.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterEdgeRoutingStyle%23CURVED">Online Documentation</a>
 */
val CURVED: EdgeRoutingStyle
   }
}

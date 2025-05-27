// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.hierarchic

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Routing styles for edges routed by the [HierarchicLayout].
 * @see [RoutingStyle]
 * @see [RoutingStyle.backLoopRoutingStyle]
 * @see [RoutingStyle.defaultEdgeRoutingStyle]
 * @see [RoutingStyle.edgeGroupRoutingStyle]
 * @see [RoutingStyle.sameLayerEdgeRoutingStyle]
 * @see [RoutingStyle.selfLoopRoutingStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutEdgeRoutingStyle">Online Documentation</a>
 */
@JsName("HierarchicLayoutEdgeRoutingStyle")
external sealed class EdgeRoutingStyle: YEnum<EdgeRoutingStyle> {
   companion object: EnumMetadata<EdgeRoutingStyle> {
       /**
 * A routing style constant specifying that the edges should be orthogonal.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutEdgeRoutingStyle%23ORTHOGONAL">Online Documentation</a>
 */
val ORTHOGONAL: EdgeRoutingStyle

/**
 * A routing style constant specifying that the edges should be octilinear.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutEdgeRoutingStyle%23OCTILINEAR">Online Documentation</a>
 */
val OCTILINEAR: EdgeRoutingStyle

/**
 * A routing style constant specifying that the edges should be polyline.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutEdgeRoutingStyle%23POLYLINE">Online Documentation</a>
 */
val POLYLINE: EdgeRoutingStyle

/**
 * A routing style constant specifying that the edges should be curved.
 * 
 * Value - `3`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutEdgeRoutingStyle%23CURVED">Online Documentation</a>
 */
val CURVED: EdgeRoutingStyle
   }
}

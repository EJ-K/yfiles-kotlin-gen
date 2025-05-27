// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.partial

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * @see [ClearAreaLayout.edgeRoutingStrategy]
 * @see [PartialLayout.edgeRoutingStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayoutEdgeRoutingStrategy">Online Documentation</a>
 */
@JsName("PartialLayoutEdgeRoutingStrategy")
external sealed class EdgeRoutingStrategy: YEnum<EdgeRoutingStrategy> {
   companion object: EnumMetadata<EdgeRoutingStrategy> {
       /**
 * A routing strategy that produces orthogonal routes.
 * 
 * Value - `0`
 * @see [PartialLayout.edgeRoutingStrategy]
 * @see [ClearAreaLayout.edgeRoutingStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayoutEdgeRoutingStrategy%23ORTHOGONAL">Online Documentation</a>
 */
val ORTHOGONAL: EdgeRoutingStrategy

/**
 * A routing strategy that produces straight-line routes.
 * 
 * Value - `1`
 * @see [PartialLayout.edgeRoutingStrategy]
 * @see [ClearAreaLayout.edgeRoutingStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayoutEdgeRoutingStrategy%23STRAIGHTLINE">Online Documentation</a>
 */
val STRAIGHTLINE: EdgeRoutingStrategy

/**
 * Automatically chooses a suitable routing strategy by analyzing the existing edge routes.
 * 
 * Value - `2`
 * @see [PartialLayout.edgeRoutingStrategy]
 * @see [ClearAreaLayout.edgeRoutingStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayoutEdgeRoutingStrategy%23AUTOMATIC">Online Documentation</a>
 */
val AUTOMATIC: EdgeRoutingStrategy

/**
 * A routing strategy that produces organic routes for partial edges and inter-edges.
 * 
 * Value - `3`
 * @see [PartialLayout.edgeRoutingStrategy]
 * @see [ClearAreaLayout.edgeRoutingStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayoutEdgeRoutingStrategy%23ORGANIC">Online Documentation</a>
 */
val ORGANIC: EdgeRoutingStrategy

/**
 * A routing strategy that produces octilinear routes.
 * 
 * Value - `4`
 * @see [PartialLayout.edgeRoutingStrategy]
 * @see [ClearAreaLayout.edgeRoutingStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayoutEdgeRoutingStrategy%23OCTILINEAR">Online Documentation</a>
 */
val OCTILINEAR: EdgeRoutingStrategy
   }
}

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
 * Scope enumeration for various edge routing algorithms, used to define whether all edges are routed or only a subset.
 * @see [BusRouter.scope]
 * @see [CurveRoutingStage.scope]
 * @see [EdgeRouter.scope]
 * @see [PolylineLayoutStage.scope]
 * @see [StraightLineEdgeRouter.scope]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterScope">Online Documentation</a>
 */
@JsName("EdgeRouterScope")
external sealed class Scope: YEnum<Scope> {
   companion object: EnumMetadata<Scope> {
       /**
 * A scope specifier which defines that all edges of the input graph will be routed.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterScope%23ROUTE_ALL_EDGES">Online Documentation</a>
 */
val ROUTE_ALL_EDGES: Scope

/**
 * A scope specifier which defines that only the selected edges of the input graph will be routed.
 * 
 * Value - `1`
 * @see [EdgeRouter.affectedEdgesDpKey]
 * @see [BusRouter.affectedEdgesDpKey]
 * @see [BusRouter.DEFAULT_AFFECTED_EDGES_DP_KEY]
 * @see [CurveRoutingStage.affectedEdgesDpKey]
 * @see [PolylineLayoutStage.affectedEdgesDpKey]
 * @see [StraightLineEdgeRouter.affectedEdgesDpKey]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterScope%23ROUTE_AFFECTED_EDGES">Online Documentation</a>
 */
val ROUTE_AFFECTED_EDGES: Scope

/**
 * A scope specifier which defines that only edges incident to selected nodes will be routed.
 * 
 * Value - `4`
 * @see [EdgeRouter.affectedNodesDpKey]
 * @see [CurveRoutingStage.affectedNodesDpKey]
 * @see [PolylineLayoutStage.affectedNodesDpKey]
 * @see [StraightLineEdgeRouter.affectedNodesDpKey]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeRouterScope%23ROUTE_EDGES_AT_AFFECTED_NODES">Online Documentation</a>
 */
val ROUTE_EDGES_AT_AFFECTED_NODES: Scope
   }
}

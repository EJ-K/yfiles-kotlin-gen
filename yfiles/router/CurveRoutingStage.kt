// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.algorithms.EdgeDpKey
import yfiles.algorithms.NodeDpKey
import yfiles.lang.ClassMetadata
import yfiles.layout.ILayoutAlgorithm
import yfiles.layout.LayoutGraph
import yfiles.layout.LayoutStageBase

/**
 * [CurveRoutingStage] replaces polyline edge paths with curved segments using cubic bezier splines.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveRoutingStage">Online Documentation</a>
 * 
 * @constructor Creates a new [CurveRoutingStage] instance using the given optional [core layout algorithm][LayoutStageBase.coreLayout].
 * @param [core] the core layout algorithm
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveRoutingStage%23CurveRoutingStage-constructor-CurveRoutingStage">Online Documentation</a>
 */
external open class CurveRoutingStage  ( core: ILayoutAlgorithm?  = definedExternally) : LayoutStageBase {

/**
 * Gets or sets the [IDataProvider][yfiles.algorithms.IDataProvider] key to look up which edges are routed.
 * 
 * Default value - [LayoutKeys.AFFECTED_EDGES_DP_KEY][yfiles.layout.LayoutKeys.AFFECTED_EDGES_DP_KEY]
 * @see [scope]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveRoutingStage%23affectedEdgesDpKey">Online Documentation</a>
 */
open var affectedEdgesDpKey: EdgeDpKey<Boolean>
/**
 * Gets or sets the [IDataProvider][yfiles.algorithms.IDataProvider] key to look up the nodes whose incident edges are routed.
 * 
 * Default value - [LayoutKeys.AFFECTED_NODES_DP_KEY][yfiles.layout.LayoutKeys.AFFECTED_NODES_DP_KEY]
 * @see [scope]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveRoutingStage%23affectedNodesDpKey">Online Documentation</a>
 */
open var affectedNodesDpKey: NodeDpKey<Boolean>
/**
 * Gets or sets whether or not edge labels are considered while determining curved edge routes.
 * 
 * Default value - `true`. Edge labels are considered
 * @see [PreferredPlacementDescriptor][yfiles.layout.PreferredPlacementDescriptor]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveRoutingStage%23considerEdgeLabels">Online Documentation</a>
 */
open var considerEdgeLabels: Boolean
/**
 * Gets or sets whether or not node labels are considered while determining spline routes.
 * 
 * Default value - `true`. Node labels are considered
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveRoutingStage%23considerNodeLabels">Online Documentation</a>
 */
open var considerNodeLabels: Boolean
/**
 * Gets or sets the default [CurveEdgeLayoutDescriptor] which provides layout information that is considered when adding curves to the edge path.
 * 
 * Default value - [CurveEdgeLayoutDescriptor]
 * @see [CURVE_EDGE_LAYOUT_DESCRIPTOR_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveRoutingStage%23defaultEdgeLayoutDescriptor">Online Documentation</a>
 */
open var defaultEdgeLayoutDescriptor: CurveEdgeLayoutDescriptor
/**
 * Gets or sets the (sub-)set of edges whose routes shall be converted to curved ones.
 * 
 * Default value - [Scope.ROUTE_ALL_EDGES]
 * @throws ArgumentError if the given scope is unknown
 * @see [affectedEdgesDpKey]
 * @see [affectedNodesDpKey]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveRoutingStage%23scope">Online Documentation</a>
 */
open var scope: Scope
/**
 * Adds curved segments to the edge routes produced by the [core layout algorithm][LayoutStageBase.coreLayout].
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveRoutingStage%23CurveRoutingStage-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )

companion object : ClassMetadata<CurveRoutingStage> {
/**
 * A data provider key for specifying individual edge layout information.
 * @see [CurveEdgeLayoutDescriptor]
 * @see [defaultEdgeLayoutDescriptor]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveRoutingStage%23CURVE_EDGE_LAYOUT_DESCRIPTOR_DP_KEY">Online Documentation</a>
 */
 val CURVE_EDGE_LAYOUT_DESCRIPTOR_DP_KEY: EdgeDpKey<CurveEdgeLayoutDescriptor>
}
}

inline fun CurveRoutingStage(
    block: CurveRoutingStage.() -> Unit
): CurveRoutingStage {
    return CurveRoutingStage()
        .apply(block)
}

// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.algorithms.NodeDpKey
import yfiles.lang.ClassMetadata

/**
 * A [layout stage][ILayoutStage] that can handle fixed nodes in hierarchically grouped graphs.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FixGroupLayoutStage">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [FixGroupLayoutStage] with an optional [core layout algorithm][LayoutStageBase.coreLayout].
 * @param [coreLayout] The core layout algorithm.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FixGroupLayoutStage%23FixGroupLayoutStage-constructor-FixGroupLayoutStage">Online Documentation</a>
 */
external open class FixGroupLayoutStage  ( coreLayout: ILayoutAlgorithm?  = definedExternally) : LayoutStageBase {

/**
 * Gets or sets the edge routing algorithm that is applied to route the inter-edges.
 * 
 * Default value - [CompositeLayoutStage]. A [CompositeLayoutStage] associated with a [HideGroupsStage] and an [EdgeRouter][yfiles.router.EdgeRouter].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FixGroupLayoutStage%23interEdgeRouter">Online Documentation</a>
 */
open var interEdgeRouter: ILayoutAlgorithm
/**
 * Gets or sets the inter-edge routing style used by this layout stage.
 * 
 * Default value - [InterEdgeRoutingStyle.ADOPT]. Inter-edge routes will be adopted from the core layout algorithm.
 * @throws ArgumentError if the given routing style is unknown
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FixGroupLayoutStage%23interEdgeRoutingStyle">Online Documentation</a>
 */
open var interEdgeRoutingStyle: InterEdgeRoutingStyle
/**
 * Calculates the layout for the given graph, that is, prepares the graph by hiding the content of fixed group nodes for the [core layout algorithm][LayoutStageBase.coreLayout], executes it and, finally, restores the graph and routes inter-edges.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FixGroupLayoutStage%23FixGroupLayoutStage-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )

companion object : ClassMetadata<FixGroupLayoutStage> {
/**
 * A data provider key for selecting group nodes whose contents should keep their relative positions.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FixGroupLayoutStage%23FIXED_GROUP_NODES_DP_KEY">Online Documentation</a>
 */
 val FIXED_GROUP_NODES_DP_KEY: NodeDpKey<Boolean>
}
}

inline fun FixGroupLayoutStage(
    block: FixGroupLayoutStage.() -> Unit
): FixGroupLayoutStage {
    return FixGroupLayoutStage()
        .apply(block)
}

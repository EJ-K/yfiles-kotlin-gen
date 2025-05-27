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
import yfiles.lang.ClassMetadata
import yfiles.layout.ILayoutAlgorithm
import yfiles.layout.LayoutGraph
import yfiles.layout.LayoutStageBase

/**
 * This edge routing algorithm generates orthogonal routes for the edges of the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChannelEdgeRouter">Online Documentation</a>
 * 
 * @constructor Creates a new [ChannelEdgeRouter] instance with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChannelEdgeRouter%23ChannelEdgeRouter-constructor-ChannelEdgeRouter">Online Documentation</a>
 */
external open class ChannelEdgeRouter  () : LayoutStageBase {

/**
 * Gets or sets the strategy for the edge distribution step.
 * 
 * Default value - [OrthogonalSegmentDistributionStage]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChannelEdgeRouter%23edgeDistributionStrategy">Online Documentation</a>
 */
open var edgeDistributionStrategy: ILayoutAlgorithm?
/**
 * Gets or sets the strategy for the path finding step.
 * 
 * Default value - [OrthogonalPatternEdgeRouter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChannelEdgeRouter%23pathFinderStrategy">Online Documentation</a>
 */
open var pathFinderStrategy: ILayoutAlgorithm?
/**
 * Gets or sets the routing policy indicating if the edges are unconditionally routed or if the existing routes determines whether a new path is necessary.
 * 
 * Default value - [RoutingPolicy.ALWAYS]. The edges are routed, ignoring the existing sketch.
 * @throws ArgumentError if an unknown routing policy is given
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChannelEdgeRouter%23routingPolicy">Online Documentation</a>
 */
open var routingPolicy: RoutingPolicy
/**
 * Performs the orthogonal routing of the edges of the input graph.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChannelEdgeRouter%23ChannelEdgeRouter-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )
/**
 * Checks the sizes of the nodes to be non-zero.
 * @param [g] The graph to check.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChannelEdgeRouter%23ChannelEdgeRouter-method-checkNodeSize">Online Documentation</a>
 */
 open protected   fun checkNodeSize( g: LayoutGraph )

companion object : ClassMetadata<ChannelEdgeRouter> {
/**
 * A data provider key for marking the edges that should be routed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChannelEdgeRouter%23AFFECTED_EDGES_DP_KEY">Online Documentation</a>
 */
 val AFFECTED_EDGES_DP_KEY: EdgeDpKey<Boolean>
}
}

inline fun ChannelEdgeRouter(
    block: ChannelEdgeRouter.() -> Unit
): ChannelEdgeRouter {
    return ChannelEdgeRouter()
        .apply(block)
}

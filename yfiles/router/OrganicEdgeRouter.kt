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
import yfiles.layout.ILayoutStage
import yfiles.layout.LayoutGraph

/**
 * This edge routing algorithm applies organic routes to the edges of the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicEdgeRouter">Online Documentation</a>
 * 
 * @constructor Creates a new [OrganicEdgeRouter] with the given [core layout algorithm][coreLayout].
 * @param [coreLayout] the core layout algorithm
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicEdgeRouter%23OrganicEdgeRouter-constructor-OrganicEdgeRouter">Online Documentation</a>
 * 
 * @property coreLayout
 * Gets or sets the core layout algorithm which arranges the graph before edge routing.
 * 
 * Default value - `null`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicEdgeRouter%23coreLayout">Online Documentation</a>
 */
external open class OrganicEdgeRouter  (
override var coreLayout: ILayoutAlgorithm? = definedExternally) : ILayoutStage {

/**
 * Gets or sets whether or not the initial bend coordinates influence the path routing such that the calculated routes tend to have a similar overall shape.
 * 
 * Default value - `false`. Bends in the input graph are not considered for edge routing.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicEdgeRouter%23considerExistingBends">Online Documentation</a>
 */
open var considerExistingBends: Boolean
/**
 * Gets or sets whether or not edges are allowed to cross nodes.
 * 
 * Default value - `true`. Edges are allowed to cross nodes.
 * @see [createNodeEnlargementStage]
 * @see [minimumDistance]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicEdgeRouter%23edgeNodeOverlapAllowed">Online Documentation</a>
 */
open var edgeNodeOverlapAllowed: Boolean
/**
 * Gets or sets whether or not the initial bend coordinates are kept when determining the edge path.
 * 
 * Default value - `false`. Bends coordinates in the input graph are not kept fix.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicEdgeRouter%23keepExistingBends">Online Documentation</a>
 */
open var keepExistingBends: Boolean
/**
 * Gets or sets the minimum distance the algorithm should guarantee between nodes and non-incident edges.
 * 
 * Default value - `10`
 * @throws ArgumentError if the given minimum distance is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicEdgeRouter%23minimumDistance">Online Documentation</a>
 */
open var minimumDistance: Double
/**
 * Gets or sets whether a rerouting step is performed on all edges or just on a subset where distances are violated.
 * 
 * Default value - `false`. Only edges being too close to nodes are rerouted.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicEdgeRouter%23routeAllEdges">Online Documentation</a>
 */
open var routeAllEdges: Boolean
/**
 * Performs the organic routing of the edges of the input graph.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicEdgeRouter%23OrganicEdgeRouter-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )
/**
 * Returns a [ILayoutStage] which temporarily increases the sizes of the nodes to avoid overlaps.
 * @return the [ILayoutStage] that resizes the nodes
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicEdgeRouter%23OrganicEdgeRouter-method-createNodeEnlargementStage">Online Documentation</a>
 */
 open   fun createNodeEnlargementStage():ILayoutStage

companion object : ClassMetadata<OrganicEdgeRouter> {
/**
 * A data provider key for selecting edges that should be routed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicEdgeRouter%23AFFECTED_EDGES_DP_KEY">Online Documentation</a>
 */
 val AFFECTED_EDGES_DP_KEY: EdgeDpKey<Boolean>
}
}

inline fun OrganicEdgeRouter(
    block: OrganicEdgeRouter.() -> Unit
): OrganicEdgeRouter {
    return OrganicEdgeRouter()
        .apply(block)
}

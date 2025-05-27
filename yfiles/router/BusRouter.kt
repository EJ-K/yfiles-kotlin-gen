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
import yfiles.layout.LayoutGraph
import yfiles.layout.LayoutStageBase

/**
 * An edge routing algorithm which routes edges of a graph in an orthogonal bus-style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BusRouter">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [BusRouter] with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BusRouter%23BusRouter-constructor-BusRouter">Online Documentation</a>
 */
external open class BusRouter  () : LayoutStageBase {

/**
 * Gets or sets the key to register a [IDataProvider][yfiles.algorithms.IDataProvider] for marking edges as *selected*.
 * 
 * Default value - [DEFAULT_AFFECTED_EDGES_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BusRouter%23affectedEdgesDpKey">Online Documentation</a>
 */
open var affectedEdgesDpKey: EdgeDpKey<Boolean>
/**
 * Gets or sets the cost for each edge crossing.
 * 
 * Default value - `1.0`. One direction change is preferred over the crossing of an edge.
 * @throws ArgumentError if the given cost value is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BusRouter%23crossingCost">Online Documentation</a>
 */
open var crossingCost: Double
/**
 * Gets or sets whether or not to route edge segments on grid lines only.
 * 
 * Default value - `false`. Edges are freely routed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BusRouter%23gridRouting">Online Documentation</a>
 */
open var gridRouting: Boolean
/**
 * Gets or sets the equidistant spacing between the horizontal and vertical grid lines.
 * 
 * Default value - `10`
 * @see [gridRouting]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BusRouter%23gridSpacing">Online Documentation</a>
 */
open var gridSpacing: Double
/**
 * Gets or sets the preferred minimum length of a backbone segment.
 * 
 * Default value - `100.0`
 * @throws ArgumentError if the given minimum length is smaller than `1.0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BusRouter%23minimumBackboneSegmentLength">Online Documentation</a>
 */
open var minimumBackboneSegmentLength: Double
/**
 * Gets or sets the minimum number of bus connections a backbone segment must have.
 * 
 * Default value - `3`
 * @throws ArgumentError if the given minimum count is smaller than `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BusRouter%23minimumBusConnectionsCount">Online Documentation</a>
 */
open var minimumBusConnectionsCount: Int
/**
 * Gets or sets the minimum distance between any two edge segments.
 * 
 * Default value - `5`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BusRouter%23minimumDistanceToEdge">Online Documentation</a>
 */
open var minimumDistanceToEdge: Int
/**
 * Gets or sets the minimum distance between edge segments and nodes.
 * 
 * Default value - `10`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BusRouter%23minimumDistanceToNode">Online Documentation</a>
 */
open var minimumDistanceToNode: Int
/**
 * Gets or sets the maximum number of selected backbone segments with the same orientation.
 * 
 * Default value - `2`
 * @throws ArgumentError if the given preferred number is smaller than `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BusRouter%23preferredBackboneSegmentCount">Online Documentation</a>
 */
open var preferredBackboneSegmentCount: Int
/**
 * Gets or sets whether or not collinear bends are removed from the layout.
 * 
 * Default value - `true`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BusRouter%23removeCollinearBends">Online Documentation</a>
 */
open var removeCollinearBends: Boolean
/**
 * Gets or sets whether or not to perform an additional step to reroute the edges such that the number of edge crossings is reduced.
 * 
 * Default value - `false`
 * @see [crossingCost]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BusRouter%23rerouting">Online Documentation</a>
 */
open var rerouting: Boolean
/**
 * Gets or sets the scope for this routing algorithm that determines which edges are routed.
 * 
 * Default value - [Scope.ROUTE_ALL_EDGES]
 * @throws ArgumentError if an unknown scope is given
 * @see [Scope]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BusRouter%23scope">Online Documentation</a>
 */
open var scope: Scope
/**
 * Calculates bus-like routes for the edges in the given input graph.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BusRouter%23BusRouter-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )

companion object : ClassMetadata<BusRouter> {
/**
 * A data provider key for specifying the edge subset to be routed.
 * @see [scope]
 * @see [affectedEdgesDpKey]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BusRouter%23DEFAULT_AFFECTED_EDGES_DP_KEY">Online Documentation</a>
 */
 val DEFAULT_AFFECTED_EDGES_DP_KEY: EdgeDpKey<Boolean>
/**
 * A data provider key for specifying a bus descriptor object for each edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BusRouter%23EDGE_DESCRIPTOR_DP_KEY">Online Documentation</a>
 */
 val EDGE_DESCRIPTOR_DP_KEY: EdgeDpKey<BusDescriptor>
}
}

inline fun BusRouter(
    block: BusRouter.() -> Unit
): BusRouter {
    return BusRouter()
        .apply(block)
}

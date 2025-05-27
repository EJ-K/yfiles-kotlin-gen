// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.algorithms.Edge
import yfiles.algorithms.EdgeDpKey
import yfiles.algorithms.YList
import yfiles.algorithms.YPoint
import yfiles.lang.ClassMetadata
import yfiles.layout.LayoutGraph
import yfiles.layout.LayoutStageBase
import yfiles.layout.PortCandidate

/**
 * [OrthogonalPatternEdgeRouter] routes edges orthogonally such that the resulting layout of the edges consists only of vertical and horizontal segments.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalPatternEdgeRouter">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [OrthogonalPatternEdgeRouter] with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalPatternEdgeRouter%23OrthogonalPatternEdgeRouter-constructor-OrthogonalPatternEdgeRouter">Online Documentation</a>
 */
external open class OrthogonalPatternEdgeRouter  () : LayoutStageBase {

/**
 * Gets or sets the key to register a [IDataProvider][yfiles.algorithms.IDataProvider] which determines the edges that shall be routed by this algorithm.
 * 
 * Default value - [DEFAULT_AFFECTED_EDGES_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalPatternEdgeRouter%23affectedEdgesDpKey">Online Documentation</a>
 */
open var affectedEdgesDpKey: EdgeDpKey<Boolean>
/**
 * Gets or sets the costs for creating a bend on the edge's path.
 * 
 * Default value - `1`
 * @throws ArgumentError if the specified costs are negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalPatternEdgeRouter%23bendCost">Online Documentation</a>
 */
open var bendCost: Double
/**
 * Gets or sets the costs for a crossing between two edges.
 * 
 * Default value - `5`
 * @throws ArgumentError if the specified costs are negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalPatternEdgeRouter%23edgeCrossingCost">Online Documentation</a>
 */
open var edgeCrossingCost: Double
/**
 * Gets or sets the costs for overlapping edge paths.
 * 
 * Default value - `0`
 * @throws ArgumentError if the specified costs are negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalPatternEdgeRouter%23edgeOverlapCost">Online Documentation</a>
 */
open var edgeOverlapCost: Double
/**
 * Gets or sets the origin of the grid.
 * 
 * Default value - [YPoint.ORIGIN]
 * @see [gridRouting]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalPatternEdgeRouter%23gridOrigin">Online Documentation</a>
 */
open var gridOrigin: YPoint
/**
 * Gets or sets whether or not to route the edges on a grid.
 * 
 * Default value - `false`. Edges are not routed on a grid.
 * @see [gridOrigin]
 * @see [gridSpacing]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalPatternEdgeRouter%23gridRouting">Online Documentation</a>
 */
open var gridRouting: Boolean
/**
 * Gets or sets the spacing of the grid on which edges are routed.
 * 
 * Default value - `10.0`
 * @throws ArgumentError if the specified grid spacing is less than `2`
 * @see [gridRouting]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalPatternEdgeRouter%23gridSpacing">Online Documentation</a>
 */
open var gridSpacing: Double
/**
 * Gets or sets the minimum distance that an edge will maintain from its source and target node.
 * 
 * Default value - `10.0`
 * @throws ArgumentError if the specified distance is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalPatternEdgeRouter%23minimumDistance">Online Documentation</a>
 */
open var minimumDistance: Double
/**
 * Gets or sets the monotonic path restriction that should be applied.
 * 
 * Default value - [MonotonicPathRestriction.NONE]
 * @throws ArgumentError if the specified path restriction is unknown
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalPatternEdgeRouter%23monotonicPathRestriction">Online Documentation</a>
 */
open var monotonicPathRestriction: MonotonicPathRestriction
/**
 * Gets or sets the costs for edges that cross nodes.
 * 
 * Default value - `50`
 * @throws ArgumentError if the specified costs are negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalPatternEdgeRouter%23nodeCrossingCost">Online Documentation</a>
 */
open var nodeCrossingCost: Double
/**
 * Routes the edges of the given graph orthogonally.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalPatternEdgeRouter%23OrthogonalPatternEdgeRouter-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )
/**
 * Calculates the costs for all bends of the given path.
 * @param [edge] the edge for which the costs are calculated
 * @param [path] the path of the given edge
 * @param [spc] the source [PortCandidate] for this edge
 * @param [tpc] the target [PortCandidate] for this edge
 * @return the costs for the bends of this path
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalPatternEdgeRouter%23OrthogonalPatternEdgeRouter-method-calculateBendCost">Online Documentation</a>
 */
 open protected   fun calculateBendCost( edge: Edge ,
 path: YList<YPoint> ,
 spc: PortCandidate ,
 tpc: PortCandidate ):Double
/**
 * Calculates the edge cost of a possible edge path, in order to determine which path is the best, i.e., the cheapest.
 * @param [edge] the edge whose costs to calculate
 * @param [path] the edge's path
 * @param [spc] the source [PortCandidate] for this edge
 * @param [tpc] the target [PortCandidate] for this edge
 * @return the sum of all costs for this edge's path
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalPatternEdgeRouter%23OrthogonalPatternEdgeRouter-method-calculateCost">Online Documentation</a>
 */
 open protected   fun calculateCost( edge: Edge ,
 path: YList<YPoint> ,
 spc: PortCandidate ,
 tpc: PortCandidate ):Double
/**
 * Calculates the overall crossing costs of the given path, including edge crossings, edge overlaps and node crossings.
 * @param [edge] the edge for which the costs are calculated
 * @param [path] the path of the given edge
 * @param [spc] the source [PortCandidate] for this edge
 * @param [tpc] the target [PortCandidate] for this edge
 * @return the overall crossing costs of the given path, including edge crossings, edge overlaps and node crossings
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalPatternEdgeRouter%23OrthogonalPatternEdgeRouter-method-calculateCrossingCosts">Online Documentation</a>
 */
 open protected   fun calculateCrossingCosts( edge: Edge ,
 path: YList<YPoint> ,
 spc: PortCandidate ,
 tpc: PortCandidate ):Double
/**
 * Calculates the costs for the length of the given path.
 * @param [edge] the edge for which the costs are calculated
 * @param [path] the path of the given edge
 * @param [spc] the source [PortCandidate] for this edge
 * @param [tpc] the target [PortCandidate] for this edge
 * @return the costs for the length of the given path
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalPatternEdgeRouter%23OrthogonalPatternEdgeRouter-method-calculateEdgeLength">Online Documentation</a>
 */
 open protected   fun calculateEdgeLength( edge: Edge ,
 path: YList<YPoint> ,
 spc: PortCandidate ,
 tpc: PortCandidate ):Double
/**
 * Calculates the costs for the chosen [PortCandidate]s.
 * @param [edge] the edge for which the costs are calculated
 * @param [path] the path of the given edge
 * @param [spc] the source [PortCandidate] for this edge
 * @param [tpc] the target [PortCandidate] for this edge
 * @return the costs for the [PortCandidate]s
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalPatternEdgeRouter%23OrthogonalPatternEdgeRouter-method-calculatePortCandidateCost">Online Documentation</a>
 */
 open protected   fun calculatePortCandidateCost( edge: Edge ,
 path: YList<YPoint> ,
 spc: PortCandidate ,
 tpc: PortCandidate ):Double
/**
 * Calculates the extra penalty that is added to the path's cost if the edge is a self-loop and source and target ports have the same direction.
 * @param [edge] the edge for which the costs are calculated
 * @param [path] the path of the given edge
 * @param [spc] the source [PortCandidate] for this edge
 * @param [tpc] the target [PortCandidate] for this edge
 * @return an extra penalty for specific self-loop paths
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalPatternEdgeRouter%23OrthogonalPatternEdgeRouter-method-calculateSelfLoopSelfSidePenaltyCost">Online Documentation</a>
 */
 open protected   fun calculateSelfLoopSelfSidePenaltyCost( edge: Edge ,
 path: YList<YPoint> ,
 spc: PortCandidate ,
 tpc: PortCandidate ):Double
/**
 * Checks the sizes of the nodes to be non-zero.
 * @param [g] The graph to check.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalPatternEdgeRouter%23OrthogonalPatternEdgeRouter-method-checkNodeSize">Online Documentation</a>
 */
 open protected   fun checkNodeSize( g: LayoutGraph )

companion object : ClassMetadata<OrthogonalPatternEdgeRouter> {
/**
 * A data provider key for determining which edges are routed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalPatternEdgeRouter%23DEFAULT_AFFECTED_EDGES_DP_KEY">Online Documentation</a>
 */
 val DEFAULT_AFFECTED_EDGES_DP_KEY: EdgeDpKey<Boolean>
}
}

inline fun OrthogonalPatternEdgeRouter(
    block: OrthogonalPatternEdgeRouter.() -> Unit
): OrthogonalPatternEdgeRouter {
    return OrthogonalPatternEdgeRouter()
        .apply(block)
}

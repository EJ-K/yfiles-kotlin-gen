// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.hierarchic

import yfiles.algorithms.Edge
import yfiles.algorithms.EdgeDpKey
import yfiles.algorithms.IDataProvider
import yfiles.algorithms.Node
import yfiles.algorithms.NodeDpKey
import yfiles.algorithms.YList
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject
import yfiles.layout.LayoutGraph
import yfiles.layout.PortConstraint

/**
 * This class calculates bend points for self-loops routed in orthogonal or octilinear fashion.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelfLoopCalculator">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [SelfLoopCalculator] using the given parameters.
 * @param [minFirstSegmentLength] the minimum length of the first and last segment of an orthogonally routed self-loop
 * @param [minEdgeDistance] the minimum distance between a pair of self-loops
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelfLoopCalculator%23SelfLoopCalculator-constructor-SelfLoopCalculator">Online Documentation</a>
 */
external open class SelfLoopCalculator  ( minFirstSegmentLength: Double ,
 minEdgeDistance: Double ) : YObject {

/**
 * Calculates all self-loops at the given node of the given input graph.
 * @param [graph] the input graph
 * @param [node] the node whose self-loops will be routed
 * @param [spc] the [IDataProvider] that returns the [PortConstraint] object associated with the source ports of the edges
 * @param [tpc] the [IDataProvider] that returns the [PortConstraint] object associated with the target ports of the edges
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelfLoopCalculator%23SelfLoopCalculator-method-calculateSelfLoops(LayoutGraph,Node,IDataProvider,IDataProvider)">Online Documentation</a>
 */
 open   fun calculateSelfLoops( graph: LayoutGraph ,
 node: Node ,
 spc: IDataProvider<Edge, PortConstraint> ,
 tpc: IDataProvider<Edge, PortConstraint> )
/**
 * Convenience method that calculates a list of self-loops that belong to a given node.
 * @param [graph] the input graph
 * @param [node] the node whose self-loops will be routed
 * @param [selfLoops] a list of [Edge]s that will be routed
 * @param [spc] the [IDataProvider] that returns the [PortConstraint] object associated with the source ports of the edges
 * @param [tpc] the [IDataProvider] that returns the [PortConstraint] object associated with the target ports of the edges
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelfLoopCalculator%23SelfLoopCalculator-method-calculateSelfLoops(LayoutGraph,Node,YList,IDataProvider,IDataProvider)">Online Documentation</a>
 */
 open   fun calculateSelfLoops( graph: LayoutGraph ,
 node: Node ,
 selfLoops: YList<Edge> ,
 spc: IDataProvider<Edge, PortConstraint> ,
 tpc: IDataProvider<Edge, PortConstraint> )
/**
 * Returns the minimum length between two edges associated with the given edge.
 * @param [graph] the input graph
 * @param [edge] the given edge
 * @return the minimum length between two edges
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelfLoopCalculator%23SelfLoopCalculator-method-getMinimumDistance">Online Documentation</a>
 */
 open protected   fun getMinimumDistance( graph: LayoutGraph ,
 edge: Edge ):Double
/**
 * Returns the minimum length of the first segment of the given edge.
 * @param [graph] the input graph
 * @param [edge] the given edge
 * @return the minimum length of the first segment of an edge
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelfLoopCalculator%23SelfLoopCalculator-method-getMinimumFirstSegmentLength">Online Documentation</a>
 */
 open protected   fun getMinimumFirstSegmentLength( graph: LayoutGraph ,
 edge: Edge ):Double
/**
 * Returns the minimum length of the last segment of the given edge.
 * @param [graph] the input graph
 * @param [edge] the given edge
 * @return the minimum length of the last segment of the given edge
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelfLoopCalculator%23SelfLoopCalculator-method-getMinimumLastSegmentLength">Online Documentation</a>
 */
 open protected   fun getMinimumLastSegmentLength( graph: LayoutGraph ,
 edge: Edge ):Double
/**
 * Returns the minimum distance between two nodes associated with the given node.
 * @param [graph] the input graph
 * @param [node] the given node
 * @return the minimum distance between two nodes
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelfLoopCalculator%23SelfLoopCalculator-method-getMinimumNodeDistance">Online Documentation</a>
 */
 open protected   fun getMinimumNodeDistance( graph: LayoutGraph ,
 node: Node ):Double
/**
 * Returns the minimum octilinear segment length of the given edge.
 * @param [graph] the input graph
 * @param [edge] the given edge
 * @return the minimum octilinear segment length of the given edge
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelfLoopCalculator%23SelfLoopCalculator-method-getMinimumOctilinearSegmentLength">Online Documentation</a>
 */
 open protected   fun getMinimumOctilinearSegmentLength( graph: LayoutGraph ,
 edge: Edge ):Double
/**
 * Returns whether or not the given edge is octilinear.
 * @param [graph] the input graph
 * @param [edge] the given edge
 * @return `true` if the edge is octilinear, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelfLoopCalculator%23SelfLoopCalculator-method-isOctilinearEdge">Online Documentation</a>
 */
 open protected   fun isOctilinearEdge( graph: LayoutGraph ,
 edge: Edge ):Boolean

companion object : ClassMetadata<SelfLoopCalculator> {
/**
 * A data provider key for specifying the minimum distance to the next edge or node side.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelfLoopCalculator%23MINIMUM_EDGE_DISTANCE_DP_KEY">Online Documentation</a>
 */
 val MINIMUM_EDGE_DISTANCE_DP_KEY: EdgeDpKey<Double>
/**
 * A data provider key for specifying the minimum length of the first segment of each edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelfLoopCalculator%23MINIMUM_FIRST_SEGMENT_LENGTH_DP_KEY">Online Documentation</a>
 */
 val MINIMUM_FIRST_SEGMENT_LENGTH_DP_KEY: EdgeDpKey<Double>
/**
 * A data provider key for specifying the minimum length of the last segment of each edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelfLoopCalculator%23MINIMUM_LAST_SEGMENT_LENGTH_DP_KEY">Online Documentation</a>
 */
 val MINIMUM_LAST_SEGMENT_LENGTH_DP_KEY: EdgeDpKey<Double>
/**
 * A data provider key for defining for each node a minimum distance to the self-loop edges.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelfLoopCalculator%23MINIMUM_NODE_DISTANCE_DP_KEY">Online Documentation</a>
 */
 val MINIMUM_NODE_DISTANCE_DP_KEY: NodeDpKey<Double>
/**
 * A data provider key for specifying the minimum length of the octilinear segments of an octilinear edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelfLoopCalculator%23MINIMUM_OCTILINEAR_SEGMENT_LENGTH_DP_KEY">Online Documentation</a>
 */
 val MINIMUM_OCTILINEAR_SEGMENT_LENGTH_DP_KEY: EdgeDpKey<Double>
/**
 * A data provider key for specifying whether or not an edge is octilinear.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelfLoopCalculator%23OCTILINEAR_EDGES_DP_KEY">Online Documentation</a>
 */
 val OCTILINEAR_EDGES_DP_KEY: EdgeDpKey<Boolean>
}
}

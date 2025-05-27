// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.algorithms

import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * This class realizes an algorithm that [aggregates nodes][aggregate] and creates a hierarchical clustering structure subject to user-specified constraints like the [type of nodes][nodeTypeHandlingPolicy] as well as the preferred [minimum][minimumClusterSize] and [maximum][maximumClusterSize] size of a cluster.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAggregationAlgorithm">Online Documentation</a>
 * 
 * @constructor Creates a new [NodeAggregation] instance with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAggregationAlgorithm%23NodeAggregation-constructor-NodeAggregation">Online Documentation</a>
 */
@JsName("NodeAggregationAlgorithm")
external open class NodeAggregation  () : YObject {

/**
 * Gets or sets the policy applied for determining the clusters.
 * 
 * Default value - [NodeAggregationPolicy.STRUCTURAL]
 * @throws ArgumentError if an unknown policy is provided
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAggregationAlgorithm%23aggregationPolicy">Online Documentation</a>
 */
open var aggregationPolicy: NodeAggregationPolicy
/**
 * Gets or sets the preferred maximum number of elements contained in a cluster.
 * 
 * Default value - `10`
 * @throws ArgumentError if the maximum cluster size is less than 2
 * @see [minimumClusterSize]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAggregationAlgorithm%23maximumClusterSize">Online Documentation</a>
 */
open var maximumClusterSize: Int
/**
 * Gets or sets the maximum duration in milliseconds that this layout algorithm is allowed to run.
 * 
 * Default value - `<code>0x7FFFFFFF</code>`. The algorithm runs unrestricted.
 * @throws ArgumentError if the specified duration has a negative value
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAggregationAlgorithm%23maximumDuration">Online Documentation</a>
 */
open var maximumDuration: Int
/**
 * Gets or sets the preferred minimum number of elements contained in a cluster.
 * 
 * Default value - `5`
 * @throws ArgumentError if the minimum cluster size is less than 1
 * @see [maximumClusterSize]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAggregationAlgorithm%23minimumClusterSize">Online Documentation</a>
 */
open var minimumClusterSize: Int
/**
 * Gets or sets the policy for handling nodes of different type.
 * 
 * Default value - [NodeAggregationNodeTypeHandlingPolicy.IGNORE]
 * @throws ArgumentError if an unknown policy is provided
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAggregationAlgorithm%23nodeTypeHandlingPolicy">Online Documentation</a>
 */
open var nodeTypeHandlingPolicy: NodeAggregationNodeTypeHandlingPolicy
/**
 * Gets or sets whether or not all original nodes are only mapped to leaves of the directed rooted aggregation tree that represents the hierarchical clustering structure.
 * 
 * Default value - `true`. Nodes are only mapped to leaves of the aggregation tree.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAggregationAlgorithm%23nodesOnlyOnLeaves">Online Documentation</a>
 */
open var nodesOnlyOnLeaves: Boolean
/**
 * Starts the node aggregation for the specified graph.
 * @param [graph] the input graph
 * @param [aggregationResult] stores the result of the aggregation
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAggregationAlgorithm%23NodeAggregation-method-aggregate">Online Documentation</a>
 */
 open   fun aggregate( graph: Graph ,
 aggregationResult: INodeMap<AggregationInfo> )

companion object : ClassMetadata<NodeAggregation> {
/**
 * A data provider key for specifying the directedness of edges.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAggregationAlgorithm%23EDGE_DIRECTEDNESS_DP_KEY">Online Documentation</a>
 */
 val EDGE_DIRECTEDNESS_DP_KEY: EdgeDpKey<EdgeDirectedness>
/**
 * A data provider key for specifying the (non-negative) weights of the edges.
 * @see [aggregationPolicy]
 * @see [NodeAggregationPolicy.STRUCTURAL]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAggregationAlgorithm%23EDGE_WEIGHT_DP_KEY">Online Documentation</a>
 */
 val EDGE_WEIGHT_DP_KEY: EdgeDpKey<Double>
/**
 * A data provider key for specifying the coordinates of the nodes.
 * @see [aggregationPolicy]
 * @see [NodeAggregationPolicy.GEOMETRIC]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAggregationAlgorithm%23NODE_CENTER_DP_KEY">Online Documentation</a>
 */
 val NODE_CENTER_DP_KEY: NodeDpKey<YPoint>
/**
 * A data provider key for specifying the type of the nodes.
 * @see [nodeTypeHandlingPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAggregationAlgorithm%23NODE_TYPE_DP_KEY">Online Documentation</a>
 */
 val NODE_TYPE_DP_KEY: NodeDpKey<Any>
/**
 * A data provider key for specifying the (non-negative) weights of the nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAggregationAlgorithm%23NODE_WEIGHT_DP_KEY">Online Documentation</a>
 */
 val NODE_WEIGHT_DP_KEY: NodeDpKey<Double>
/**
 * A data provider key for specifying the top-level nodes of the aggregation info.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAggregationAlgorithm%23TOP_LEVEL_NODES_DP_KEY">Online Documentation</a>
 */
 val TOP_LEVEL_NODES_DP_KEY: NodeDpKey<Boolean>
}
}

inline fun NodeAggregation(
    block: NodeAggregation.() -> Unit
): NodeAggregation {
    return NodeAggregation()
        .apply(block)
}

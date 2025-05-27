// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.algorithms

import js.array.ReadonlyArray

/**
 * This class provides methods for automatically partitioning nodes of a graph into groups.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupAlgorithm">Online Documentation</a>
 */
@JsName("GroupAlgorithm")
external object Groups {
/**
 * This method partitions the graph by analyzing its *biconnected components*.
 * @receiver the input graph
 * @param [groupIDs] the [INodeMap] that will be filled during the execution and returns an integer value (cluster ID) for each node
 * @return the resulting number of different groups
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupAlgorithm%23Groups-method-biconnectedComponentGrouping">Online Documentation</a>
 */
 final   fun Graph.biconnectedComponentGrouping( groupIDs: INodeMap<Int> ):Int
/**
 * Partitions the graph into groups using *edge betweenness centrality*.
 * ### Preconditions
 * - `minGroupCount <= maxGroupCount`
 * - `minGroupCount <= graph.N()`
 * - `maxGroupCount > 0`
 * @receiver the input graph
 * @param [clusterIDs] the [INodeMap] that will be filled during the execution and returns an integer value (cluster ID) for each node
 * @param [directed] `true` if the graph should be considered as directed, `false` otherwise
 * @param [minGroupCount] the minimum number of groups that will be returned
 * @param [maxGroupCount] the maximum number of groups that will be returned
 * @param [edgeCosts] the [IDataProvider] that holds a positive [Number] cost or `null` if the edges of the graph are considered to be of equal cost
 * @return the resulting number of different groups
 * @throws ArgumentError if `minGroupCount > maxGroupCount` or `minGroupCount > graph.N()` or `maxGroupCount <= 0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupAlgorithm%23Groups-method-edgeBetweennessClustering(Graph,INodeMap,boolean,number,number,IDataProvider)">Online Documentation</a>
 */
 final   fun Graph.edgeBetweennessClustering( clusterIDs: INodeMap<Int> ,
 directed: Boolean ,
 minGroupCount: Int ,
 maxGroupCount: Int ,
 edgeCosts: IDataProvider<Edge, Double>? ):Int
/**
 * Partitions the graph into groups using *edge betweenness clustering* proposed by Girvan and Newman.
 * ### Preconditions
 * - `minGroupCount <= maxGroupCount`
 * - `minGroupCount <= graph.N()`
 * - `maxGroupCount > 0`
 * @receiver the input graph
 * @param [clusterIDs] the [INodeMap] that will be filled during the execution and returns an integer value (cluster ID) for each node
 * @param [qualityTimeRatio] a value between `0.0` (low quality, fast) and `1.0` (high quality, slow); the recommended value is `0.5`
 * @param [minGroupCount] the minimum number of groups that will be returned
 * @param [maxGroupCount] the maximum number of groups that will be returned
 * @param [refine] `true` if the algorithm refines the current grouping, `false` if the algorithm discards the current grouping
 * @return the resulting number of different groups
 * @throws ArgumentError if `minGroupCount > maxGroupCount` or `minGroupCount > graph.N()` or `maxGroupCount <= 0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupAlgorithm%23Groups-method-edgeBetweennessClustering(Graph,INodeMap,number,number,number,boolean)">Online Documentation</a>
 */
 final   fun Graph.edgeBetweennessClustering( clusterIDs: INodeMap<Int> ,
 qualityTimeRatio: Double ,
 minGroupCount: Int ,
 maxGroupCount: Int ,
 refine: Boolean ):Int
/**
 * Calculates the local clustering coefficient for each node and returns the average clustering coefficient.
 * @receiver the input graph
 * @param [coefficientMap] a map that returns the clustering coefficient for each node
 * @param [directed] whether or not the graph is directed
 * @return returns the average clustering coefficient
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupAlgorithm%23Groups-method-getClusteringCoefficient">Online Documentation</a>
 */
 final   fun Graph.getClusteringCoefficient( coefficientMap: INodeMap<Double> ,
 directed: Boolean ):Double
/**
 * Computes the modularity of a given graph.
 * @receiver The input graph.
 * @param [communityIndex] The community index for each node (nodes with same index are associated with the same community).
 * @param [edgeWeight] The weight of the edges.
 *   If no [IDataProvider] is given, an equal weight of `1.0` will be assumed for all edges.
 * @return the modularity of a given graph
 * @throws ArgumentError if no [IDataProvider] `communityIndex` for the community indices is specified
 * @see [louvainModularity]
 * @see [labelPropagation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupAlgorithm%23Groups-method-getModularity">Online Documentation</a>
 */
 final   fun Graph.getModularity( communityIndex: IDataProvider<Node, Int> ,
 edgeWeight: IDataProvider<Edge, Double>  = definedExternally):Double
/**
 * Partitions the graph into clusters based on hierarchical clustering.
 * @receiver the input graph
 * @param [distances] a given [INodeDistanceProvider] object that determines the distance between any two nodes
 * @param [linkage] one of the predefined linkage values
 * @return a [Dendrogram] which represents the result of the clustering as a binary tree or `null` if the given graph is empty
 * @throws ArgumentError if an unknown linkage is given
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupAlgorithm%23Groups-method-hierarchicalClustering(Graph,INodeDistanceProvider,Linkage)">Online Documentation</a>
 */
 final   fun Graph.hierarchicalClustering( distances: INodeDistanceProvider ,
 linkage: Linkage ):Dendrogram?
/**
 * Partitions the graph into clusters based on hierarchical clustering, while the dendrogram is cut based on a given cut-off value.
 * @receiver the input graph
 * @param [clusterIDs] the [INodeMap] that will be filled during the execution and returns an integer value (cluster ID) for each node
 * @param [distances] a given [INodeDistanceProvider] object that determines the distance between any two nodes
 * @param [linkage] one of the predefined linkage values
 * @param [cutOff] the cut-off value that determines where to cut the hierarchic tree into clusters
 * @return the resulting number of clusters
 * @throws ArgumentError if an unknown linkage is used
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupAlgorithm%23Groups-method-hierarchicalClustering(Graph,INodeMap,INodeDistanceProvider,Linkage,number)">Online Documentation</a>
 */
 final   fun Graph.hierarchicalClustering( clusterIDs: INodeMap<Int> ,
 distances: INodeDistanceProvider ,
 linkage: Linkage ,
 cutOff: Double ):Int
/**
 * Partitions the graph into clusters based on hierarchical clustering, while the dendrogram is cut based on a given maximum number of clusters.
 * @receiver the input graph
 * @param [maxCluster] the maximum number of clusters that determines where to cut the hierarchic tree into clusters
 * @param [clusterIDs] the [INodeMap] that will be filled during the execution and returns an integer value (cluster ID) for each node
 * @param [distances] a given [INodeDistanceProvider] object that determines the distance between any two graph nodes
 * @param [linkage] one of the predefined linkage values
 * @return the resulting number of clusters
 * @throws ArgumentError if an unknown linkage is given or if the maximum number of clusters is less than or equal to zero or greater than the number of nodes of the graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupAlgorithm%23Groups-method-hierarchicalClustering(Graph,number,INodeMap,INodeDistanceProvider,Linkage)">Online Documentation</a>
 */
 final   fun Graph.hierarchicalClustering( maxCluster: Int ,
 clusterIDs: INodeMap<Int> ,
 distances: INodeDistanceProvider ,
 linkage: Linkage ):Int
/**
 * Partitions the graph into clusters using k-means clustering algorithm.
 * @receiver the input graph
 * @param [clusterIDs] the [INodeMap] that will be filled during the execution and returns an integer value (cluster ID) for each node
 * @param [nodePositions] the [IDataProvider] that holds a [point][YPoint] representing the current position of each node in the graph
 * @param [distanceMetric] one of the predefined distance metrics
 * @param [k] the number of clusters
 * @param [iterations] the maximum number of iterations performed by the algorithm for convergence
 * @param [centroids] the initial centroids
 * @return the number of resulting (non-empty) clusters
 * @throws ArgumentError if the given distance metric is not supported
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupAlgorithm%23Groups-method-kMeansClustering">Online Documentation</a>
 */
 final   fun Graph.kMeansClustering( clusterIDs: INodeMap<Int> ,
 nodePositions: IDataProvider<Node, YPoint> ,
 distanceMetric: DistanceMetric ,
 k: Int ,
 iterations: Int  = definedExternally,
 centroids: ReadonlyArray<YPoint>  = definedExternally):Int
/**
 * Detects the communities in the specified input graph by applying a label propagation algorithm.
 * @receiver the undirected input graph
 * @param [finalLabel] the [INodeMap] that returns the integer labels of each node after applying the algorithm where nodes without a label receive the value `-1`
 * @param [initialLabel] [IDataProvider] that stores the initial integer labels of each node (negative values indicate that a node is not associated with an initial label).
 *   If no provider is specified, each node starts with a unique label.
 * @param [nodeWeight] [IDataProvider] that stores the weights of the nodes.
 *   If no provider is specified, the algorithm assumes that all nodes have the weight `1.0`.
 * @param [edgeWeight] [IDataProvider] that stores the weights of the edges.
 *   If no provider is specified, the algorithm assumes that all edges have the weight `1.0`.
 * @param [edgeDirectedness] [IDataProvider] that stores the directedness of the edges.
 *   If no provider is specified, the algorithm assumes that all edges are undirected (i.e. have directedness `0.0`).
 * @return the number of resulting communities
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupAlgorithm%23Groups-method-labelPropagation">Online Documentation</a>
 */
 final   fun Graph.labelPropagation( finalLabel: INodeMap<Int> ,
 initialLabel: IDataProvider<Node, Int>  = definedExternally,
 nodeWeight: IDataProvider<Node, Double>  = definedExternally,
 edgeWeight: IDataProvider<Edge, Double>  = definedExternally,
 edgeDirectedness: IDataProvider<Edge, EdgeDirectedness>  = definedExternally):Int
/**
 * Detects the communities in the specified input graph by applying the louvain modularity method.
 * @receiver the input graph
 * @param [communityIndex] [INodeMap] that stores, for each node, the integer community index of the node.
 * @param [edgeWeight] [IDataProvider] that stores the weights of the edges.
 *   If nothing is given, the algorithm will assume that all edges have edge weights equal to `1.0`.
 * @return the number of resulting communities
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupAlgorithm%23Groups-method-louvainModularity">Online Documentation</a>
 */
 final   fun Graph.louvainModularity( communityIndex: INodeMap<Int> ,
 edgeWeight: IDataProvider<Edge, Double>  = definedExternally):Int
}

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
 * This class provides diverse algorithms and helper methods for solving the shortest path problem on weighted graphs.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShortestPathAlgorithm">Online Documentation</a>
 */
@JsName("ShortestPathAlgorithm")
external object ShortestPaths {
/**
 * Solves the single-source single-sink shortest path problem for arbitrary graphs using an implementation of the well-known a-star algorithm (A*).
 * ### Preconditions
 * - `cost.length == graph.E()`
 * - `heuristicCost.length == graph.N()`
 * @receiver the input graph
 * @param [s] the source node
 * @param [t] the sink node
 * @param [directed] `true` if the graph should be considered as directed, `false` otherwise
 * @param [cost] an array of double values that represent the costs for traversing each edge; edge `e` has cost `cost[e.index()]`
 * @param [heuristicCost] an array of double values that represent an estimate to reach the sink node `t`. The value of `heuristicCost[n.index()]` is the estimated heuristic cost to reach node `t` from node `n`
 * @return the list of edges constituting the shortest path from the source node `s` to the sink node `t` or an empty list if there is no such path
 * @see [aStar]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShortestPathAlgorithm%23ShortestPaths-method-aStar(Graph,Node,Node,boolean,number[],number[])">Online Documentation</a>
 */
 final   fun Graph.aStar( s: Node ,
 t: Node? ,
 directed: Boolean ,
 cost: ReadonlyArray<Double> ,
 heuristicCost: ReadonlyArray<Double>? ):EdgeList
/**
 * Solves the single-source single-sink shortest path problem for arbitrary graphs using an implementation of the well-known a-star algorithm (A*).
 * @receiver the input graph
 * @param [s] the source node
 * @param [t] the sink node
 * @param [directed] `true` if the graph should be considered as directed, `false` otherwise
 * @param [cost] the [IDataProvider] that returns the cost for traversing an edge
 * @param [heuristicCost] the [IDataProvider] that yields for each node the heuristic cost estimate to reach the sink node `t` starting from the node
 * @return the list of edges constituting the shortest path from the source node `s` to the sink node `t` or an empty list if there is no such path
 * @see [aStar]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShortestPathAlgorithm%23ShortestPaths-method-aStar(Graph,Node,Node,boolean,IDataProvider,IDataProvider)">Online Documentation</a>
 */
 final   fun Graph.aStar( s: Node ,
 t: Node? ,
 directed: Boolean ,
 cost: IDataProvider<Edge, Double> ,
 heuristicCost: IDataProvider<Node, Double> ):EdgeList
/**
 * Solves the single-source single-sink shortest path problem for arbitrary graphs using an implementation of the well-known a-star algorithm (A*).
 * ### Preconditions
 * - `cost.length == graph.E()`
 * - `heuristicCost.length == graph.N()`
 * - `pred.length == graph.N()`
 * @receiver the input graph
 * @param [s] the source node
 * @param [t] the sink node
 * @param [directed] `true` if the graph should be considered as directed, `false` otherwise
 * @param [cost] an array of double values that represent the costs for traversing each edge; edge `e` has cost `cost[e.index()]`
 * @param [heuristicCost] an array of double values that represent an estimate to reach the sink node `t`. The value of `heuristicCost[n.index()]` is the estimated heuristic cost to reach node `t` from node `n`
 * @param [pred] an array of [Edge]s that will be filled during the execution and holds for each node `t` the shortest path edge `pred[t.index()]` which is the last edge on the shortest path from `s` to `t`. If `t == s` or if there is no shortest path from `s` to `t`, then `pred[t.index()] == null`.
 * @return the shortest distance (cost) between `s` and `t` if a path between these two nodes exists or [Double.POSITIVE_INFINITY] otherwise
 * @see [aStar]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShortestPathAlgorithm%23ShortestPaths-method-aStar(Graph,Node,Node,boolean,number[],number[],Edge[])">Online Documentation</a>
 */
 final   fun Graph.aStar( s: Node ,
 t: Node? ,
 directed: Boolean ,
 cost: ReadonlyArray<Double> ,
 heuristicCost: ReadonlyArray<Double>? ,
 pred: ReadonlyArray<Edge> ):Double
/**
 * Solves the single-source single-sink shortest path problem for arbitrary graphs using an implementation of the well-known a-star algorithm (A*).
 * @receiver the input graph
 * @param [s] the source node
 * @param [t] the sink node
 * @param [directed] `true` if the graph should be considered as directed, `false` otherwise
 * @param [cost] the [IDataProvider] that returns the cost for traversing an edge
 * @param [heuristicCost] the [IDataProvider] that yields for each node the heuristic cost estimate to reach the sink node `t` starting from the node
 * @param [pred] the map that will be filled during the execution and returns for each node `t` the last edge on the shortest path from `s` to `t` or `null` if `t == s` or no shortest path from `s` to `t` exists
 * @return the shortest distance (cost) between `s` and `t` if a path between these two nodes exists or [Double.POSITIVE_INFINITY] otherwise
 * @see [aStar]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShortestPathAlgorithm%23ShortestPaths-method-aStar(Graph,Node,Node,boolean,IDataProvider,IDataProvider,INodeMap)">Online Documentation</a>
 */
 final   fun Graph.aStar( s: Node ,
 t: Node? ,
 directed: Boolean ,
 cost: IDataProvider<Edge, Double> ,
 heuristicCost: IDataProvider<Node, Double> ,
 pred: INodeMap<Edge> ):Double
/**
 * Solves the single-source shortest path problem for **acyclic** directed graphs.
 * ### Preconditions
 * - `pred.length == graph.N()`
 * @receiver the input graph
 * @param [s] the node from which the shortest path search starts
 * @param [cost] an array of double values that returns the costs for traversing each edge; edge `e` has cost `cost[e.index()]`
 * @param [dist] an array of values that will be filled during the execution and returns the shortest distance from node `s` to all other nodes. The distance from `s` to `v` is `dist[v.index()]`. If there is no path from `s` to `v`, then `dist[v.index()] == Double.POSITIVE_INFINITY`.
 * @param [pred] an array of [Edge]s that will be filled during the execution and returns for each node `t` the shortest path edge `pred[t.index()]` which is the last edge on the shortest path from `s` to `t`. If `t == s` or if there is no shortest path from `s` to `t`, then `pred[t.index()] == null`.
 * @return `true` if the input graph is acyclic, `false` otherwise
 * @see [acyclic]
 * @see [constructNodePath]
 * @see [constructEdgePath]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShortestPathAlgorithm%23ShortestPaths-method-acyclic(Graph,Node,number[],number[],Edge[])">Online Documentation</a>
 */
 final   fun Graph.acyclic( s: Node ,
 cost: ReadonlyArray<Double> ,
 dist: ReadonlyArray<Double> ,
 pred: ReadonlyArray<Edge>?  = definedExternally):Boolean
/**
 * Solves the single-source shortest path problem for **acyclic** directed graphs.
 * ### Preconditions
 * - `pred.length == graph.N()`
 * @receiver the input graph
 * @param [s] the node from which the shortest path search starts
 * @param [cost] the [IDataProvider] that returns the double value (cost) for traversing each edge
 * @param [dist] the [INodeMap] that will be filled during the execution and returns a double value (shortest distance) from node `s` to all other nodes or [Double.POSITIVE_INFINITY] if no such paths exist
 * @param [pred] the [INodeMap] that will be filled during the execution and returns for each node `t` the last edge on the shortest path from `s` to `t` or `null` if `t == s` or no shortest path from `s` to `t` exists
 * @return `true` if the input graph is acyclic, `false` otherwise
 * @see [acyclic]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShortestPathAlgorithm%23ShortestPaths-method-acyclic(Graph,Node,IDataProvider,INodeMap,INodeMap)">Online Documentation</a>
 */
 final   fun Graph.acyclic( s: Node ,
 cost: IDataProvider<Edge, Double> ,
 dist: INodeMap<Double> ,
 pred: INodeMap<Edge> ):Boolean
/**
 * This method solves the all-pairs shortest path problem for graphs with arbitrary edge costs.
 * ### Preconditions
 * - `cost.length == graph.E()`
 * - Dimension of `dist`: `[graph.N()] [graph.N()]]`
 * @receiver the input graph
 * @param [directed] `true` if the graph should be considered as directed, `false` otherwise
 * @param [cost] an array of double values that returns the costs for traversing each edge; edge `e` has cost `cost[e.index()]`
 * @param [dist] an array of values that will be filled during the execution and returns the shortest path distances from all pairs of nodes `s` and `t` in the graph. The distance from `s` to `t` is `dist[s.index()][t.index()]`. If there is no path from `s` to `t`, then `dist[s.index()][t.index()] == Double.POSITIVE_INFINITY`.
 * @return `true` if the given graph does not contain a negative-cost cycle, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShortestPathAlgorithm%23ShortestPaths-method-allPairs">Online Documentation</a>
 */
 final   fun Graph.allPairs( directed: Boolean ,
 cost: ReadonlyArray<Double> ,
 dist: ReadonlyArray<Double> ):Boolean
/**
 * Solves the single-source shortest path problem for arbitrary graphs.
 * ### Preconditions
 * - `pred.length == graph.N()`
 * @receiver the input graph
 * @param [s] the node from which the shortest path search starts
 * @param [directed] `true` if the graph should be considered as directed, `false` otherwise
 * @param [cost] an array of double values that returns the costs for traversing each edge; edge `e` has cost `cost[e.index()]`
 * @param [dist] an array of values that will be filled during the execution and returns the shortest distance from node `s` to all other nodes. The distance from `s` to `v` is `dist[v.index()]`. If there is no path from `s` to `v`, then `dist[v.index()] == Double.POSITIVE_INFINITY`.
 * @param [pred] an array of [Edge]s that will be filled during the execution and returns for each node `t` the shortest path edge `pred[t.index()]` which is the last edge on the shortest path from `s` to `t`. If `t == s` or if there is no shortest path from `s` to `t`, then `pred[t.index()] == null`.
 * @return `true` if the algorithm found a valid result, `false` otherwise (i.e., graph contains negative-cost cycles)
 * @see [constructNodePath]
 * @see [constructEdgePath]
 * @see [bellmanFord]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShortestPathAlgorithm%23ShortestPaths-method-bellmanFord(Graph,Node,boolean,number[],number[],Edge[])">Online Documentation</a>
 */
 final   fun Graph.bellmanFord( s: Node ,
 directed: Boolean ,
 cost: ReadonlyArray<Double> ,
 dist: ReadonlyArray<Double> ,
 pred: ReadonlyArray<Edge>  = definedExternally):Boolean
/**
 * Solves the single-source shortest path problem for arbitrary graphs.
 * @receiver the input graph
 * @param [s] the source node
 * @param [directed] `true` if the graph should be considered as directed, `false` otherwise
 * @param [cost] the [IDataProvider] that returns the double value (cost) for traversing each edge
 * @param [dist] the [INodeMap] that will be filled during the execution and returns a double value (shortest distance) from node `s` to all other nodes or [Double.POSITIVE_INFINITY] if no such paths exist
 * @param [pred] the [INodeMap] that will be filled during the execution and returns for each node `t` the last edge on the shortest path from `s` to `t` or `null` if `t == s` or no shortest path from `s` to `t` exists
 * @return `true` if the algorithm found a valid result, `false` otherwise (i.e., graph contains negative-cost cycles)
 * @see [bellmanFord]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShortestPathAlgorithm%23ShortestPaths-method-bellmanFord(Graph,Node,boolean,IDataProvider,INodeMap,INodeMap)">Online Documentation</a>
 */
 final   fun Graph.bellmanFord( s: Node ,
 directed: Boolean ,
 cost: IDataProvider<Edge, Double> ,
 dist: INodeMap<Double> ,
 pred: INodeMap<Edge> ):Boolean
/**
 * Convenience method that constructs an explicit [path of edges][EdgeList] from the result returned by one of the shortest paths methods defined in this class.
 * @param [s] the start node of the shortest path which must be the same start node that was specified when `pred` was calculated
 * @param [t] the target node of the path
 * @param [pred] an array of [Edge]s that will be filled during the execution and returns for each node `t` the shortest path edge `pred[t.index()]` which is the last edge on the shortest path from `s` to `t`. If `t == s` or if there is no shortest path from `s` to `t`, then `pred[t.index()] == null`.
 * @return a [list][EdgeList] containing the edges on the shortest path from `s` to `t` in the correct order
 * @see [constructEdgePath]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShortestPathAlgorithm%23ShortestPaths-method-constructEdgePath(Node,Node,Edge[])">Online Documentation</a>
 */
 final   fun constructEdgePath( s: Node ,
 t: Node ,
 pred: ReadonlyArray<Edge> ):EdgeList
/**
 * Like [constructEdgePath] but the path edges are given by a [IDataProvider].
 * @param [s] the start node of the shortest path which must be the same start node that was specified when `pred` was calculated
 * @param [t] the target node of the path
 * @param [pred] the [INodeMap] that will be filled during the execution and returns for each node `t` the last edge on the shortest path from `s` to `t` or `null` if `t == s` or no shortest path from `s` to `t` exists
 * @return a [list][EdgeList] containing the edges on the shortest path from `s` to `t` in the correct order
 * @see [constructEdgePath]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShortestPathAlgorithm%23ShortestPaths-method-constructEdgePath(Node,Node,IDataProvider)">Online Documentation</a>
 */
 final   fun constructEdgePath( s: Node ,
 t: Node ,
 pred: IDataProvider<Node, Edge> ):EdgeList
/**
 * Convenience method that constructs an explicit [path of nodes][NodeList] from the result returned by one of the shortest paths methods defined in this class.
 * @param [s] the start node of the shortest path which must be the same start node that was specified when `pred` was calculated
 * @param [t] the target node of the path
 * @param [pred] an array of [Edge]s that will be filled during the execution and returns for each node `t` the shortest path edge `pred[t.index()]` which is the last edge on the shortest path from `s` to `t`. If `t == s` or if there is no shortest path from `s` to `t`, then `pred[t.index()] == null`.
 * @return a [list][NodeList] containing the nodes on the shortest path from `s` to `t` in the correct order
 * @see [constructNodePath]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShortestPathAlgorithm%23ShortestPaths-method-constructNodePath(Node,Node,Edge[])">Online Documentation</a>
 */
 final   fun constructNodePath( s: Node ,
 t: Node ,
 pred: ReadonlyArray<Edge> ):NodeList
/**
 * Like [constructNodePath] but the path edges are given by a [IDataProvider].
 * @param [s] the start node of the shortest path which must be the same start node that was specified when `pred` was calculated
 * @param [t] the target node of the path
 * @param [pred] the [INodeMap] that will be filled during the execution and returns for each node `t` the last edge on the shortest path from `s` to `t` or `null` if `t == s` or no shortest path from `s` to `t` exists
 * @return a [list][NodeList] containing the nodes on the shortest path from `s` to `t` in the correct order
 * @see [constructNodePath]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShortestPathAlgorithm%23ShortestPaths-method-constructNodePath(Node,Node,IDataProvider)">Online Documentation</a>
 */
 final   fun constructNodePath( s: Node ,
 t: Node ,
 pred: IDataProvider<Node, Edge> ):NodeList
/**
 * Solves the single-source shortest path problem for arbitrary graphs and additionally, this method yields the path edges of each calculated shortest path.
 * ### Preconditions
 * - `pred.length == graph.N()`
 * @receiver the input graph
 * @param [s] the node from which the shortest path search starts
 * @param [directed] `true` if the graph should be considered as directed, `false` otherwise
 * @param [cost] an array of double values that returns the costs for traversing each edge; edge `e` has cost `cost[e.index()]`
 * @param [dist] an array of values that will be filled during the execution and returns the shortest distance from node `s` to all other nodes. The distance from `s` to `v` is `dist[v.index()]`. If there is no path from `s` to `v`, then `dist[v.index()] == Double.POSITIVE_INFINITY`.
 * @param [pred] an array of [Edge]s that will be filled during the execution and returns for each node `t` the shortest path edge `pred[t.index()]` which is the last edge on the shortest path from `s` to `t`. If `t == s` or if there is no shortest path from `s` to `t`, then `pred[t.index()] == null`.
 * @see [constructNodePath]
 * @see [constructEdgePath]
 * @see [dijkstra]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShortestPathAlgorithm%23ShortestPaths-method-dijkstra(Graph,Node,boolean,number[],number[],Edge[])">Online Documentation</a>
 */
 final   fun Graph.dijkstra( s: Node ,
 directed: Boolean ,
 cost: ReadonlyArray<Double> ,
 dist: ReadonlyArray<Double> ,
 pred: ReadonlyArray<Edge>?  = definedExternally)
/**
 * Solves the single-source shortest path problem for arbitrary graphs.
 * @receiver the input graph
 * @param [s] the node from which the shortest path search starts
 * @param [directed] `true` if the graph should be considered as directed, `false` otherwise
 * @param [cost] the [IDataProvider] that returns the double value (cost) for traversing each edge
 * @param [dist] the [INodeMap] that will be filled during the execution and returns a double value (shortest distance) from node `s` to all other nodes or [Double.POSITIVE_INFINITY] if no such paths exist
 * @param [pred] the [INodeMap] that will be filled during the execution and returns for each node `t` the last edge on the shortest path from `s` to `t` or `null` if `t == s` or no shortest path from `s` to `t` exists
 * @see [constructNodePath]
 * @see [constructEdgePath]
 * @see [dijkstra]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShortestPathAlgorithm%23ShortestPaths-method-dijkstra(Graph,Node,boolean,IDataProvider,INodeMap,INodeMap)">Online Documentation</a>
 */
 final   fun Graph.dijkstra( s: Node ,
 directed: Boolean ,
 cost: IDataProvider<Edge, Double> ,
 dist: INodeMap<Double> ,
 pred: INodeMap<Edge> )
/**
 * Marks all edges that belong to a shortest path from `start` node to `target` node.
 * @receiver the input graph
 * @param [start] the start node
 * @param [end] the target node
 * @param [directed] `true` if the graph should be considered as directed, `false` otherwise
 * @param [pathMap] the [IEdgeMap] that will be filled during the execution and returns a boolean value indicating whether or not the edge belongs to a shortest path connecting the two nodes
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShortestPathAlgorithm%23ShortestPaths-method-findShortestUniformPaths(Graph,Node,Node,boolean,IEdgeMap)">Online Documentation</a>
 */
 final   fun Graph.findShortestUniformPaths( start: Node ,
 end: Node ,
 directed: Boolean ,
 pathMap: IEdgeMap<Boolean> )
/**
 * Finds all nodes and edges that belong to a shortest path from a `start` node to a set of target nodes in the graph not farther away than a given distance.
 * @receiver the input graph
 * @param [start] the start node
 * @param [targetMap] the [IDataProvider] that returns a boolean value indicating whether or not a node belongs to the set of target nodes
 * @param [directed] `true` if the graph should be considered as directed, `false` otherwise
 * @param [maxLength] the maximum edge length of the shortest paths
 * @param [pathEdges] a [list][EdgeList] that will be filled during the execution and returns the edges on the shortest path from `s` to `t` in the correct order
 * @param [pathNodes] a [list][NodeList] that will be filled during the execution and returns the nodes on the shortest path from `s` to `t` in the correct order
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShortestPathAlgorithm%23ShortestPaths-method-findShortestUniformPaths(Graph,Node,IDataProvider,boolean,number,EdgeList,NodeList)">Online Documentation</a>
 */
 final   fun Graph.findShortestUniformPaths( start: Node ,
 targetMap: IDataProvider<Node, Boolean> ,
 directed: Boolean ,
 maxLength: Double ,
 pathEdges: EdgeList ,
 pathNodes: NodeList )
/**
 * This method finds the `k` shortest paths connecting a pair of nodes in a directed graph with non-negative edge costs.
 * @receiver the input graph
 * @param [costDP] the [IDataProvider] that returns a double value (cost) for traversing each edge
 * @param [start] the given start node
 * @param [end] the given target node
 * @param [k] a non-negative integer value
 * @return a [list][YList] of [EdgeList] objects each of which represents a path from `start` node to `target` node. The `i`-th path in the list contains the `i`-th shortest path between the `start` and `target` node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShortestPathAlgorithm%23ShortestPaths-method-kShortestPaths">Online Documentation</a>
 */
 final   fun Graph.kShortestPaths( costDP: IDataProvider<Edge, Double> ,
 start: Node ,
 end: Node ,
 k: Int ):YList<EdgeList>
/**
 * A variant of [kShortestPaths] that returns the result as a special cursor that calculates the next path in the sequence only when needed.
 * @receiver the input graph
 * @param [costDP] the [IDataProvider] that returns a double value (cost) for traversing each edge
 * @param [start] the given start node
 * @param [end] the given target node
 * @param [k] a non-negative integer value
 * @return a [cursor][ICursor] that calculates the next path in the sequence only when needed
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShortestPathAlgorithm%23ShortestPaths-method-kShortestPathsCursor">Online Documentation</a>
 */
 final   fun Graph.kShortestPathsCursor( costDP: IDataProvider<Edge, Double> ,
 start: Node ,
 end: Node ,
 k: Int ):ICursor<EdgeList>
/**
 * Returns two edge-disjoint paths in a non-negatively weighted directed graph, such that both paths connect nodes `s` and `t` and have minimum total length.
 * @receiver the input graph
 * @param [source] the source node of the shortest pair
 * @param [target] the target node of the shortest pair
 * @param [directed] `true` if the graph should be considered as directed, `false` otherwise
 * @param [costDP] the [IDataProvider] that returns a double value (cost) for traversing each edge
 * @return a two-dimensional array of [EdgeList]s holding the resulting edge-disjoint paths or `null` if no such edge-disjoint paths exist
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShortestPathAlgorithm%23ShortestPaths-method-shortestPair">Online Documentation</a>
 */
 final   fun Graph.shortestPair( source: Node ,
 target: Node ,
 directed: Boolean ,
 costDP: IDataProvider<Edge, Double> ):ReadonlyArray<EdgeList>?
/**
 * This method solves the single-source shortest path problem for arbitrary graphs.
 * ### Preconditions
 * - `pred.length == graph.N()`
 * @receiver the input graph
 * @param [s] the node from which the shortest path search starts
 * @param [directed] `true` if the graph should be considered as directed, `false` otherwise
 * @param [cost] an array of double values that returns the costs for traversing each edge; edge `e` has cost `cost[e.index()]`
 * @param [dist] an array of values that will be filled during the execution and returns the shortest distance from node `s` to all other nodes. The distance from `s` to `v` is `dist[v.index()]`. If there is no path from `s` to `v`, then `dist[v.index()] == Double.POSITIVE_INFINITY`.
 * @param [pred] an array of [Edge]s that will be filled during the execution and returns for each node `t` the shortest path edge `pred[t.index()]` which is the last edge on the shortest path from `s` to `t`. If `t == s` or if there is no shortest path from `s` to `t`, then `pred[t.index()] == null`.
 * @return `true` if the weighted graph does not contain a negative-cost cycle, `false` otherwise
 * @see [constructNodePath]
 * @see [constructEdgePath]
 * @see [singleSource]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShortestPathAlgorithm%23ShortestPaths-method-singleSource(Graph,Node,boolean,number[],number[],Edge[])">Online Documentation</a>
 */
 final   fun Graph.singleSource( s: Node ,
 directed: Boolean ,
 cost: ReadonlyArray<Double> ,
 dist: ReadonlyArray<Double> ,
 pred: ReadonlyArray<Edge>?  = definedExternally):Boolean
/**
 * This method solves the single-source shortest path problem for arbitrary graphs.
 * @receiver the input graph
 * @param [s] the source node
 * @param [directed] `true` if the graph should be considered as directed, `false` otherwise
 * @param [cost] the [IDataProvider] that returns the double value (cost) for traversing each edge
 * @param [dist] the [INodeMap] that will be filled during the execution and returns a double value (shortest distance) from node `s` to all other nodes or [Double.POSITIVE_INFINITY] if no such paths exist
 * @param [pred] the [INodeMap] that will be filled during the execution and returns for each node `t` the last edge on the shortest path from `s` to `t` or `null` if `t == s` or no shortest path from `s` to `t` exists
 * @return `true` if the weighted graph does not contain a negative-cost cycle, `false` otherwise
 * @see [constructNodePath]
 * @see [constructEdgePath]
 * @see [singleSource]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShortestPathAlgorithm%23ShortestPaths-method-singleSource(Graph,Node,boolean,IDataProvider,INodeMap,INodeMap)">Online Documentation</a>
 */
 final   fun Graph.singleSource( s: Node ,
 directed: Boolean ,
 cost: IDataProvider<Edge, Double> ,
 dist: INodeMap<Double> ,
 pred: INodeMap<Edge> ):Boolean
/**
 * Similar to [singleSourceSingleSink] but instead of returning the shortest distance between the source and sink the actual shortest edge path between these nodes will be returned.
 * @receiver the input graph
 * @param [s] the source node
 * @param [t] the sink node
 * @param [directed] `true` if the graph should be considered as directed, `false` otherwise
 * @param [cost] an array of double values that returns the costs for traversing each edge; edge `e` has cost `cost[e.index()]`
 * @return a shortest [path of edges][EdgeList] between source and sink
 * @see [singleSourceSingleSink]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShortestPathAlgorithm%23ShortestPaths-method-singleSourceSingleSink(Graph,Node,Node,boolean,number[])">Online Documentation</a>
 */
 final   fun Graph.singleSourceSingleSink( s: Node ,
 t: Node ,
 directed: Boolean ,
 cost: ReadonlyArray<Double> ):EdgeList
/**
 * Similar to [singleSourceSingleSink] but instead of returning the shortest distance between the source and sink the actual shortest edge path between these nodes will be returned.
 * @receiver the input graph
 * @param [s] the source node
 * @param [t] the sink node
 * @param [directed] `true` if the graph should be considered as directed, `false` otherwise
 * @param [cost] the [IDataProvider] that returns the double value (cost) for traversing each edge
 * @return a shortest [path of edges][EdgeList] between source and sink
 * @see [singleSourceSingleSink]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShortestPathAlgorithm%23ShortestPaths-method-singleSourceSingleSink(Graph,Node,Node,boolean,IDataProvider)">Online Documentation</a>
 */
 final   fun Graph.singleSourceSingleSink( s: Node ,
 t: Node ,
 directed: Boolean ,
 cost: IDataProvider<Edge, Double> ):EdgeList
/**
 * This method solves the single-source single-sink shortest path problem for arbitrary graphs.
 * ### Preconditions
 * - `cost.length == graph.E()`
 * - `pred.length == graph.N()`
 * @receiver the input graph
 * @param [s] the source node
 * @param [t] the sink node
 * @param [directed] `true` if the graph should be considered as directed, `false` otherwise
 * @param [cost] an array of double values that returns the costs for traversing each edge; edge `e` has cost `cost[e.index()]`
 * @param [pred] an array of [Edge]s that will be filled during the execution and returns for each node `t` the shortest path edge `pred[t.index()]` which is the last edge on the shortest path from `s` to `t`. If `t == s` or if there is no shortest path from `s` to `t`, then `pred[t.index()] == null`.
 * @return the distance between `s`and `t` if a path between these two nodes exists or [Double.POSITIVE_INFINITY] otherwise
 * @see [constructNodePath]
 * @see [constructEdgePath]
 * @see [singleSourceSingleSink]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShortestPathAlgorithm%23ShortestPaths-method-singleSourceSingleSink(Graph,Node,Node,boolean,number[],Edge[])">Online Documentation</a>
 */
 final   fun Graph.singleSourceSingleSink( s: Node ,
 t: Node ,
 directed: Boolean ,
 cost: ReadonlyArray<Double> ,
 pred: ReadonlyArray<Edge> ):Double
/**
 * Like [singleSourceSingleSink] but uses [INodeMap]s and [IDataProvider]s instead of arrays.
 * @receiver the input graph
 * @param [s] the source node
 * @param [t] the sink node
 * @param [directed] `true` if the graph should be considered as directed, `false` otherwise
 * @param [cost] the [IDataProvider] that returns the double value (cost) for traversing each edge
 * @param [pred] the [INodeMap] that will be filled during the execution and returns for each node `t` the last edge on the shortest path from `s` to `t` or `null` if `t == s` or no shortest path from `s` to `t` exists
 * @return the distance between `s`and `t` if a path between these two nodes exists or [Double.POSITIVE_INFINITY] otherwise
 * @see [singleSourceSingleSink]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShortestPathAlgorithm%23ShortestPaths-method-singleSourceSingleSink(Graph,Node,Node,boolean,IDataProvider,INodeMap)">Online Documentation</a>
 */
 final   fun Graph.singleSourceSingleSink( s: Node ,
 t: Node ,
 directed: Boolean ,
 cost: IDataProvider<Edge, Double> ,
 pred: INodeMap<Edge> ):Double
/**
 * Solves the single-source shortest path problem for arbitrary graphs in which each edge has a **uniform cost of
 *  `1.0`**.
 * ### Preconditions
 * - `pred.length == graph.N()`
 * @receiver the input graph
 * @param [s] the node from which the shortest path search starts
 * @param [directed] `true` if the graph should be considered as directed, `false` otherwise
 * @param [dist] an array of values that will be filled during the execution and returns the shortest distance from node `s` to all other nodes. The distance from `s` to `v` is `dist[v.index()]`. If there is no path from `s` to `v`, then `dist[v.index()] == Double.POSITIVE_INFINITY`.
 * @param [pred] an array of [Edge]s that will be filled during the execution and returns for each node `t` the shortest path edge `pred[t.index()]` which is the last edge on the shortest path from `s` to `t`. If `t == s` or if there is no shortest path from `s` to `t`, then `pred[t.index()] == null`.
 * @see [constructNodePath]
 * @see [constructEdgePath]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShortestPathAlgorithm%23ShortestPaths-method-uniform(Graph,Node,boolean,number[],Edge[])">Online Documentation</a>
 */
 final   fun Graph.uniform( s: Node ,
 directed: Boolean ,
 dist: ReadonlyArray<Double> ,
 pred: ReadonlyArray<Edge>  = definedExternally)
/**
 * Like [uniform] but uses [INodeMap]s instead of arrays.
 * ### Preconditions
 * - `pred.length == graph.N()`
 * @receiver the input graph
 * @param [s] the node from which the shortest path search starts
 * @param [directed] `true` if the graph should be considered as directed, `false` otherwise
 * @param [dist] the [INodeMap] that will be filled during the execution and returns a double value (shortest distance) from node `s` to all other nodes or [Double.POSITIVE_INFINITY] if no such paths exist
 * @param [pred] the [INodeMap] that will be filled during the execution and returns for each node `t` the last edge on the shortest path from `s` to `t` or `null` if `t == s` or no shortest path from `s` to `t` exists
 * @see [uniform]
 * @see [constructNodePath]
 * @see [constructEdgePath]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShortestPathAlgorithm%23ShortestPaths-method-uniform(Graph,Node,boolean,INodeMap,INodeMap)">Online Documentation</a>
 */
 final   fun Graph.uniform( s: Node ,
 directed: Boolean ,
 dist: INodeMap<Double> ,
 pred: INodeMap<Edge> )
/**
 * Convenience method that returns an array containing uniform edge costs of `1.0` for each edge of the given graph.
 * @receiver the input graph
 * @return an array that contains uniform edge costs of value `1.0` (i.e., for each edge `e: cost[e.index()] == 1.0`)
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShortestPathAlgorithm%23ShortestPaths-method-uniformCost">Online Documentation</a>
 */
 final   fun Graph.uniformCost():ReadonlyArray<Double>
}

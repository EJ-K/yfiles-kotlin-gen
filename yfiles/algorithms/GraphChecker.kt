// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.algorithms

/**
 * This class provides methods that check structural properties of a given graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphChecker">Online Documentation</a>
 */
external object GraphChecker {
/**
 * Computes the average degree of a given graph.
 * @receiver the input graph
 * @param [directed] `true` if the graph should be considered as directed, `false` otherwise
 * @return the average degree of the given graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphChecker%23GraphChecker-method-getAverageDegree">Online Documentation</a>
 */
 final   fun Graph.getAverageDegree( directed: Boolean ):Int
/**
 * Computes the average weighted degree of a given graph.
 * @receiver the input graph
 * @param [directed] `true` if the graph should be considered as directed, `false` otherwise
 * @param [edgeWeight] [IDataProvider] that provides the weights of the edges
 * @return the average weighted degree of the given graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphChecker%23GraphChecker-method-getAverageWeightedDegree">Online Documentation</a>
 */
 final   fun Graph.getAverageWeightedDegree( directed: Boolean ,
 edgeWeight: IDataProvider<Edge, Double> ):Double
/**
 * Computes the density of a given simple graph.
 * @receiver the input graph
 * @param [directed] `true` if the graph should be considered as directed, `false` otherwise
 * @return the density of the given graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphChecker%23GraphChecker-method-getDensity">Online Documentation</a>
 */
 final   fun Graph.getDensity( directed: Boolean ):Double
/**
 * Computes the diameter of a given graph.
 * @receiver the input graph
 * @param [directed] `true` if the graph should be considered as directed, `false` otherwise
 * @param [edgeCost] [IDataProvider] that provides the costs of the edges
 * @return the diameter of the given graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphChecker%23GraphChecker-method-getDiameter">Online Documentation</a>
 */
 final   fun Graph.getDiameter( directed: Boolean ,
 edgeCost: IDataProvider<Edge, Double> ):Double
/**
 * Checks whether or not the given directed graph is acyclic.
 * @receiver the given graph
 * @return `true` if the graph is acyclic, `false`, otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphChecker%23GraphChecker-method-isAcyclic">Online Documentation</a>
 */
 final   fun Graph.isAcyclic():Boolean
/**
 * Checks whether or not the given undirected graph is biconnected.
 * @receiver the given undirected graph
 * @return `true` if the graph is biconnected, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphChecker%23GraphChecker-method-isBiconnected">Online Documentation</a>
 */
 final   fun Graph.isBiconnected():Boolean
/**
 * Checks whether or not the given undirected graph is bipartite.
 * @receiver the given undirected graph
 * @return `true` if the graph is bipartite, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphChecker%23GraphChecker-method-isBipartite">Online Documentation</a>
 */
 final   fun Graph.isBipartite():Boolean
/**
 * Checks whether or not the given graph is connected.
 * @receiver the given graph
 * @return `true` if the graph is connected, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphChecker%23GraphChecker-method-isConnected">Online Documentation</a>
 */
 final   fun Graph.isConnected():Boolean
/**
 * Checks whether or not the given directed graph is cyclic.
 * @receiver the given graph
 * @return `true` if the graph is cyclic, `false`, otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphChecker%23GraphChecker-method-isCyclic">Online Documentation</a>
 */
 final   fun Graph.isCyclic():Boolean
/**
 * Checks whether the given graph is a forest.
 * @receiver the given graph
 * @return `true` if the graph is a forest, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphChecker%23GraphChecker-method-isForest">Online Documentation</a>
 */
 final   fun Graph.isForest():Boolean
/**
 * Checks whether or not the given undirected graph contains no multiple edges.
 * @receiver the given undirected graph
 * @return `true` if the graph contains no multiple edges, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphChecker%23GraphChecker-method-isMultipleEdgeFree">Online Documentation</a>
 */
 final   fun Graph.isMultipleEdgeFree():Boolean
/**
 * Checks whether or not the given graph is a directed rooted tree where each node has a maximum of `n` children.
 * @receiver the given graph
 * @return `true` if the graph is a directed rooted tree where each node has at most `n` children, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphChecker%23GraphChecker-method-isNaryTree">Online Documentation</a>
 */
 final   fun Graph.isNaryTree( n: Int ):Boolean
/**
 * Checks whether or not the given directed graph is a directed rooted tree.
 * @receiver the given graph
 * @return `true` if the graph is a directed rooted tree, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphChecker%23GraphChecker-method-isRootedTree">Online Documentation</a>
 */
 final   fun Graph.isRootedTree():Boolean
/**
 * Checks whether or not the given graph contains no self-loops.
 * @receiver the given graph
 * @return `true` if the graph contains no self-loops, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphChecker%23GraphChecker-method-isSelfLoopFree">Online Documentation</a>
 */
 final   fun Graph.isSelfLoopFree():Boolean
/**
 * Checks whether or not the given directed graph is simple.
 * @receiver the given directed graph
 * @return `true` if the graph is simple, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphChecker%23GraphChecker-method-isSimple">Online Documentation</a>
 */
 final   fun Graph.isSimple():Boolean
/**
 * Checks whether or not the given directed graph is strongly connected.
 * @receiver the given directed graph
 * @return `true` if the graph is strongly connected, `false`, otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphChecker%23GraphChecker-method-isStronglyConnected">Online Documentation</a>
 */
 final   fun Graph.isStronglyConnected():Boolean
/**
 * Checks whether or not the given graph is an undirected tree.
 * @receiver the given graph
 * @return `true` if the graph is an undirected tree, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphChecker%23GraphChecker-method-isTree">Online Documentation</a>
 */
 final   fun Graph.isTree():Boolean
}

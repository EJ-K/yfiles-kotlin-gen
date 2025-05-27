// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.analysis

import yfiles.collections.IEnumerable
import yfiles.collections.IMapper
import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject
import yfiles.layout.ItemCollection

/**
 * This class provides methods that check structural properties of a given graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphStructureAnalyzer">Online Documentation</a>
 * 
 * @constructor Creates a new instance for the given graph.
 * @param [graph] The graph to provide analysis methods for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphStructureAnalyzer%23GraphStructureAnalyzer-constructor-GraphStructureAnalyzer">Online Documentation</a>
 */
external  class GraphStructureAnalyzer  ( graph: IGraph ) : YObject {

/**
 * Gets or sets the collection of [edges][IEdge] which define an induced subgraph for the algorithms to work on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphStructureAnalyzer%23subgraphEdges">Online Documentation</a>
 */
final var subgraphEdges: ItemCollection<IEdge>
/**
 * Gets or sets the collection of [nodes][INode] which define an induced subgraph for the algorithms to work on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphStructureAnalyzer%23subgraphNodes">Online Documentation</a>
 */
final var subgraphNodes: ItemCollection<INode>
/**
 * Computes the average degree of the graph.
 * @param [directed] Whether or not to respect the direction of the edges.
 * @return The average degree of the given graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphStructureAnalyzer%23GraphStructureAnalyzer-method-getAverageDegree">Online Documentation</a>
 */
 final   fun getAverageDegree( directed: Boolean  = definedExternally):Int
/**
 * Computes the average weighted degree of the graph.
 * @param [edgeWeights] The mapping that provides the weights of the edges.
 * @param [directed] Whether or not to respect the direction of the edges.
 * @return The average weighted degree of the given graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphStructureAnalyzer%23GraphStructureAnalyzer-method-getAverageWeightedDegree">Online Documentation</a>
 */
 final   fun getAverageWeightedDegree( edgeWeights: IMapper<IEdge, Number> ,
 directed: Boolean  = definedExternally):Double
/**
 * Computes the density of the graph.
 * @param [directed] Whether or not to respect the direction of the edges.
 * @return The density of the given graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphStructureAnalyzer%23GraphStructureAnalyzer-method-getDensity">Online Documentation</a>
 */
 final   fun getDensity( directed: Boolean  = definedExternally):Double
/**
 * Computes the diameter of the graph.
 * @param [edgeCosts] The mapping that provides the costs of the edges.
 * @param [directed] Whether or not to respect the direction of the edges.
 * @return The diameter of the given graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphStructureAnalyzer%23GraphStructureAnalyzer-method-getDiameter">Online Documentation</a>
 */
 final   fun getDiameter( edgeCosts: IMapper<IEdge, Number> ,
 directed: Boolean  = definedExternally):Double
/**
 * Determines the multiple edges of the directed or undirected graph.
 * @param [directed] Whether or not to respect the direction of the edges.
 * @return A collection of multiple edges.
 * @throws InvalidOperationError If the graph has edge to edge connections.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphStructureAnalyzer%23GraphStructureAnalyzer-method-getMultipleEdges(boolean)">Online Documentation</a>
 */
 final   fun getMultipleEdges( directed: Boolean  = definedExternally):IEnumerable<IEnumerable<IEdge>>
/**
 * Determines the multiple edges adjacent to the given node of the directed or undirected graph.
 * @param [node] The node that is adjacent to the multiple edge to determine.
 * @param [directed] Whether or not to respect the direction of the edges.
 * @return A collection of multiple edges.
 * @throws InvalidOperationError If the graph has edge to edge connections.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphStructureAnalyzer%23GraphStructureAnalyzer-method-getMultipleEdges(INode,boolean)">Online Documentation</a>
 */
 final   fun getMultipleEdges( node: INode ,
 directed: Boolean  = definedExternally):IEnumerable<IEnumerable<IEdge>>
/**
 * Determines the multiple edges between the source and target node of the given edge of the directed or undirected graph.
 * @param [edge] The edge with the same source and target as the edges to determine.
 * @param [directed] Whether or not to respect the direction of the edges.
 * @return The multiple edges.
 * @throws InvalidOperationError If the graph has edge to edge connections.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphStructureAnalyzer%23GraphStructureAnalyzer-method-getMultipleEdges(IEdge,boolean)">Online Documentation</a>
 */
 final   fun getMultipleEdges( edge: IEdge ,
 directed: Boolean  = definedExternally):IEnumerable<IEdge>
/**
 * Gets the nodes of the graph in topological order.
 * ### Preconditions
 * - The graph must be [acyclic][isAcyclic].
 * @return The nodes of the graph in topological order.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphStructureAnalyzer%23GraphStructureAnalyzer-method-getTopologicalOrder">Online Documentation</a>
 */
 final   fun getTopologicalOrder():IEnumerable<INode>
/**
 * Determines whether or not the directed or undirected graph contains multiple edges.
 * @return `true` if the graph contains multiple edges, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphStructureAnalyzer%23GraphStructureAnalyzer-method-hasMultipleEdges">Online Documentation</a>
 */
 final   fun hasMultipleEdges( directed: Boolean  = definedExternally):Boolean
/**
 * Determines whether or not the graph has self-loops.
 * @return `true` if the graph contains self-loops, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphStructureAnalyzer%23GraphStructureAnalyzer-method-hasSelfLoops">Online Documentation</a>
 */
 final   fun hasSelfLoops():Boolean
/**
 * Determines whether the graph is acyclic.
 * @param [directed] Whether or not to respect the direction of the edges.
 * @return `true` if the graph is acyclic, `false`, otherwise
 * @throws InvalidOperationError If the graph has edge to edge connections.
 * @see [isCyclic]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphStructureAnalyzer%23GraphStructureAnalyzer-method-isAcyclic">Online Documentation</a>
 */
 final   fun isAcyclic( directed: Boolean  = definedExternally):Boolean
/**
 * Determines whether or not the undirected graph is biconnected.
 * @return `true` if the graph is biconnected, `false` otherwise
 * @throws InvalidOperationError If the graph has edge to edge connections.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphStructureAnalyzer%23GraphStructureAnalyzer-method-isBiconnected">Online Documentation</a>
 */
 final   fun isBiconnected():Boolean
/**
 * Determines whether or not the undirected graph is bipartite.
 * @return `true` if the graph is bipartite, `false` otherwise
 * @throws InvalidOperationError If the graph has edge to edge connections.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphStructureAnalyzer%23GraphStructureAnalyzer-method-isBipartite">Online Documentation</a>
 */
 final   fun isBipartite():Boolean
/**
 * Determines whether or not the graph is connected.
 * @return `true` if the graph is connected, `false` otherwise
 * @throws InvalidOperationError If the graph has edge to edge connections.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphStructureAnalyzer%23GraphStructureAnalyzer-method-isConnected">Online Documentation</a>
 */
 final   fun isConnected():Boolean
/**
 * Determines whether the graph is cyclic.
 * @param [directed] Whether or not to respect the direction of the edges.
 * @return `true` if the graph is cyclic, `false`, otherwise
 * @throws InvalidOperationError If the graph has edge to edge connections.
 * @see [isAcyclic]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphStructureAnalyzer%23GraphStructureAnalyzer-method-isCyclic">Online Documentation</a>
 */
 final   fun isCyclic( directed: Boolean  = definedExternally):Boolean
/**
 * Determines whether the graph is a directed (undirected) forest.
 * @param [directed] Whether or not to respect the direction of the edges.
 * @return `true` if the graph is a forest, `false` otherwise
 * @throws InvalidOperationError If the graph has edge to edge connections.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphStructureAnalyzer%23GraphStructureAnalyzer-method-isForest">Online Documentation</a>
 */
 final   fun isForest( directed: Boolean  = definedExternally):Boolean
/**
 * Determines whether or not the graph is a directed rooted tree where each node has a maximum of `n` children.
 * @return `true` if the graph is a directed rooted tree where each node has at most `n` children, `false` otherwise
 * @throws InvalidOperationError If the graph has edge to edge connections.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphStructureAnalyzer%23GraphStructureAnalyzer-method-isNaryTree">Online Documentation</a>
 */
 final   fun isNaryTree( n: Int ):Boolean
/**
 * Determines whether or not the graph is planar.
 * @return `true` if the graph is planar, `false`, otherwise.
 * @throws InvalidOperationError If the graph has edge to edge connections.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphStructureAnalyzer%23GraphStructureAnalyzer-method-isPlanar">Online Documentation</a>
 */
 final   fun isPlanar():Boolean
/**
 * Determines whether or not the given undirected graph is simple.
 * @return `true` if the graph is simple, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphStructureAnalyzer%23GraphStructureAnalyzer-method-isSimple">Online Documentation</a>
 */
 final   fun isSimple():Boolean
/**
 * Determines whether or not the directed graph is strongly connected.
 * @return `true` if the graph is strongly connected, `false`, otherwise
 * @throws InvalidOperationError If the graph has edge to edge connections.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphStructureAnalyzer%23GraphStructureAnalyzer-method-isStronglyConnected">Online Documentation</a>
 */
 final   fun isStronglyConnected():Boolean
/**
 * Determines whether or not the graph is a directed (undirected) tree.
 * @param [directed] Whether or not to respect the direction of the edges.
 * @return `true` if the graph is a tree, `false` otherwise
 * @throws InvalidOperationError If the graph has edge to edge connections.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphStructureAnalyzer%23GraphStructureAnalyzer-method-isTree">Online Documentation</a>
 */
 final   fun isTree( directed: Boolean  = definedExternally):Boolean

companion object : ClassMetadata<GraphStructureAnalyzer> {
}
}

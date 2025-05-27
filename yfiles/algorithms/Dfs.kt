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
 * Framework class for implementing depth first search (DFS) based algorithms.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DfsAlgorithm">Online Documentation</a>
 * 
 * @constructor Creates a new [Dfs] instance with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DfsAlgorithm%23Dfs-constructor-Dfs">Online Documentation</a>
 */
@JsName("DfsAlgorithm")
external open class Dfs  () : YObject {

/**
 * Sets whether or not to interpret the edges of the graph as directed.
 * 
 * Default value - `false`. Graphs are considered undirected.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DfsAlgorithm%23directedMode">Online Documentation</a>
 */
open var directedMode: Boolean
@Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
get
/**
 * Sets whether or not to continue the depth first search after all nodes reachable from the first node have been visited.
 * 
 * Default value - `true`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DfsAlgorithm%23lookFurtherMode">Online Documentation</a>
 */
open var lookFurtherMode: Boolean
@Deprecated(message = "Write-only property", level = DeprecationLevel.HIDDEN)
get
/**
 * A [INodeMap] that holds for each [Node] an [Object] indicating the current state of the given node as it is visited by this algorithm.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DfsAlgorithm%23stateMap">Online Documentation</a>
 */
protected final var stateMap: INodeMap<DfsState>
/**
 * Cancels the depth first search.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DfsAlgorithm%23Dfs-method-cancel">Online Documentation</a>
 */
 open protected   fun cancel()
/**
 * Callback method that will be invoked whenever DFS continues its search at a new root node.
 * @param [v] the new root node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DfsAlgorithm%23Dfs-method-lookFurther">Online Documentation</a>
 */
 open protected   fun lookFurther( v: Node )
/**
 * Callback method that will be invoked after the DFS has returned from the given node.
 * @param [edge] the given edge
 * @param [node] the node that has been reached via the given edge
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DfsAlgorithm%23Dfs-method-postTraverse">Online Documentation</a>
 */
 open protected   fun postTraverse( edge: Edge ,
 node: Node )
/**
 * Callback method that will be invoked whenever a node visit has been completed.
 * @param [node] the given node
 * @param [dfsNumber] the DFS number of the given node
 * @param [compNumber] the completion number of the given node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DfsAlgorithm%23Dfs-method-postVisit">Online Documentation</a>
 */
 open protected   fun postVisit( node: Node ,
 dfsNumber: Int ,
 compNumber: Int )
/**
 * Callback method that will be invoked if the given edge will be considered the first (and only) time during the DFS.
 * @param [edge] the given edge
 * @param [node] the node to be visited next only if `treeEdge == true`
 * @param [treeEdge] `true` if the `node` will be visited, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DfsAlgorithm%23Dfs-method-preTraverse">Online Documentation</a>
 */
 open protected   fun preTraverse( edge: Edge ,
 node: Node ,
 treeEdge: Boolean )
/**
 * Callback method that will be invoked whenever a formerly unvisited node gets visited for the first time.
 * @param [node] the given node
 * @param [dfsNumber] the DFS number of the given node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DfsAlgorithm%23Dfs-method-preVisit">Online Documentation</a>
 */
 open protected   fun preVisit( node: Node ,
 dfsNumber: Int )
/**
 * Starts a depth first search on the given graph.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DfsAlgorithm%23Dfs-method-start(Graph)">Online Documentation</a>
 */
 open   fun start( graph: Graph )
/**
 * Starts a depth first search from a given [Node] of the input graph.
 * @param [graph] the input graph
 * @param [start] the given start node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DfsAlgorithm%23Dfs-method-start(Graph,Node)">Online Documentation</a>
 */
 open   fun start( graph: Graph ,
 start: Node )

companion object : ClassMetadata<Dfs> {
}
}
@JsName("DfsAlgorithm")
sealed external class DfsState {
    companion object {
        /**
 * A constant indicating a node has been completed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DfsAlgorithm%23BLACK">Online Documentation</a>
 */
protected val BLACK: Any

/**
 * A constant indicating a node has already been visited, but has not been completed yet.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DfsAlgorithm%23GRAY">Online Documentation</a>
 */
protected val GRAY: Any

/**
 * A constant indicating a node has not been visited yet.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DfsAlgorithm%23WHITE">Online Documentation</a>
 */
protected val WHITE: Any
    }
}

inline fun Dfs(
    block: Dfs.() -> Unit
): Dfs {
    return Dfs()
        .apply(block)
}

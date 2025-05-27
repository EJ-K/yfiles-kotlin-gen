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
 * This class provides methods to determine whether a graph is bipartite and to obtain the corresponding partitions.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BipartitionAlgorithm">Online Documentation</a>
 */
@JsName("BipartitionAlgorithm")
external object Bipartitions {
/**
 * Calculates a bipartition of the given graph, if one exists.
 * @receiver the given graph
 * @param [markMap] the [INodeMap] that will be filled during the BFS execution and returns the partition (either [RED] or [BLUE]) to which each node belongs
 * @return `true` if the graph is bipartite, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BipartitionAlgorithm%23Bipartitions-method-getBipartition">Online Documentation</a>
 */
 final   fun Graph.getBipartition( markMap: INodeMap<BipartitionMark> ):Boolean
/**
 * Determines whether or not the given graph is bipartite.
 * @receiver the given graph
 * @return `true` if the graph is bipartite, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BipartitionAlgorithm%23Bipartitions-method-isBipartite">Online Documentation</a>
 */
 final   fun Graph.isBipartite():Boolean
}
@JsName("BipartitionAlgorithm")
sealed external class BipartitionMark {
    companion object {
        /**
 * A constant for marking a node that belongs to the blue partition.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BipartitionAlgorithm%23BLUE">Online Documentation</a>
 */
 val BLUE: Any

/**
 * A constant for marking a node that belongs to the red partition.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BipartitionAlgorithm%23RED">Online Documentation</a>
 */
 val RED: Any
    }
}

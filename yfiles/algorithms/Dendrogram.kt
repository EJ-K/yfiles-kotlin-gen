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
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * This class provides the result of hierarchical clustering algorithms by means of a binary tree structure.
 * @see [Groups.hierarchicalClustering]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Dendrogram">Online Documentation</a>
 */
external open class Dendrogram  : YObject {

/**
 * Gets the number of levels this dendrogram has.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Dendrogram%23levelCount">Online Documentation</a>
 */
open val levelCount: Int
/**
 * Gets the number of nodes in this dendrogram.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Dendrogram%23nodeCount">Online Documentation</a>
 */
open val nodeCount: Int
/**
 * Gets the root node of the dendrogram.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Dendrogram%23root">Online Documentation</a>
 */
open val root: Node
/**
 * Returns a [NodeList] that contains the child nodes of the given parent node.
 * @param [parent] the parent node for which to retrieve the child nodes
 * @return the list of child nodes of the given parent node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Dendrogram%23Dendrogram-method-getChildren">Online Documentation</a>
 */
 open   fun getChildren( parent: Node ):NodeList
/**
 * Returns an array of [NodeList]s that contain the nodes of the original graph that are associated with the given dendrogram node.
 * @param [node] the given dendrogram node
 * @return an array of [NodeList]s that contain the nodes of the original graph that are associated with the given dendrogram node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Dendrogram%23Dendrogram-method-getClusterNodes">Online Documentation</a>
 */
 open   fun getClusterNodes( node: Node ):ReadonlyArray<NodeList>
/**
 * Returns the dissimilarity value associated with the given node of the dendrogram.
 * @param [node] the given dendrogram node
 * @return the dissimilarity value associated with the given dendrogram node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Dendrogram%23Dendrogram-method-getDissimilarityValue">Online Documentation</a>
 */
 open   fun getDissimilarityValue( node: Node ):Double
/**
 * Returns the level of the given node of the dendrogram.
 * @param [node] the given dendrogram node
 * @return the level of the given dendrogram node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Dendrogram%23Dendrogram-method-getLevel">Online Documentation</a>
 */
 open   fun getLevel( node: Node ):Int
/**
 * Returns the node of the dendrogram that belongs to the given level index.
 * @param [level] the given level index
 * @return the node of the dendrogram that belongs to the given level index or `null` if there exists no level with the given index.
 * @throws ArgumentError if the given level is negative or greater than the [node count][nodeCount] minus one.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Dendrogram%23Dendrogram-method-getNodeAtLevel">Online Documentation</a>
 */
 open   fun getNodeAtLevel( level: Int ):Node?
/**
 * Returns the node of original graph that is mapped with the given leaf node of the dendrogram.
 * @param [node] the given leaf node
 * @return the node of original graph that is mapped with the given leaf node or `null` if the given node is an inner dendrogram node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Dendrogram%23Dendrogram-method-getOriginalNode">Online Documentation</a>
 */
 open   fun getOriginalNode( node: Node ):Node?
/**
 * Returns whether or not the given dendrogram node is a leaf node.
 * @param [node] a dendrogram node
 * @return `true` if the given node is a leaf node, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Dendrogram%23Dendrogram-method-isLeaf">Online Documentation</a>
 */
 open   fun isLeaf( node: Node ):Boolean

companion object : ClassMetadata<Dendrogram> {
}
}

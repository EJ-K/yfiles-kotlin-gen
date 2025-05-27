// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.analysis

import yfiles.graph.INode
import yfiles.lang.ClassMetadata

/**
 * Represents a bipartition of a graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BipartitionResult">Online Documentation</a>
 */
external class BipartitionResult private constructor()  {
  /**
   * Gets the first partition of a bipartite graph.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BipartitionResult%23firstPartition">Online Documentation</a>
   */
  final val firstPartition: BipartitionPartition
  
  /**
   * Gets a value indicating whether this result represents a bipartition of the graph.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BipartitionResult%23isBipartite">Online Documentation</a>
   */
  final val isBipartite: Boolean
  
  /**
   * Gets a mapping from each node to its partition.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BipartitionResult%23nodePartitions">Online Documentation</a>
   */
  final val nodePartitions: ResultItemMapping<INode, BipartitionPartition>
  
  /**
   * Gets the second partition of a bipartite graph.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BipartitionResult%23secondPartition">Online Documentation</a>
   */
  final val secondPartition: BipartitionPartition
  
  /**
   * Returns a value indicating whether the specified nodes are in the same partition.
   * @param [node1] The first node to test.
   * @param [node2] The second node to test.
   * @return `true` if both nodes are in the same partition, `false` if they are in different partitions. If the graph is [not bipartite][BipartitionResult], `true` is returned.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BipartitionResult%23BipartitionResult-method-inSamePartition">Online Documentation</a>
   */
  fun inSamePartition(
    node1: INode,
    node2: INode,
  ): Boolean
  
  companion object : ClassMetadata<BipartitionResult> {
  }
}

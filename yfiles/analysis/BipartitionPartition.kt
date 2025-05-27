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
import yfiles.lang.YObject

/**
 * Represents a partition in a bipartite graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BipartitionPartition">Online Documentation</a>
 */
external  class BipartitionPartition 
private constructor () : YObject {

/**
 * Gets a collection of nodes belonging to this partition.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BipartitionPartition%23nodes">Online Documentation</a>
 */
final val nodes: ResultItemCollection<INode>

companion object : ClassMetadata<BipartitionPartition> {
}
}

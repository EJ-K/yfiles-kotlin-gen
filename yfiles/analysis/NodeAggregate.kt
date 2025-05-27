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
import yfiles.collections.IListEnumerable
import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * Represents an aggregate or cluster found by [NodeAggregation].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAggregate">Online Documentation</a>
 */
external open class NodeAggregate  : YObject {

/**
 * The child aggregates of this aggregate.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAggregate%23children">Online Documentation</a>
 */
final val children: IListEnumerable<NodeAggregate>
/**
 * Gets the number of nodes that are descendants of this aggregate.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAggregate%23descendantCount">Online Documentation</a>
 */
final val descendantCount: Int
/**
 * Gets the sum of the weights of nodes that are descendants of this aggregate.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAggregate%23descendantWeightSum">Online Documentation</a>
 */
final val descendantWeightSum: Double
/**
 * Gets the maximum weight of nodes that are descendants of this aggregate.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAggregate%23maximumDescendantWeight">Online Documentation</a>
 */
final val maximumDescendantWeight: Double
/**
 * The node which is represented by this aggregate.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAggregate%23node">Online Documentation</a>
 */
final val node: INode?
/**
 * Returns all nodes which are associated with this [NodeAggregate] or its descendants.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAggregate%23nodes">Online Documentation</a>
 */
final val nodes: IEnumerable<INode>
/**
 * The parent of this [NodeAggregate].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAggregate%23parent">Online Documentation</a>
 */
final val parent: NodeAggregate?

companion object : ClassMetadata<NodeAggregate> {
}
}

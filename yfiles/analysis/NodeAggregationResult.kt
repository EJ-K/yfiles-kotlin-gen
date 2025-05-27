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
 * The tree of [NodeAggregate] which is created by [NodeAggregation].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAggregationResult">Online Documentation</a>
 */
external open class NodeAggregationResult  : YObject {

/**
 * Gets a map which maps an [NodeAggregate] to its corresponding node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAggregationResult%23aggregateMap">Online Documentation</a>
 */
final val aggregateMap: ResultItemMapping<INode, NodeAggregate>
/**
 * The root of the tree of [NodeAggregate] which is created by [NodeAggregation].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAggregationResult%23root">Online Documentation</a>
 */
final val root: NodeAggregate

companion object : ClassMetadata<NodeAggregationResult> {
}
}

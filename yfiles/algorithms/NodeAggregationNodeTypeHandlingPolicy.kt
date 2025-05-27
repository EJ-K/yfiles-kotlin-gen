// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.algorithms

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * @see [NodeAggregation.nodeTypeHandlingPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAggregationNodeTypeHandlingPolicy">Online Documentation</a>
 */
external sealed class NodeAggregationNodeTypeHandlingPolicy: YEnum<NodeAggregationNodeTypeHandlingPolicy> {
   companion object: EnumMetadata<NodeAggregationNodeTypeHandlingPolicy> {
       /**
 * A node type handling policy that specifies that the types are ignored.
 * 
 * Value - `0`
 * @see [NodeAggregation.nodeTypeHandlingPolicy]
 * @see [NodeAggregation.NODE_TYPE_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAggregationNodeTypeHandlingPolicy%23IGNORE">Online Documentation</a>
 */
val IGNORE: NodeAggregationNodeTypeHandlingPolicy

/**
 * A node type handling policy that specifies that nodes of different types are always separated right at the root.
 * 
 * Value - `1`
 * @see [NodeAggregation.nodeTypeHandlingPolicy]
 * @see [NodeAggregation.NODE_TYPE_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAggregationNodeTypeHandlingPolicy%23SEPARATE_AT_ROOT">Online Documentation</a>
 */
val SEPARATE_AT_ROOT: NodeAggregationNodeTypeHandlingPolicy

/**
 * A node type handling policy that specifies that nodes of different types are always separated at the leaves.
 * 
 * Value - `2`
 * @see [NodeAggregation.nodeTypeHandlingPolicy]
 * @see [NodeAggregation.NODE_TYPE_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAggregationNodeTypeHandlingPolicy%23SEPARATE_AT_LEAVES">Online Documentation</a>
 */
val SEPARATE_AT_LEAVES: NodeAggregationNodeTypeHandlingPolicy
   }
}

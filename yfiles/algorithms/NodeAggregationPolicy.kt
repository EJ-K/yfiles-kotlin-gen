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
 * @see [NodeAggregation.aggregationPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAggregationPolicy">Online Documentation</a>
 */
external sealed class NodeAggregationPolicy: YEnum<NodeAggregationPolicy> {
   companion object: EnumMetadata<NodeAggregationPolicy> {
       /**
 * An aggregation policy that specifies that nodes are aggregated according to their structure, that is, the connectivity.
 * 
 * Value - `0`
 * @see [NodeAggregation.aggregationPolicy]
 * @see [NodeAggregation.NODE_CENTER_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAggregationPolicy%23STRUCTURAL">Online Documentation</a>
 */
val STRUCTURAL: NodeAggregationPolicy

/**
 * An aggregation policy that specifies that nodes are aggregated according to their geometric position.
 * 
 * Value - `1`
 * @see [NodeAggregation.aggregationPolicy]
 * @see [NodeAggregation.NODE_CENTER_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAggregationPolicy%23GEOMETRIC">Online Documentation</a>
 */
val GEOMETRIC: NodeAggregationPolicy
   }
}

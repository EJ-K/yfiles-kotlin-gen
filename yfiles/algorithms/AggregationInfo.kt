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
 * The result of a [NodeAggregation.aggregate] run is a hierarchical nested clustering structure.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AggregationInfo">Online Documentation</a>
 */
external open class AggregationInfo  : YObject {

/**
 * Gets the number of nodes of the original graph that are descendants of this aggregate.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AggregationInfo%23descendantCount">Online Documentation</a>
 */
open val descendantCount: Int
/**
 * Gets the sum of the weights of nodes of the original graph that are descendants of this aggregate.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AggregationInfo%23descendantWeightSum">Online Documentation</a>
 */
open val descendantWeightSum: Double
/**
 * Gets the maximum weight of a node of the original graph that is a descendant of this aggregate.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AggregationInfo%23maximumDescendantWeight">Online Documentation</a>
 */
open val maximumDescendantWeight: Double
/**
 * Gets the [parent info][AggregationInfo] of this info.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AggregationInfo%23parentAggregation">Online Documentation</a>
 */
open val parentAggregation: AggregationInfo?

companion object : ClassMetadata<AggregationInfo> {
}
}

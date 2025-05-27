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
 * Provides constants for different metrics used in [KMeansClustering][yfiles.analysis.KMeansClustering] and [Groups.kMeansClustering].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DistanceMetric">Online Documentation</a>
 */
external sealed class DistanceMetric: YEnum<DistanceMetric> {
   companion object: EnumMetadata<DistanceMetric> {
       /**
 * Specifies the euclidean distance metric or L² metric.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DistanceMetric%23EUCLIDEAN">Online Documentation</a>
 */
val EUCLIDEAN: DistanceMetric

/**
 * Specifies the (squared) euclidean distance metric.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DistanceMetric%23EUCLIDEAN_SQUARED">Online Documentation</a>
 */
val EUCLIDEAN_SQUARED: DistanceMetric

/**
 * Specifies the Manhattan distance metric or L¹ metric.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DistanceMetric%23MANHATTAN">Online Documentation</a>
 */
val MANHATTAN: DistanceMetric

/**
 * Specifies the Chebychev distance metric or L<sub>∞</sub> metric.
 * 
 * Value - `3`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DistanceMetric%23CHEBYCHEV">Online Documentation</a>
 */
val CHEBYCHEV: DistanceMetric
   }
}

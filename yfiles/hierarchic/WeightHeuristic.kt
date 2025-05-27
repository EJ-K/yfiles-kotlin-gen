// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.hierarchic

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * A weight assignment specifier based on a median heuristic.
 * @see [DefaultLayerSequencer.weightHeuristic]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WeightHeuristic">Online Documentation</a>
 */
external sealed class WeightHeuristic: YEnum<WeightHeuristic> {
   companion object: EnumMetadata<WeightHeuristic> {
       /**
 * A weight assignment specifier based on a barycenter heuristic.
 * 
 * Value - `0`
 * @see [DefaultLayerSequencer.weightHeuristic]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WeightHeuristic%23BARYCENTER">Online Documentation</a>
 */
val BARYCENTER: WeightHeuristic

/**
 * A weight assignment specifier based on a median heuristic.
 * 
 * Value - `1`
 * @see [DefaultLayerSequencer.weightHeuristic]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WeightHeuristic%23MEDIAN">Online Documentation</a>
 */
val MEDIAN: WeightHeuristic
   }
}

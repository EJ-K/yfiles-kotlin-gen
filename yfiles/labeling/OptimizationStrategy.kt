// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.labeling

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * @see [MISLabelingBase.optimizationStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OptimizationStrategy">Online Documentation</a>
 */
external sealed class OptimizationStrategy: YEnum<OptimizationStrategy> {
   companion object: EnumMetadata<OptimizationStrategy> {
       /**
 * An optimization strategy aiming at a good balance between the available optimization options.
 * 
 * Value - `0`
 * @see [MISLabelingBase.optimizationStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OptimizationStrategy%23BALANCED">Online Documentation</a>
 */
val BALANCED: OptimizationStrategy

/**
 * An optimization strategy that especially reduces overlaps between labels and nodes as well as labels and node halos.
 * 
 * Value - `1`
 * @see [MISLabelingBase.optimizationStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OptimizationStrategy%23NODE_OVERLAP">Online Documentation</a>
 */
val NODE_OVERLAP: OptimizationStrategy

/**
 * An optimization strategy that especially reduces overlaps between labels.
 * 
 * Value - `2`
 * @see [MISLabelingBase.optimizationStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OptimizationStrategy%23LABEL_OVERLAP">Online Documentation</a>
 */
val LABEL_OVERLAP: OptimizationStrategy

/**
 * An optimization strategy that especially reduces overlaps between labels and edges.
 * 
 * Value - `3`
 * @see [MISLabelingBase.optimizationStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OptimizationStrategy%23EDGE_OVERLAP">Online Documentation</a>
 */
val EDGE_OVERLAP: OptimizationStrategy

/**
 * An optimization strategy that mainly tries to satisfy the preferences described by a [PreferredPlacementDescriptor][yfiles.layout.PreferredPlacementDescriptor] associated with edge labels.
 * 
 * Value - `4`
 * @see [MISLabelingBase.optimizationStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OptimizationStrategy%23PREFERRED_PLACEMENT">Online Documentation</a>
 */
val PREFERRED_PLACEMENT: OptimizationStrategy

/**
 * An optimization strategy that especially reduces overlaps of labels and the [PartitionGrid][yfiles.layout.PartitionGrid].
 * 
 * Value - `5`
 * @see [MISLabelingBase.optimizationStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OptimizationStrategy%23PARTITION_GRID_OVERLAP">Online Documentation</a>
 */
val PARTITION_GRID_OVERLAP: OptimizationStrategy

/**
 * Use no optimization strategy.
 * 
 * Value - `6`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OptimizationStrategy%23NONE">Online Documentation</a>
 */
val NONE: OptimizationStrategy
   }
}

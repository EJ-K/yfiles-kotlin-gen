// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Defines how a label placement algorithm should place edge labels.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPreferredPlacementPolicy">Online Documentation</a>
 */
external sealed class LabelPreferredPlacementPolicy: YEnum<LabelPreferredPlacementPolicy> {
   companion object: EnumMetadata<LabelPreferredPlacementPolicy> {
       /**
 * Edge labels will be placed as defined by their [PreferredPlacementDescriptor].
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPreferredPlacementPolicy%23FROM_DESCRIPTOR">Online Documentation</a>
 */
val FROM_DESCRIPTOR: LabelPreferredPlacementPolicy

/**
 * Edge labels will be placed in a way that is supported by the [ILabelModelParameter.model][yfiles.graph.ILabelModelParameter.model] of their current [ILabel.layoutParameter][yfiles.graph.ILabel.layoutParameter].
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPreferredPlacementPolicy%23FROM_MODEL">Online Documentation</a>
 */
val FROM_MODEL: LabelPreferredPlacementPolicy

/**
 * Edge labels will be placed near their current position.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPreferredPlacementPolicy%23FROM_PARAMETER">Online Documentation</a>
 */
val FROM_PARAMETER: LabelPreferredPlacementPolicy
   }
}

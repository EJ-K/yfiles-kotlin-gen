// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Policy to determines at which visual layer node, edge or port labels shall be inserted by the [GraphModelManager].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelLayerPolicy">Online Documentation</a>
 */
external sealed class LabelLayerPolicy: YEnum<LabelLayerPolicy> {
   companion object: EnumMetadata<LabelLayerPolicy> {
       /**
 * The labels will be visualized directly on top of their owner.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelLayerPolicy%23AT_OWNER">Online Documentation</a>
 */
val AT_OWNER: LabelLayerPolicy

/**
 * All labels will be visualized in one of three separate label layers.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelLayerPolicy%23SEPARATE_LAYER">Online Documentation</a>
 */
val SEPARATE_LAYER: LabelLayerPolicy
   }
}

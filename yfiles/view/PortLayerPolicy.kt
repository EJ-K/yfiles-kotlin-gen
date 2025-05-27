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
 * Policy to determines at which visual layer node and edge ports shall be inserted by the [GraphModelManager].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortLayerPolicy">Online Documentation</a>
 */
external sealed class PortLayerPolicy: YEnum<PortLayerPolicy> {
   companion object: EnumMetadata<PortLayerPolicy> {
       /**
 * The ports will be visualized directly on top of their owner.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortLayerPolicy%23AT_OWNER">Online Documentation</a>
 */
val AT_OWNER: PortLayerPolicy

/**
 * All ports will be visualized in the [GraphModelManager.portGroup].
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortLayerPolicy%23SEPARATE_LAYER">Online Documentation</a>
 */
val SEPARATE_LAYER: PortLayerPolicy
   }
}

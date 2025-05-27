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
 * @see [CactusGroupLayout.groupSizingPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CactusGroupLayoutGroupSizingPolicy">Online Documentation</a>
 */
external sealed class CactusGroupLayoutGroupSizingPolicy: YEnum<CactusGroupLayoutGroupSizingPolicy> {
   companion object: EnumMetadata<CactusGroupLayoutGroupSizingPolicy> {
       /**
 * Policy for sizing group nodes individually that optimizes for compact drawings.
 * 
 * Value - `0`
 * @see [CactusGroupLayout.groupSizingPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CactusGroupLayoutGroupSizingPolicy%23COMPACT">Online Documentation</a>
 */
val COMPACT: CactusGroupLayoutGroupSizingPolicy

/**
 * Policy for sizing group nodes individually that optimizes for compact drawings.
 * 
 * Value - `1`
 * @see [CactusGroupLayout.groupSizingPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CactusGroupLayoutGroupSizingPolicy%23ADAPTIVE">Online Documentation</a>
 */
val ADAPTIVE: CactusGroupLayoutGroupSizingPolicy

/**
 * Policy for sizing group nodes individually that optimizes for compact drawings which can be collapsed at any group without producing overlaps.
 * 
 * Value - `3`
 * @see [CactusGroupLayout.groupSizingPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CactusGroupLayoutGroupSizingPolicy%23STABLE">Online Documentation</a>
 */
val STABLE: CactusGroupLayoutGroupSizingPolicy
   }
}

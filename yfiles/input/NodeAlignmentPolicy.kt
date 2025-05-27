// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Enumeration used by [NavigationInputMode] to determine which point (if any) of a group or folder node should be kept fixed when toggling the group node state.
 * @see [NavigationInputMode]
 * @see [NavigationInputMode.expandGroup]
 * @see [NavigationInputMode.collapseGroup]
 * @see [NavigationInputMode.toggleExpansionState]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAlignmentPolicy">Online Documentation</a>
 */
external sealed class NodeAlignmentPolicy: YEnum<NodeAlignmentPolicy> {
   companion object: EnumMetadata<NodeAlignmentPolicy> {
       /**
 * Don't fix any specific point, only use the layout from the target state.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAlignmentPolicy%23NONE">Online Documentation</a>
 */
val NONE: NodeAlignmentPolicy

/**
 * Fix the center point.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAlignmentPolicy%23CENTER">Online Documentation</a>
 */
val CENTER: NodeAlignmentPolicy

/**
 * Fix the upper left corner.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAlignmentPolicy%23TOP_LEFT">Online Documentation</a>
 */
val TOP_LEFT: NodeAlignmentPolicy

/**
 * Fix the lower left corner.
 * 
 * Value - `3`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAlignmentPolicy%23BOTTOM_LEFT">Online Documentation</a>
 */
val BOTTOM_LEFT: NodeAlignmentPolicy

/**
 * Fix the upper right corner.
 * 
 * Value - `4`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAlignmentPolicy%23TOP_RIGHT">Online Documentation</a>
 */
val TOP_RIGHT: NodeAlignmentPolicy

/**
 * Fix the lower right corner.
 * 
 * Value - `5`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAlignmentPolicy%23BOTTOM_RIGHT">Online Documentation</a>
 */
val BOTTOM_RIGHT: NodeAlignmentPolicy

/**
 * Fix the uppermost center.
 * 
 * Value - `6`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAlignmentPolicy%23TOP_CENTER">Online Documentation</a>
 */
val TOP_CENTER: NodeAlignmentPolicy

/**
 * Fix the lowermost center.
 * 
 * Value - `7`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAlignmentPolicy%23BOTTOM_CENTER">Online Documentation</a>
 */
val BOTTOM_CENTER: NodeAlignmentPolicy

/**
 * Fix the left center.
 * 
 * Value - `8`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAlignmentPolicy%23CENTER_LEFT">Online Documentation</a>
 */
val CENTER_LEFT: NodeAlignmentPolicy

/**
 * Fix the right center.
 * 
 * Value - `9`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAlignmentPolicy%23CENTER_RIGHT">Online Documentation</a>
 */
val CENTER_RIGHT: NodeAlignmentPolicy
   }
}

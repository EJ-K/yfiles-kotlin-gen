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
 * Group layering alignment strategies for the recursive group layering.
 * @see [HierarchicLayout.groupAlignmentPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupAlignmentPolicy">Online Documentation</a>
 */
external sealed class GroupAlignmentPolicy: YEnum<GroupAlignmentPolicy> {
   companion object: EnumMetadata<GroupAlignmentPolicy> {
       /**
 * A group layering alignment strategy which aligns groups and normal nodes that occupy the same layer to the top with respect to their inner layers.
 * 
 * Value - `18`
 * @see [HierarchicLayout.groupAlignmentPolicy]
 * @see [HierarchicLayout.recursiveGroupLayering]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupAlignmentPolicy%23TOP">Online Documentation</a>
 */
val TOP: GroupAlignmentPolicy

/**
 * A group layering alignment strategy which aligns groups and normal nodes that occupy the same layer to the bottom with respect to their inner layers.
 * 
 * Value - `34`
 * @see [HierarchicLayout.groupAlignmentPolicy]
 * @see [HierarchicLayout.recursiveGroupLayering]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupAlignmentPolicy%23BOTTOM">Online Documentation</a>
 */
val BOTTOM: GroupAlignmentPolicy

/**
 * A group layering alignment strategy which aligns groups and normal nodes that occupy the same layer to the center with respect to their inner layers.
 * 
 * Value - `66`
 * @see [HierarchicLayout.groupAlignmentPolicy]
 * @see [HierarchicLayout.recursiveGroupLayering]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupAlignmentPolicy%23CENTER">Online Documentation</a>
 */
val CENTER: GroupAlignmentPolicy
   }
}

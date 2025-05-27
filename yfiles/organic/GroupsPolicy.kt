// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.organic

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Enum constants that specify how groups are handled by the [OrganicLayout].
 * @see [ClassicOrganicLayout.groupNodePolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupsPolicy">Online Documentation</a>
 */
external sealed class GroupsPolicy: YEnum<GroupsPolicy> {
   companion object: EnumMetadata<GroupsPolicy> {
       /**
 * Group handling policy for considering and arranging the nodes contained in a group such that their togetherness is highlighted.
 * 
 * Value - `0`
 * @see [ClassicOrganicLayout.groupNodePolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupsPolicy%23LAYOUT">Online Documentation</a>
 */
val LAYOUT: GroupsPolicy

/**
 * Group handling policy for keeping the relative positions of nodes that belong to the same group fixed.
 * 
 * Value - `1`
 * @see [ClassicOrganicLayout.groupNodePolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupsPolicy%23FIXED">Online Documentation</a>
 */
val FIXED: GroupsPolicy

/**
 * Group handling policy for completely ignoring group nodes during the layout process.
 * 
 * Value - `2`
 * @see [ClassicOrganicLayout.groupNodePolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupsPolicy%23IGNORE">Online Documentation</a>
 */
val IGNORE: GroupsPolicy
   }
}

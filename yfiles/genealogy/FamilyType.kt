// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.genealogy

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Enum constants that specify the node types for the [FamilyTreeLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FamilyType">Online Documentation</a>
 */
external sealed class FamilyType: YEnum<FamilyType> {
   companion object: EnumMetadata<FamilyType> {
       /**
 * Type specifier for nodes that connect partners with each other and their children.
 * 
 * Value - `1`
 * @see [FamilyTreeLayout.FAMILY_TYPE_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FamilyType%23FAMILY">Online Documentation</a>
 */
val FAMILY: FamilyType

/**
 * Type specifier for nodes that represent men.
 * 
 * Value - `2`
 * @see [FamilyTreeLayout.FAMILY_TYPE_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FamilyType%23MALE">Online Documentation</a>
 */
val MALE: FamilyType

/**
 * Type specifier for nodes that represent women.
 * 
 * Value - `3`
 * @see [FamilyTreeLayout.FAMILY_TYPE_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FamilyType%23FEMALE">Online Documentation</a>
 */
val FEMALE: FamilyType
   }
}

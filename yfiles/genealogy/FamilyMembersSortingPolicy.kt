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
 * Enum constants that specify how family members are sorted by the [FamilyTreeLayout].
 * @see [FamilyTreeLayout.familyMembersSortingPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FamilyMembersSortingPolicy">Online Documentation</a>
 */
external sealed class FamilyMembersSortingPolicy: YEnum<FamilyMembersSortingPolicy> {
   companion object: EnumMetadata<FamilyMembersSortingPolicy> {
       /**
 * Order specifier that disables sorting of individuals according to their sex.
 * 
 * Value - `0`
 * @see [FamilyTreeLayout.familyMembersSortingPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FamilyMembersSortingPolicy%23NO_SORTING">Online Documentation</a>
 */
val NO_SORTING: FamilyMembersSortingPolicy

/**
 * Order specifier that places female individuals before their male siblings and partners, if possible.
 * 
 * Value - `1`
 * @see [FamilyTreeLayout.familyMembersSortingPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FamilyMembersSortingPolicy%23FEMALE_FIRST">Online Documentation</a>
 */
val FEMALE_FIRST: FamilyMembersSortingPolicy

/**
 * Order specifier that places female individuals before their male siblings and partners.
 * 
 * Value - `2`
 * @see [FamilyTreeLayout.familyMembersSortingPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FamilyMembersSortingPolicy%23FEMALE_ALWAYS_FIRST">Online Documentation</a>
 */
val FEMALE_ALWAYS_FIRST: FamilyMembersSortingPolicy

/**
 * Order specifier that places male individuals before their female siblings and partners, if possible.
 * 
 * Value - `3`
 * @see [FamilyTreeLayout.familyMembersSortingPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FamilyMembersSortingPolicy%23MALE_FIRST">Online Documentation</a>
 */
val MALE_FIRST: FamilyMembersSortingPolicy

/**
 * Order specifier that places male individuals before their female siblings and partners.
 * 
 * Value - `4`
 * @see [FamilyTreeLayout.familyMembersSortingPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FamilyMembersSortingPolicy%23MALE_ALWAYS_FIRST">Online Documentation</a>
 */
val MALE_ALWAYS_FIRST: FamilyMembersSortingPolicy
   }
}

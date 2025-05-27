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
 * Alignment specifier that defines that all nodes in the same layer (generation) are aligned based on their top coordinate.
 * @see [FamilyTreeLayout.alignment]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VerticalNodeAlignment">Online Documentation</a>
 */
external sealed class VerticalNodeAlignment: YEnum<VerticalNodeAlignment> {
   companion object: EnumMetadata<VerticalNodeAlignment> {
       /**
 * Alignment specifier that defines that all nodes in the same layer (generation) are aligned based on their top coordinate.
 * 
 * Value - `-1`
 * @see [FamilyTreeLayout.alignment]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VerticalNodeAlignment%23TOP">Online Documentation</a>
 */
val TOP: VerticalNodeAlignment

/**
 * Alignment specifier that defines that all nodes in the same layer (generation) are aligned based on their center coordinate.
 * 
 * Value - `0`
 * @see [FamilyTreeLayout.alignment]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VerticalNodeAlignment%23CENTER">Online Documentation</a>
 */
val CENTER: VerticalNodeAlignment

/**
 * Alignment specifier that defines that all nodes in the same layer (generation) are aligned based on their bottom coordinate.
 * 
 * Value - `1`
 * @see [FamilyTreeLayout.alignment]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VerticalNodeAlignment%23BOTTOM">Online Documentation</a>
 */
val BOTTOM: VerticalNodeAlignment
   }
}

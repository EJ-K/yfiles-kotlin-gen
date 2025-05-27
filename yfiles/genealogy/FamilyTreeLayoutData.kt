// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.genealogy

import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.layout.ItemMapping
import yfiles.layout.LayoutData

/**
 * Specifies custom data for the [FamilyTreeLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FamilyTreeLayoutData">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [FamilyTreeLayoutData] which helps configuring [FamilyTreeLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FamilyTreeLayoutData%23FamilyTreeLayoutData-constructor-FamilyTreeLayoutData">Online Documentation</a>
 */
external open class FamilyTreeLayoutData  () : LayoutData {

/**
 * Gets or sets the mapping from nodes to their family type.
 * @see [FamilyTreeLayout.FAMILY_TYPE_DP_KEY]
 * @see [FamilyType]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FamilyTreeLayoutData%23familyTypes">Online Documentation</a>
 */
final var familyTypes: ItemMapping<INode, FamilyType>

companion object : ClassMetadata<FamilyTreeLayoutData> {
}
}

inline fun FamilyTreeLayoutData(
    block: FamilyTreeLayoutData.() -> Unit
): FamilyTreeLayoutData {
    return FamilyTreeLayoutData()
        .apply(block)
}

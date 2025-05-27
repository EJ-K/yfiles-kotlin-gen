// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.organic

import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject
import yfiles.layout.ItemCollection

/**
 * Describes the two sets of nodes that are separated by [OrganicConstraintData.addSeparationConstraint].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutSeparationConstraint">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutSeparationConstraint%23OrganicLayoutSeparationConstraint-constructor-OrganicLayoutSeparationConstraint">Online Documentation</a>
 */
external open class OrganicLayoutSeparationConstraint  () : YObject {

/**
 * Depending on the constraint orientation, the set of nodes that lies to the left or above the separation axis.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutSeparationConstraint%23firstSet">Online Documentation</a>
 */
final val firstSet: ItemCollection<INode>
/**
 * Depending on the constraint orientation, the set of nodes that lies to the right or below the separation axis.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutSeparationConstraint%23secondSet">Online Documentation</a>
 */
final val secondSet: ItemCollection<INode>

companion object : ClassMetadata<OrganicLayoutSeparationConstraint> {
}
}

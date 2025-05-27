// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.organic

import yfiles.collections.ItemCollection
import yfiles.lang.ClassMetadata

/**
 * Describes the two sets of nodes that are separated by [addSeparationConstraint][OrganicConstraintData].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutSeparationConstraint">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutSeparationConstraint%23OrganicLayoutSeparationConstraint-constructor-OrganicLayoutSeparationConstraint">Online Documentation</a>
 */
external class OrganicLayoutSeparationConstraint<TNode> ()  {
  /**
   * Depending on the constraint orientation, the set of nodes that lie to the left or above the separation axis.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutSeparationConstraint%23firstSet">Online Documentation</a>
   */
  final val firstSet: ItemCollection<TNode>
  
  /**
   * Depending on the constraint orientation, the set of nodes that lie to the right or below the separation axis.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutSeparationConstraint%23secondSet">Online Documentation</a>
   */
  final val secondSet: ItemCollection<TNode>
  
  companion object : ClassMetadata<OrganicLayoutSeparationConstraint<*>> {
  }
}

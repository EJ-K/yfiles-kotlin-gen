// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.collections.ICollection
import yfiles.lang.ClassMetadata

/**
 * Combines several [LayoutData] instances.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompositeLayoutData">Online Documentation</a>
 * 
 * @constructor Creates a new instance that combines the given `items`.
 * @param [items] The [LayoutData] to combine.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompositeLayoutData%23CompositeLayoutData-constructor-CompositeLayoutData">Online Documentation</a>
 */
external class CompositeLayoutData<TNode, TEdge, TNodeLabel, TEdgeLabel> (
  vararg items: LayoutData<TNode, TEdge, TNodeLabel, TEdgeLabel>,
) : LayoutData<TNode, TEdge, TNodeLabel, TEdgeLabel> {
  /**
   * Gets or sets a collection of composed layout data objects.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompositeLayoutData%23items">Online Documentation</a>
   */
  final var items: ICollection<out LayoutData<TNode, TEdge, TNodeLabel, TEdgeLabel>>
  
  companion object : ClassMetadata<CompositeLayoutData<*, *, *, *>> {
  }
}

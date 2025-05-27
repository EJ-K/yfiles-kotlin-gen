// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.collections.ItemCollection
import yfiles.collections.ItemMapping
import yfiles.geometry.Insets
import yfiles.lang.ClassMetadata
import yfiles.lang.IComparable

/**
 * Specifies custom data for the [ComponentLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentLayoutData">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentLayoutData%23ComponentLayoutData-constructor-ComponentLayoutData">Online Documentation</a>
 */
external class ComponentLayoutData<TNode, TEdge, TNodeLabel, TEdgeLabel> () : LayoutData<TNode, TEdge, TNodeLabel, TEdgeLabel> {
  /**
   * Gets or sets a collection of nodes that determine the components that shall be laid out.
   * @see [ComponentLayout.AFFECTED_COMPONENTS_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentLayoutData%23affectedComponents">Online Documentation</a>
   */
  final var affectedComponents: ItemCollection<TNode>
  
  /**
   * Gets or sets the mapping from nodes to their component comparable that is used to sort the components.
   * @see [ComponentLayout.COMPONENT_ID_DATA_KEY]
   * @see [ConnectedComponents][yfiles.analysis.ConnectedComponents]
   * @see [LayoutGraphAlgorithms.connectedComponents][yfiles.analysis.LayoutGraphAlgorithms.connectedComponents]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentLayoutData%23componentIds">Online Documentation</a>
   */
  final var componentIds: ItemMapping<TNode, IComparable<*>>
  
  /**
   * Gets or sets the mapping from nodes to the [ILayoutAlgorithm] used to arrange the content of their component.
   * @see [ComponentLayout.COMPONENT_LAYOUT_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentLayoutData%23componentLayouts">Online Documentation</a>
   */
  final var componentLayouts: ItemMapping<TNode, ILayoutAlgorithm>
  
  /**
   * Gets or sets the mapping from nodes to their margins.
   * @see [LayoutKeys.NODE_MARGIN_DATA_KEY]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentLayoutData%23nodeMargins">Online Documentation</a>
   */
  final var nodeMargins: ItemMapping<TNode, Insets>
  
  /**
   * Gets or sets the mapping from nodes to an object defining the node type, which is considered by selected component arrangement styles such that components that contain nodes of the same type are placed close to each other.
   * @see [LayoutKeys.NODE_TYPE_DATA_KEY]
   * @see [ComponentArrangementStyle.ROWS]
   * @see [ComponentArrangementStyle.SINGLE_ROW]
   * @see [ComponentArrangementStyle.SINGLE_COLUMN]
   * @see [ComponentArrangementStyle.MULTI_ROWS_TYPE_SEPARATED]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentLayoutData%23nodeTypes">Online Documentation</a>
   */
  final var nodeTypes: ItemMapping<TNode, Any>
  
  companion object : ClassMetadata<ComponentLayoutData<*, *, *, *>> {
  }
}

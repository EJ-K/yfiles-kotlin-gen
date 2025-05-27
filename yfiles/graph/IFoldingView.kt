// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.collections.IListEnumerable
import yfiles.collections.ILookup
import yfiles.collections.ItemEventArgs
import yfiles.geometry.Rect
import yfiles.lang.EventHandler1
import yfiles.lang.IPropertyObservable
import yfiles.lang.InterfaceMetadata
import yfiles.styles.INodeStyle

/**
 * Interface that is used for manipulating a [managed view][FoldingManager] of an [IGraph] that supports folding operations like [expanding][IFoldingView] and [collapsing][IFoldingView] of nodes.
 * @see [FoldingManager]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFoldingView">Online Documentation</a>
 */
external interface IFoldingView : ILookup, IPropertyObservable {
  /**
   * Gets or sets whether this instance should automatically switch the [localRoot][IFoldingView] to an ancestor of the current root, if this view becomes [invalid][IFoldingView].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFoldingView%23autoSwitchToAncestor">Online Documentation</a>
   */
  var autoSwitchToAncestor: Boolean
  
  /**
   * Gets or sets whether changes to the [localRoot][IFoldingView] property and calls to [collapse][IFoldingView] and [expand][IFoldingView] should be recorded in undo history.
   * @see [autoSwitchToAncestor]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFoldingView%23enqueueNavigationalUndoUnits">Online Documentation</a>
   */
  var enqueueNavigationalUndoUnits: Boolean
  
  /**
   * Gets the view graph managed by this view.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFoldingView%23graph">Online Documentation</a>
   */
  val graph: IGraph
  
  /**
   * Gets whether this view is currently valid and can be edited.
   * @see [autoSwitchToAncestor]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFoldingView%23invalid">Online Documentation</a>
   */
  val invalid: Boolean
  
  /**
   * Gets or sets an entity of the [masterGraph][FoldingManager] hierarchy to serve as the virtual root for the view's local hierarchy.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFoldingView%23localRoot">Online Documentation</a>
   */
  var localRoot: INode?
  
  /**
   * Gets the manager that created this view and that contains a reference to the [masterGraph][FoldingManager].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFoldingView%23manager">Online Documentation</a>
   */
  val manager: FoldingManager
  
  /**
   * This method will collapse the [children][IGraph] of a group node into the group node.
   * @param [groupNode] A group node that is part of the [graph][IFoldingView] or the [masterGraph][FoldingManager].
   * @see [isExpanded]
   * @see [expand]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFoldingView%23IFoldingView-method-collapse">Online Documentation</a>
   */
  fun collapse(
    groupNode: INode,
  )
  
  /**
   * Directly creates a collapsed node on this instance with the given parameters.
   * @param [parent] The optional parent node in the [graph][IFoldingView]. If omitted, a new folder will be created at the root.
   * @param [layout] The optional layout for the collapsed node or `null` if the default should be used.
   * @param [style] The optional style for the collapsed node or `null` if the default should be used.
   * @param [tag] The optional tag of the node which will be used for both the group in the master graph and the folder.
   * @return A collapsed (folder) node that lives in [graph][IFoldingView]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFoldingView%23IFoldingView-method-createFolderNode">Online Documentation</a>
   */
  fun createFolderNode(
    parent: INode?  = definedExternally,
    layout: Rect  = definedExternally,
    style: INodeStyle  = definedExternally,
    tag: Tag?  = definedExternally,
  ): INode
  
  /**
   * Disposes of this view explicitly.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFoldingView%23IFoldingView-method-dispose">Online Documentation</a>
   */
  fun dispose()
  
  /**
   * This method will expand a previously [collapsed][IFoldingView] group node to make its contents appear in this view.
   * @param [groupNode] A group node that is part of the [graph][IFoldingView] or the [masterGraph][FoldingManager].
   * @see [isExpanded]
   * @see [collapse]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFoldingView%23IFoldingView-method-expand">Online Documentation</a>
   */
  fun expand(
    groupNode: INode,
  )
  
  /**
   * Helper method that corresponds to the [getMasterItem][IFoldingView] method, but is used for folding edges only.
   * @param [foldingEdge] The folding edge for which the master edges should be returned.
   * @return An enumerable that can enumerate all of the edges in the [masterGraph][FoldingManager] that are being represented by the folding edge in this [view][IFoldingView].
   * @see [IFoldingEdgeConverterContext.addToExistingFoldingEdge]
   * @see [getViewItem]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFoldingView%23IFoldingView-method-getMasterEdges">Online Documentation</a>
   */
  fun getMasterEdges(
    foldingEdge: IEdge,
  ): IListEnumerable<IEdge>
  
  /**
   * Helper method that can be used to retrieve the original "master" items in the [masterGraph][FoldingManager] that is managed by the [manager][IFoldingView] associated with this view.
   * @param [T] The type of the argument, which is typically [INode], [IEdge], [ILabel], [IBend], or [IPort].
   * @param [item] The item that is part of this [graph][IFoldingView] for which the original "master" item in the [masterGraph][FoldingManager] will be returned.
   * @return An item in the [masterGraph][FoldingManager] that corresponds to the `item` or `null`, if there is no such item.
   * @see [getViewItem]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFoldingView%23IFoldingView-method-getMasterItem">Online Documentation</a>
   */
  fun <T : IModelItem> getMasterItem(
    item: T,
  ): T?
  
  /**
   * Helper method that can be used to retrieve the items in this [graph][IFoldingView]-view for all items that are part of the [masterGraph][FoldingManager] that is associated with the [manager][IFoldingView] of this instance.
   * @param [T] The type of the argument, which is typically [INode], [IEdge], [ILabel], [IBend], or [IPort].
   * @param [item] An item that is part of the [masterGraph][FoldingManager] that is associated with the [manager][IFoldingView] of this instance.
   * @return An item in the [local graph view][IFoldingView] that corresponds to the `item` or `null`, if the item is not currently being represented in this view.
   * @see [getMasterItem]
   * @see [getMasterEdges]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFoldingView%23IFoldingView-method-getViewItem">Online Documentation</a>
   */
  fun <T : IModelItem> getViewItem(
    item: T,
  ): T?
  
  /**
   * Determines whether the provided node is currently expanded or will be displayed in [expand][IFoldingView]ed state the next time it will be included in this view.
   * @param [groupNode] The group node for which the [expanded][IFoldingView] state will be returned.
   * @return `true`, if the group node can be [collapsed][IFoldingView].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFoldingView%23IFoldingView-method-isExpanded">Online Documentation</a>
   */
  fun isExpanded(
    groupNode: INode?,
  ): Boolean
  
  /**
   * Determines whether the specified item is a folding state in this view.
   * @param [item] One of the items that are [contained][IGraph] in the [graph][IFoldingView].
   * @return Whether the item is in a folding state and is not an exact copy of an item in the [masterGraph][FoldingManager].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFoldingView%23IFoldingView-method-isInFoldingState">Online Documentation</a>
   */
  fun isInFoldingState(
    item: IModelItem,
  ): Boolean
  
  /**
   * Updates the [master][IFoldingView] group node of a single folder node in this view using [updateGroupNodeState][IFolderNodeConverter].
   * @param [folderNode] The folder node from this [view][IFoldingView] to update the group node for.
   * @see [FoldingManager.folderNodeConverter]
   * @see [IFolderNodeConverter.updateGroupNodeState]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFoldingView%23IFoldingView-method-updateGroupNodeState">Online Documentation</a>
   */
  fun updateGroupNodeState(
    folderNode: INode,
  )
  
  /**
   * Updates the [masters][IFoldingView] of a single folding edge from this view using [updateMasterEdges][IFoldingEdgeConverter].
   * @param [foldingEdge] The folding edge from this [view][IFoldingView] to update the masters for.
   * @see [IFoldingEdgeConverter.updateMasterEdges]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFoldingView%23IFoldingView-method-updateMasterEdges">Online Documentation</a>
   */
  fun updateMasterEdges(
    foldingEdge: IEdge,
  )

  
  companion object : InterfaceMetadata<IFoldingView> {
  }
}

/**
 * `group-collapsed`: Occurs whenever a group has been [collapse][IFoldingView]d.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFoldingView%23group-collapsed">Online Documentation</a>
 */
inline fun  IFoldingView.addGroupCollapsedHandler(
  crossinline handler: (item:INode) -> Unit
): () -> Unit {
  val listener: EventHandler1<ItemEventArgs<INode>> = { event, _ -> handler(event.item) }
  addEventListener("group-collapsed", listener)
  return { removeEventListener("group-collapsed", listener) }
}
/**
 * `group-expanded`: Occurs whenever a group has been [expand][IFoldingView]ed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFoldingView%23group-expanded">Online Documentation</a>
 */
inline fun  IFoldingView.addGroupExpandedHandler(
  crossinline handler: (item:INode) -> Unit
): () -> Unit {
  val listener: EventHandler1<ItemEventArgs<INode>> = { event, _ -> handler(event.item) }
  addEventListener("group-expanded", listener)
  return { removeEventListener("group-expanded", listener) }
}

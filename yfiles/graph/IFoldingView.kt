// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.collections.IEnumerable
import yfiles.collections.ItemEventArgs
import yfiles.geometry.Rect
import yfiles.lang.EventHandler1
import yfiles.lang.IPropertyObservable
import yfiles.lang.InterfaceMetadata
import yfiles.styles.INodeStyle

/**
 * Interface that is used for manipulating a [managed view][FoldingManager.createFoldingView] of an [IGraph] that supports folding operations like [expanding][expand] and [collapsing][collapse] of nodes.
 * @see [FoldingManager]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFoldingView">Online Documentation</a>
 */
external interface IFoldingView : ILookup, IPropertyObservable {
/**
 * Gets or sets whether this instance should automatically switch the [localRoot] to an ancestor of the current root, if this view becomes [invalid].
 * 
 * By default this property is set to `true` which assures that this view will never become [invalid]. It is the responsibility of the client code to check for the validity of this view before trying to modify it if this feature is disabled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFoldingView%23autoSwitchToAncestor">Online Documentation</a>
 */
var autoSwitchToAncestor: Boolean
/**
 * Gets or sets whether changes to the [localRoot] property and calls to [collapse] and [expand] should be recorded in undo history.
 * 
 * By default this property is set to `false`, however depending on the use case it may make sense to enqueue [IUndoUnit]s for this type of operations.
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
 * Gets or sets an entity of the [FoldingManager.masterGraph] hierarchy to serve as the virtual root for the view's local hierarchy.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFoldingView%23localRoot">Online Documentation</a>
 */
var localRoot: INode?
/**
 * Gets the manager that created this view and that contains a reference to the [FoldingManager.masterGraph].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFoldingView%23manager">Online Documentation</a>
 */
val manager: FoldingManager
/**
 * This method will collapse the [children][IGraph.getChildren] of a group node into the group node.
 * @param [groupNode] A group node that is part of the [graph] or the [master graph][FoldingManager.masterGraph].
 * @see [isExpanded]
 * @see [expand]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFoldingView%23IFoldingView-method-collapse">Online Documentation</a>
 */
   fun collapse( groupNode: INode )
/**
 * Directly creates a collapsed node on this instance with the given parameters.
 * @param [parent] The parent node in the [graph], or `null`
 * @param [layout] The layout for the collapsed node.
 * @param [style] The style for the collapsed node
 * @param [tag] The tag of the node.
 * @return A collapsed (folder) node that lives in [graph]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFoldingView%23IFoldingView-method-createFolderNode">Online Documentation</a>
 */
   fun createFolderNode( parent: INode?  = definedExternally,
 layout: Rect?  = definedExternally,
 style: INodeStyle  = definedExternally,
 tag: Tag?  = definedExternally):INode
/**
 * Disposes of this view explicitly.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFoldingView%23IFoldingView-method-dispose">Online Documentation</a>
 */
   fun dispose()
/**
 * This method will expand a previously [collapsed][collapse] group node to make its contents appear in this view.
 * @param [groupNode] A group node that is part of the [graph] or the [master graph][FoldingManager.masterGraph].
 * @see [isExpanded]
 * @see [collapse]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFoldingView%23IFoldingView-method-expand">Online Documentation</a>
 */
   fun expand( groupNode: INode )
/**
 * Helper method that corresponds to the [getMasterItem] method, but is used for folding edges, only.
 * @param [foldingEdge] The folding edge for which the master edges should be returned.
 * @return An enumerable that can enumerate all of the edges in the [FoldingManager.masterGraph] that are being represented by the folding edge in this [view][graph].
 * @see [IFoldingEdgeFactory.addToExistingFoldingEdge]
 * @see [getViewItem]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFoldingView%23IFoldingView-method-getMasterEdges">Online Documentation</a>
 */
   fun getMasterEdges( foldingEdge: IEdge ):IEnumerable<IEdge>
/**
 * Helper method that can be used to retrieve the original "master" items in the [FoldingManager.masterGraph] that is managed by the [manager] associated with this view.
 * @param [T] The type of the argument, which is typically [INode], [IEdge], [ILabel], [IBend], or [IPort].
 * @param [item] The item that is part of this [graph] for which the original "master" item in the [FoldingManager.masterGraph] will be returned.
 * @return An item in the [FoldingManager.masterGraph] that corresponds to the `item` or `null`, if there is no such item.
 * @see [getViewItem]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFoldingView%23IFoldingView-method-getMasterItem">Online Documentation</a>
 */
   fun <T : IModelItem>getMasterItem( item: T ):T?
/**
 * Helper method that can be used to retrieve the items in this [graph]-view for all items that are part of the [FoldingManager.masterGraph] that is associated with the [manager] of this instance.
 * @param [T] The type of the argument, which is typically [INode], [IEdge], [ILabel], [IBend], or [IPort].
 * @param [item] An item that is part of the [FoldingManager.masterGraph] that is associated with the [manager] of this instance.
 * @return An item in the [local graph view][graph] that corresponds to the `item` or `null`, if the item is not currently being represented in this view.
 * @see [getMasterItem]
 * @see [getMasterEdges]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFoldingView%23IFoldingView-method-getViewItem">Online Documentation</a>
 */
   fun <T : IModelItem>getViewItem( item: T ):T?
/**
 * Determines whether the provided node is currently expanded or will be displayed in [expand]ed state the next time it will be included in this view.
 * @param [groupNode] The group node for which the [expanded][expand] state will be returned.
 * @return `true`, if the group node can be [collapsed][collapse].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFoldingView%23IFoldingView-method-isExpanded">Online Documentation</a>
 */
   fun isExpanded( groupNode: INode ):Boolean
/**
 * Determines whether the specified item is a folding state in this view.
 * @param [item] One of the items that are [contained][IGraph.contains] in the [graph].
 * @return Whether the item is in folding state and is not an exact copy of an item in the [FoldingManager.masterGraph].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFoldingView%23IFoldingView-method-isInFoldingState">Online Documentation</a>
 */
   fun isInFoldingState( item: IModelItem ):Boolean
/**
 * Occurs whenever a group has been [collapse]d.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFoldingView%23GroupCollapsed">Online Documentation</a>
 */
fun addGroupCollapsedListener(listener: EventHandler1<ItemEventArgs<INode>>)
fun removeGroupCollapsedListener(listener: EventHandler1<ItemEventArgs<INode>>)

/**
 * Occurs whenever a group has been [expand]ed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFoldingView%23GroupExpanded">Online Documentation</a>
 */
fun addGroupExpandedListener(listener: EventHandler1<ItemEventArgs<INode>>)
fun removeGroupExpandedListener(listener: EventHandler1<ItemEventArgs<INode>>)

companion object : InterfaceMetadata<IFoldingView> {
}
}

/**
 * Occurs whenever a group has been [collapse]d.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFoldingView%23GroupCollapsed">Online Documentation</a>
 */
inline fun  IFoldingView.addGroupCollapsedHandler(
    crossinline handler: (item:INode) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemEventArgs<INode>> = { _, event -> handler(event.item) }
    addGroupCollapsedListener(listener)
    return { removeGroupCollapsedListener(listener) }
}
/**
 * Occurs whenever a group has been [expand]ed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFoldingView%23GroupExpanded">Online Documentation</a>
 */
inline fun  IFoldingView.addGroupExpandedHandler(
    crossinline handler: (item:INode) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemEventArgs<INode>> = { _, event -> handler(event.item) }
    addGroupExpandedListener(listener)
    return { removeGroupExpandedListener(listener) }
}

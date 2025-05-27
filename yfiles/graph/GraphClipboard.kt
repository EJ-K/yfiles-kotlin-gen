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
import yfiles.geometry.Point
import yfiles.input.IInputModeContext
import yfiles.lang.ClassMetadata
import yfiles.lang.EventHandler1
import yfiles.lang.IEventDispatcher
import yfiles.lang.Id

/**
 * Clipboard implementation for [IGraph] instances.
 * @see [IClipboardHelper]
 * @see [cut]
 * @see [copy]
 * @see [onPaste]
 * @see [clipboardGraph]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard">Online Documentation</a>
 * 
 * @constructor Creates a new initially empty clipboard.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-constructor-GraphClipboard">Online Documentation</a>
 */
open external class GraphClipboard () : IEventDispatcher {
  /**
   * Gets the clipboard context for the current clipboard operation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23clipboardContext">Online Documentation</a>
   */
  protected final val clipboardContext: IGraphClipboardContext?
  
  /**
   * Gets the graph that contains the clipboard's contents.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23clipboardGraph">Online Documentation</a>
   */
  final val clipboardGraph: IGraph
  
  /**
   * Gets or sets the type of items that can be copied and pasted using the clipboard.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23copyItems">Online Documentation</a>
   */
  final var copyItems: GraphItemTypes
  
  /**
   * Gets or sets the type of items that depend on other items but should automatically be copied implicitly to the clipboard if all items that they depend on are explicitly selected for copying.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23dependentCopyItems">Online Documentation</a>
   */
  final var dependentCopyItems: GraphItemTypes
  
  /**
   * Gets or sets the [ClipboardGraphCopier] instance that will be used to duplicate items inside the graph.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23duplicateCopier">Online Documentation</a>
   */
  final var duplicateCopier: ClipboardGraphCopier
  
  /**
   * Gets or sets the [ClipboardGraphCopier] instance that will be used to copy the graph from the clipboard to the target graph.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23fromClipboardCopier">Online Documentation</a>
   */
  final var fromClipboardCopier: ClipboardGraphCopier
  
  /**
   * Gets or sets the [IClipboardIdProvider] used by this instance to provide IDs for copied items.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23idProvider">Online Documentation</a>
   */
  final var idProvider: IClipboardIdProvider
  
  /**
   * Gets or sets whether to paste edges where either its source or target node was copied while the other was not.
   * 
   * The default is `false`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23ignoreEdgesWithOneNode">Online Documentation</a>
   */
  final var ignoreEdgesWithOneNode: Boolean
  
  /**
   * Gets or sets the type of items that can be copied and pasted independently of their owning item.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23independentCopyItems">Online Documentation</a>
   */
  final var independentCopyItems: GraphItemTypes
  
  /**
   * Gets whether the clipboard graph is empty.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23isEmpty">Online Documentation</a>
   */
  open val isEmpty: Boolean
  
  /**
   * Gets or sets whether nodes should be automatically put into a group node and if so how this group will be determined.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23parentNodeDetection">Online Documentation</a>
   */
  final var parentNodeDetection: ParentNodeDetectionModes
  
  /**
   * Gets or sets a vector that will be used to move nodes and bends by after they have been pasted to the target graph.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23pasteOffset">Online Documentation</a>
   */
  final var pasteOffset: Point
  
  /**
   * Gets or sets the increment the [pasteOffset][GraphClipboard] is increased by after a paste operation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23pasteOffsetIncrement">Online Documentation</a>
   */
  final var pasteOffsetIncrement: Point
  
  /**
   * Gets or sets the [ClipboardGraphCopier] instance that will be used to copy the graph to the clipboard.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23toClipboardCopier">Online Documentation</a>
   */
  final var toClipboardCopier: ClipboardGraphCopier
  
  /**
   * Clears the clipboard's contents.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-clear">Online Documentation</a>
   */
  open fun clear()
  
  /**
   * Copies the `itemsToCopy` to the clipboard graph.
   * @param [sourceGraph] The graph to copy the contents from.
   * @param [itemsToCopy] The source graph's items which should be copied. Items which are not in the `sourceGraph` are ignored. If none are provided, the entire `sourceGraph` is copied.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-copy">Online Documentation</a>
   */
  open fun copy(
    sourceGraph: IGraph,
    itemsToCopy: IEnumerable<IModelItem>?  = definedExternally,
  )
  
  /**
   * Factory method that creates the context for the upcoming calls to the [IClipboardHelper] methods.
   * @param [sourceGraph] The source graph of the operation.
   * @param [targetGraph] The target graph of the operation.
   * @param [context] A valid input mode context the [lookup][yfiles.collections.ILookup] method should return or `null` if no such context is available.
   * @return A context that has the properties configured according to the parameters.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-createContext">Online Documentation</a>
   */
  protected open fun createContext(
    sourceGraph: IGraph,
    targetGraph: IGraph,
    context: IInputModeContext?  = definedExternally,
  ): IGraphClipboardContext
  
  /**
   * Cuts the items indicated by `itemsToCut` to the clipboard and removes them from the graph.
   * @param [sourceGraph] The graph to cut the items from.
   * @param [itemsToCut] The items to cut. Items which are not in the `sourceGraph` are ignored. If none are provided, the entire `sourceGraph` will be cut.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-cut">Online Documentation</a>
   */
  open fun cut(
    sourceGraph: IGraph,
    itemsToCut: IEnumerable<IModelItem>?,
  )
  
  /**
   * Duplicates the `itemsToDuplicate` from and to the `graph`.
   * @param [context] The current [IInputModeContext].
   * @param [graph] The graph whose items should be duplicated.
   * @param [itemsToDuplicate] The items which should be duplicated. If none are provided the entire `graph` is duplicated.
   * @param [itemDuplicated] An item copied callback which gets invoked for each item which has been duplicated. The two parameters passed into the callback are guaranteed to be part of the `graph`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-duplicate">Online Documentation</a>
   */
  open fun duplicate(
    context: IInputModeContext?,
    graph: IGraph,
    itemsToDuplicate: IEnumerable<IModelItem>?  = definedExternally,
    itemDuplicated: ItemCopiedCallback?  = definedExternally,
  )
  
  /**
   * Provides the original parent group node or its ancestor for the given `sourceNode`.
   * @param [context] The information which items to copy.
   * @param [sourceNode] The node to be duplicated from the source graph or copied from the [clipboardGraph][GraphClipboard] for which the parent shall be found.
   * @param [ignoreDistance] Whether the distance, the previous parent might have been moved away in between the copy and paste operation, is ignored. Note that this might increase the parent's size considerably.
   * @return The parent or its ancestor node of the given `sourceNode`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-findParentByPreviousParent">Online Documentation</a>
   */
  protected fun findParentByPreviousParent(
    context: ClipboardOperationContext,
    sourceNode: INode,
    ignoreDistance: Boolean,
  ): INode?
  
  /**
   * Gets a folding state of an edge for a given [FoldingEdgeStateId].
   * @param [edge] The edge to get the folding state for.
   * @param [id] The original [FoldingEdgeStateId] to get the folding state for. Passing `null` will return the folding state which was visible when the edge was copied into the clipboard.
   * @return The folding state which is mapped to the given `id`. May be `null`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-getFoldingEdgeState">Online Documentation</a>
   */
  protected open fun getFoldingEdgeState(
    edge: IEdge,
    id: FoldingEdgeStateId?,
  ): IEdge?
  
  /**
   * Returns the [ID][IClipboardIdProvider] which is linked with the given clipboard item.
   * @param [clipboardItem] An [IModelItem] which lives in the clipboard graph.
   * @return The ID which represents the item from which `clipboardItem` has originally been copied into the clipboard. [idProvider][GraphClipboard]'s [getItem][IClipboardIdProvider] can be used to retrieve the original item. Note that both, the returned ID and the item returned by [getItem][IClipboardIdProvider] might be `null`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-getId">Online Documentation</a>
   */
  protected fun getId(
    clipboardItem: IModelItem,
  ): Id?
  
  /**
   * Gets an [ILabelModelParameter] for the given `sourceLabel` to be placed at the given `newTargetOwner`.
   * @param [copier] The [GraphCopier] whose [copyLabelLayoutParameter][ClipboardGraphCopier] method can be used to copy the existing parameter.
   * @param [targetGraph] The [targetGraph][ClipboardOperationContext] whose [nodeDefaults][IGraph] or [edgeDefaults][IGraph] can be used to create a new parameter.
   * @param [sourceLabel] The label in the [sourceGraph][ClipboardOperationContext] to be copied.
   * @param [newTargetOwner] The new owner in the [targetGraph][ClipboardOperationContext] for the label.
   * @return An [ILabelModelParameter] for the copied label.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-getLabelLayoutParameter">Online Documentation</a>
   */
  protected open fun getLabelLayoutParameter(
    copier: ClipboardGraphCopier,
    targetGraph: IGraph,
    sourceLabel: ILabel,
    newTargetOwner: ILabelOwner,
  ): ILabelModelParameter
  
  /**
   * Gets an [IPortLocationModelParameter] for the given `sourcePort` to be placed at the given `newTargetOwner`.
   * @param [copier] The [GraphCopier] whose [copyPortLocationParameter][ClipboardGraphCopier] method can be used to copy the existing parameter.
   * @param [targetGraph] The [targetGraph][ClipboardOperationContext] whose [nodeDefaults][IGraph] or [edgeDefaults][IGraph] can be used to create a new parameter.
   * @param [sourcePort] The port [sourceGraph][ClipboardOperationContext] to be copied.
   * @param [newTargetOwner] The new owner in the [targetGraph][ClipboardOperationContext] for the port.
   * @return An [IPortLocationModelParameter] for the copied port.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-getPortLocationParameter">Online Documentation</a>
   */
  protected open fun getPortLocationParameter(
    copier: ClipboardGraphCopier,
    targetGraph: IGraph,
    sourcePort: IPort,
    newTargetOwner: IPortOwner,
  ): IPortLocationModelParameter
  
  /**
   * Provides an [IEdge] where the given `sourceBend` can be added to.
   * @param [context] The information which items to copy.
   * @param [sourceBend] The bend to be duplicated from the source graph or copied from the [clipboardGraph][GraphClipboard].
   * @return An [IEdge] for the bend to be added to or `null` if the bend should not be copied.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-getTargetEdge">Online Documentation</a>
   */
  protected open fun getTargetEdge(
    context: ClipboardOperationContext,
    sourceBend: IBend,
  ): IEdge?
  
  /**
   * Provides an [ILabelOwner] where the given `sourceLabel` can be added to.
   * @param [context] The information which items to copy.
   * @param [sourceLabel] The label to be duplicated from the source graph or copied from the [clipboardGraph][GraphClipboard].
   * @return An [ILabelOwner] for the label to be added to or `null` if the label should not be copied.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-getTargetLabeledItem">Online Documentation</a>
   */
  protected open fun getTargetLabeledItem(
    context: ClipboardOperationContext,
    sourceLabel: ILabel,
  ): ILabelOwner?
  
  /**
   * Provides a parent group node for the given `sourceNode` considering the [parentNodeDetection][GraphClipboard].
   * @param [context] The information which items to copy.
   * @param [sourceNode] The node to be duplicated from the source graph or copied from the [clipboardGraph][GraphClipboard].
   * @param [pasteLocation] The location to look for the parent group if [parentNodeDetection][GraphClipboard] contains [AT_LOCATION][ParentNodeDetectionModes]
   * @return The new parent group of the node or `null` if the node should be placed at the root of the hierarchy or if the graph is not grouped.
   * @see [parentNodeDetection]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-getTargetNode">Online Documentation</a>
   */
  protected open fun getTargetNode(
    context: ClipboardOperationContext,
    sourceNode: INode,
    pasteLocation: Point,
  ): INode?
  
  /**
   * Provides an [IPort] where the given `sourceEdge` can be added to.
   * @param [context] The information which items to copy.
   * @param [sourceEdge] The edge to be duplicated from the source graph or copied from the [clipboardGraph][GraphClipboard].
   * @param [atSource] Whether to look for a source port.
   * @return An [IPort] for the edge to be added to or `null` if the edge should not be copied.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-getTargetPort">Online Documentation</a>
   */
  protected open fun getTargetPort(
    context: ClipboardOperationContext,
    sourceEdge: IEdge,
    atSource: Boolean,
  ): IPort?
  
  /**
   * Provides an [IPortOwner] where the given `sourcePort` can be added to.
   * @param [context] The information which items to copy.
   * @param [sourcePort] The port to be duplicated from the source graph or copied from the [clipboardGraph][GraphClipboard].
   * @return An [IPortOwner] for the port to be added to or `null` if the port should not be copied.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-getTargetPortOwner">Online Documentation</a>
   */
  protected open fun getTargetPortOwner(
    context: ClipboardOperationContext,
    sourcePort: IPort,
  ): IPortOwner?
  
  /**
   * Whether the given `clipboardItem` of the [clipboardGraph][GraphClipboard] was copied from a folding state of its owner.
   * @param [clipboardItem] An [ILabel], [IPort], or [IBend] of the [clipboardGraph][GraphClipboard].
   * @return `true` if the given item was copied from a folding state.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-isFoldingStateItem">Online Documentation</a>
   */
  protected fun isFoldingStateItem(
    clipboardItem: IModelItem,
  ): Boolean
  
  /**
   * Whether the given `clipboardItem` is a "helper" item which should not be pasted.
   * @param [clipboardItem] The item to test.
   * @return `true` if the item is a "helper" item.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-isHelper">Online Documentation</a>
   */
  fun isHelper(
    clipboardItem: IModelItem?,
  ): Boolean
  
  /**
   * Called from [copy][GraphClipboard] and delegates to [copy][ClipboardGraphCopier] on the current [toClipboardCopier][GraphClipboard] instance.
   * @param [copyContext] Contains the information on which items to copy.
   * @param [targetRootNode] The node to use as the root node in the grouped [targetGraph][ClipboardOperationContext].
   * @param [itemCopiedCallback] The delegate to pass on. For each item that is copied during the operation to the clipboard, this callback will be passed the original and the copy of the item. In case the source graph is a [folding view graph][FoldingManager] both items are passed as [master][FoldingManager] items or [folding state items][FoldingManager] if a master item does not exist.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-onCopy">Online Documentation</a>
   */
  protected open fun onCopy(
    copyContext: ClipboardOperationContext,
    targetRootNode: INode?  = definedExternally,
    itemCopiedCallback: ItemCopiedCallback?  = definedExternally,
  )
  
  /**
   * Called from [duplicate][GraphClipboard] and delegates to [copy][ClipboardGraphCopier] on the current [duplicateCopier][GraphClipboard] instance.
   * @param [duplicateContext] Contains the information which items to duplicate.
   * @param [itemDuplicatedCallback] The delegate to pass on. For each item that is duplicated during the operation, this callback will be passed the original and the copy of the item. In case the source graph is a [folding view graph][FoldingManager], both items are passed as [master][FoldingManager] items or [folding state items][FoldingManager] if a master item does not exist.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-onDuplicate">Online Documentation</a>
   */
  protected open fun onDuplicate(
    duplicateContext: ClipboardOperationContext,
    itemDuplicatedCallback: ItemCopiedCallback?,
  )
  
  /**
   * Invoked for each item that has been copied into the clipboard graph in response to a [copy][GraphClipboard] operation.
   * @param [context] The context to get the [IClipboardHelper] from.
   * @param [original] The original item from the source graph instance. If the source graph is a managed folding view, this is always a master item.
   * @param [copy] The copy from the clipboard graph.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-onItemCopied">Online Documentation</a>
   */
  protected open fun onItemCopied(
    context: ClipboardOperationContext,
    original: IModelItem,
    copy: IModelItem,
  )
  
  /**
   * Invoked for each item that has been copied into the clipboard graph in response to a [cut][GraphClipboard] operation.
   * @param [context] The context to get the [IClipboardHelper] from.
   * @param [original] The original item from the source graph instance. If the source graph is a managed folding view, this is always a master item.
   * @param [copy] The copy from the clipboard graph.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-onItemCut">Online Documentation</a>
   */
  protected open fun onItemCut(
    context: ClipboardOperationContext,
    original: IModelItem,
    copy: IModelItem,
  )
  
  /**
   * Invoked for each item that has been duplicated into the target graph in response to a [duplicate][GraphClipboard] operation.
   * @param [context] The context to get the [IClipboardHelper] from.
   * @param [original] The original item from the source graph instance. If the source graph is a managed folding view, this is always a master item.
   * @param [copy] The copy from the target graph.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-onItemDuplicated">Online Documentation</a>
   */
  protected open fun onItemDuplicated(
    context: ClipboardOperationContext,
    original: IModelItem,
    copy: IModelItem,
  )
  
  /**
   * Invoked for each item that has been pasted into the target graph in response to a [onPaste][GraphClipboard] operation.
   * @param [context] A context which provides additional information.
   * @param [original] The original item from the clipboard graph instance. If the target graph is a managed folding view, this is always a master item.
   * @param [copy] The copy from the target graph.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-onItemPasted">Online Documentation</a>
   */
  protected open fun onItemPasted(
    context: ClipboardOperationContext,
    original: IModelItem,
    copy: IModelItem,
  )
  
  /**
   * Called during paste operation to call [copy][ClipboardGraphCopier] on the current [fromClipboardCopier][GraphClipboard] instance.
   * @param [context] The operation context to get, e.g., the [targetGraph][ClipboardOperationContext] from.
   * @param [itemCopiedCallback] The delegate to pass on. For each item that is copied during the operation from the clipboard, this callback will be passed the original and the copy of the item. In case the [targetGraph][ClipboardOperationContext] is a [folding view graph][FoldingManager], the original item is passed as [master][FoldingManager] items or [folding state items][FoldingManager] if a master item does not exist. The copied item is always part of the [targetGraph][ClipboardOperationContext].
   * @param [targetRootNode] The node to use as the root node in the grouped [targetGraph][ClipboardOperationContext].
   * @param [targetOwners] Model items which can be used as target for pasted clipboard items which need an owner (e.g., [ILabel]s which were copied without their owner). If `null`, the previous owners are used if they are available in the [targetGraph][ClipboardOperationContext] or items may not be pasted if no target owner could be found. Often the [graphSelection][yfiles.input.GraphInputMode] is used as possible target owners.
   * @param [pasteLocation] The location to look for the parent group of a pasted node if [parentNodeDetection][GraphClipboard] contains [AT_LOCATION][ParentNodeDetectionModes].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-onPaste">Online Documentation</a>
   */
  protected open fun onPaste(
    context: ClipboardOperationContext,
    itemCopiedCallback: ItemCopiedCallback?,
    targetRootNode: INode?  = definedExternally,
    targetOwners: IEnumerable<IModelItem>?  = definedExternally,
    pasteLocation: Point?  = definedExternally,
  )
  
  /**
   * Pastes the `itemsToPaste` from the [clipboardGraph][GraphClipboard] to the `targetGraph`.
   * @param [targetGraph] The graph to paste the contents in.
   * @param [itemsToPaste] The items to copy from the clipboard graph. If none are provided, all items in the clipboard graph are pasted.
   * @param [itemPasted] The callback to use for each item that has been pasted. For each item that is copied during the operation from the clipboard, this callback will be passed the original and the copy of the item. In case the `targetGraph` is a [folding view graph][FoldingManager], the original item is passed as [master][FoldingManager] items or [folding state items][FoldingManager] if a master item does not exist. The copied item is always part of the `targetGraph`.
   * @param [targetOwners] Model items which can be used as a target for clipboard items that need an owner (e.g. [ILabel]s which were copied without their owner). If `null`, the previous owners are used if they are available in the `targetGraph` or items may not be pasted if no target owner could be found. Often the [graphSelection][yfiles.input.GraphInputMode] is used as possible target owners.
   * @param [pasteLocation] The location at which the center of the clipboard's contents should be positioned or `null` if their original location moved by the [pasteOffset][GraphClipboard] should be used.
   * @param [context] A valid input mode context. Passing a valid input mode context is required for keeping orthogonal edges at group nodes whose size might be adjusted after the paste operation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-paste">Online Documentation</a>
   */
  open fun paste(
    targetGraph: IGraph,
    itemsToPaste: IEnumerable<IModelItem>?  = definedExternally,
    itemPasted: ItemCopiedCallback?  = definedExternally,
    targetOwners: IEnumerable<IModelItem>?  = definedExternally,
    pasteLocation: Point?  = definedExternally,
    context: IInputModeContext?  = definedExternally,
  )
  
  /**
   * Removes the `itemsToRemove` from the `graph` during a [cut][GraphClipboard] operation.
   * @param [graph] The graph to remove items from.
   * @param [itemsToRemove] The items to remove.
   * @see [cut]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23GraphClipboard-method-removeItems">Online Documentation</a>
   */
  protected open fun removeItems(
    graph: IGraph,
    itemsToRemove: IEnumerable<IModelItem>,
  )
  
  companion object : ClassMetadata<GraphClipboard> {
    /**
     * Gets a [GraphClipboard] instance that is used by default for [clipboard][yfiles.view.GraphComponent] so that it is shared between multiple [GraphComponent][yfiles.view.GraphComponent] instances.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23DEFAULT_GRAPH_CLIPBOARD">Online Documentation</a>
     */
     val DEFAULT_GRAPH_CLIPBOARD: GraphClipboard
  }
}

inline fun GraphClipboard(
    block: GraphClipboard.() -> Unit
): GraphClipboard {
    return GraphClipboard()
        .apply(block)
}

inline val  GraphClipboard.isNotEmpty: Boolean
    get() = !isEmpty

/**
 * `items-cutting`: Occurs before the [cut][GraphClipboard] operation starts.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23items-cutting">Online Documentation</a>
 */
inline fun  GraphClipboard.addItemsCuttingHandler(
  crossinline handler: (event:GraphClipboardEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<GraphClipboardEventArgs> = { event, _ -> handler(event) }
  addEventListener("items-cutting", listener)
  return { removeEventListener("items-cutting", listener) }
}

/**
 * `items-copying`: Occurs before the [copy][GraphClipboard] operation starts.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23items-copying">Online Documentation</a>
 */
inline fun  GraphClipboard.addItemsCopyingHandler(
  crossinline handler: (event:GraphClipboardEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<GraphClipboardEventArgs> = { event, _ -> handler(event) }
  addEventListener("items-copying", listener)
  return { removeEventListener("items-copying", listener) }
}

/**
 * `items-pasting`: Occurs before the [onPaste][GraphClipboard] operation starts.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23items-pasting">Online Documentation</a>
 */
inline fun  GraphClipboard.addItemsPastingHandler(
  crossinline handler: (event:GraphClipboardEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<GraphClipboardEventArgs> = { event, _ -> handler(event) }
  addEventListener("items-pasting", listener)
  return { removeEventListener("items-pasting", listener) }
}

/**
 * `items-duplicating`: Occurs before the [duplicate][GraphClipboard] operation starts.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23items-duplicating">Online Documentation</a>
 */
inline fun  GraphClipboard.addItemsDuplicatingHandler(
  crossinline handler: (event:GraphClipboardEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<GraphClipboardEventArgs> = { event, _ -> handler(event) }
  addEventListener("items-duplicating", listener)
  return { removeEventListener("items-duplicating", listener) }
}

/**
 * `items-cut`: Occurs when the [cut][GraphClipboard] operation finished successfully.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23items-cut">Online Documentation</a>
 */
inline fun  GraphClipboard.addItemsCutHandler(
  crossinline handler: (event:GraphClipboardEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<GraphClipboardEventArgs> = { event, _ -> handler(event) }
  addEventListener("items-cut", listener)
  return { removeEventListener("items-cut", listener) }
}

/**
 * `items-copied`: Occurs when the [copy][GraphClipboard] operation finished successfully.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23items-copied">Online Documentation</a>
 */
inline fun  GraphClipboard.addItemsCopiedHandler(
  crossinline handler: (event:GraphClipboardEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<GraphClipboardEventArgs> = { event, _ -> handler(event) }
  addEventListener("items-copied", listener)
  return { removeEventListener("items-copied", listener) }
}

/**
 * `items-pasted`: Occurs when the [onPaste][GraphClipboard] operation finished successfully.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23items-pasted">Online Documentation</a>
 */
inline fun  GraphClipboard.addItemsPastedHandler(
  crossinline handler: (event:GraphClipboardEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<GraphClipboardEventArgs> = { event, _ -> handler(event) }
  addEventListener("items-pasted", listener)
  return { removeEventListener("items-pasted", listener) }
}

/**
 * `items-duplicated`: Occurs when the [duplicate][GraphClipboard] operation finished successfully.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphClipboard%23items-duplicated">Online Documentation</a>
 */
inline fun  GraphClipboard.addItemsDuplicatedHandler(
  crossinline handler: (event:GraphClipboardEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<GraphClipboardEventArgs> = { event, _ -> handler(event) }
  addEventListener("items-duplicated", listener)
  return { removeEventListener("items-duplicated", listener) }
}
